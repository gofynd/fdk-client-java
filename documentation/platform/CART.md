



##### [Back to Platform docs](./README.md)

## Cart Methods
Cart APIs

Default
* [getCoupons](#getcoupons)
* [createCoupon](#createcoupon)
* [getCouponById](#getcouponbyid)
* [updateCoupon](#updatecoupon)
* [updateCouponPartially](#updatecouponpartially)
* [getPromotions](#getpromotions)
* [createPromotion](#createpromotion)
* [getPromotionById](#getpromotionbyid)
* [updatePromotion](#updatepromotion)
* [updatePromotionPartially](#updatepromotionpartially)
* [getPromosCouponConfig](#getpromoscouponconfig)
* [updateCartMetaConfig](#updatecartmetaconfig)
* [fetchCartMetaConfig](#fetchcartmetaconfig)
* [createCartMetaConfig](#createcartmetaconfig)
* [updatePriceAdjustment](#updatepriceadjustment)
* [removePriceAdjustment](#removepriceadjustment)
* [addPriceAdjustment](#addpriceadjustment)
* [fetchAndvalidateCartItems](#fetchandvalidatecartitems)
* [checkCartServiceability](#checkcartserviceability)
* [checkoutCart](#checkoutcart)
* [getAbandonedCart](#getabandonedcart)
* [getAbandonedCartDetails](#getabandonedcartdetails)
* [addItems](#additems)
* [updateCart](#updatecart)
* [getCouponOptionValues](#getcouponoptionvalues)
* [getCouponCodeExists](#getcouponcodeexists)
* [getPromotionCodeExists](#getpromotioncodeexists)
* [overrideCart](#overridecart)
* [getCartShareLink](#getcartsharelink)
* [getCartSharedItems](#getcartshareditems)
* [updateCartWithSharedItems](#updatecartwithshareditems)
* [getCartList](#getcartlist)
* [updateCartUser](#updatecartuser)
* [getCart](#getcart)
* [platformAddItems](#platformadditems)
* [platformUpdateCart](#platformupdatecart)
* [deleteCart](#deletecart)
* [getItemCount](#getitemcount)
* [getAppCoupons](#getappcoupons)
* [applyCoupon](#applycoupon)
* [removeCoupon](#removecoupon)
* [getAddresses](#getaddresses)
* [addAddress](#addaddress)
* [getAddressById](#getaddressbyid)
* [updateAddress](#updateaddress)
* [removeAddress](#removeaddress)
* [selectAddress](#selectaddress)
* [getShipments](#getshipments)
* [updateShipments](#updateshipments)
* [updateCartMeta](#updatecartmeta)
* [platformCheckoutCart](#platformcheckoutcart)
* [getAvailableDeliveryModes](#getavailabledeliverymodes)
* [getStoreAddressByUid](#getstoreaddressbyuid)
* [selectPaymentMode](#selectpaymentmode)
* [validateCouponForPayment](#validatecouponforpayment)
* [platformCheckoutCartV2](#platformcheckoutcartv2)
* [selectPaymentModeV2](#selectpaymentmodev2)




## Methods with example and description



### getCoupons
Get with single coupon details or coupon list




```java
platformClient.application("<APPLICATION_ID>").cart.getCoupons( pageNo,  pageSize,  isArchived,  title,  isPublic,  isDisplay,  typeSlug,  code) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isArchived | Boolean? | no |  |   
| title | String? | no |  |   
| isPublic | Boolean? | no |  |   
| isDisplay | Boolean? | no |  |   
| typeSlug | String? | no |  |   
| code | String? | no |  |  



Get coupon list with pagination

*Returned Response:*




[CouponsResponse](#CouponsResponse)

Coupon List for sent page_size and page_no




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Coupon list for sent filter and page size</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "5e1d9bec6d6b7e000146c840",
        "rule": [],
        "identifiers": {},
        "validity": {
          "priority": 0
        },
        "type_slug": "bundle_quantity_absolute",
        "display_meta": {
          "title": "percent50 title"
        },
        "_schedule": {
          "next_schedule": [
            {
              "start": "2020-01-14T10:45:03.600000+00:00",
              "end": "2020-01-16T10:45:03+00:00"
            }
          ],
          "duration": null,
          "start": "2020-01-14T10:45:03.600000+00:00",
          "end": "2020-01-16T10:45:03+00:00",
          "cron": ""
        },
        "state": {
          "is_public": true,
          "is_display": true,
          "is_archived": false
        },
        "ownership": {
          "payable_category": "seller",
          "payable_by": ""
        },
        "code": "percent50",
        "rule_definition": {
          "type": "percentage",
          "scope": [
            "category_id"
          ],
          "applicable_on": "quantity",
          "calculate_on": "esp",
          "value_type": "percentage"
        }
      }
    ],
    "page": {
      "type": "",
      "has_next": true,
      "size": 10,
      "current": 1,
      "item_total": 30
    }
  }
}
```
</details>

</details>









---


### createCoupon
Create new coupon




```java
platformClient.application("<APPLICATION_ID>").cart.createCoupon(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [CouponAdd](#CouponAdd) | yes | Request body |


Create new coupon

*Returned Response:*




[SuccessMessage](#SuccessMessage)

Coupon Created successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Coupon Created"
}
```
</details>









---


### getCouponById
Get with single coupon details or coupon list




```java
platformClient.application("<APPLICATION_ID>").cart.getCouponById( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  



Get single coupon details with `id` in path param

*Returned Response:*




[CouponUpdate](#CouponUpdate)

Coupon object for sent `id`




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "5e1d9bec6d6b7e000146c840",
  "validation": {
    "anonymous": true,
    "app_id": [
      "5cd3db5e9d692cfe5302a7ba"
    ],
    "user_registered_after": null
  },
  "rule": [
    {
      "key": 1,
      "max": 1500,
      "min": 3000,
      "value": 50
    }
  ],
  "display_meta": {
    "title": "percent50 title",
    "description": "percent50 description",
    "auto": {
      "title": "",
      "subtitle": ""
    },
    "subtitle": "percent50 subtitle",
    "remove": {
      "title": "",
      "subtitle": ""
    },
    "apply": {
      "title": "percen50 mt",
      "subtitle": "percen50 ms"
    }
  },
  "date_meta": {
    "modified_on": "2020-02-04T14:27:00.577000+00:00",
    "created_on": "2020-01-14T10:46:04.474000+00:00"
  },
  "action": {
    "action_date": null,
    "txn_mode": "coupon"
  },
  "identifiers": {
    "category_id": [
      465,
      192,
      133,
      134,
      150,
      151,
      155,
      193,
      157,
      191,
      154,
      152,
      417,
      168,
      416,
      167,
      166,
      162,
      161,
      163,
      165,
      160
    ],
    "user_id": [],
    "store_id": [],
    "company_id": []
  },
  "author": {
    "modified_by": "23109086",
    "created_by": "23206328"
  },
  "_schedule": {
    "next_schedule": [
      {
        "start": "2020-01-14T10:45:03.600000+00:00",
        "end": "2020-01-16T10:45:03+00:00"
      }
    ],
    "duration": null,
    "start": "2020-01-14T10:45:03.600000+00:00",
    "end": "2020-01-16T10:45:03+00:00",
    "cron": ""
  },
  "state": {
    "is_public": true,
    "is_display": true,
    "is_archived": false
  },
  "ownership": {
    "payable_category": "seller",
    "payable_by": ""
  },
  "validity": {
    "priority": 0
  },
  "code": "percent50",
  "rule_definition": {
    "calculate_on": "esp",
    "value_type": "percentage",
    "is_exact": false,
    "type": "percentage",
    "scope": [
      "category_id"
    ],
    "auto_apply": false,
    "applicable_on": "quantity",
    "currency_code": "INR"
  },
  "restrictions": {
    "price_range": {
      "max": -1,
      "min": -1
    },
    "uses": {
      "remaining": {
        "app": -1,
        "user": -1,
        "total": -1
      },
      "maximum": {
        "app": -1,
        "user": -1,
        "total": -1
      }
    },
    "post_order": {
      "cancellation_allowed": true,
      "return_allowed": true
    },
    "platforms": [
      "web",
      "android",
      "ios"
    ]
  },
  "type_slug": "percentage_quantity_percentage"
}
```
</details>









---


### updateCoupon
Update existing coupon configuration




```java
platformClient.application("<APPLICATION_ID>").cart.updateCoupon( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  
| body | [CouponUpdate](#CouponUpdate) | yes | Request body |


Update coupon with id sent in `id`

*Returned Response:*




[SuccessMessage](#SuccessMessage)

Coupon updated successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Coupon Updated"
}
```
</details>









---


### updateCouponPartially
Update coupon archive state and schedule




```java
platformClient.application("<APPLICATION_ID>").cart.updateCouponPartially( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  
| body | [CouponPartialUpdate](#CouponPartialUpdate) | yes | Request body |


Update archive/unarchive and change schedule for coupon

*Returned Response:*




[SuccessMessage](#SuccessMessage)

Coupon updated successfully




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Archive or Unarchive coupon</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Coupon Updated"
  }
}
```
</details>

<details>
<summary><i>&nbsp; Coupon schedule updated successfully</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Coupon schedule updated"
  }
}
```
</details>

</details>









---


### getPromotions
Get promotion list




```java
platformClient.application("<APPLICATION_ID>").cart.getPromotions( pageNo,  pageSize,  q,  isActive,  promoGroup,  promotionType,  fpPanel,  promotionId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| q | String? | no |  |   
| isActive | Boolean? | no |  |   
| promoGroup | String? | no |  |   
| promotionType | String? | no |  |   
| fpPanel | String? | no |  |   
| promotionId | String? | no |  |  



Get promotion list with pagination

*Returned Response:*




[PromotionsResponse](#PromotionsResponse)

Promotion List for sent page_size and page_no




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Promotion list for sent filter and page size</i></summary>

```json
{
  "value": {
    "items": [
      {
        "_id": "61dc8dc9adf45b2273a70a6e",
        "application_id": "000000000000000000000004",
        "promo_group": "product",
        "promotion_type": "bogo",
        "date_meta": {
          "modified_on": "2022-01-11T05:47:11.503000+00:00",
          "created_on": "2022-01-10T19:49:29.917000+00:00"
        },
        "display_meta": {
          "name": "Test BOGO promo"
        },
        "ownership": {
          "payable_category": "seller",
          "payable_by": ""
        },
        "author": {
          "created_by": "5",
          "modified_by": "5"
        },
        "_schedule": {
          "start": "2022-01-10T18:45:36.311000+00:00",
          "end": "2025-01-10T18:45:36.311000+00:00",
          "published": true,
          "next_schedule": [
            {
              "start": "2022-01-10T18:45:36.311000+00:00",
              "end": null,
              "cron": ""
            }
          ],
          "duration": 0
        },
        "discount_rules": [
          {
            "buy_condition": "( rule#1 )",
            "offer": {
              "max_offer_quantity": 2
            },
            "discount_type": "bogo",
            "item_criteria": {
              "item_brand": [
                2,
                14,
                65
              ]
            }
          }
        ],
        "buy_rules": {
          "rule#1": {
            "cart_quantity": {
              "greater_than_equals": 5
            },
            "item_brand": [
              1,
              2,
              14,
              16,
              29,
              39,
              43,
              65,
              73
            ]
          }
        },
        "mode": "promotion"
      }
    ],
    "page": {
      "type": "number",
      "has_next": true,
      "size": 10,
      "current": 1,
      "item_total": 30
    }
  }
}
```
</details>

</details>









---


### createPromotion
Create new promotion




```java
platformClient.application("<APPLICATION_ID>").cart.createPromotion(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [PromotionAdd](#PromotionAdd) | yes | Request body |


Create new promotion

*Returned Response:*




[PromotionAdd](#PromotionAdd)

Promotion Created successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "61dc8dc9adf45b2273a70a6e",
  "application_id": "000000000000000000000001",
  "promo_group": "product",
  "promotion_type": "bogo",
  "date_meta": {
    "modified_on": "2022-01-11T05:47:11.503000+00:00",
    "created_on": "2022-01-10T19:49:29.917000+00:00"
  },
  "discount_rules": [
    {
      "buy_condition": "( rule#1 )",
      "offer": {
        "max_offer_quantity": 2
      },
      "discount_type": "bogo",
      "item_criteria": {
        "item_brand": [
          2,
          14,
          65
        ]
      }
    }
  ],
  "buy_rules": {
    "rule#1": {
      "cart_quantity": {
        "greater_than_equals": 5
      },
      "item_brand": [
        1,
        2,
        14,
        16,
        29,
        39,
        43,
        65,
        73
      ]
    }
  },
  "display_meta": {
    "offer_text": "Test",
    "name": "Test BOGO promo",
    "description": "Test"
  },
  "apply_all_discount": false,
  "apply_exclusive": null,
  "stackable": true,
  "restrictions": {
    "user_id": [],
    "anonymous_users": true,
    "platforms": [
      "web",
      "android",
      "ios"
    ],
    "post_order": {
      "cancellation_allowed": true,
      "return_allowed": true
    },
    "uses": {
      "remaining": {
        "user": 0,
        "total": 0
      },
      "maximum": {
        "user": 0,
        "total": 0
      }
    },
    "payments": []
  },
  "_custom_json": {},
  "author": {
    "created_by": "5",
    "modified_by": "5"
  },
  "_schedule": {
    "start": "2022-01-10T18:45:36.311Z",
    "end": "2025-01-10T18:45:36.311Z",
    "published": true,
    "next_schedule": [
      {
        "start": "2022-01-10T18:45:36.311Z",
        "end": "2025-01-10T18:45:36.311Z"
      }
    ],
    "cron": "",
    "duration": 0
  },
  "apply_priority": 1,
  "visiblility": {
    "pdp": true,
    "coupon_list": false
  },
  "ownership": {
    "payable_by": "",
    "payable_category": "seller"
  },
  "currency": "INR",
  "mode": "promotion",
  "post_order_action": {
    "action_date": null,
    "action_type": ""
  },
  "indexed_criteria": {
    "item_brand": [
      1,
      2
    ]
  }
}
```
</details>









---


### getPromotionById
Get with single promotion details or promotion list




```java
platformClient.application("<APPLICATION_ID>").cart.getPromotionById( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  



Get single promotion details with `id` in path param

*Returned Response:*




[PromotionUpdate](#PromotionUpdate)

Promotion object for sent `id`




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "61dc8dc9adf45b2273a70a6e",
  "application_id": "000000000000000000000001",
  "promo_group": "product",
  "promotion_type": "bogo",
  "date_meta": {
    "modified_on": "2022-01-11T05:47:11.503000+00:00",
    "created_on": "2022-01-10T19:49:29.917000+00:00"
  },
  "discount_rules": [
    {
      "buy_condition": "( rule#1 )",
      "offer": {
        "max_offer_quantity": 2
      },
      "discount_type": "bogo",
      "item_criteria": {
        "item_brand": [
          2,
          14,
          65
        ]
      }
    }
  ],
  "buy_rules": {
    "rule#1": {
      "cart_quantity": {
        "greater_than_equals": 5
      },
      "item_brand": [
        1,
        2,
        14,
        16,
        29,
        39,
        43,
        65,
        73
      ]
    }
  },
  "display_meta": {
    "offer_text": "Test",
    "name": "Test BOGO promo",
    "description": "test"
  },
  "apply_all_discount": false,
  "apply_exclusive": null,
  "stackable": true,
  "restrictions": {
    "user_id": [],
    "anonymous_users": true,
    "platforms": [
      "web",
      "android",
      "ios"
    ],
    "post_order": {
      "cancellation_allowed": true,
      "return_allowed": true
    },
    "uses": {
      "remaining": {
        "user": 0,
        "total": 0
      },
      "maximum": {
        "user": 0,
        "total": 0
      }
    },
    "payments": []
  },
  "_custom_json": {},
  "author": {
    "created_by": "5",
    "modified_by": "5"
  },
  "_schedule": {
    "start": "2022-01-10T18:45:36.311Z",
    "end": "2025-01-10T18:45:36.311Z",
    "published": true,
    "next_schedule": [
      {
        "start": "2022-01-10T18:45:36.311Z",
        "end": "2025-01-10T18:45:36.311Z"
      }
    ],
    "cron": "",
    "duration": 0
  },
  "apply_priority": 1,
  "visiblility": {
    "pdp": true,
    "coupon_list": false
  },
  "ownership": {
    "payable_by": "",
    "payable_category": "seller"
  },
  "currency": "INR",
  "mode": "promotion",
  "post_order_action": {
    "action_date": null,
    "action_type": ""
  },
  "indexed_criteria": {
    "item_brand": [
      1,
      2
    ]
  }
}
```
</details>









---


### updatePromotion
Update existing promotion configuration




```java
platformClient.application("<APPLICATION_ID>").cart.updatePromotion( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  
| body | [PromotionUpdate](#PromotionUpdate) | yes | Request body |


Update promotion with id sent in `id`

*Returned Response:*




[PromotionUpdate](#PromotionUpdate)

Promotion updated successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "61dc8dc9adf45b2273a70a6e",
  "application_id": "000000000000000000000001",
  "promo_group": "product",
  "promotion_type": "bogo",
  "date_meta": {
    "modified_on": "2022-01-11T05:47:11.503000+00:00",
    "created_on": "2022-01-10T19:49:29.917000+00:00"
  },
  "discount_rules": [
    {
      "buy_condition": "( rule#1 )",
      "offer": {
        "max_offer_quantity": 2
      },
      "discount_type": "bogo",
      "item_criteria": {
        "item_brand": [
          2,
          14,
          65
        ]
      }
    }
  ],
  "buy_rules": {
    "rule#1": {
      "cart_quantity": {
        "greater_than_equals": 5
      },
      "item_brand": [
        1,
        2,
        14,
        16,
        29,
        39,
        43,
        65,
        73
      ]
    }
  },
  "display_meta": {
    "offer_text": "Test",
    "name": "Test BOGO promo",
    "description": "Test"
  },
  "apply_all_discount": false,
  "apply_exclusive": null,
  "stackable": true,
  "restrictions": {
    "user_id": [],
    "anonymous_users": true,
    "platforms": [
      "web",
      "android",
      "ios"
    ],
    "post_order": {
      "cancellation_allowed": true,
      "return_allowed": true
    },
    "uses": {
      "remaining": {
        "user": 0,
        "total": 0
      },
      "maximum": {
        "user": 0,
        "total": 0
      }
    },
    "payments": []
  },
  "_custom_json": {},
  "author": {
    "created_by": "5",
    "modified_by": "5"
  },
  "_schedule": {
    "start": "2022-01-10T18:45:36.311Z",
    "end": "2025-01-10T18:45:36.311Z",
    "published": true,
    "next_schedule": [
      {
        "start": "2022-01-10T18:45:36.311Z",
        "end": "2025-01-10T18:45:36.311Z"
      }
    ],
    "cron": "",
    "duration": 0
  },
  "apply_priority": 1,
  "visiblility": {
    "pdp": true,
    "coupon_list": false
  },
  "ownership": {
    "payable_by": "",
    "payable_category": "seller"
  },
  "currency": "INR",
  "mode": "promotion",
  "post_order_action": {
    "action_date": null,
    "action_type": ""
  },
  "indexed_criteria": {
    "item_brand": [
      1,
      2
    ]
  }
}
```
</details>









---


### updatePromotionPartially
Update promotion publish state and schedule




```java
platformClient.application("<APPLICATION_ID>").cart.updatePromotionPartially( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  
| body | [PromotionPartialUpdate](#PromotionPartialUpdate) | yes | Request body |


Update publish/unpublish and change schedule for promotion

*Returned Response:*




[SuccessMessage](#SuccessMessage)

Promotion updated successfully




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Publish or Unpublish promotion</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Promotion Updated"
  }
}
```
</details>

<details>
<summary><i>&nbsp; Promotion schedule updated successfully</i></summary>

```json
{
  "value": {
    "success": true,
    "message": "Promotion schedule updated"
  }
}
```
</details>

</details>









---


### getPromosCouponConfig
Fetch all promos that are set as active




```java
platformClient.application("<APPLICATION_ID>").cart.getPromosCouponConfig( entityType,  isHidden) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| entityType | String? | no | entity_type as promotion or coupon |   
| isHidden | Boolean? | no | promo-coupon config shown or not |  



Use this API to get list of all the active promos/coupons.

*Returned Response:*




[ActivePromosResponse](#ActivePromosResponse)

Success. Returns a list of all the curently active coupons/promos




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": "Success",
  "items": [
    {
      "_id": "634647aa9d4b59bf1a0c1269",
      "entity_slug": "percentage_quantity_percentage",
      "title": "X Percentage Value",
      "subtitle": "Get a fixed percentage discount on the effective selling price",
      "description": "Here, Buy items(BI) is the minimum number of items eligible for a discount Percentage Value(D) is the fixed percentage discount Maximum Discount Amount(MD) (optional) is a limit to the discount Minimum Cart Value(MCV) (optional) is the minimum price of the cart items Apply coupon on exact quantities (optional) if checked, will apply the coupon only to the specified Buy items and if unchecked, will apply the coupon to more than the specified Buy items",
      "is_hidden": true,
      "entity_type": "promotion",
      "type": "percentage",
      "created_on": "2022-05-30 07:33:01.303000",
      "modified_on": "2022-05-31 10:41:01.441000"
    }
  ]
}
```
</details>









---


### updateCartMetaConfig
Update cart meta configuration




```java
platformClient.application("<APPLICATION_ID>").cart.updateCartMetaConfig( cartMetaId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| cartMetaId | String | yes |  |  
| body | [CartMetaConfigUpdate](#CartMetaConfigUpdate) | yes | Request body |


Update cart meta configuration

*Returned Response:*




[CartMetaConfigUpdate](#CartMetaConfigUpdate)

Cart Meta Config Created successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "645ba594d414eb0669e6ee14",
  "app_id": "60792ded7826bd09330ed90d",
  "company_id": 884,
  "bulk_coupons": false,
  "delivery_charges": {
    "charges": [],
    "enabled": false
  },
  "empty_cart": false,
  "enabled": true,
  "max_cart_items": 50,
  "min_cart_value": 0,
  "revenue_engine_coupon": false,
  "gift_pricing": 50,
  "gift_display_text": ""
}
```
</details>









---


### fetchCartMetaConfig
Fetch cart meta configuration




```java
platformClient.application("<APPLICATION_ID>").cart.fetchCartMetaConfig() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  



Fetch cart meta configuration

*Returned Response:*




[CartMetaConfigAdd](#CartMetaConfigAdd)

Cart Meta Config Fetched successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "645ba594d414eb0669e6ee14",
  "app_id": "60792ded7826bd09330ed90d",
  "company_id": 884,
  "bulk_coupons": false,
  "delivery_charges": {
    "charges": [],
    "enabled": false
  },
  "empty_cart": false,
  "enabled": true,
  "max_cart_items": 50,
  "min_cart_value": 0,
  "revenue_engine_coupon": false,
  "gift_pricing": 50,
  "gift_display_text": ""
}
```
</details>









---


### createCartMetaConfig
Create new cart meta configuration




```java
platformClient.application("<APPLICATION_ID>").cart.createCartMetaConfig(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [CartMetaConfigAdd](#CartMetaConfigAdd) | yes | Request body |


Create new cart meta configuration

*Returned Response:*




[CartMetaConfigAdd](#CartMetaConfigAdd)

Cart Meta Config Created successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "_id": "645ba594d414eb0669e6ee14",
  "app_id": "60792ded7826bd09330ed90d",
  "company_id": 884,
  "bulk_coupons": false,
  "delivery_charges": {
    "charges": [],
    "enabled": false
  },
  "empty_cart": false,
  "enabled": true,
  "max_cart_items": 50,
  "min_cart_value": 0,
  "revenue_engine_coupon": false,
  "gift_pricing": 50,
  "gift_display_text": ""
}
```
</details>









---


### updatePriceAdjustment
Update price adjustment configuration




```java
platformClient.application("<APPLICATION_ID>").cart.updatePriceAdjustment( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  
| body | [PriceAdjustmentUpdate](#PriceAdjustmentUpdate) | yes | Request body |


Update price adjustment configuration

*Returned Response:*




[PriceAdjustmentResponse](#PriceAdjustmentResponse)

Price Adjustment Updated successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "data": {
    "id": "cc8154592ccb42c88b481ce4c21ab602",
    "cart_id": "fa45f5cbd3764a6297bfa79d6bedf71c",
    "is_authenticated": true,
    "article_ids": [
      {
        "article_id": "f322167ce70f4dca8f8ac0efdc496abe",
        "value": 100,
        "code": "abs120",
        "meta": {},
        "quantity": 2
      }
    ],
    "type": "discount",
    "message": "Fynd Campaign 100 Rs off",
    "value": 100,
    "article_level_distribution": true,
    "allow_refund": true,
    "meta": {},
    "collection": {
      "collected_by": "FYND",
      "refund_by": "FYND"
    },
    "restrictions": {
      "post_order": {
        "cancellation_allowed": false,
        "return_allowed": false
      }
    }
  }
}
```
</details>









---


### removePriceAdjustment
Remove price adjustment




```java
platformClient.application("<APPLICATION_ID>").cart.removePriceAdjustment( id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |  



Remove price adjustment

*Returned Response:*




[SuccessMessage](#SuccessMessage)

Price Adjustment data Removed successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Price Adjustment removed successfully"
}
```
</details>









---


### addPriceAdjustment
Create new price adjustment




```java
platformClient.application("<APPLICATION_ID>").cart.addPriceAdjustment(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [PriceAdjustmentAdd](#PriceAdjustmentAdd) | yes | Request body |


Create new price adjustment

*Returned Response:*




[PriceAdjustmentResponse](#PriceAdjustmentResponse)

Price Adjustment Created successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "data": {
    "id": "cc8154592ccb42c88b481ce4c21ab602",
    "cart_id": "fa45f5cbd3764a6297bfa79d6bedf71c",
    "is_authenticated": true,
    "article_ids": [
      {
        "article_id": "f322167ce70f4dca8f8ac0efdc496abe",
        "value": 100,
        "code": "abs120",
        "meta": {},
        "quantity": 2
      }
    ],
    "type": "discount",
    "message": "Fynd Campaign 100 Rs off",
    "value": 100,
    "article_level_distribution": true,
    "allow_refund": true,
    "meta": {},
    "collection": {
      "collected_by": "FYND",
      "refund_by": "FYND"
    },
    "restrictions": {
      "post_order": {
        "cancellation_allowed": false,
        "return_allowed": false
      }
    }
  }
}
```
</details>









---


### fetchAndvalidateCartItems
Fetch Cart Details




```java
platformClient.application("<APPLICATION_ID>").cart.fetchAndvalidateCartItems(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [OpenapiCartDetailsRequest](#OpenapiCartDetailsRequest) | yes | Request body |


Get all the details of cart for a list of provided `cart_items`

*Returned Response:*




[OpenapiCartDetailsResponse](#OpenapiCartDetailsResponse)

Cart details with breakup




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "quantity": 1,
      "identifiers": {
        "user_id": [],
        "brand_id": [
          9
        ]
      },
      "message": "",
      "coupon_message": "",
      "product": {
        "type": "product",
        "uid": 803140,
        "name": "Green Solid T-Shirt",
        "slug": "celio-green-solid-t-shirt-803140-dd9e2c",
        "brand": {
          "uid": 44,
          "name": "celio"
        },
        "categories": [
          {
            "uid": 192,
            "name": "T-Shirts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/celio-green-solid-t-shirt-803140-dd9e2c/",
          "query": {
            "product_slug": [
              "celio-green-solid-t-shirt-803140-dd9e2c"
            ]
          }
        }
      },
      "article": {
        "type": "article",
        "uid": "25_44_A7050_NEMIEL@GREENBRITISH_S",
        "size": "S",
        "seller": {
          "uid": 25,
          "name": "CELIO FUTURE FASHION PRIVATE LIMITED"
        },
        "store": {
          "uid": 1486,
          "name": "Forum Mall"
        },
        "quantity": 1,
        "price": {
          "base": {
            "marked": 1299,
            "effective": 649.5,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1299,
            "effective": 649.5,
            "currency_code": "INR"
          }
        }
      },
      "key": "803140_S",
      "discount": "50% OFF",
      "price": {
        "base": {
          "add_on": 0,
          "marked": 1299,
          "effective": 649.5,
          "selling": 649.5,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 0,
          "marked": 1299,
          "effective": 649.5,
          "selling": 649.5,
          "currency_code": "INR"
        }
      },
      "availability": {
        "sizes": [
          "L",
          "XL",
          "M",
          "S"
        ],
        "other_store_quantity": 0,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true,
        "available_sizes": [
          {
            "is_available": true,
            "display": "L",
            "value": "L"
          },
          {
            "is_available": true,
            "display": "XXL",
            "value": "XXL"
          },
          {
            "is_available": true,
            "display": "XL",
            "value": "XL"
          },
          {
            "is_available": true,
            "display": "M",
            "value": "M"
          },
          {
            "is_available": true,
            "display": "S",
            "value": "S"
          },
          {
            "is_available": false,
            "display": "30",
            "value": "30"
          }
        ]
      },
      "bulk_offer": {}
    },
    {
      "quantity": 1,
      "identifiers": {
        "user_id": [],
        "brand_id": [
          9
        ]
      },
      "message": "Out of stock. Please remove item",
      "coupon_message": "",
      "product": {
        "type": "product",
        "uid": 803140,
        "name": "Green Solid T-Shirt",
        "slug": "celio-green-solid-t-shirt-803140-dd9e2c",
        "brand": {
          "uid": 44,
          "name": "celio"
        },
        "categories": [
          {
            "uid": 192,
            "name": "T-Shirts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/celio-green-solid-t-shirt-803140-dd9e2c/",
          "query": {
            "product_slug": [
              "celio-green-solid-t-shirt-803140-dd9e2c"
            ]
          }
        }
      },
      "article": {},
      "key": "803140_S",
      "discount": "",
      "price": {
        "base": {
          "add_on": 0,
          "marked": 1299,
          "effective": 1299,
          "selling": 1299,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 0,
          "marked": 1299,
          "effective": 1299,
          "selling": 1299,
          "currency_code": "INR"
        }
      },
      "availability": {
        "sizes": [
          "L",
          "XXL",
          "XL",
          "M",
          "S"
        ],
        "other_store_quantity": 0,
        "out_of_stock": true,
        "deliverable": false,
        "is_valid": false,
        "available_sizes": [
          {
            "is_available": true,
            "display": "L",
            "value": "L"
          },
          {
            "is_available": true,
            "display": "XXL",
            "value": "XXL"
          },
          {
            "is_available": true,
            "display": "XL",
            "value": "XL"
          },
          {
            "is_available": true,
            "display": "M",
            "value": "M"
          },
          {
            "is_available": true,
            "display": "S",
            "value": "S"
          },
          {
            "is_available": false,
            "display": "30",
            "value": "30"
          }
        ]
      },
      "bulk_offer": {}
    }
  ],
  "is_valid": false,
  "breakup_values": {
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 2598,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -649,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 1949,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 1949,
        "currency_code": "INR"
      }
    ],
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": -649.5,
      "fynd_cash": 0,
      "gst_charges": 170.11,
      "mrp_total": 2598,
      "subtotal": 1948.5,
      "total": 1948.5,
      "vog": 1778.39,
      "you_saved": 0
    }
  }
}
```
</details>









---


### checkCartServiceability
Check Pincode Serviceability




```java
platformClient.application("<APPLICATION_ID>").cart.checkCartServiceability(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [OpenApiCartServiceabilityRequest](#OpenApiCartServiceabilityRequest) | yes | Request body |


Check Pincode serviceability for cart items provided in `cart_items` and address pincode in `shipping_address`

*Returned Response:*




[OpenApiCartServiceabilityResponse](#OpenApiCartServiceabilityResponse)

Cart details with pincode validity information at item level




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Valid pincode</i></summary>

```json
{
  "value": {
    "items": [
      {
        "quantity": 1,
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "message": "",
        "coupon_message": "",
        "product": {
          "type": "product",
          "uid": 803140,
          "name": "Green Solid T-Shirt",
          "slug": "celio-green-solid-t-shirt-803140-dd9e2c",
          "brand": {
            "uid": 44,
            "name": "celio"
          },
          "categories": [
            {
              "uid": 192,
              "name": "T-Shirts"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/celio-green-solid-t-shirt-803140-dd9e2c/",
            "query": {
              "product_slug": [
                "celio-green-solid-t-shirt-803140-dd9e2c"
              ]
            }
          }
        },
        "article": {
          "type": "article",
          "uid": "25_44_A7050_NEMIEL@GREENBRITISH_S",
          "size": "S",
          "seller": {
            "uid": 25,
            "name": "CELIO FUTURE FASHION PRIVATE LIMITED"
          },
          "store": {
            "uid": 1486,
            "name": "Forum Mall"
          },
          "quantity": 1,
          "price": {
            "base": {
              "marked": 1299,
              "effective": 649.5,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 1299,
              "effective": 649.5,
              "currency_code": "INR"
            }
          }
        },
        "key": "803140_S",
        "discount": "50% OFF",
        "price": {
          "base": {
            "add_on": 0,
            "marked": 1299,
            "effective": 649.5,
            "selling": 649.5,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 0,
            "marked": 1299,
            "effective": 649.5,
            "selling": 649.5,
            "currency_code": "INR"
          }
        },
        "availability": {
          "sizes": [
            "L",
            "XL",
            "M",
            "S"
          ],
          "other_store_quantity": 0,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true,
          "delivery_promise": {
            "timestamp": {
              "min": 1605306343,
              "max": 1605468343
            },
            "formatted": {
              "min": "Sat, 14 Nov",
              "max": "Mon, 16 Nov"
            }
          },
          "available_sizes": [
            {
              "is_available": true,
              "display": "L",
              "value": "L"
            },
            {
              "is_available": true,
              "display": "XXL",
              "value": "XXL"
            },
            {
              "is_available": true,
              "display": "XL",
              "value": "XL"
            },
            {
              "is_available": true,
              "display": "M",
              "value": "M"
            },
            {
              "is_available": true,
              "display": "S",
              "value": "S"
            },
            {
              "is_available": false,
              "display": "30",
              "value": "30"
            }
          ]
        },
        "bulk_offer": {}
      },
      {
        "quantity": 1,
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "message": "Out of stock. Please remove item",
        "coupon_message": "",
        "product": {
          "type": "product",
          "uid": 803140,
          "name": "Green Solid T-Shirt",
          "slug": "celio-green-solid-t-shirt-803140-dd9e2c",
          "brand": {
            "uid": 44,
            "name": "celio"
          },
          "categories": [
            {
              "uid": 192,
              "name": "T-Shirts"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/44_NEMIEL@GREENBRITISH/1_1548161273344.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/celio-green-solid-t-shirt-803140-dd9e2c/",
            "query": {
              "product_slug": [
                "celio-green-solid-t-shirt-803140-dd9e2c"
              ]
            }
          }
        },
        "article": {},
        "key": "803140_S",
        "discount": "",
        "price": {
          "base": {
            "add_on": 0,
            "marked": 1299,
            "effective": 1299,
            "selling": 1299,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 0,
            "marked": 1299,
            "effective": 1299,
            "selling": 1299,
            "currency_code": "INR"
          }
        },
        "availability": {
          "sizes": [
            "L",
            "XXL",
            "XL",
            "M",
            "S"
          ],
          "other_store_quantity": 0,
          "out_of_stock": true,
          "deliverable": false,
          "is_valid": false,
          "delivery_promise": {
            "timestamp": {
              "min": 1605306343,
              "max": 1605468343
            },
            "formatted": {
              "min": "Sat, 14 Nov",
              "max": "Mon, 16 Nov"
            }
          },
          "available_sizes": [
            {
              "is_available": true,
              "display": "L",
              "value": "L"
            },
            {
              "is_available": true,
              "display": "XXL",
              "value": "XXL"
            },
            {
              "is_available": true,
              "display": "XL",
              "value": "XL"
            },
            {
              "is_available": true,
              "display": "M",
              "value": "M"
            },
            {
              "is_available": true,
              "display": "S",
              "value": "S"
            },
            {
              "is_available": false,
              "display": "30",
              "value": "30"
            }
          ]
        },
        "bulk_offer": {}
      }
    ],
    "delivery_promise": {
      "timestamp": {
        "min": 1605306343,
        "max": 1605468343
      },
      "formatted": {
        "min": "Sat, 14 Nov",
        "max": "Mon, 16 Nov"
      }
    },
    "is_valid": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Invalid pincode</i></summary>

```json
{
  "value": {
    "message": "All of the items in your cart are not deliverable to 800108",
    "is_valid": false,
    "items": [
      {
        "discount": "15% OFF",
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "price": {
          "base": {
            "add_on": 0,
            "marked": 2195,
            "effective": 1866,
            "selling": 1866,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 0,
            "marked": 2195,
            "effective": 1866,
            "selling": 1866,
            "currency_code": "INR"
          }
        },
        "product": {
          "type": "product",
          "uid": 876245,
          "name": "Brown Sandals",
          "slug": "red-chief-brown-sandals-876245-c92507",
          "brand": {
            "uid": 433,
            "name": ""
          },
          "categories": [
            {
              "uid": 176,
              "name": ""
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/433_RC330004/1_1564147181287.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/433_RC330004/1_1564147181287.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/red-chief-brown-sandals-876245-c92507/",
            "query": {
              "product_slug": [
                "red-chief-brown-sandals-876245-c92507"
              ]
            }
          },
          "item_code": "RC330004"
        },
        "bulk_offer": {},
        "key": "876245_6",
        "message": "We are not delivering to 800108",
        "delivery_promise": {
          "timestamp": {
            "min": 1646257339,
            "max": 1646689339,
            "formatted": {
              "min": "03 Mar, Thursday",
              "max": "08 Mar, Tuesday"
            }
          }
        },
        "coupon_message": "",
        "availability": {
          "sizes": [
            "7",
            "6",
            "10",
            "8"
          ],
          "other_store_quantity": 21,
          "out_of_stock": false,
          "deliverable": false,
          "is_valid": true,
          "available_sizes": [
            {
              "is_available": false,
              "display": "9",
              "value": "9"
            },
            {
              "is_available": true,
              "display": "10",
              "value": "10"
            },
            {
              "is_available": true,
              "display": "6",
              "value": "6"
            },
            {
              "is_available": true,
              "display": "7",
              "value": "7"
            },
            {
              "is_available": true,
              "display": "8",
              "value": "8"
            }
          ]
        },
        "quantity": 1,
        "article": {
          "type": "article",
          "uid": "304_433_LGPL30402_RC330004_6",
          "size": "6",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 9767,
            "name": "Udyog Kunj, Kanpur"
          },
          "quantity": 3,
          "price": {
            "base": {
              "marked": 2195,
              "effective": 1866,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2195,
              "effective": 1866,
              "currency_code": "INR"
            }
          }
        }
      },
      {
        "discount": "15% OFF",
        "identifiers": {
          "identifier": "gIq0E94RSMueSdDRAk_Txg"
        },
        "price": {
          "base": {
            "add_on": 0,
            "marked": 2195,
            "effective": 1866,
            "selling": 1866,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 0,
            "marked": 2195,
            "effective": 1866,
            "selling": 1866,
            "currency_code": "INR"
          }
        },
        "product": {
          "type": "product",
          "uid": 876245,
          "name": "Brown Sandals",
          "slug": "red-chief-brown-sandals-876245-c92507",
          "brand": {
            "uid": 433,
            "name": ""
          },
          "categories": [
            {
              "uid": 176,
              "name": ""
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/433_RC330004/1_1564147181287.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/433_RC330004/1_1564147181287.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/red-chief-brown-sandals-876245-c92507/",
            "query": {
              "product_slug": [
                "red-chief-brown-sandals-876245-c92507"
              ]
            }
          },
          "item_code": "RC330004"
        },
        "bulk_offer": {},
        "key": "876245_6",
        "message": "We are not delivering to 800108",
        "coupon_message": "",
        "availability": {
          "sizes": [
            "7",
            "6",
            "10",
            "8"
          ],
          "other_store_quantity": 21,
          "out_of_stock": false,
          "deliverable": false,
          "is_valid": true,
          "available_sizes": [
            {
              "is_available": false,
              "display": "9",
              "value": "9"
            },
            {
              "is_available": true,
              "display": "10",
              "value": "10"
            },
            {
              "is_available": true,
              "display": "6",
              "value": "6"
            },
            {
              "is_available": true,
              "display": "7",
              "value": "7"
            },
            {
              "is_available": true,
              "display": "8",
              "value": "8"
            }
          ]
        },
        "quantity": 1,
        "article": {
          "type": "article",
          "uid": "304_433_LGPL30402_RC330004_6",
          "size": "6",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 9767,
            "name": "Udyog Kunj, Kanpur"
          },
          "quantity": 3,
          "price": {
            "base": {
              "marked": 2195,
              "effective": 1866,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2195,
              "effective": 1866,
              "currency_code": "INR"
            }
          }
        }
      }
    ]
  }
}
```
</details>

</details>









---


### checkoutCart
Create Fynd order with cart details




```java
platformClient.application("<APPLICATION_ID>").cart.checkoutCart(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [OpenApiPlatformCheckoutReq](#OpenApiPlatformCheckoutReq) | yes | Request body |


Generate Fynd order for cart details send with provided `cart_items`

*Returned Response:*




[OpenApiCheckoutResponse](#OpenApiCheckoutResponse)

Checkout cart and create Fynd order id




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "order_id": "FY5E182A9D0A5E405446",
  "message": "Order initiation completed",
  "order_ref_id": "5d64e3500bcad8693a821c0d"
}
```
</details>









---


### getAbandonedCart
Get with abandoned cart list




```java
platformClient.application("<APPLICATION_ID>").cart.getAbandonedCart( pageNo,  pageSize,  fromDate,  toDate,  anonymousCart,  lastId,  sortOn) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| anonymousCart | Boolean? | no |  |   
| lastId | String? | no |  |   
| sortOn | String? | no |  |  



Get abandoned cart list with pagination

*Returned Response:*




[AbandonedCartResponse](#AbandonedCartResponse)

Abandoned Cart List for sent page_size and page_no




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Abandoned Cart list for sent filter and page size</i></summary>

```json
{
  "value": {
    "message": "Cart fetched successfully !!",
    "success": true,
    "result": {},
    "items": [
      {
        "_id": "62bbe2c4b79692d559ac1f16",
        "uid": 19986,
        "user_id": "600693a01faf8695d70a15df",
        "is_default": true,
        "app_id": "5d64e3500bcad8693a821c0d",
        "articles": [
          {
            "service_item_meta": {
              "product_group_tags": null,
              "products": null
            },
            "parent_item_identifiers": {
              "identifier": null,
              "parent_item_size": null,
              "parent_item_id": null
            },
            "item_id": 7500426,
            "item_size": "SET1",
            "article_id": "5f37d9b71cb7c10001b90ee2",
            "quantity": 2,
            "price_marked": 1000,
            "price_effective": 1,
            "currency_code": "INR",
            "store_id": 10183,
            "company_id": 61,
            "article_assignment": {
              "level": "multi-companies",
              "strategy": "optimal"
            },
            "brand_uid": 85,
            "l3_categories": [
              466
            ],
            "discount": 99.9,
            "coupon": {
              "amount": 0,
              "currency_code": "INR",
              "article_count": 0
            },
            "referral_credits": {
              "amount": 0,
              "currency_code": "FC"
            },
            "cashback": {
              "amount": 0,
              "currency_code": "FC"
            },
            "bulk_coupon": {
              "margin": 0,
              "discount": 0,
              "code": null
            },
            "promotion": [
              {
                "promo_id": "62bbf355beda57df173122fa",
                "amount": 1,
                "article_quantity": 2,
                "mrp_promotion": false,
                "promotion_type": "amount",
                "discount_rules": [
                  {
                    "type": "amount",
                    "value": 125
                  }
                ]
              }
            ],
            "identifiers": {
              "identifier": "pEF2t4GGTKaieox5rsRibw"
            },
            "meta": {},
            "extra_meta": {},
            "payment_methods": []
          }
        ],
        "cart_value": 1,
        "discount": 0,
        "delivery_charges": {
          "amount": 1,
          "currency_code": "INR"
        },
        "coupon": {
          "amount": 0,
          "currency_code": "INR",
          "code": null,
          "type": "cart",
          "uid": "",
          "id": null
        },
        "promotion": {
          "amount": 2,
          "currency_code": "INR",
          "mode": "promotion",
          "promotions": [
            {
              "id": "62bbf355beda57df173122fa",
              "mrp_promo": false,
              "promo_group": "product"
            }
          ]
        },
        "fynd_credits": {
          "amount": 0,
          "currency_code": "FC",
          "auto_applied": true
        },
        "cod_charges": {
          "amount": 0,
          "currency_code": "INR"
        },
        "cashback": {
          "amount": 0,
          "currency_code": "FC",
          "uid": ""
        },
        "payments": {},
        "is_archive": false,
        "created_on": "2022-06-28 14:25:15.578000",
        "last_modified": "2022-06-29 13:52:03.313000",
        "expire_at": "2023-06-24 13:52:03.313000",
        "fc_index_map": [
          0,
          0
        ],
        "checkout_mode": "self",
        "meta": {
          "shipping_address_id": "62b161cb3ad0eed3e48ec6a9",
          "billing_address_id": "62b161cb3ad0eed3e48ec6a9"
        },
        "comment": "",
        "bulk_coupon_discount": 0,
        "pick_up_customer_details": {},
        "is_active": true,
        "shipments": [],
        "payment_methods": [],
        "buy_now": false
      }
    ],
    "page": {
      "type": "number",
      "has_next": false,
      "item_total": 28,
      "size": 20,
      "page": 2,
      "current": 2,
      "last_id": "62d4ff76d6aec8db897de407"
    }
  }
}
```
</details>

</details>









---


### getAbandonedCartDetails
Fetch all items added to the cart




```java
platformClient.application("<APPLICATION_ID>").cart.getAbandonedCartDetails( id,  i,  b,  c) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| c | Boolean? | no |  |  



Use this API to get details of all the items added to a cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object. Check the example shown below or refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "bulk_offer": {},
      "discount": "67% OFF",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "article": {
        "type": "article",
        "uid": "604_902_SSTC60401_636BLUE_1",
        "size": "1",
        "seller": {
          "uid": 604,
          "name": "SHRI SHANTINATH TRADING COMPANY"
        },
        "store": {
          "uid": 4579,
          "name": "Gandhi Nagar"
        },
        "quantity": 108,
        "price": {
          "base": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          }
        }
      },
      "coupon_message": "",
      "key": "707569_1",
      "availability": {
        "sizes": [
          "1",
          "8",
          "7",
          "2",
          "9",
          "5",
          "3",
          "6"
        ],
        "other_store_quantity": 107,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 707569,
        "name": "Blue and Gold Printed Ethnic Set",
        "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
        "brand": {
          "uid": 902,
          "name": ""
        },
        "categories": [
          {
            "uid": 525,
            "name": ""
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
          "query": {
            "product_slug": [
              "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
            ]
          }
        }
      },
      "price": {
        "base": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        }
      },
      "message": "",
      "quantity": 1
    }
  ],
  "buy_now": false,
  "cart_id": 54,
  "uid": "54",
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": -2000,
      "fynd_cash": 0,
      "gst_charges": 47.57,
      "mrp_total": 2999,
      "subtotal": 999,
      "total": 999,
      "vog": 951.43,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "",
      "uid": "21755",
      "value": 0,
      "is_applied": false,
      "message": "Sorry! Invalid Coupon"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 2999,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -2000,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 999,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 999,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "gstin": "",
  "checkout_mode": "self",
  "restrict_checkout": false,
  "is_valid": true,
  "last_modified": "2022-06-28"
}
```
</details>









---


### addItems
Add items to abandoned cart




```java
platformClient.application("<APPLICATION_ID>").cart.addItems( cartId,  b, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| cartId | String | yes | Current Cart _id |   
| b | Boolean? | no |  |  
| body | [AddCartRequest](#AddCartRequest) | yes | Request body |


Use this API to add items to the abandoned cart.

*Returned Response:*




[AddCartDetailResponse](#AddCartDetailResponse)

Success. Returns a cart object as shown below. Refer `AddCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Product has been added to your cart</i></summary>

```json
{
  "value": {
    "message": "Product has been added to your cart",
    "success": true,
    "cart": {
      "breakup_values": {
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 17486,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -3540,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 13946,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 13946,
            "currency_code": "INR"
          }
        ],
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -3540,
          "fynd_cash": 0,
          "gst_charges": 1529.96,
          "mrp_total": 17486,
          "subtotal": 13946,
          "total": 13946,
          "vog": 12416.04,
          "you_saved": 0
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "25_44_A7050_NEMIEL@GREENBRITISH_S",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        }
      },
      "items": [
        {
          "key": "751083_10",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "612_9_SE61201_19100302_10",
            "size": "10",
            "seller": {
              "uid": 612,
              "name": "SSR ENTERPRISE"
            },
            "store": {
              "uid": 4431,
              "name": "Motilal Nagar 1, Goregaon"
            },
            "quantity": 4,
            "price": {
              "base": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "10"
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 751083,
            "name": "Carson 2",
            "slug": "puma-carson-2-751083-6ad98d",
            "brand": {
              "uid": 9,
              "name": "Puma"
            },
            "categories": [
              {
                "uid": 165,
                "name": "Outdoor Sports Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/puma-carson-2-751083-6ad98d/",
              "query": {
                "product_slug": [
                  "puma-carson-2-751083-6ad98d"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 2,
          "message": "",
          "bulk_offer": {},
          "discount": "41% OFF"
        },
        {
          "key": "246228_",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "article": {
            "type": "article",
            "uid": "46_235_TM62_M11029ONDSXNS_S",
            "size": "S",
            "seller": {
              "uid": 46,
              "name": "RELIANCE BRANDS LIMITED"
            },
            "store": {
              "uid": 4550,
              "name": "VR Mall"
            },
            "quantity": 1,
            "price": {
              "base": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "L",
              "M",
              "S",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 0,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 246228,
            "name": "Blue Solid T-Shirt",
            "slug": "superdry-blue-solid-t-shirt-2",
            "brand": {
              "uid": 235,
              "name": "Superdry"
            },
            "categories": [
              {
                "uid": 192,
                "name": "T-Shirts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/superdry-blue-solid-t-shirt-2/",
              "query": {
                "product_slug": [
                  "superdry-blue-solid-t-shirt-2"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "443175_s",
          "identifiers": {
            "identifier": "gIq0E94RSMueSdDRAk_Txg"
          },
          "article": {
            "type": "article",
            "uid": "162_207_1271_LJ03LBLUDN88_S",
            "size": "S",
            "seller": {
              "uid": 162,
              "name": "GO FASHION INDIA PRIVATE LIMITED"
            },
            "store": {
              "uid": 5784,
              "name": "Vega City mall"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "XL",
              "M",
              "L",
              "S"
            ],
            "other_store_quantity": 8,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 443175,
            "name": "Light Blue Denim Jeggings",
            "slug": "go-colors-light-blue-denim-jeggings-443175-3c688c",
            "brand": {
              "uid": 207,
              "name": "Go Colors"
            },
            "categories": [
              {
                "uid": 267,
                "name": "Jeggings"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/go-colors-light-blue-denim-jeggings-443175-3c688c/",
              "query": {
                "product_slug": [
                  "go-colors-light-blue-denim-jeggings-443175-3c688c"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "778937_OS",
          "identifiers": {
            "identifier": "gIq0E94RSMueSdDRAk_Txg"
          },
          "article": {
            "type": "article",
            "uid": "686_963_IC68601_PWUPC01977_OS",
            "size": "OS",
            "seller": {
              "uid": 686,
              "name": "INDUS CORPORATION"
            },
            "store": {
              "uid": 5059,
              "name": "Vidyaranyapura Main Road"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "OS"
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 778937,
            "name": "Colourful Carnival Bouncer",
            "slug": "fisher-price-colourful-carnival-bouncer-778937-fafa1f",
            "brand": {
              "uid": 963,
              "name": "Fisher-Price"
            },
            "categories": [
              {
                "uid": 576,
                "name": "Cradles"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/fisher-price-colourful-carnival-bouncer-778937-fafa1f/",
              "query": {
                "product_slug": [
                  "fisher-price-colourful-carnival-bouncer-778937-fafa1f"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": "11% OFF"
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 7927,
      "uid": "7927",
      "gstin": "",
      "checkout_mode": "self",
      "last_modified": "2023-03-03",
      "restrict_checkout": false,
      "is_valid": true
    },
    "result": {}
  }
}
```
</details>

<details>
<summary><i>&nbsp; Sorry, item is out of stock</i></summary>

```json
{
  "value": {
    "message": "Sorry, item is out of stock",
    "success": false,
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "identifiers": {
            "identifier": "gIq0E94RSMueSdDRAk_Txg"
          },
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": false,
      "last_modified": "2023-03-03"
    },
    "result": {}
  }
}
```
</details>

</details>









---


### updateCart
Update items in the abandoned cart




```java
platformClient.application("<APPLICATION_ID>").cart.updateCart( cartId,  b, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| cartId | String | yes | Current Cart _id |   
| b | Boolean? | no |  |  
| body | [UpdateCartRequest](#UpdateCartRequest) | yes | Request body |


Use this API to update items added to the cart with the help of a request object containing attributes like item_quantity and item_size. These attributes will be fetched from the following APIs operation Operation for current api call.update_item for update items. remove_item for removing items. item_id "/platform/content/v1/products/" "/platform/content/v1/products/:slug/sizes/" quantity item quantity (must be greater than or equal to 1) article_id "/content​/v1​/products​/:identifier​/sizes​/price​/"  item position in the cart (must be greater than or equal to 0)

*Returned Response:*




[UpdateCartDetailResponse](#UpdateCartDetailResponse)

Success. Updates and returns a cart object as shown below. Refer `UpdateCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Nothing updated</i></summary>

```json
{
  "value": {
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "identifiers": {
            "identifier": "gIq0E94RSMueSdDRAk_Txg"
          },
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": true,
      "last_modified": "2023-03-03"
    },
    "result": {
      "707569_90": {
        "success": true,
        "message": "Nothing updated"
      }
    },
    "message": "Nothing updated",
    "success": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Item updated in the cart</i></summary>

```json
{
  "value": {
    "cart": {
      "breakup_values": {
        "raw": {
          "sub_total": 8000,
          "subtotal": 8000,
          "coupon": 0,
          "promotion": -100,
          "delivery_charge": 100,
          "you_saved": 0,
          "fynd_cash": 0,
          "cod_charge": 0,
          "total": 8000,
          "gst_charges": 0,
          "vog": 0,
          "convenience_fee": 0,
          "mrp_total": 20010,
          "discount": -12010
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, reward points, and refund amount get credited to Fynd Cash which can be redeemed while placing an order.",
          "message": "Reward point not applicable with Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "original": 20010,
            "attr": "mrp_total",
            "value": 20010,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Discount",
            "key": "discount",
            "original": -12010,
            "attr": "discount",
            "value": -12010,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "original": 8000,
            "attr": "subtotal",
            "value": 8000,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Promotion",
            "key": "promotion",
            "original": -100,
            "attr": "promotion",
            "value": -100,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Delivery Charge",
            "key": "delivery_charge",
            "original": 100,
            "attr": "delivery_charge",
            "value": 100,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": [
              "Delivery charges applicable ₹100.00 on order upto ₹10,000.00",
              "Free delivery on order above ₹10,000.00"
            ]
          },
          {
            "display": "Total",
            "key": "total",
            "original": 8000,
            "attr": "total",
            "value": 8000,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          }
        ]
      },
      "items": [
        {
          "parent_item_identifiers": {
            "identifier": null,
            "parent_item_size": null,
            "parent_item_id": null
          },
          "article": {
            "type": "article",
            "uid": "618c1a6874b93908c98f6d18",
            "size": "XL",
            "product_group_tags": [
              "tag1"
            ],
            "seller": {
              "uid": 61,
              "name": "FUCHSIA VINE DESIGNS PRIVATE LIMITED"
            },
            "store": {
              "uid": 11491,
              "name": "Store46"
            },
            "quantity": 200,
            "price": {
              "base": {
                "marked": 2001,
                "effective": 800,
                "selling": 800,
                "currency_code": "INR",
                "currency_symbol": "₹"
              },
              "converted": {
                "marked": 2001,
                "effective": 800,
                "selling": 800,
                "currency_code": "INR",
                "currency_symbol": "INR"
              }
            },
            "extra_meta": {}
          },
          "product": {
            "type": "product",
            "uid": 75252592,
            "name": "Nike Yellow Top",
            "slug": "nike-black-top",
            "brand": {
              "uid": 18,
              "name": "Nike"
            },
            "categories": [
              {
                "uid": 258,
                "name": "Blouson Top"
              }
            ],
            "attributes": {
              "hsn_code": "62040000",
              "short_description": "test description1",
              "essential": "No",
              "item_code": "1304678617",
              "gender": "Women",
              "currency": "INR",
              "media": [
                {
                  "url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/oy168nSHP-Nike-Black-Top.jpeg",
                  "type": "image"
                }
              ],
              "marketer-address": "Tops Range",
              "marketer-name": "Bandra(W), Link Road",
              "brand_name": "Nike"
            },
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/oy168nSHP-Nike-Black-Top.jpeg",
                "secure_url": "https://hdn-1.addsale.com/addsale/products/pictures/item/free/original/oy168nSHP-Nike-Black-Top.jpeg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.fyndx0.de/platform/content/v1/products/nike-black-top/",
              "query": {
                "product_slug": [
                  "nike-black-top"
                ]
              }
            },
            "item_code": "1304678617",
            "_custom_json": {}
          },
          "message": "",
          "price_per_unit": {
            "base": {
              "marked": 2001,
              "effective": 800,
              "selling_price": 800,
              "currency_code": "INR",
              "currency_symbol": "₹"
            },
            "converted": {
              "marked": 2001,
              "effective": 800,
              "selling_price": 800,
              "currency_code": "INR",
              "currency_symbol": "₹"
            }
          },
          "promo_meta": {},
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 8000,
              "marked": 20010,
              "effective": 8000,
              "selling": 8000,
              "currency_code": "INR",
              "currency_symbol": "₹"
            },
            "converted": {
              "add_on": 8000,
              "marked": 20010,
              "effective": 8000,
              "selling": 8000,
              "currency_code": "INR",
              "currency_symbol": "₹"
            }
          },
          "is_set": false,
          "identifiers": {
            "identifier": "SfOmcAtTR4ut4pI_eVU6FQ"
          },
          "discount": "60% OFF",
          "moq": {},
          "availability": {
            "sizes": [
              "S",
              "XL",
              "L"
            ],
            "other_store_quantity": 984,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true,
            "available_sizes": [
              {
                "is_available": true,
                "display": "S",
                "value": "S"
              },
              {
                "is_available": true,
                "display": "XL",
                "value": "XL"
              },
              {
                "is_available": false,
                "display": "CLL",
                "value": "CLL"
              },
              {
                "is_available": true,
                "display": "L",
                "value": "L"
              },
              {
                "is_available": false,
                "display": "XLL",
                "value": "XLL"
              },
              {
                "is_available": false,
                "display": "XLLL",
                "value": "XLLL"
              }
            ]
          },
          "quantity": 10,
          "promotions_applied": [
            {
              "promo_id": "62da8b75e951ea5e67b1454b",
              "amount": 10,
              "article_quantity": 10,
              "mrp_promotion": false,
              "promotion_type": "shipping_price",
              "offer_text": "Free shipping 22/07/2"
            }
          ],
          "key": "75252592_XL",
          "delivery_promise": {},
          "coupon_message": ""
        }
      ],
      "cart_id": 22251,
      "id": "62d4ff76d6aec8db897de407",
      "uid": "22251",
      "buy_now": false,
      "gstin": "",
      "comment": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": true,
      "currency": {
        "code": "INR",
        "symbol": "₹"
      },
      "last_modified": "2023-03-03"
    },
    "message": "Quantity of item updated",
    "success": true
  }
}
```
</details>

</details>









---


### getCouponOptionValues
Get coupon options enums with display values




```java
platformClient.application("<APPLICATION_ID>").cart.getCouponOptionValues() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  



Get coupon enum values for fields in valid coupon object. Used for front end to create, update and filter coupon lists via fields

*Returned Response:*




[Object](#Object)

Coupon options enums




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "types": [
    "Absolute"
  ],
  "scopes": [
    "Categories"
  ],
  "applicable_on": [
    "Amount"
  ],
  "value_types": [
    "Absolute"
  ],
  "calculate_on": [
    "Mrp"
  ],
  "payable_category": [
    "Fynd"
  ],
  "txn_mode": [
    "Fynd Cash"
  ],
  "payable_by": [
    "Fynd Marketing"
  ]
}
```
</details>









---


### getCouponCodeExists
Check if coupon is already created with coupon code




```java
platformClient.application("<APPLICATION_ID>").cart.getCouponCodeExists( code) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| code | String? | no |  |  



Check if sent coupon code is already existing coupon code. As coupon code is to be unique.

*Returned Response:*




[Object](#Object)

Valid response with existing coupon code count




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Coupon code exists</i></summary>

```json
{
  "value": {
    "success": true,
    "count": 1
  }
}
```
</details>

<details>
<summary><i>&nbsp; Coupon code is new</i></summary>

```json
{
  "value": {
    "success": true,
    "count": 0
  }
}
```
</details>

</details>









---


### getPromotionCodeExists
Check if promotion is already created with promotion code




```java
platformClient.application("<APPLICATION_ID>").cart.getPromotionCodeExists( code) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| code | String? | no |  |  



Check if sent promotion code is already existing promotion code. As promotion code is to be unique.

*Returned Response:*




[Object](#Object)

Valid response with existing promotion code count




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Promotion code exists</i></summary>

```json
{
  "value": {
    "success": true,
    "count": 1
  }
}
```
</details>

<details>
<summary><i>&nbsp; Promotion code is new</i></summary>

```json
{
  "value": {
    "success": true,
    "count": 0
  }
}
```
</details>

</details>









---


### overrideCart
Create Fynd order with overriding cart details




```java
platformClient.application("<APPLICATION_ID>").cart.overrideCart(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [OverrideCheckoutReq](#OverrideCheckoutReq) | yes | Request body |


Generate Fynd order while overriding cart details sent with provided `cart_items`

*Returned Response:*




[OverrideCheckoutResponse](#OverrideCheckoutResponse)

Checkout cart and create Fynd order id




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": "true",
  "cart": {
    "success": true,
    "delivery_charges": 0,
    "store_code": "",
    "order_id": "FY630DDF8601EF037743",
    "cod_message": "COD available",
    "delivery_slots": [
      {
        "date": "Fri, 09 Nov",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "user_type": "FYND Store user",
    "cod_available": true,
    "cod_charges": 0,
    "store_emp_list": [],
    "delivery_charge_order_value": 1500,
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, reward points, and refund amount get credited to Fynd Cash which can be redeemed while placing an order.",
        "message": "No Fynd Cash Applied"
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "",
        "value": 0,
        "is_applied": false,
        "message": "Coupon not applicable with Reward point"
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "original": 400,
          "attr": "mrp_total",
          "value": 400,
          "currency_code": "INR",
          "currency_symbol": "₹",
          "message": []
        },
        {
          "display": "Discount",
          "key": "discount",
          "original": -200,
          "attr": "discount",
          "value": -200,
          "currency_code": "INR",
          "currency_symbol": "₹",
          "message": []
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "original": 200,
          "attr": "subtotal",
          "value": 200,
          "currency_code": "INR",
          "currency_symbol": "₹",
          "message": []
        },
        {
          "display": "Total",
          "key": "total",
          "original": 200,
          "attr": "total",
          "value": 200,
          "currency_code": "INR",
          "currency_symbol": "₹",
          "message": []
        }
      ],
      "raw": {
        "sub_total": 200,
        "subtotal": 200,
        "coupon": 0,
        "promotion": 0,
        "delivery_charge": 0,
        "you_saved": 0,
        "fynd_cash": 0,
        "cod_charge": 0,
        "total": 200,
        "gst_charges": 9.52,
        "vog": 190.48,
        "convenience_fee": 0,
        "mrp_total": 400,
        "discount": -200
      }
    },
    "items": [
      {
        "message": "",
        "quantity": 1,
        "is_set": false,
        "delivery_promise": {
          "timestamp": {
            "min": 1646257339,
            "max": 1646689339
          },
          "formatted": {
            "min": "03 Mar, Thursday",
            "max": "08 Mar, Tuesday"
          }
        },
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "moq": {
          "maximum": 4,
          "minimum": 1
        },
        "coupon_message": "",
        "product": {
          "type": "product",
          "uid": 7502730,
          "name": "SLIM FIT JEANS",
          "slug": "slim-fit-jeans1",
          "brand": {
            "uid": 29,
            "name": "lacoste"
          },
          "categories": [
            {
              "uid": 3602,
              "name": "Dresses"
            }
          ],
          "attributes": {
            "net-quantity": "17",
            "occasion": "Beach Wear",
            "gender": "Men",
            "pattern": "Animal",
            "brand-size": "UK46",
            "style-type": "A-line Dresses",
            "season-year": "2018",
            "secondary-color": "Black",
            "jiomart-allowed-size": "Free Size",
            "fabric": "Chambray",
            "wash-care": "Hand Wash Cold Separately",
            "size-group": "Regular",
            "brand-color": "Black",
            "color-shade": "Bright",
            "multi-brick": "Ethnic Bottoms",
            "product-name": "Bodycon Dress",
            "multi-segment": "Men",
            "primary-color": "Navy",
            "multi-vertical": "Western Wear",
            "component-count": "100",
            "manufactured-by": "RIL",
            "year-of-packaging": "2017",
            "product-code-x-catalog-option-color": "1",
            "technique": "Sanganeri",
            "waist-in-inches": "30",
            "chest-size-in-inches": "12",
            "shoulder-size-in-inches": "12",
            "sleeve-length": "Half",
            "neckline": "Collar",
            "brand_name": "lacoste"
          },
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "https://hdn-1.jiomarketx0.de/x0/products/pictures/item/free/original/LYa1_YA3_-console.png",
              "secure_url": "https://hdn-1.jiomarketx0.de/x0/products/pictures/item/free/original/LYa1_YA3_-console.png"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.fyndx0.de/platform/content/v1/products/slim-fit-jeans1/",
            "query": {
              "product_slug": [
                "slim-fit-jeans1"
              ]
            }
          },
          "item_code": "JEANS1232",
          "_custom_json": {}
        },
        "key": "7502730_OS",
        "price": {
          "base": {
            "add_on": 100,
            "marked": 400,
            "effective": 200,
            "selling": 200,
            "currency_code": "INR",
            "currency_symbol": "₹"
          },
          "converted": {
            "add_on": 100,
            "marked": 400,
            "effective": 200,
            "selling": 200,
            "currency_code": "INR",
            "currency_symbol": "₹"
          }
        },
        "price_per_unit": {
          "base": {
            "marked": 400,
            "effective": 200,
            "selling_price": 200,
            "currency_code": "INR",
            "currency_symbol": "₹"
          },
          "converted": {
            "marked": 400,
            "effective": 200,
            "selling_price": 200,
            "currency_code": "INR",
            "currency_symbol": "₹"
          }
        },
        "article": {
          "type": "article",
          "uid": "62e3ca42a2348dd4cb4cd693",
          "size": "OS",
          "seller": {
            "uid": 1527,
            "name": "SPEED-A-WAY PVT. LTD."
          },
          "store": {
            "uid": 3484,
            "name": "Location 1"
          },
          "quantity": 19,
          "price": {
            "base": {
              "marked": 400,
              "effective": 200,
              "selling": 200,
              "currency_code": "INR",
              "currency_symbol": "₹"
            },
            "converted": {
              "marked": 400,
              "effective": 200,
              "selling": 200,
              "currency_code": "INR",
              "currency_symbol": "INR"
            }
          },
          "extra_meta": {}
        },
        "bulk_offer": {},
        "discount": "50% OFF",
        "promotions_applied": [],
        "availability": {
          "sizes": [
            "OS"
          ],
          "other_store_quantity": 1,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true,
          "available_sizes": [
            {
              "is_available": true,
              "display": "OS",
              "value": "OS"
            }
          ]
        },
        "promo_meta": {}
      }
    ],
    "delivery_charge_info": "",
    "notification": {},
    "message": "",
    "delivery_promise": {
      "timestamp": {
        "min": 1646257339,
        "max": 1646689339
      },
      "formatted": {
        "min": "03 Mar, Thursday",
        "max": "08 Mar, Tuesday"
      }
    },
    "coupon_text": "View all offers",
    "cart_id": 21755,
    "id": "63007e85f7df71d5a89758cf",
    "uid": "21755",
    "gstin": "",
    "comment": "",
    "checkout_mode": "self",
    "payment_selection_lock": {
      "enabled": true,
      "default_options": "JIOPP",
      "payment_identifier": "JIOPP"
    },
    "restrict_checkout": false,
    "is_valid": true,
    "currency": {
      "code": "INR",
      "symbol": "₹"
    },
    "last_modified": "2023-03-03T00:00:00.000Z"
  },
  "message": "",
  "data": {
    "transactionRefNumber": "FY630DDF8601EF037743",
    "base64_html": "PGh0bWw+PGhlYWQ+PG1ldGEgbmFtZT0ndmlld3BvcnQnIGNvbnRlbnQ9J3dpZHRoPWRldmljZS13aWR0aCwgaW5pdGlhbC1zY2FsZT0xICwgbWF4aW11bS1zY2FsZT0xLCB1c2VyLXNjYWxhYmxlPW5vJz48c2NyaXB0IHR5cGU9J3RleHQvamF2YXNjcmlwdCc+ZnVuY3Rpb24gZm9ybVN1Ym1pdCgpe2RvY3VtZW50LmdldEVsZW1lbnRCeUlkKCdwYXltZW50Jykuc3VibWl0KCk7fTwvc2NyaXB0PjwvaGVhZD48Ym9keSBvbmxvYWQ9J2phdmFzY3JpcHQ6Zm9ybVN1Ym1pdCgpOyc+PGZvcm0gbmFtZT0ncGF5bWVudCcgaWQ9J3BheW1lbnQnIG1ldGhvZD0nUE9TVCcgYWN0aW9uPSdodHRwczovL3J0c3Mtc2l0Lmppb2Nvbm5lY3QuY29tL2ppb3BheXBnL3YxL3BheW1lbnQtb3B0aW9ucyc+PGltZyBzcmM9J2h0dHBzOi8vcnRzcy1zaXQuamlvY29ubmVjdC5jb20vdXBsb2FkL215amlvY29yZXN0YXRpY2ZpbGVzL2ltYWdlcy9sb2FkZXIuZ2lmJyB3aWR0aD0nMjUlJyBoZWlnaHQ9J2F1dG8nIHN0eWxlPSdkaXNwbGF5OiBibG9jazsgbWFyZ2luLXRvcDogMTIwcHg7bWFyZ2luLWxlZnQ6IGF1dG87IG1hcmdpbi1yaWdodDogYXV0bzsgbWFyZ2luLWJvdHRvbToxMHB4OycvPjxkaXYgc3R5bGU9J3RleHQtYWxpZ246IGNlbnRlcic+PHAgc3R5bGU9J2Rpc3BsYXk6IGlubGluZS1ibG9jazt2ZXJ0aWNhbC1hbGlnbjogbWlkZGxlO2ZvbnQtc2l6ZToxNnB4Jz5SZWRpcmVjdGluZyB0byBwYXltZW50IGdhdGV3YXkuIFBsZWFzZSBkbyBub3QgY2xpY2sgb24gcmVmcmVzaCBvciBiYWNrIGJ1dHRvbi4gPC9wPjwvZGl2PjxpbnB1dCB0eXBlPSdoaWRkZW4nIG5hbWU9J3BhcmFtMScgdmFsdWU9J2Q5OTBlYWFlZDI3ODRmNWNiMDVmMjI0M2Y2Y2IzNDNjJy8+PGlucHV0IHR5cGU9J3N1Ym1pdCcgdmFsdWU9Jycgc3R5bGU9J2Rpc3BsYXk6IG5vbmU7Jy8+PC9mb3JtPjwvYm9keT48L2h0bWw+",
    "render_url": "https://api.xxxx0.de/platform/payment/v2/external/payments/html/render",
    "payment_confirm": "https://api.xxxx0.de/service/application/payment/v1.0/payment/confirm/"
  },
  "callback_url": "https://jio.xxxx0.de/cart/order-status",
  "payment_confirm_url": "https://api.xxxx0.de/service/application/payment/v1.0/payment/confirm/",
  "order_id": "FY630DDF8601EF037743",
  "app_intercept_url": "https://jio.xxxx0.de/cart/order-status"
}
```
</details>









---


### getCartShareLink
Generate token for sharing the cart




```java
platformClient.application("<APPLICATION_ID>").cart.getCartShareLink(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [GetShareCartLinkRequest](#GetShareCartLinkRequest) | yes | Request body |


Use this API to generate a shared cart snapshot and return a shortlink token. The link can be shared with other users for getting the same items in their cart.

*Returned Response:*




[GetShareCartLinkResponse](#GetShareCartLinkResponse)

Returns a URL to share and a token as shown below.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Token Generated</i></summary>

```json
{
  "value": {
    "token": "ZweG1XyX",
    "share_url": "https://uniket-testing.addsale.link/shared-cart/ZweG1XyX"
  }
}
```
</details>

</details>









---


### getCartSharedItems
Get details of a shared cart




```java
platformClient.application("<APPLICATION_ID>").cart.getCartSharedItems( token) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| token | String | yes | Token of the shared short link |  



Use this API to get the shared cart details as per the token generated using the share-cart API.

*Returned Response:*




[SharedCartResponse](#SharedCartResponse)

Success. Returns a Cart object as per the valid token. Refer `SharedCartResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "cart": {
    "shared_cart_details": {
      "token": "BQ9jySQ9",
      "user": {
        "user_id": "23109086",
        "is_anonymous": false
      },
      "meta": {
        "selected_staff": "",
        "ordering_store": null
      },
      "selected_staff": "",
      "ordering_store": null,
      "source": {},
      "created_on": "2019-12-18T14:00:07.165000"
    },
    "items": [
      {
        "key": "791651_6",
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "discount": "",
        "bulk_offer": {},
        "coupon_message": "",
        "article": {
          "type": "article",
          "uid": "304_1054_9036_R1005753_6",
          "size": "6",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 5322,
            "name": "Vaisali Nagar"
          },
          "quantity": 1,
          "price": {
            "base": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            }
          }
        },
        "product": {
          "type": "product",
          "uid": 791651,
          "name": "Black Running Shoes",
          "slug": "furo-black-running-shoes-791651-f8bcc3",
          "brand": {
            "uid": 1054,
            "name": "Furo"
          },
          "categories": [
            {
              "uid": 160,
              "name": "Running Shoes"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
            "query": {
              "product_slug": [
                "furo-black-running-shoes-791651-f8bcc3"
              ]
            }
          }
        },
        "message": "",
        "quantity": 1,
        "availability": {
          "sizes": [
            "7",
            "8",
            "9",
            "10",
            "6"
          ],
          "other_store_quantity": 12,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true
        },
        "price": {
          "base": {
            "add_on": 2095,
            "marked": 2095,
            "effective": 2095,
            "selling": 2095,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 2095,
            "marked": 2095,
            "effective": 2095,
            "selling": 2095,
            "currency_code": "INR"
          }
        }
      },
      {
        "key": "791651_7",
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "discount": "",
        "bulk_offer": {},
        "coupon_message": "",
        "article": {
          "type": "article",
          "uid": "304_1054_9036_R1005753_7",
          "size": "7",
          "seller": {
            "uid": 304,
            "name": "LEAYAN GLOBAL PVT. LTD."
          },
          "store": {
            "uid": 5322,
            "name": "Vaisali Nagar"
          },
          "quantity": 2,
          "price": {
            "base": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "marked": 2095,
              "effective": 2095,
              "currency_code": "INR"
            }
          }
        },
        "product": {
          "type": "product",
          "uid": 791651,
          "name": "Black Running Shoes",
          "slug": "furo-black-running-shoes-791651-f8bcc3",
          "brand": {
            "uid": 1054,
            "name": "Furo"
          },
          "categories": [
            {
              "uid": 160,
              "name": "Running Shoes"
            }
          ],
          "images": [
            {
              "aspect_ratio": "16:25",
              "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
              "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
            }
          ],
          "action": {
            "type": "product",
            "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
            "query": {
              "product_slug": [
                "furo-black-running-shoes-791651-f8bcc3"
              ]
            }
          }
        },
        "message": "",
        "quantity": 2,
        "availability": {
          "sizes": [
            "7",
            "8",
            "9",
            "10",
            "6"
          ],
          "other_store_quantity": 7,
          "out_of_stock": false,
          "deliverable": true,
          "is_valid": true
        },
        "price": {
          "base": {
            "add_on": 4190,
            "marked": 4190,
            "effective": 4190,
            "selling": 4190,
            "currency_code": "INR"
          },
          "converted": {
            "add_on": 4190,
            "marked": 4190,
            "effective": 4190,
            "selling": 4190,
            "currency_code": "INR"
          }
        }
      }
    ],
    "cart_id": 13055,
    "uid": "13055",
    "breakup_values": {
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 958.73,
        "mrp_total": 6285,
        "subtotal": 6285,
        "total": 6285,
        "vog": 5326.27,
        "you_saved": 0
      },
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "",
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid coupon"
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 6285,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 6285,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 6285,
          "currency_code": "INR"
        }
      ]
    },
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": "",
    "comment": "",
    "checkout_mode": "self",
    "payment_selection_lock": {
      "enabled": false,
      "default_options": "COD",
      "payment_identifier": "JIOPP"
    },
    "restrict_checkout": false,
    "is_valid": true,
    "last_modified": "2023-03-03"
  },
  "error": ""
}
```
</details>









---


### updateCartWithSharedItems
Merge or replace existing cart




```java
platformClient.application("<APPLICATION_ID>").cart.updateCartWithSharedItems( token,  action,  cartId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| token | String | yes | Token of the shared short link |   
| action | String | yes | Operation to perform on the existing cart merge or replace. |   
| cartId | String? | no |  |  



Use this API to merge the shared cart with existing cart, or replace the existing cart with the shared cart. The `action` parameter is used to indicate the operation Merge or Replace.

*Returned Response:*




[SharedCartResponse](#SharedCartResponse)

Success. Returns a merged or replaced cart as per the valid token. Refer `SharedCartResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Cart Merged/Replaced</i></summary>

```json
{
  "value": {
    "cart": {
      "shared_cart_details": {
        "token": "BQ9jySQ9",
        "user": {
          "user_id": "23109086",
          "is_anonymous": false
        },
        "meta": {
          "selected_staff": "",
          "ordering_store": null
        },
        "selected_staff": "",
        "ordering_store": null,
        "source": {},
        "created_on": "2019-12-18T14:00:07.165000"
      },
      "items": [
        {
          "key": "791651_6",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "discount": "",
          "bulk_offer": {},
          "coupon_message": "",
          "article": {
            "type": "article",
            "uid": "304_1054_9036_R1005753_6",
            "size": "6",
            "seller": {
              "uid": 304,
              "name": "LEAYAN GLOBAL PVT. LTD."
            },
            "store": {
              "uid": 5322,
              "name": "Vaisali Nagar"
            },
            "quantity": 1,
            "price": {
              "base": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              }
            }
          },
          "product": {
            "type": "product",
            "uid": 791651,
            "name": "Black Running Shoes",
            "slug": "furo-black-running-shoes-791651-f8bcc3",
            "brand": {
              "uid": 1054,
              "name": "Furo"
            },
            "categories": [
              {
                "uid": 160,
                "name": "Running Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
              "query": {
                "product_slug": [
                  "furo-black-running-shoes-791651-f8bcc3"
                ]
              }
            }
          },
          "message": "",
          "quantity": 1,
          "availability": {
            "sizes": [
              "7",
              "8",
              "9",
              "10",
              "6"
            ],
            "other_store_quantity": 12,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "price": {
            "base": {
              "add_on": 2095,
              "marked": 2095,
              "effective": 2095,
              "selling": 2095,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 2095,
              "marked": 2095,
              "effective": 2095,
              "selling": 2095,
              "currency_code": "INR"
            }
          }
        },
        {
          "key": "791651_7",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "discount": "",
          "bulk_offer": {},
          "coupon_message": "",
          "article": {
            "type": "article",
            "uid": "304_1054_9036_R1005753_7",
            "size": "7",
            "seller": {
              "uid": 304,
              "name": "LEAYAN GLOBAL PVT. LTD."
            },
            "store": {
              "uid": 5322,
              "name": "Vaisali Nagar"
            },
            "quantity": 2,
            "price": {
              "base": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2095,
                "effective": 2095,
                "currency_code": "INR"
              }
            }
          },
          "product": {
            "type": "product",
            "uid": 791651,
            "name": "Black Running Shoes",
            "slug": "furo-black-running-shoes-791651-f8bcc3",
            "brand": {
              "uid": 1054,
              "name": "Furo"
            },
            "categories": [
              {
                "uid": 160,
                "name": "Running Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1054_R1005753/1_1546490507364.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/furo-black-running-shoes-791651-f8bcc3/",
              "query": {
                "product_slug": [
                  "furo-black-running-shoes-791651-f8bcc3"
                ]
              }
            }
          },
          "message": "",
          "quantity": 2,
          "availability": {
            "sizes": [
              "7",
              "8",
              "9",
              "10",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "price": {
            "base": {
              "add_on": 4190,
              "marked": 4190,
              "effective": 4190,
              "selling": 4190,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4190,
              "marked": 4190,
              "effective": 4190,
              "selling": 4190,
              "currency_code": "INR"
            }
          }
        }
      ],
      "cart_id": 13055,
      "uid": "13055",
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 958.73,
          "mrp_total": 6285,
          "subtotal": 6285,
          "total": 6285,
          "vog": 5326.27,
          "you_saved": 0
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 6285,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 6285,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 6285,
            "currency_code": "INR"
          }
        ]
      },
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "gstin": "",
      "comment": "",
      "checkout_mode": "self",
      "payment_selection_lock": {
        "enabled": false,
        "default_options": "COD",
        "payment_identifier": "JIOPP"
      },
      "restrict_checkout": false,
      "is_valid": true,
      "last_modified": "2023-03-03"
    }
  }
}
```
</details>

</details>









---


### getCartList
Get cart list for store os user




```java
platformClient.application("<APPLICATION_ID>").cart.getCartList( fromDate,  toDate,  filterOn) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| filterOn | String? | no |  |  



Get all carts for the store os user which is created for customer

*Returned Response:*




[MultiCartResponse](#MultiCartResponse)

Platform user cart list




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Cart list for pos platform</i></summary>

```json
{
  "value": {
    "data": [
      {
        "pick_up_customer_details": {
          "mobile": 7777996559,
          "email": "test_pickup_customer@gmail.com"
        },
        "created_on": "1675780233",
        "cart_value": 1999,
        "cart_id": "63e213d45e4206d94485935f",
        "item_counts": 1,
        "user_id": "63d0bfa35b92b61cf50cfe29"
      },
      {
        "pick_up_customer_details": {},
        "created_on": "1675779508",
        "cart_value": 5997,
        "cart_id": "63e210d03437dfb6c731062a",
        "item_counts": 3,
        "user_id": "63693036ef136d40c32c0ac8"
      }
    ],
    "success": true
  }
}
```
</details>

</details>









---


### updateCartUser
Update user id for store os customer




```java
platformClient.application("<APPLICATION_ID>").cart.updateCartUser( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |  
| body | [UpdateUserCartMapping](#UpdateUserCartMapping) | yes | Request body |


Update user id for store os customer after creating customer

*Returned Response:*




[UserCartMappingResponse](#UserCartMappingResponse)






<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Update and map cart user</i></summary>

```json
{
  "value": {
    "message": "User verified successfully",
    "success": true,
    "cart": {
      "breakup_values": {
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "original": 5997,
            "attr": "mrp_total",
            "value": 5997,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "original": 5997,
            "attr": "subtotal",
            "value": 5997,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          },
          {
            "display": "Total",
            "key": "total",
            "original": 5997,
            "attr": "total",
            "value": 5997,
            "currency_code": "INR",
            "currency_symbol": "₹",
            "message": []
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, reward points, and refund amount get credited to Fynd Cash which can be redeemed while placing an order.",
          "message": "No Fynd Cash Applied"
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid coupon"
        },
        "raw": {
          "sub_total": 5997,
          "subtotal": 5997,
          "coupon": 0,
          "promotion": 0,
          "delivery_charge": 0,
          "you_saved": 0,
          "fynd_cash": 0,
          "cod_charge": 0,
          "total": 5997,
          "gst_charges": 0,
          "vog": 0,
          "convenience_fee": 0,
          "mrp_total": 5997,
          "discount": 0
        }
      },
      "items": [
        {
          "quantity": 3,
          "discount": "",
          "bulk_offer": {},
          "is_set": false,
          "key": "803158_M",
          "price_per_unit": {
            "base": {
              "marked": 1999,
              "effective": 1999,
              "selling_price": 1999,
              "currency_code": "INR",
              "currency_symbol": "₹"
            },
            "converted": {
              "marked": 1999,
              "effective": 1999,
              "selling_price": 1999,
              "currency_code": "INR",
              "currency_symbol": "₹"
            }
          },
          "promotions_applied": [],
          "message": "",
          "identifiers": {
            "identifier": "gIq0E94RSMueSdDRAk_Txg"
          },
          "delivery_promise": null,
          "price": {
            "base": {
              "add_on": 5997,
              "marked": 5997,
              "effective": 5997,
              "selling": 5997,
              "currency_code": "INR",
              "currency_symbol": "₹"
            },
            "converted": {
              "add_on": 5997,
              "marked": 5997,
              "effective": 5997,
              "selling": 5997,
              "currency_code": "INR",
              "currency_symbol": "₹"
            }
          },
          "product": {
            "type": "product",
            "uid": 803158,
            "name": "Pink Solid Casual Shirt",
            "slug": "pink-solid-casual-shirt-vpvlt-00h3rv",
            "brand": {
              "uid": 44,
              "name": ""
            },
            "categories": [
              {
                "uid": 133,
                "name": "Casual Shirts"
              }
            ],
            "attributes": {
              "item_code": "NAPINPOINT@PRUNE",
              "color": "Pink",
              "gender": "Men",
              "occasion": "Casual",
              "season": "SS19",
              "material": "100% Cotton",
              "pattern": "Solid",
              "product_fit": "Slim",
              "sleeve_length": "Long",
              "neck_type": "Classic Collar",
              "care_instructions": "Machine Wash",
              "primary_color": "Pink",
              "primary-material": "Cotton",
              "currency": "INR",
              "media": [
                {
                  "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/1_1548161273342.jpg",
                  "type": "image"
                },
                {
                  "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/2_1548161273342.jpg",
                  "type": "image"
                },
                {
                  "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/3_1548161273342.jpg",
                  "type": "image"
                },
                {
                  "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/4_1548161273342.jpg",
                  "type": "image"
                },
                {
                  "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/5_1548161273342.jpg",
                  "type": "image"
                }
              ],
              "name": "Pink Solid Casual Shirt",
              "brand_name": "celio",
              "primary_color_hex": "FA7DC9"
            },
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/1_1548161273342.jpg",
                "secure_url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/1_1548161273342.jpg"
              },
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/2_1548161273342.jpg",
                "secure_url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/2_1548161273342.jpg"
              },
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/3_1548161273342.jpg",
                "secure_url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/3_1548161273342.jpg"
              },
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/4_1548161273342.jpg",
                "secure_url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/4_1548161273342.jpg"
              },
              {
                "aspect_ratio": "16:25",
                "url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/5_1548161273342.jpg",
                "secure_url": "https://hdn-1.fynd.com/media/pictures/tagged_items/original/44_NAPINPOINT@PRUNE/5_1548161273342.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.fyndx1.de/platform/content/v1/products/pink-solid-casual-shirt-vpvlt-00h3rv/",
              "query": {
                "product_slug": [
                  "pink-solid-casual-shirt-vpvlt-00h3rv"
                ]
              }
            },
            "item_code": "NAPINPOINT@PRUNE",
            "_custom_json": {}
          },
          "coupon_message": "",
          "parent_item_identifiers": {
            "identifier": null,
            "parent_item_size": null,
            "parent_item_id": null
          },
          "availability": {
            "sizes": [
              "M",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 0,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true,
            "available_sizes": [
              {
                "is_available": true,
                "display": "XL",
                "value": "XL"
              },
              {
                "is_available": true,
                "display": "XXL",
                "value": "XXL"
              },
              {
                "is_available": true,
                "display": "M",
                "value": "M"
              },
              {
                "is_available": false,
                "display": "L",
                "value": "L"
              },
              {
                "is_available": false,
                "display": "S",
                "value": "S"
              }
            ]
          },
          "promo_meta": {},
          "article": {
            "type": "article",
            "uid": "5e6344616272810001dd0269",
            "size": "M",
            "product_group_tags": null,
            "seller": {
              "uid": 743,
              "name": "SUN LIFE STYLES"
            },
            "store": {
              "uid": 9957,
              "name": "JAYANAGAR, Karnataka"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR",
                "currency_symbol": "₹"
              },
              "converted": {
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR",
                "currency_symbol": "INR"
              }
            },
            "extra_meta": {}
          },
          "moq": {}
        }
      ],
      "cart_id": 436470,
      "id": "63e210d03437dfb6c731062a",
      "uid": "436470",
      "buy_now": false,
      "gstin": "",
      "comment": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": true,
      "currency": {
        "code": "INR",
        "symbol": "₹"
      },
      "last_modified": "2023-03-03T00:00:00.000Z"
    },
    "user": {
      "uid": "63693036ef136d40c32c0ac8",
      "_id": "63693036ef136d40c32c0ac8",
      "first_name": "Neel",
      "last_name": "Gajjar",
      "email": "neelgajjar@gofynd.com",
      "mobile": "7096263966",
      "gender": "male",
      "created_at": "1667838020",
      "modified_on": "1668514790",
      "external_id": ""
    }
  }
}
```
</details>

</details>









---


### getCart
Fetch all items added to the customer cart using cart id




```java
platformClient.application("<APPLICATION_ID>").cart.getCart( id,  userId,  i,  b,  assignCardId,  buyNow) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| userId | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| assignCardId | Integer? | no |  |   
| buyNow | Boolean? | no |  |  



Use this API to get details of all the items added to a cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object. Check the example shown below or refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "bulk_offer": {},
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "discount": "67% OFF",
      "article": {
        "type": "article",
        "tags": [],
        "uid": "604_902_SSTC60401_636BLUE_1",
        "size": "1",
        "seller": {
          "uid": 604,
          "name": "SHRI SHANTINATH TRADING COMPANY"
        },
        "store": {
          "uid": 4579,
          "name": "Gandhi Nagar"
        },
        "quantity": 108,
        "price": {
          "base": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 2999,
            "effective": 999,
            "currency_code": "INR"
          }
        }
      },
      "coupon_message": "",
      "key": "707569_1",
      "availability": {
        "sizes": [
          "1",
          "8",
          "7",
          "2",
          "9",
          "5",
          "3",
          "6"
        ],
        "other_store_quantity": 107,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 707569,
        "name": "Blue and Gold Printed Ethnic Set",
        "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
        "brand": {
          "uid": 902,
          "name": ""
        },
        "categories": [
          {
            "uid": 525,
            "name": ""
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
          "query": {
            "product_slug": [
              "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
            ]
          }
        }
      },
      "price": {
        "base": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 999,
          "marked": 2999,
          "effective": 999,
          "selling": 999,
          "currency_code": "INR"
        }
      },
      "message": "",
      "quantity": 1
    }
  ],
  "buy_now": false,
  "cart_id": 54,
  "uid": "54",
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": -2000,
      "fynd_cash": 0,
      "gst_charges": 47.57,
      "mrp_total": 2999,
      "subtotal": 999,
      "total": 999,
      "vog": 951.43,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "",
      "uid": "304_1054_9036_R1005753_6",
      "value": 0,
      "is_applied": false,
      "message": "Sorry! Invalid Coupon"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 2999,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -2000,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 999,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 999,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "gstin": "",
  "checkout_mode": "self",
  "restrict_checkout": false,
  "is_valid": true,
  "last_modified": "2023-03-03"
}
```
</details>









---


### platformAddItems
Add items to cart




```java
platformClient.application("<APPLICATION_ID>").cart.platformAddItems( i,  b,  buyNow,  id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| buyNow | Boolean? | no |  |   
| id | String? | no |  |  
| body | [PlatformAddCartRequest](#PlatformAddCartRequest) | yes | Request body |


Use this API to add items to the cart.

*Returned Response:*




[AddCartDetailResponse](#AddCartDetailResponse)

Success. Returns a cart object as shown below. Refer `AddCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Product has been added to your cart</i></summary>

```json
{
  "value": {
    "message": "Product has been added to your cart",
    "success": true,
    "cart": {
      "breakup_values": {
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 17486,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -3540,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 13946,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 13946,
            "currency_code": "INR"
          }
        ],
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -3540,
          "fynd_cash": 0,
          "gst_charges": 1529.96,
          "mrp_total": 17486,
          "subtotal": 13946,
          "total": 13946,
          "vog": 12416.04,
          "you_saved": 0
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        }
      },
      "items": [
        {
          "key": "751083_10",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "612_9_SE61201_19100302_10",
            "size": "10",
            "seller": {
              "uid": 612,
              "name": "SSR ENTERPRISE"
            },
            "store": {
              "uid": 4431,
              "name": "Motilal Nagar 1, Goregaon"
            },
            "quantity": 4,
            "price": {
              "base": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3999,
                "effective": 2399,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4798,
              "marked": 7998,
              "effective": 4798,
              "selling": 4798,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "10"
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 751083,
            "name": "Carson 2",
            "slug": "puma-carson-2-751083-6ad98d",
            "brand": {
              "uid": 9,
              "name": "Puma"
            },
            "categories": [
              {
                "uid": 165,
                "name": "Outdoor Sports Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/puma-carson-2-751083-6ad98d/",
              "query": {
                "product_slug": [
                  "puma-carson-2-751083-6ad98d"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 2,
          "message": "",
          "bulk_offer": {},
          "discount": "41% OFF"
        },
        {
          "key": "246228_S",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "article": {
            "type": "article",
            "uid": "46_235_TM62_M11029ONDSXNS_S",
            "size": "S",
            "seller": {
              "uid": 46,
              "name": "RELIANCE BRANDS LIMITED"
            },
            "store": {
              "uid": 4550,
              "name": "VR Mall"
            },
            "quantity": 1,
            "price": {
              "base": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 4490,
                "effective": 4490,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 4490,
              "marked": 4490,
              "effective": 4490,
              "selling": 4490,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "L",
              "M",
              "S",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 0,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 246228,
            "name": "Blue Solid T-Shirt",
            "slug": "superdry-blue-solid-t-shirt-2",
            "brand": {
              "uid": 235,
              "name": "Superdry"
            },
            "categories": [
              {
                "uid": 192,
                "name": "T-Shirts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/superdry-blue-solid-t-shirt-2/",
              "query": {
                "product_slug": [
                  "superdry-blue-solid-t-shirt-2"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "443175_S",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "article": {
            "type": "article",
            "uid": "162_207_1271_LJ03LBLUDN88_S",
            "size": "S",
            "seller": {
              "uid": 162,
              "name": "GO FASHION INDIA PRIVATE LIMITED"
            },
            "store": {
              "uid": 5784,
              "name": "Vega City mall"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1599,
                "effective": 1599,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1599,
              "marked": 1599,
              "effective": 1599,
              "selling": 1599,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "XL",
              "M",
              "L",
              "S"
            ],
            "other_store_quantity": 8,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 443175,
            "name": "Light Blue Denim Jeggings",
            "slug": "go-colors-light-blue-denim-jeggings-443175-3c688c",
            "brand": {
              "uid": 207,
              "name": "Go Colors"
            },
            "categories": [
              {
                "uid": 267,
                "name": "Jeggings"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/go-colors-light-blue-denim-jeggings-443175-3c688c/",
              "query": {
                "product_slug": [
                  "go-colors-light-blue-denim-jeggings-443175-3c688c"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": ""
        },
        {
          "key": "778937_OS",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "article": {
            "type": "article",
            "uid": "686_963_IC68601_PWUPC01977_OS",
            "size": "OS",
            "seller": {
              "uid": 686,
              "name": "INDUS CORPORATION"
            },
            "store": {
              "uid": 5059,
              "name": "Vidyaranyapura Main Road"
            },
            "quantity": 3,
            "price": {
              "base": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 3399,
                "effective": 3059,
                "currency_code": "INR"
              }
            }
          },
          "price": {
            "base": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 3059,
              "marked": 3399,
              "effective": 3059,
              "selling": 3059,
              "currency_code": "INR"
            }
          },
          "availability": {
            "sizes": [
              "OS"
            ],
            "other_store_quantity": 2,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 778937,
            "name": "Colourful Carnival Bouncer",
            "slug": "fisher-price-colourful-carnival-bouncer-778937-fafa1f",
            "brand": {
              "uid": 963,
              "name": "Fisher-Price"
            },
            "categories": [
              {
                "uid": 576,
                "name": "Cradles"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/fisher-price-colourful-carnival-bouncer-778937-fafa1f/",
              "query": {
                "product_slug": [
                  "fisher-price-colourful-carnival-bouncer-778937-fafa1f"
                ]
              }
            }
          },
          "coupon_message": "",
          "quantity": 1,
          "message": "",
          "bulk_offer": {},
          "discount": "11% OFF"
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 7927,
      "uid": "7927",
      "gstin": "",
      "checkout_mode": "self",
      "last_modified": "2023-03-03T00:00:00.000Z",
      "restrict_checkout": false,
      "is_valid": true
    },
    "result": {}
  }
}
```
</details>

<details>
<summary><i>&nbsp; Sorry, item is out of stock</i></summary>

```json
{
  "value": {
    "message": "Sorry, item is out of stock",
    "success": false,
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": false,
      "last_modified": "2023-03-03T00:00:00.000Z"
    },
    "result": {}
  }
}
```
</details>

</details>









---


### platformUpdateCart
Update items in the customer 's cart using cart id




```java
platformClient.application("<APPLICATION_ID>").cart.platformUpdateCart( id,  i,  b,  buyNow, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [PlatformUpdateCartRequest](#PlatformUpdateCartRequest) | yes | Request body |


Use this API to update items added to the cart with the help of a request object containing attributes like item_quantity and item_size. These attributes will be fetched from the following APIs operation Operation for current api call. update_item for update items. remove_item for removing items.item_id "/platform/content/v1/products/" item_size "/platform/content/v1/products/:slug/sizes/" quantity  item quantity (must be greater than or equal to 1) article_id "/content​/v1​/products​/:identifier​/sizes​/price​/" item_index item position in the cart (must be greater than or equal to 0)

*Returned Response:*




[UpdateCartDetailResponse](#UpdateCartDetailResponse)

Success. Updates and returns a cart object as shown below. Refer `UpdateCartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Nothing updated</i></summary>

```json
{
  "value": {
    "cart": {
      "breakup_values": {
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": -202000,
          "fynd_cash": 0,
          "gst_charges": 4804.71,
          "mrp_total": 302899,
          "subtotal": 100899,
          "total": 100899,
          "vog": 96094.29,
          "you_saved": 0
        },
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 302899,
            "currency_code": "INR"
          },
          {
            "display": "Discount",
            "key": "discount",
            "value": -202000,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 100899,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 100899,
            "currency_code": "INR"
          }
        ],
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        }
      },
      "items": [
        {
          "bulk_offer": {},
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "discount": "67% OFF",
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "604_902_SSTC60401_636BLUE_1",
            "size": "1",
            "seller": {
              "uid": 604,
              "name": "SHRI SHANTINATH TRADING COMPANY"
            },
            "store": {
              "uid": 4579,
              "name": "Gandhi Nagar"
            },
            "quantity": 108,
            "price": {
              "base": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 2999,
                "effective": 999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "key": "707569_1",
          "availability": {
            "sizes": [
              "1",
              "8",
              "7",
              "2",
              "9",
              "5",
              "3",
              "6"
            ],
            "other_store_quantity": 7,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          },
          "product": {
            "type": "product",
            "uid": 707569,
            "name": "Blue and Gold Printed Ethnic Set",
            "slug": "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a",
            "brand": {
              "uid": 902,
              "name": ""
            },
            "categories": [
              {
                "uid": 525,
                "name": ""
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/902_636BLUE/1_1540301094877.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/v1/products/aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a/",
              "query": {
                "product_slug": [
                  "aj-dezines-blue-and-gold-printed-ethnic-set-707569-bff01a"
                ]
              }
            }
          },
          "price": {
            "base": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 100899,
              "marked": 302899,
              "effective": 100899,
              "selling": 100899,
              "currency_code": "INR"
            }
          },
          "message": "",
          "quantity": 101
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 54,
      "uid": "54",
      "gstin": "",
      "checkout_mode": "self",
      "restrict_checkout": false,
      "is_valid": true,
      "last_modified": "2023-03-03T00:00:00.000Z"
    },
    "result": {
      "707569_90": {
        "success": true,
        "message": "Nothing updated"
      }
    },
    "message": "Nothing updated",
    "success": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Item updated in the cart</i></summary>

```json
{
  "value": {
    "cart": {
      "breakup_values": {
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 838.83,
          "mrp_total": 5499,
          "subtotal": 5499,
          "total": 5499,
          "vog": 4660.17,
          "you_saved": 0
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 5499,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 5499,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 5499,
            "currency_code": "INR"
          }
        ]
      },
      "items": [
        {
          "key": "437414_7",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "message": "",
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 5499,
              "marked": 5499,
              "effective": 5499,
              "selling": 5499,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 5499,
              "marked": 5499,
              "effective": 5499,
              "selling": 5499,
              "currency_code": "INR"
            }
          },
          "quantity": 1,
          "discount": "",
          "product": {
            "type": "product",
            "uid": 437414,
            "name": "Suede Classic",
            "slug": "puma-suede-classic-437414-6e6bbf",
            "brand": {
              "uid": 9,
              "name": "Puma"
            },
            "categories": [
              {
                "uid": 165,
                "name": "Outdoor Sports Shoes"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_35656851/1_1511171811830.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_35656851/1_1511171811830.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/puma-suede-classic-437414-6e6bbf/",
              "query": {
                "product_slug": [
                  "puma-suede-classic-437414-6e6bbf"
                ]
              }
            }
          },
          "parent_item_identifiers": {
            "identifier": "ZASFF",
            "parent_item_id": 7501190,
            "parent_item_size": "OS"
          },
          "article": {
            "type": "article",
            "uid": "507_9_96099_35656851_7",
            "size": "7",
            "seller": {
              "uid": 507,
              "name": "PUMA SPORTS INDIA PVT LTD"
            },
            "store": {
              "uid": 3632,
              "name": "Colaba Causway"
            },
            "quantity": 5,
            "price": {
              "base": {
                "marked": 5499,
                "effective": 5499,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 5499,
                "effective": 5499,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "availability": {
            "sizes": [
              "10",
              "11",
              "6",
              "9",
              "7",
              "8"
            ],
            "other_store_quantity": 22,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          }
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "buy_now": false,
      "cart_id": 12426,
      "uid": "12426",
      "gstin": "",
      "checkout_mode": "self",
      "last_modified": "2023-02-02T00:00:00.000Z",
      "restrict_checkout": false,
      "is_valid": true
    },
    "result": {
      "437414_7": {
        "success": true,
        "message": "Quantity of item updated"
      }
    },
    "message": "Quantity of item updated",
    "success": true
  }
}
```
</details>

</details>









---


### deleteCart
Delete cart once user made successful checkout




```java
platformClient.application("<APPLICATION_ID>").cart.deleteCart( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no | The unique identifier of the cart. |  
| body | [DeleteCartRequest](#DeleteCartRequest) | yes | Request body |


Use this API to delete the cart.

*Returned Response:*




[DeleteCartDetailResponse](#DeleteCartDetailResponse)

Success. Returns whether the cart has been deleted or not.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "cart archived"
}
```
</details>









---


### getItemCount
Count items in the customer's cart




```java
platformClient.application("<APPLICATION_ID>").cart.getItemCount( id,  buyNow) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no | The unique identifier of the cart. |   
| buyNow | Boolean? | no |  |  



Use this API to get the total number of items present in cart.

*Returned Response:*




[CartItemCountResponse](#CartItemCountResponse)

Success. Returns the total count of items in a user's cart.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "user_cart_items_count": 0
}
```
</details>









---


### getAppCoupons
Fetch Coupon




```java
platformClient.application("<APPLICATION_ID>").cart.getAppCoupons( id,  buyNow,  slug,  storeId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |   
| slug | String? | no |  |   
| storeId | String? | no |  |  



Use this API to get a list of available coupons along with their details.

*Returned Response:*




[GetCouponResponse](#GetCouponResponse)

Success. Returns a coupon object which has a list of all the eligible coupons. Refer `GetCouponResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available_coupon_list": [
    {
      "coupon_value": 500,
      "minimum_cart_value": 0,
      "coupon_code": "RAJA500",
      "title": "RAJA500 | Fynd coupon",
      "sub_title": "NA",
      "message": "TEST500",
      "max_discount_value": 500,
      "uid": 17921,
      "is_applicable": true,
      "is_applied": false,
      "expires_on": "28 Aug, 19"
    },
    {
      "coupon_value": 2250,
      "minimum_cart_value": 0,
      "coupon_code": "PRISMC22250111",
      "title": "celio 2 time coupn to kalim hsp",
      "sub_title": "celio 2 time coupn to kalim hsp",
      "message": "celio 2 time coupn to kalim hsp",
      "max_discount_value": 2250,
      "uid": 17743,
      "is_applicable": true,
      "is_applied": false,
      "expires_on": "24 Jan, 20"
    }
  ],
  "page": {
    "current": 1,
    "total": 0,
    "has_previous": false,
    "has_next": false,
    "total_item_count": 0
  }
}
```
</details>









---


### applyCoupon
Apply Coupon for platform pos user




```java
platformClient.application("<APPLICATION_ID>").cart.applyCoupon( i,  b,  p,  id,  buyNow, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |   
| p | Boolean? | no |  |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [ApplyCouponRequest](#ApplyCouponRequest) | yes | Request body |


Use this API to apply coupons on items in the cart.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns coupons applied to the cart along with item details and price breakup. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": -7240.2163,
      "fynd_cash": 0,
      "gst_charges": 2139.08,
      "mrp_total": 26983,
      "subtotal": 19742.7837,
      "total": 17492.7837,
      "vog": 15353.7,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": "17743",
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 26983,
        "currency_code": "INR"
      },
      {
        "display": "Discount",
        "key": "discount",
        "value": -7240,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 19743,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 17493,
        "currency_code": "INR"
      }
    ]
  },
  "items": [
    {
      "identifiers": {},
      "availability": {
        "identifiers": {
          "identifier": "5mPyy88URXuh3Lo35uaTg"
        },
        "sizes": [
          "10"
        ],
        "other_store_quantity": 0,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 751083,
        "name": "Carson 2",
        "slug": "puma-carson-2-751083-6ad98d",
        "brand": {
          "uid": 9,
          "name": "Puma"
        },
        "categories": [
          {
            "uid": 165,
            "name": "Outdoor Sports Shoes"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/9_19100302/1_1542807042296.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/puma-carson-2-751083-6ad98d/",
          "query": {
            "product_slug": [
              "puma-carson-2-751083-6ad98d"
            ]
          }
        }
      },
      "quantity": 4,
      "discount": "41% OFF",
      "price": {
        "base": {
          "add_on": 9596,
          "marked": 15996,
          "effective": 9596,
          "selling": 9596,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 9596,
          "marked": 15996,
          "effective": 9596,
          "selling": 9596,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "751083_10",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "612_9_SE61201_19100302_10",
        "size": "10",
        "seller": {
          "uid": 612,
          "name": "SSR ENTERPRISE"
        },
        "store": {
          "uid": 4431,
          "name": "Motilal Nagar 1, Goregaon"
        },
        "quantity": 4,
        "price": {
          "base": {
            "marked": 3999,
            "effective": 2399,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3999,
            "effective": 2399,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "identifiers": {},
      "availability": {
        "sizes": [
          "L",
          "M",
          "S",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 0,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 246228,
        "name": "Blue Solid T-Shirt",
        "slug": "superdry-blue-solid-t-shirt-2",
        "brand": {
          "uid": 235,
          "name": "Superdry"
        },
        "categories": [
          {
            "uid": 192,
            "name": "T-Shirts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/235_M11029ONDSXNS/1.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/superdry-blue-solid-t-shirt-2/",
          "query": {
            "product_slug": [
              "superdry-blue-solid-t-shirt-2"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "",
      "price": {
        "base": {
          "add_on": 4490,
          "marked": 4490,
          "effective": 4490,
          "selling": 4490,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 4490,
          "marked": 4490,
          "effective": 4490,
          "selling": 4490,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "246228_S",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "46_235_TM62_M11029ONDSXNS_S",
        "size": "S",
        "seller": {
          "uid": 46,
          "name": "RELIANCE BRANDS LIMITED"
        },
        "store": {
          "uid": 4550,
          "name": "VR Mall"
        },
        "quantity": 1,
        "price": {
          "base": {
            "marked": 4490,
            "effective": 4490,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 4490,
            "effective": 4490,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "identifiers": {},
      "availability": {
        "sizes": [
          "XL",
          "M",
          "L",
          "S"
        ],
        "other_store_quantity": 8,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 443175,
        "name": "Light Blue Denim Jeggings",
        "slug": "go-colors-light-blue-denim-jeggings-443175-3c688c",
        "brand": {
          "uid": 207,
          "name": "Go Colors"
        },
        "categories": [
          {
            "uid": 267,
            "name": "Jeggings"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/207_LJ03LBLUDN88/1_1512382513548.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/go-colors-light-blue-denim-jeggings-443175-3c688c/",
          "query": {
            "product_slug": [
              "go-colors-light-blue-denim-jeggings-443175-3c688c"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "",
      "price": {
        "base": {
          "add_on": 1599,
          "marked": 1599,
          "effective": 1599,
          "selling": 1599,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1599,
          "marked": 1599,
          "effective": 1599,
          "selling": 1599,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "443175_S",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "162_207_1271_LJ03LBLUDN88_S",
        "size": "S",
        "seller": {
          "uid": 162,
          "name": "GO FASHION INDIA PRIVATE LIMITED"
        },
        "store": {
          "uid": 5784,
          "name": "Vega City mall"
        },
        "quantity": 3,
        "price": {
          "base": {
            "marked": 1599,
            "effective": 1599,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1599,
            "effective": 1599,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "identifiers": {},
      "availability": {
        "sizes": [
          "OS"
        ],
        "other_store_quantity": 12,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 842716,
        "name": "Blue Backpack",
        "slug": "istorm-blue-backpack-842716-951b5a",
        "brand": {
          "uid": 1177,
          "name": "iStorm"
        },
        "categories": [
          {
            "uid": 198,
            "name": "Backpacks"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/1177_IS483/1_1551353288247.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/1177_IS483/1_1551353288247.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/istorm-blue-backpack-842716-951b5a/",
          "query": {
            "product_slug": [
              "istorm-blue-backpack-842716-951b5a"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "34% OFF",
      "price": {
        "base": {
          "add_on": 998.7837,
          "marked": 1499,
          "effective": 998.7837,
          "selling": 998.7837,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 998.7837,
          "marked": 1499,
          "effective": 998.7837,
          "selling": 998.7837,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "842716_OS",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "638_1177_CRSL63802_IS483_OS",
        "size": "OS",
        "seller": {
          "uid": 638,
          "name": "COUNFREEDISE RETAIL SERVICES LTD"
        },
        "store": {
          "uid": 4630,
          "name": "Bhiwandi"
        },
        "quantity": 4,
        "price": {
          "base": {
            "marked": 1499,
            "effective": 998.7837,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1499,
            "effective": 998.7837,
            "currency_code": "INR"
          }
        }
      }
    },
    {
      "identifiers": {},
      "availability": {
        "sizes": [
          "OS"
        ],
        "other_store_quantity": 2,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "product": {
        "type": "product",
        "uid": 778937,
        "name": "Colourful Carnival Bouncer",
        "slug": "fisher-price-colourful-carnival-bouncer-778937-fafa1f",
        "brand": {
          "uid": 963,
          "name": "Fisher-Price"
        },
        "categories": [
          {
            "uid": 576,
            "name": "Cradles"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/963_PWUPC01977/1_1545308400588.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/fisher-price-colourful-carnival-bouncer-778937-fafa1f/",
          "query": {
            "product_slug": [
              "fisher-price-colourful-carnival-bouncer-778937-fafa1f"
            ]
          }
        }
      },
      "quantity": 1,
      "discount": "11% OFF",
      "price": {
        "base": {
          "add_on": 3059,
          "marked": 3399,
          "effective": 3059,
          "selling": 3059,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3059,
          "marked": 3399,
          "effective": 3059,
          "selling": 3059,
          "currency_code": "INR"
        }
      },
      "message": "",
      "bulk_offer": {},
      "key": "778937_OS",
      "coupon_message": "",
      "article": {
        "type": "article",
        "uid": "686_963_IC68601_PWUPC01977_OS",
        "size": "OS",
        "seller": {
          "uid": 686,
          "name": "INDUS CORPORATION"
        },
        "store": {
          "uid": 5059,
          "name": "Vidyaranyapura Main Road"
        },
        "quantity": 3,
        "price": {
          "base": {
            "marked": 3399,
            "effective": 3059,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3399,
            "effective": 3059,
            "currency_code": "INR"
          }
        }
      }
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7927,
  "uid": "7927",
  "gstin": "",
  "checkout_mode": "self",
  "last_modified": "2023-03-03T00:00:00.000Z",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### removeCoupon
Remove Applied Coupon for platform pos user




```java
platformClient.application("<APPLICATION_ID>").cart.removeCoupon( uid,  buyNow) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| uid | String? | no |  |   
| buyNow | Boolean? | no |  |  



Remove Coupon applied on the cart by passing uid in request body.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns coupons removed from the cart along with item details and price breakup. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": 0,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 342.75,
      "mrp_total": 3199,
      "subtotal": 3199,
      "total": 3199,
      "vog": 2856.25,
      "you_saved": 0
    },
    "coupon": {
      "type": "cash",
      "code": "prismc22250111",
      "uid": "17743",
      "value": 0,
      "is_applied": false,
      "message": "Coupon successfully removed"
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 3199,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 3199,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 3199,
        "currency_code": "INR"
      }
    ],
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "bulk_offer": {},
      "key": "857596_S",
      "quantity": 1,
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "discount": "",
      "coupon_message": "",
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      }
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7477,
  "uid": "7477",
  "gstin": "",
  "checkout_mode": "self",
  "last_modified": "2023-02-02T00:00:00.000Z",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### getAddresses
Fetch address




```java
platformClient.application("<APPLICATION_ID>").cart.getAddresses( cartId,  buyNow,  mobileNo,  checkoutMode,  tags,  isDefault,  userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| mobileNo | String? | no |  |   
| checkoutMode | String? | no |  |   
| tags | String? | no |  |   
| isDefault | Boolean? | no |  |   
| userId | String? | no |  |  



Use this API to get all the addresses associated with an account. If successful, returns a Address resource in the response body specified in GetAddressesResponse.attibutes listed below are optional uid address_id  mobile_no checkout_mode tags default

*Returned Response:*




[PlatformGetAddressesResponse](#PlatformGetAddressesResponse)

Success. Returns an Address object containing a list of address saved in the account. Refer `GetAddressesResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; example1</i></summary>

```json
{
  "summary": "Address for India",
  "value": {
    "address": [
      {
        "landmark": "",
        "area_code": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "id": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "state": "Maharashtra",
        "meta": {},
        "user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "created_by_user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "country_code": "+91",
        "state_code": "MH",
        "country_phone_code": "91",
        "country_iso_code": "IN",
        "phone": "9915347757",
        "geo_location": {},
        "country": "India",
        "is_default_address": true,
        "is_active": true,
        "city": "Mumbai",
        "pincode": 400093,
        "checkout_mode": "self",
        "address_type": "home",
        "tags": [],
        "area": "Sector 127",
        "name": "abc",
        "email": "ankur@gofynd1.com",
        "address": "Megatron2",
        "_custom_json": {}
      }
    ]
  }
}
```
</details>

<details>
<summary><i>&nbsp; example2</i></summary>

```json
{
  "summary": "Address for Dubai",
  "value": {
    "address": [
      {
        "landmark": "",
        "area_code": "",
        "id": "651c0b882dbd5f702f711677",
        "state": "",
        "meta": {},
        "user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "created_by_user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
        "country_code": "+971",
        "country_phone_code": "+971",
        "country_iso_code": "AE",
        "phone": "551234567",
        "geo_location": {},
        "country": "United Arab Emirates",
        "is_default_address": true,
        "is_active": true,
        "city": "Sharjah",
        "sector": "Al Fisht",
        "checkout_mode": "self",
        "address_type": "home",
        "tags": [],
        "area": "Dubai Park",
        "name": "Shaikh Ahmed",
        "email": "example@gmail.com",
        "address": "B-62",
        "_custom_json": {}
      }
    ]
  }
}
```
</details>

</details>









---


### addAddress
Add address to an account




```java
platformClient.application("<APPLICATION_ID>").cart.addAddress(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |  
| body | [PlatformAddress](#PlatformAddress) | yes | Request body |


Use this API to add an address to an account.

*Returned Response:*




[SaveAddressResponse](#SaveAddressResponse)

Success. Returns the address ID, a flag whether the address is set as default, and a success message. Refer `SaveAddressResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "mongo_object_id",
  "is_default_address": true,
  "success": true
}
```
</details>









---


### getAddressById
Fetch a single address by its ID




```java
platformClient.application("<APPLICATION_ID>").cart.getAddressById( id,  cartId,  buyNow,  mobileNo,  checkoutMode,  tags,  isDefault,  userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes |  |   
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| mobileNo | String? | no |  |   
| checkoutMode | String? | no |  |   
| tags | String? | no |  |   
| isDefault | Boolean? | no |  |   
| userId | String? | no |  |  



Use this API to get an addresses using its ID. If successful, returns a Address resource in the response body specified in `PlatformAddress`. Attibutes listed below are optional mobile_no checkout_mode tags default

*Returned Response:*




[PlatformAddress](#PlatformAddress)

Success. Returns an PlatformAddress object containing a list of address saved in the account. Refer `PlatformAddress` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "landmark": "",
  "area_code": "410218",
  "state": "Maharashtra",
  "meta": {},
  "user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
  "created_by_user_id": "8b526f521bb14a2593a8b9e3ce8c76b3",
  "country_code": "IND",
  "state_code": "MH",
  "phone": "9915347757",
  "geo_location": {},
  "country": "India",
  "is_default_address": true,
  "is_active": true,
  "city": "Mumbai",
  "pincode": 400093,
  "checkout_mode": "self",
  "address_type": "home",
  "uid": 1145,
  "tags": [],
  "area": "Sector 127",
  "name": "abc",
  "address_id": 1145,
  "email": "ankur@gofynd1.com",
  "address": "Megatron2",
  "store_name": "store123"
}
```
</details>









---


### updateAddress
Update address added to an account




```java
platformClient.application("<APPLICATION_ID>").cart.updateAddress( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes | ID allotted to the selected address |  
| body | [PlatformAddress](#PlatformAddress) | yes | Request body |


Use this API to update an existing address in the account. Request object should contain attributes mentioned in Address can be updated. These attributes are:is_default_address landmark area pincode email address_type name address_id address

*Returned Response:*




[UpdateAddressResponse](#UpdateAddressResponse)

Success. Returns the address ID and a message indicating a successful address updation.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_updated": true,
  "id": "<mongo_object_id>",
  "is_default_address": true,
  "success": true
}
```
</details>









---


### removeAddress
Remove address associated with an account




```java
platformClient.application("<APPLICATION_ID>").cart.removeAddress( id,  userId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String | yes | ID allotted to the selected address |   
| userId | String? | no | Option to delete address for the provided user_id. |  



Use this API to delete an address by its ID. This will returns an object that will indicate whether the address was deleted successfully or not.

*Returned Response:*




[DeleteAddressResponse](#DeleteAddressResponse)

Returns a Status object indicating the success or failure of address deletion.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "id": "<mongo_object_id>",
  "is_deleted": true
}
```
</details>









---


### selectAddress
Select an address from available addresses




```java
platformClient.application("<APPLICATION_ID>").cart.selectAddress( cartId,  buyNow,  i,  b, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| cartId | String? | no |  |   
| buyNow | Boolean? | no |  |   
| i | Boolean? | no |  |   
| b | Boolean? | no |  |  
| body | [PlatformSelectCartAddressRequest](#PlatformSelectCartAddressRequest) | yes | Request body |


Select Address from all addresses associated with the account in order to ship the cart items to that address, otherwise default address will be selected implicitly. See `PlatformSelectCartAddressRequest` in schema of request body for the list of attributes needed to select Address from account. On successful request, this API returns a Cart object. Below address attributes are required. address_id billing_address_id uid

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object as shown below. Refer `CartDetailResponse` for more details.  .




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "is_valid": true,
  "buy_now": false,
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 315.86,
      "mrp_total": 5198,
      "subtotal": 5198,
      "total": 2948,
      "vog": 2632.15,
      "you_saved": 0
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 2948,
        "currency_code": "INR"
      }
    ],
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": "17743",
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "key": "857596_S",
      "discount": ""
    },
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "L",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 1,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
        "size": "L",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 2,
        "price": {
          "base": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 820312,
        "name": "Navy Blue Melange Shorts",
        "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 193,
            "name": "Shorts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
          "query": {
            "product_slug": [
              "883-police-navy-blue-melange-shorts-820312-4943a8"
            ]
          }
        }
      },
      "key": "820312_L",
      "discount": ""
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "uid": "7477",
  "gstin": "",
  "checkout_mode": "self",
  "last_modified": "2023-02-02T00:00:00.000Z",
  "restrict_checkout": false
}
```
</details>









---


### getShipments
Get delivery date and options before checkout




```java
platformClient.application("<APPLICATION_ID>").cart.getShipments( pickAtStoreUid,  orderingStoreId,  i,  p,  id,  addressId,  areaCode,  orderType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| pickAtStoreUid | Integer? | no |  |   
| orderingStoreId | Integer? | no |  |   
| i | Boolean? | no | This is a boolean value. Select `true` to retrieve all the items added in the cart. |   
| p | Boolean? | no | This is a boolean value. Select `true` for getting a payment option in response. |   
| id | String? | no | The unique identifier of the cart |   
| addressId | String? | no | ID allotted to the selected address |   
| areaCode | String? | no | The PIN Code of the destination address, e.g. 400059 |   
| orderType | String? | no | The order type of shipment HomeDelivery - If the customer wants the order home-delivered PickAtStore - If the customer wants the handover of an order at the store itself. |  



Use this API to get shipment details, expected delivery date, items and price breakup of the shipment.

*Returned Response:*




[PlatformCartShipmentsResponse](#PlatformCartShipmentsResponse)

Success. Returns delivery promise along with shipment details and price breakup. Refer `PlatformCartShipmentsResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Shipment Generated</i></summary>

```json
{
  "value": {
    "items": [],
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "304_1054_9036_R1005753_7",
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [
      {
        "fulfillment_id": 3009,
        "shipment_type": "single_shipment",
        "fulfillment_type": "store",
        "dp_id": "29",
        "dp_options": {
          "4": {
            "f_priority": 4,
            "r_priority": 5,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "7": {
            "f_priority": 3,
            "r_priority": 4,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "29": {
            "f_priority": 1,
            "r_priority": 2,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          }
        },
        "promise": {
          "timestamp": {
            "min": 1566678108,
            "max": 1567023708
          },
          "formatted": {
            "min": "Aug 24",
            "max": "Aug 28"
          },
          "iso": {
            "min": "2019-08-25T00:35:08.000Z",
            "max": "2019-08-29T07:55:08.000Z"
          }
        },
        "box_type": "Small Courier bag",
        "shipments": 1,
        "items": [
          {
            "quantity": 1,
            "identifiers": {
              "identifier": "5mPyy88URXuh3Lo35uaTg"
            },
            "product": {
              "type": "product",
              "uid": 820312,
              "name": "Navy Blue Melange Shorts",
              "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
              "brand": {
                "uid": 610,
                "name": "883 Police"
              },
              "categories": [
                {
                  "uid": 193,
                  "name": "Shorts"
                }
              ],
              "images": [
                {
                  "aspect_ratio": "16:25",
                  "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                  "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
                }
              ],
              "action": {
                "type": "product",
                "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
                "query": {
                  "product_slug": [
                    "883-police-navy-blue-melange-shorts-820312-4943a8"
                  ]
                }
              }
            },
            "discount": "",
            "bulk_offer": {},
            "key": "820312_L",
            "price": {
              "base": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              }
            },
            "article": {
              "type": "article",
              "tags": [],
              "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
              "size": "L",
              "seller": {
                "uid": 381,
                "name": "INTERSOURCE GARMENTS PVT LTD"
              },
              "store": {
                "uid": 3009,
                "name": "Kormangala"
              },
              "quantity": 2,
              "price": {
                "base": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                },
                "converted": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                }
              }
            },
            "availability": {
              "sizes": [
                "L",
                "XL",
                "XXL"
              ],
              "other_store_quantity": 1,
              "out_of_stock": false,
              "deliverable": true,
              "is_valid": true
            },
            "coupon_message": "",
            "message": ""
          }
        ]
      }
    ],
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": "",
    "checkout_mode": "self",
    "last_modified": "2023-03-03",
    "restrict_checkout": false,
    "is_valid": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Shipment Generation Failed</i></summary>

```json
{
  "value": {
    "items": [],
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "304_1054_9036_R1005753_7",
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [],
    "message": "Shipments could not be generated. Please Try again after some time.",
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": "",
    "checkout_mode": "self",
    "last_modified": "2023-03-03",
    "restrict_checkout": false,
    "is_valid": false
  }
}
```
</details>

</details>









---


### updateShipments
Update shipment delivery type and quantity before checkout




```java
platformClient.application("<APPLICATION_ID>").cart.updateShipments( i,  p,  id,  addressId,  areaCode,  orderType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| i | Boolean? | no | This is a boolean value. Select `true` to retrieve all the items added in the cart. |   
| p | Boolean? | no | This is a boolean value. Select `true` for getting a payment option in response. |   
| id | String? | no | The unique identifier of the cart |   
| addressId | String? | no | ID allotted to an address |   
| areaCode | String? | no | The PIN Code of the destination address, e.g. 400059 |   
| orderType | String? | no | The order type of shipment HomeDelivery - If the customer wants the order home-delivered PickAtStore - If the customer wants the handover of an order at the store itself. |  
| body | [UpdateCartShipmentRequest](#UpdateCartShipmentRequest) | yes | Request body |


Use this API to update the delivery type and quantity as per customer's preference for either store pick-up or home-delivery.

*Returned Response:*




[PlatformCartShipmentsResponse](#PlatformCartShipmentsResponse)

Success. Returns delivery promise along with shipment details and price breakup. Refer `PlatformCartShipmentsResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Shipment Generated</i></summary>

```json
{
  "value": {
    "items": [],
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "304_1054_9036_R1005753_6",
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [
      {
        "fulfillment_id": 3009,
        "shipment_type": "single_shipment",
        "fulfillment_type": "store",
        "dp_id": "29",
        "order_type": "PickAtStore",
        "dp_options": {
          "4": {
            "f_priority": 4,
            "r_priority": 5,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "7": {
            "f_priority": 3,
            "r_priority": 4,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          },
          "29": {
            "f_priority": 1,
            "r_priority": 2,
            "is_cod": true,
            "is_prepaid": true,
            "is_reverse": true
          }
        },
        "promise": {
          "timestamp": {
            "min": 1566678108,
            "max": 1567023708
          },
          "formatted": {
            "min": "Aug 24",
            "max": "Aug 28"
          },
          "iso": {
            "min": "2019-08-25T00:35:08.000Z",
            "max": "2019-08-29T07:55:08.000Z"
          }
        },
        "box_type": "Small Courier bag",
        "shipments": 1,
        "items": [
          {
            "quantity": 1,
            "identifiers": {
              "identifier": "5mPyy88URXuh3Lo35uaTg"
            },
            "product": {
              "type": "product",
              "uid": 820312,
              "name": "Navy Blue Melange Shorts",
              "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
              "brand": {
                "uid": 610,
                "name": "883 Police"
              },
              "categories": [
                {
                  "uid": 193,
                  "name": "Shorts"
                }
              ],
              "images": [
                {
                  "aspect_ratio": "16:25",
                  "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                  "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
                }
              ],
              "action": {
                "type": "product",
                "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
                "query": {
                  "product_slug": [
                    "883-police-navy-blue-melange-shorts-820312-4943a8"
                  ]
                }
              }
            },
            "discount": "",
            "bulk_offer": {},
            "key": "820312_L",
            "price": {
              "base": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "add_on": 1999,
                "marked": 1999,
                "effective": 1999,
                "selling": 1999,
                "currency_code": "INR"
              }
            },
            "article": {
              "type": "article",
              "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
              "size": "L",
              "seller": {
                "uid": 381,
                "name": "INTERSOURCE GARMENTS PVT LTD"
              },
              "store": {
                "uid": 3009,
                "name": "Kormangala"
              },
              "quantity": 2,
              "price": {
                "base": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                },
                "converted": {
                  "marked": 1999,
                  "effective": 1999,
                  "currency_code": "INR"
                }
              }
            },
            "availability": {
              "sizes": [
                "L",
                "XL",
                "XXL"
              ],
              "other_store_quantity": 1,
              "out_of_stock": false,
              "deliverable": true,
              "is_valid": true
            },
            "coupon_message": "",
            "message": ""
          }
        ]
      }
    ],
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": "",
    "checkout_mode": "self",
    "last_modified": "2023-03-03",
    "restrict_checkout": false,
    "is_valid": true
  }
}
```
</details>

<details>
<summary><i>&nbsp; Shipment Generation Failed</i></summary>

```json
{
  "value": {
    "items": [],
    "cart_id": 7501,
    "uid": "7501",
    "success": true,
    "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
    "payment_options": {
      "payment_option": [
        {
          "name": "COD",
          "display_name": "Cash on Delivery",
          "display_priority": 1,
          "payment_mode_id": 11,
          "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
          "logo_url": {
            "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
          },
          "list": []
        },
        {
          "name": "CARD",
          "display_priority": 2,
          "payment_mode_id": 2,
          "display_name": "Card",
          "list": []
        },
        {
          "name": "NB",
          "display_priority": 3,
          "payment_mode_id": 3,
          "display_name": "Net Banking",
          "list": [
            {
              "aggregator_name": "Razorpay",
              "bank_name": "ICICI Bank",
              "bank_code": "ICIC",
              "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
              },
              "merchant_code": "NB_ICICI",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "WL",
          "display_priority": 4,
          "payment_mode_id": 4,
          "display_name": "Wallet",
          "list": [
            {
              "wallet_name": "Paytm",
              "wallet_code": "paytm",
              "wallet_id": 4,
              "merchant_code": "PAYTM",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
              },
              "aggregator_name": "Juspay",
              "display_priority": 1
            }
          ]
        },
        {
          "name": "UPI",
          "display_priority": 9,
          "payment_mode_id": 6,
          "display_name": "UPI",
          "list": [
            {
              "aggregator_name": "UPI_Razorpay",
              "name": "UPI",
              "display_name": "BHIM UPI",
              "code": "UPI",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
              },
              "merchant_code": "UPI",
              "timeout": 240,
              "retry_count": 0,
              "fynd_vpa": "shopsense.rzp@hdfcbank",
              "intent_flow": true,
              "intent_app_error_list": [
                "com.csam.icici.bank.imobile",
                "in.org.npci.upiapp",
                "com.whatsapp"
              ]
            }
          ]
        },
        {
          "name": "PL",
          "display_priority": 11,
          "payment_mode_id": 1,
          "display_name": "Pay Later",
          "list": [
            {
              "aggregator_name": "Simpl",
              "name": "Simpl",
              "code": "simpl",
              "merchant_code": "SIMPL",
              "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
              "logo_url": {
                "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
              }
            }
          ]
        }
      ],
      "payment_flows": {
        "Simpl": {
          "data": {
            "gateway": {
              "route": "simpl",
              "entity": "sdk",
              "is_customer_validation_required": true,
              "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
              "sdk": {
                "config": {
                  "redirect": false,
                  "callback_url": null,
                  "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                },
                "data": {
                  "user_phone": "8452996729",
                  "user_email": "paymentsdummy@gofynd.com"
                }
              },
              "return_url": null
            }
          },
          "api_link": "",
          "payment_flow": "sdk"
        },
        "Juspay": {
          "data": {},
          "api_link": "https://sandbox.juspay.in/txns",
          "payment_flow": "api"
        },
        "Razorpay": {
          "data": {},
          "api_link": "",
          "payment_flow": "sdk"
        },
        "UPI_Razorpay": {
          "data": {},
          "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
          "payment_flow": "api"
        },
        "Fynd": {
          "data": {},
          "api_link": "",
          "payment_flow": "api"
        }
      },
      "default": {}
    },
    "user_type": "Store User",
    "cod_charges": 0,
    "order_id": null,
    "cod_available": true,
    "cod_message": "No additional COD charges applicable",
    "delivery_charges": 0,
    "delivery_charge_order_value": 0,
    "delivery_slots": [
      {
        "date": "Sat, 24 Aug",
        "delivery_slot": [
          {
            "delivery_slot_timing": "By 9:00 PM",
            "default": true,
            "delivery_slot_id": 1
          }
        ]
      }
    ],
    "store_code": "",
    "store_emps": [],
    "breakup_values": {
      "loyalty_points": {
        "total": 0,
        "applicable": 0,
        "is_applied": false,
        "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
      },
      "coupon": {
        "type": "cash",
        "code": "",
        "uid": "304_1054_9036_R1005753_6",
        "value": 0,
        "is_applied": false,
        "message": "Sorry! Invalid Coupon"
      },
      "raw": {
        "cod_charge": 0,
        "convenience_fee": 0,
        "coupon": 0,
        "delivery_charge": 0,
        "discount": 0,
        "fynd_cash": 0,
        "gst_charges": 214.18,
        "mrp_total": 1999,
        "subtotal": 1999,
        "total": 1999,
        "vog": 1784.82,
        "you_saved": 0
      },
      "display": [
        {
          "display": "MRP Total",
          "key": "mrp_total",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Subtotal",
          "key": "subtotal",
          "value": 1999,
          "currency_code": "INR"
        },
        {
          "display": "Total",
          "key": "total",
          "value": 1999,
          "currency_code": "INR"
        }
      ]
    },
    "shipments": [],
    "message": "Shipments could not be generated. Please Try again after some time.",
    "delivery_charge_info": "",
    "coupon_text": "View all offers",
    "gstin": "",
    "checkout_mode": "self",
    "last_modified": "2023-03-03",
    "restrict_checkout": false,
    "is_valid": false
  }
}
```
</details>

</details>









---


### updateCartMeta
Update the cart meta for platform pos user




```java
platformClient.application("<APPLICATION_ID>").cart.updateCartMeta( id,  buyNow, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |  
| body | [PlatformCartMetaRequest](#PlatformCartMetaRequest) | yes | Request body |


Use this API to update cart meta like checkout_mode and gstin.

*Returned Response:*




[CartMetaResponse](#CartMetaResponse)

Returns a message indicating the success of cart meta updation as shown below.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "message": "cart meta updated"
}
```
</details>









---


### platformCheckoutCart
Checkout all items in the cart




```java
platformClient.application("<APPLICATION_ID>").cart.platformCheckoutCart( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |  
| body | [PlatformCartCheckoutDetailRequest](#PlatformCartCheckoutDetailRequest) | yes | Request body |


Use this API to checkout all items in the cart for payment and order generation. For COD, order will be generated directly, whereas for other checkout modes, user will be redirected to a payment gateway.

*Returned Response:*




[CartCheckoutResponse](#CartCheckoutResponse)

Success. Returns the status of cart checkout. Refer `CartCheckoutResponse` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Address id not found</i></summary>

```json
{
  "value": {
    "success": false,
    "message": "No address found with address id {address_id}"
  }
}
```
</details>

<details>
<summary><i>&nbsp; Missing address_id</i></summary>

```json
{
  "value": {
    "address_id": [
      "Missing data for required field."
    ]
  }
}
```
</details>

<details>
<summary><i>&nbsp; Successful checkout cod payment</i></summary>

```json
{
  "value": {
    "success": true,
    "cart": {
      "success": true,
      "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
      "payment_options": {
        "payment_option": [
          {
            "name": "COD",
            "display_name": "Cash on Delivery",
            "display_priority": 1,
            "payment_mode_id": 11,
            "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "logo_url": {
              "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
              "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
            },
            "list": []
          },
          {
            "name": "CARD",
            "display_priority": 2,
            "payment_mode_id": 2,
            "display_name": "Card",
            "list": []
          },
          {
            "name": "NB",
            "display_priority": 3,
            "payment_mode_id": 3,
            "display_name": "Net Banking",
            "list": [
              {
                "aggregator_name": "Razorpay",
                "bank_name": "ICICI Bank",
                "bank_code": "ICIC",
                "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
                },
                "merchant_code": "NB_ICICI",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "WL",
            "display_priority": 4,
            "payment_mode_id": 4,
            "display_name": "Wallet",
            "list": [
              {
                "wallet_name": "Paytm",
                "wallet_code": "paytm",
                "wallet_id": 4,
                "merchant_code": "PAYTM",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
                },
                "aggregator_name": "Juspay",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "UPI",
            "display_priority": 9,
            "payment_mode_id": 6,
            "display_name": "UPI",
            "list": [
              {
                "aggregator_name": "UPI_Razorpay",
                "name": "UPI",
                "display_name": "BHIM UPI",
                "code": "UPI",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
                },
                "merchant_code": "UPI",
                "timeout": 240,
                "retry_count": 0,
                "fynd_vpa": "shopsense.rzp@hdfcbank",
                "intent_flow": true,
                "intent_app_error_list": [
                  "com.csam.icici.bank.imobile",
                  "in.org.npci.upiapp",
                  "com.whatsapp"
                ]
              }
            ]
          },
          {
            "name": "PL",
            "display_priority": 11,
            "payment_mode_id": 1,
            "display_name": "Pay Later",
            "list": [
              {
                "aggregator_name": "Simpl",
                "name": "Simpl",
                "code": "simpl",
                "merchant_code": "SIMPL",
                "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
                }
              }
            ]
          }
        ],
        "payment_flows": {
          "Simpl": {
            "data": {
              "gateway": {
                "route": "simpl",
                "entity": "sdk",
                "is_customer_validation_required": true,
                "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
                "sdk": {
                  "config": {
                    "redirect": false,
                    "callback_url": null,
                    "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                  },
                  "data": {
                    "user_phone": "8452996729",
                    "user_email": "paymentsdummy@gofynd.com"
                  }
                },
                "return_url": null
              }
            },
            "api_link": "",
            "payment_flow": "sdk"
          },
          "Juspay": {
            "data": {},
            "api_link": "https://sandbox.juspay.in/txns",
            "payment_flow": "api"
          },
          "Razorpay": {
            "data": {},
            "api_link": "",
            "payment_flow": "sdk"
          },
          "UPI_Razorpay": {
            "data": {},
            "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
            "payment_flow": "api"
          },
          "Fynd": {
            "data": {},
            "api_link": "",
            "payment_flow": "api"
          }
        },
        "default": {}
      },
      "user_type": "Store User",
      "cod_charges": 0,
      "order_id": "FY5D5E215CF287584CE6",
      "cod_available": true,
      "cod_message": "No additional COD charges applicable",
      "delivery_charges": 0,
      "delivery_charge_order_value": 0,
      "delivery_slots": [
        {
          "date": "Sat, 24 Aug",
          "delivery_slot": [
            {
              "delivery_slot_timing": "By 9:00 PM",
              "default": true,
              "delivery_slot_id": 1
            }
          ]
        }
      ],
      "store_code": "",
      "store_emps": [],
      "breakup_values": {
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 214.18,
          "mrp_total": 1999,
          "subtotal": 1999,
          "total": 1999,
          "vog": 1784.82,
          "you_saved": 0
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 1999,
            "currency_code": "INR"
          }
        ]
      },
      "items": [
        {
          "key": "820312_L",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "message": "",
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            }
          },
          "quantity": 1,
          "discount": "",
          "product": {
            "type": "product",
            "uid": 820312,
            "name": "Navy Blue Melange Shorts",
            "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
            "brand": {
              "uid": 610,
              "name": "883 Police"
            },
            "categories": [
              {
                "uid": 193,
                "name": "Shorts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
              "query": {
                "product_slug": [
                  "883-police-navy-blue-melange-shorts-820312-4943a8"
                ]
              }
            }
          },
          "article": {
            "type": "article",
            "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
            "size": "L",
            "seller": {
              "uid": 381,
              "name": "INTERSOURCE GARMENTS PVT LTD"
            },
            "store": {
              "uid": 3009,
              "name": "Kormangala"
            },
            "quantity": 2,
            "price": {
              "base": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "availability": {
            "sizes": [
              "L",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 1,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          }
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "cart_id": 7483,
      "uid": "7483",
      "gstin": "",
      "checkout_mode": "self",
      "last_modified": "2023-03-03T00:00:00.000Z",
      "restrict_checkout": false,
      "is_valid": true
    },
    "callback_url": "https://api.addsale.com/gringotts/api/v1/external/payment-callback/",
    "app_intercept_url": "http://uniket-testing.addsale.link/cart/order-status",
    "message": "",
    "data": {
      "order_id": "FY5D5E215CF287584CE6"
    },
    "order_id": "FY5D5E215CF287584CE6"
  }
}
```
</details>

</details>









---


### getAvailableDeliveryModes
Get available delivery modes for cart




```java
platformClient.application("<APPLICATION_ID>").cart.getAvailableDeliveryModes( areaCode,  id) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| areaCode | String | yes |  |   
| id | String? | no |  |  



Use this API to get the delivery modes (home-delivery/store-pickup) along with a list of pickup stores available for a given cart at a given PIN Code. User can then view the address of a pickup store with the help of store-address API.

*Returned Response:*




[CartDeliveryModesResponse](#CartDeliveryModesResponse)

Success. Returns the available delivery mode available for a given PIN Code, along with the UID of all the eligible pickup stores.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "available_modes": [
    "HomeDelivery",
    "PickAtStore"
  ],
  "pickup_stores": [
    1
  ]
}
```
</details>









---


### getStoreAddressByUid
Get list of stores for give uids




```java
platformClient.application("<APPLICATION_ID>").cart.getStoreAddressByUid( storeUid) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| storeUid | Integer | yes |  |  



Use this API to get the store details by entering the unique identifier of the pickup stores shown in the response of available-delivery-mode API.

*Returned Response:*




[StoreDetailsResponse](#StoreDetailsResponse)

Success. Returns available store information with its address as shown below.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "name": "Tennille Urse",
      "phone": "9819716565",
      "email": "rehman@cashkart.com",
      "address_type": "store",
      "address": "NO",
      "area": "",
      "pincode": 400072,
      "area_code": "400072",
      "area_code_slug": "pincode",
      "landmark": "",
      "country": "INDIA",
      "city": "MUMBAI",
      "state": "MAHA",
      "store_code": "6462b3cd-9d64-4da9-a764-b0e6a52cf5e8",
      "uid": 20,
      "store_manager_name": "Salma",
      "geo_location": {
        "longitude": 1,
        "latitude": 1
      }
    }
  ]
}
```
</details>









---


### selectPaymentMode
Update cart payment




```java
platformClient.application("<APPLICATION_ID>").cart.selectPaymentMode( id,  buyNow,  orderType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |   
| orderType | String? | no | The order type of shipment HomeDelivery - If the customer wants the order home-delivered PickAtStore - If the customer wants the handover of an order at the store itself. |  
| body | [UpdateCartPaymentRequest](#UpdateCartPaymentRequest) | yes | Request body |


Use this API to update cart payment.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object as shown below. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
  "user_type": "Store User",
  "cod_charges": 0,
  "order_id": null,
  "cod_available": true,
  "cod_message": "No additional COD charges applicable",
  "delivery_charges": 0,
  "delivery_charge_order_value": 0,
  "store_code": "",
  "store_emps": [],
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 315.86,
      "mrp_total": 5198,
      "subtotal": 5198,
      "total": 2948,
      "vog": 2632.15,
      "you_saved": 0
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 2948,
        "currency_code": "INR"
      }
    ],
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": "17743",
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "key": "857596_S",
      "discount": ""
    },
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "L",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 1,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
        "size": "L",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 2,
        "price": {
          "base": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 820312,
        "name": "Navy Blue Melange Shorts",
        "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 193,
            "name": "Shorts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
          "query": {
            "product_slug": [
              "883-police-navy-blue-melange-shorts-820312-4943a8"
            ]
          }
        }
      },
      "key": "820312_L",
      "discount": ""
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7477,
  "uid": "7477",
  "gstin": "",
  "checkout_mode": "self",
  "last_modified": "2023-02-02T00:00:00.000Z",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---


### validateCouponForPayment
Verify the coupon eligibility against the payment mode




```java
platformClient.application("<APPLICATION_ID>").cart.validateCouponForPayment( id,  buyNow,  addressId,  paymentMode,  paymentIdentifier,  aggregatorName,  merchantCode) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |   
| addressId | String? | no |  |   
| paymentMode | String? | no |  |   
| paymentIdentifier | String? | no |  |   
| aggregatorName | String? | no |  |   
| merchantCode | String? | no |  |  



Use this API to validate a coupon against the payment mode such as NetBanking, Wallet, UPI etc.

*Returned Response:*




[PaymentCouponValidate](#PaymentCouponValidate)

Success. Returns a success message and the coupon validity. Refer `PaymentCouponValidate` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "",
  "coupon_validity": {
    "valid": true,
    "discount": 499.5,
    "code": "testpayment",
    "display_message_en": "",
    "title": "Coupon value will change."
  }
}
```
</details>









---


### platformCheckoutCartV2
Checkout all items in the cart




```java
platformClient.application("<APPLICATION_ID>").cart.platformCheckoutCartV2( id, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |  
| body | [PlatformCartCheckoutDetailV2Request](#PlatformCartCheckoutDetailV2Request) | yes | Request body |


Use this API to checkout all items in the cart for payment and order generation. For COD, order will be directly generated, whereas for other checkout modes, user will be redirected to a payment gateway.

*Returned Response:*




[CartCheckoutResponse](#CartCheckoutResponse)

Success. Returns the status of cart checkout. Refer `CartCheckoutResponseSchema` for more details.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; Address id not found</i></summary>

```json
{
  "value": {
    "success": false,
    "message": "No address found with address id {address_id}"
  }
}
```
</details>

<details>
<summary><i>&nbsp; Missing address_id</i></summary>

```json
{
  "value": {
    "address_id": [
      "Missing data for required field."
    ]
  }
}
```
</details>

<details>
<summary><i>&nbsp; Successful checkout cod payment</i></summary>

```json
{
  "value": {
    "success": true,
    "cart": {
      "success": true,
      "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
      "payment_options": {
        "payment_option": [
          {
            "name": "COD",
            "display_name": "Cash on Delivery",
            "display_priority": 1,
            "payment_mode_id": 11,
            "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
            "logo_url": {
              "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png",
              "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/cod.png"
            },
            "list": []
          },
          {
            "name": "CARD",
            "display_priority": 2,
            "payment_mode_id": 2,
            "display_name": "Card",
            "list": []
          },
          {
            "name": "NB",
            "display_priority": 3,
            "payment_mode_id": 3,
            "display_name": "Net Banking",
            "list": [
              {
                "aggregator_name": "Razorpay",
                "bank_name": "ICICI Bank",
                "bank_code": "ICIC",
                "url": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/NB_ICICI.png"
                },
                "merchant_code": "NB_ICICI",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "WL",
            "display_priority": 4,
            "payment_mode_id": 4,
            "display_name": "Wallet",
            "list": [
              {
                "wallet_name": "Paytm",
                "wallet_code": "paytm",
                "wallet_id": 4,
                "merchant_code": "PAYTM",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_small.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/paytm_logo_large.png"
                },
                "aggregator_name": "Juspay",
                "display_priority": 1
              }
            ]
          },
          {
            "name": "UPI",
            "display_priority": 9,
            "payment_mode_id": 6,
            "display_name": "UPI",
            "list": [
              {
                "aggregator_name": "UPI_Razorpay",
                "name": "UPI",
                "display_name": "BHIM UPI",
                "code": "UPI",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_100x78.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/upi_150x100.png"
                },
                "merchant_code": "UPI",
                "timeout": 240,
                "retry_count": 0,
                "fynd_vpa": "shopsense.rzp@hdfcbank",
                "intent_flow": true,
                "intent_app_error_list": [
                  "com.csam.icici.bank.imobile",
                  "in.org.npci.upiapp",
                  "com.whatsapp"
                ]
              }
            ]
          },
          {
            "name": "PL",
            "display_priority": 11,
            "payment_mode_id": 1,
            "display_name": "Pay Later",
            "list": [
              {
                "aggregator_name": "Simpl",
                "name": "Simpl",
                "code": "simpl",
                "merchant_code": "SIMPL",
                "logo": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                "logo_url": {
                  "small": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png",
                  "large": "https://d2co8r51m5ca2d.cloudfront.net/payments_assets/simpl_logo.png"
                }
              }
            ]
          }
        ],
        "payment_flows": {
          "Simpl": {
            "data": {
              "gateway": {
                "route": "simpl",
                "entity": "sdk",
                "is_customer_validation_required": true,
                "cust_validation_url": "https://api.addsale.com/gringotts/api/v1/validate-customer/",
                "sdk": {
                  "config": {
                    "redirect": false,
                    "callback_url": null,
                    "action_url": "https://api.addsale.com/avis/api/v1/payments/charge-gringotts-transaction/"
                  },
                  "data": {
                    "user_phone": "8452996729",
                    "user_email": "paymentsdummy@gofynd.com"
                  }
                },
                "return_url": null
              }
            },
            "api_link": "",
            "payment_flow": "sdk"
          },
          "Juspay": {
            "data": {},
            "api_link": "https://sandbox.juspay.in/txns",
            "payment_flow": "api"
          },
          "Razorpay": {
            "data": {},
            "api_link": "",
            "payment_flow": "sdk"
          },
          "UPI_Razorpay": {
            "data": {},
            "api_link": "https://api.addsale.com/gringotts/api/v1/external/payment-initialisation/",
            "payment_flow": "api"
          },
          "Fynd": {
            "data": {},
            "api_link": "",
            "payment_flow": "api"
          }
        },
        "default": {}
      },
      "user_type": "Store User",
      "cod_charges": 0,
      "order_id": "FY5D5E215CF287584CE6",
      "cod_available": true,
      "cod_message": "No additional COD charges applicable",
      "delivery_charges": 0,
      "delivery_charge_order_value": 0,
      "delivery_slots": [
        {
          "date": "Sat, 24 Aug",
          "delivery_slot": [
            {
              "delivery_slot_timing": "By 9:00 PM",
              "default": true,
              "delivery_slot_id": 1
            }
          ]
        }
      ],
      "store_code": "",
      "store_emps": [],
      "breakup_values": {
        "coupon": {
          "type": "cash",
          "code": "",
          "uid": "",
          "value": 0,
          "is_applied": false,
          "message": "Sorry! Invalid Coupon"
        },
        "loyalty_points": {
          "total": 0,
          "applicable": 0,
          "is_applied": false,
          "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
        },
        "raw": {
          "cod_charge": 0,
          "convenience_fee": 0,
          "coupon": 0,
          "delivery_charge": 0,
          "discount": 0,
          "fynd_cash": 0,
          "gst_charges": 214.18,
          "mrp_total": 1999,
          "subtotal": 1999,
          "total": 1999,
          "vog": 1784.82,
          "you_saved": 0
        },
        "display": [
          {
            "display": "MRP Total",
            "key": "mrp_total",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Subtotal",
            "key": "subtotal",
            "value": 1999,
            "currency_code": "INR"
          },
          {
            "display": "Total",
            "key": "total",
            "value": 1999,
            "currency_code": "INR"
          }
        ]
      },
      "items": [
        {
          "key": "820312_L",
          "identifiers": {
            "identifier": "5mPyy88URXuh3Lo35uaTg"
          },
          "message": "",
          "bulk_offer": {},
          "price": {
            "base": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            },
            "converted": {
              "add_on": 1999,
              "marked": 1999,
              "effective": 1999,
              "selling": 1999,
              "currency_code": "INR"
            }
          },
          "quantity": 1,
          "discount": "",
          "product": {
            "type": "product",
            "uid": 820312,
            "name": "Navy Blue Melange Shorts",
            "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
            "brand": {
              "uid": 610,
              "name": "883 Police"
            },
            "categories": [
              {
                "uid": 193,
                "name": "Shorts"
              }
            ],
            "images": [
              {
                "aspect_ratio": "16:25",
                "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
                "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
              }
            ],
            "action": {
              "type": "product",
              "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
              "query": {
                "product_slug": [
                  "883-police-navy-blue-melange-shorts-820312-4943a8"
                ]
              }
            }
          },
          "article": {
            "type": "article",
            "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
            "size": "L",
            "seller": {
              "uid": 381,
              "name": "INTERSOURCE GARMENTS PVT LTD"
            },
            "store": {
              "uid": 3009,
              "name": "Kormangala"
            },
            "quantity": 2,
            "price": {
              "base": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              },
              "converted": {
                "marked": 1999,
                "effective": 1999,
                "currency_code": "INR"
              }
            }
          },
          "coupon_message": "",
          "availability": {
            "sizes": [
              "L",
              "XL",
              "XXL"
            ],
            "other_store_quantity": 1,
            "out_of_stock": false,
            "deliverable": true,
            "is_valid": true
          }
        }
      ],
      "delivery_charge_info": "",
      "coupon_text": "View all offers",
      "cart_id": 7483,
      "uid": "7483",
      "gstin": "",
      "checkout_mode": "self",
      "last_modified": "2023-02-02T00:00:00.000Z",
      "restrict_checkout": false,
      "is_valid": true
    },
    "callback_url": "https://api.addsale.com/gringotts/api/v1/external/payment-callback/",
    "app_intercept_url": "http://uniket-testing.addsale.link/cart/order-status",
    "message": "",
    "data": {
      "order_id": "FY5D5E215CF287584CE6"
    },
    "order_id": "FY5D5E215CF287584CE6"
  }
}
```
</details>

</details>









---


### selectPaymentModeV2
Update cart payment




```java
platformClient.application("<APPLICATION_ID>").cart.selectPaymentModeV2( id,  buyNow,  orderType, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes | Current company id |   
| applicationId | String | yes | Current Application _id |   
| id | String? | no |  |   
| buyNow | Boolean? | no |  |   
| orderType | String? | no | The order type of shipment HomeDelivery - If the customer wants the order home-delivered PickAtStore - If the customer wants the handover of an order at the store itself. |  
| body | [UpdateCartPaymentRequestV2](#UpdateCartPaymentRequestV2) | yes | Request body |


Use this API to update cart payment.

*Returned Response:*




[CartDetailResponse](#CartDetailResponse)

Success. Returns a Cart object as shown below. Refer `CartDetailResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "error_message": "Note: Your order delivery will be delayed by 7-10 Days",
  "user_type": "Store User",
  "cod_charges": 0,
  "order_id": null,
  "cod_available": true,
  "cod_message": "No additional COD charges applicable",
  "delivery_charges": 0,
  "delivery_charge_order_value": 0,
  "store_code": "",
  "store_emps": [],
  "breakup_values": {
    "raw": {
      "cod_charge": 0,
      "convenience_fee": 0,
      "coupon": -2250,
      "delivery_charge": 0,
      "discount": 0,
      "fynd_cash": 0,
      "gst_charges": 315.86,
      "mrp_total": 5198,
      "subtotal": 5198,
      "total": 2948,
      "vog": 2632.15,
      "you_saved": 0
    },
    "display": [
      {
        "display": "MRP Total",
        "key": "mrp_total",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Subtotal",
        "key": "subtotal",
        "value": 5198,
        "currency_code": "INR"
      },
      {
        "display": "Coupon",
        "key": "coupon",
        "value": -2250,
        "currency_code": "INR"
      },
      {
        "display": "Total",
        "key": "total",
        "value": 2948,
        "currency_code": "INR"
      }
    ],
    "coupon": {
      "type": "cash",
      "code": "PRISMC22250111",
      "uid": "17743",
      "value": 2250,
      "is_applied": true,
      "message": "coupn applied"
    },
    "loyalty_points": {
      "total": 0,
      "applicable": 0,
      "is_applied": false,
      "description": "Your cashback, referrals, and refund amount get credited to Fynd Cash which can be redeemed while placing an order."
    }
  },
  "items": [
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "M",
          "S",
          "L",
          "XXL",
          "XL"
        ],
        "other_store_quantity": 10,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 3199,
          "marked": 3199,
          "effective": 3199,
          "selling": 3199,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_LETTER19APINK_S",
        "size": "S",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 11,
        "price": {
          "base": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 3199,
            "effective": 3199,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 857596,
        "name": "Pink Solid Hoodie",
        "slug": "883-police-pink-solid-hoodie-857596-111bdc",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 144,
            "name": "Hoodies"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_LETTER19APINK/1_1553062658148.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-pink-solid-hoodie-857596-111bdc/",
          "query": {
            "product_slug": [
              "883-police-pink-solid-hoodie-857596-111bdc"
            ]
          }
        }
      },
      "key": "857596_S",
      "discount": ""
    },
    {
      "message": "",
      "identifiers": {
        "identifier": "5mPyy88URXuh3Lo35uaTg"
      },
      "quantity": 1,
      "availability": {
        "sizes": [
          "L",
          "XL",
          "XXL"
        ],
        "other_store_quantity": 1,
        "out_of_stock": false,
        "deliverable": true,
        "is_valid": true
      },
      "coupon_message": "PRISMC22250111 coupon applied",
      "price": {
        "base": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        },
        "converted": {
          "add_on": 1999,
          "marked": 1999,
          "effective": 1999,
          "selling": 1999,
          "currency_code": "INR"
        }
      },
      "bulk_offer": {},
      "article": {
        "type": "article",
        "uid": "381_610_IGPL01_SPIRAL19ANAVY_L",
        "size": "L",
        "seller": {
          "uid": 381,
          "name": "INTERSOURCE GARMENTS PVT LTD"
        },
        "store": {
          "uid": 3009,
          "name": "Kormangala"
        },
        "quantity": 2,
        "price": {
          "base": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          },
          "converted": {
            "marked": 1999,
            "effective": 1999,
            "currency_code": "INR"
          }
        }
      },
      "product": {
        "type": "product",
        "uid": 820312,
        "name": "Navy Blue Melange Shorts",
        "slug": "883-police-navy-blue-melange-shorts-820312-4943a8",
        "brand": {
          "uid": 610,
          "name": "883 Police"
        },
        "categories": [
          {
            "uid": 193,
            "name": "Shorts"
          }
        ],
        "images": [
          {
            "aspect_ratio": "16:25",
            "url": "http://cdn4.gofynd.com/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg",
            "secure_url": "https://d2zv4gzhlr4ud6.cloudfront.net/media/pictures/tagged_items/original/610_SPIRAL19ANAVY/1_1549105947281.jpg"
          }
        ],
        "action": {
          "type": "product",
          "url": "https://api.addsale.com/platform/content/v1/products/883-police-navy-blue-melange-shorts-820312-4943a8/",
          "query": {
            "product_slug": [
              "883-police-navy-blue-melange-shorts-820312-4943a8"
            ]
          }
        }
      },
      "key": "820312_L",
      "discount": ""
    }
  ],
  "delivery_charge_info": "",
  "coupon_text": "View all offers",
  "buy_now": false,
  "cart_id": 7477,
  "uid": "7477",
  "gstin": "",
  "checkout_mode": "self",
  "last_modified": "2023-02-02T00:00:00.000Z",
  "restrict_checkout": false,
  "is_valid": true
}
```
</details>









---




### Schemas

 
 
 #### [CouponDateMeta](#CouponDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [Ownership](#Ownership)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payableCategory | String |  no  |  |
 | payableBy | String |  no  |  |

---


 
 
 #### [CouponAuthor](#CouponAuthor)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | String? |  yes  |  |
 | modifiedBy | String? |  yes  |  |

---


 
 
 #### [State](#State)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isArchived | Boolean? |  yes  |  |
 | isDisplay | Boolean? |  yes  |  |
 | isPublic | Boolean? |  yes  |  |

---


 
 
 #### [PaymentAllowValue](#PaymentAllowValue)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer? |  yes  |  |

---


 
 
 #### [PaymentModes](#PaymentModes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codes | ArrayList<String>? |  yes  |  |
 | iins | ArrayList<String>? |  yes  |  |
 | types | ArrayList<String>? |  yes  |  |
 | networks | ArrayList<String>? |  yes  |  |
 | uses | [PaymentAllowValue](#PaymentAllowValue)? |  yes  |  |

---


 
 
 #### [PriceRange](#PriceRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer? |  yes  |  |
 | min | Integer? |  yes  |  |

---


 
 
 #### [PostOrder](#PostOrder)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancellationAllowed | Boolean? |  yes  |  |
 | returnAllowed | Boolean? |  yes  |  |

---


 
 
 #### [BulkBundleRestriction](#BulkBundleRestriction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | multiStoreAllowed | Boolean |  no  |  |

---


 
 
 #### [UsesRemaining](#UsesRemaining)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |
 | app | Integer? |  yes  |  |

---


 
 
 #### [UsesRestriction](#UsesRestriction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maximum | [UsesRemaining](#UsesRemaining)? |  yes  |  |
 | remaining | [UsesRemaining](#UsesRemaining)? |  yes  |  |

---


 
 
 #### [Restrictions](#Restrictions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payments | HashMap<String,[PaymentModes](#PaymentModes)>? |  yes  |  |
 | userType | String? |  yes  |  |
 | priceRange | [PriceRange](#PriceRange)? |  yes  |  |
 | platforms | ArrayList<String>? |  yes  |  |
 | postOrder | [PostOrder](#PostOrder)? |  yes  |  |
 | bulkBundle | [BulkBundleRestriction](#BulkBundleRestriction)? |  yes  |  |
 | userGroups | ArrayList<Integer>? |  yes  |  |
 | couponAllowed | Boolean? |  yes  |  |
 | uses | [UsesRestriction](#UsesRestriction)? |  yes  |  |
 | orderingStores | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [Validation](#Validation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appId | ArrayList<String>? |  yes  |  |
 | anonymous | Boolean? |  yes  |  |
 | userRegisteredAfter | String? |  yes  |  |

---


 
 
 #### [CouponAction](#CouponAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | actionDate | String? |  yes  |  |
 | txnMode | String? |  yes  |  |

---


 
 
 #### [CouponSchedule](#CouponSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | String? |  yes  |  |
 | start | String? |  yes  |  |
 | nextSchedule | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | cron | String? |  yes  |  |
 | duration | Integer? |  yes  |  |

---


 
 
 #### [Rule](#Rule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | Double? |  yes  |  |
 | value | Double? |  yes  |  |
 | max | Double? |  yes  |  |
 | discountQty | Double? |  yes  |  |
 | min | Double? |  yes  |  |

---


 
 
 #### [DisplayMetaDict](#DisplayMetaDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | subtitle | String? |  yes  |  |

---


 
 
 #### [DisplayMeta](#DisplayMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | auto | [DisplayMetaDict](#DisplayMetaDict)? |  yes  |  |
 | apply | [DisplayMetaDict](#DisplayMetaDict)? |  yes  |  |
 | remove | [DisplayMetaDict](#DisplayMetaDict)? |  yes  |  |
 | subtitle | String? |  yes  |  |
 | description | String? |  yes  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandId | ArrayList<Integer>? |  yes  |  |
 | emailDomain | ArrayList<String>? |  yes  |  |
 | companyId | ArrayList<Integer>? |  yes  |  |
 | storeId | ArrayList<Integer>? |  yes  |  |
 | collectionId | ArrayList<String>? |  yes  |  |
 | itemId | ArrayList<Integer>? |  yes  |  |
 | userId | ArrayList<String>? |  yes  |  |
 | categoryId | ArrayList<Integer>? |  yes  |  |
 | articleId | ArrayList<String>? |  yes  |  |
 | excludeBrandId | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [Validity](#Validity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priority | Integer? |  yes  |  |

---


 
 
 #### [RuleDefinition](#RuleDefinition)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyCode | String? |  yes  |  |
 | autoApply | Boolean? |  yes  |  |
 | type | String |  no  |  |
 | isExact | Boolean? |  yes  |  |
 | applicableOn | String |  no  |  |
 | calculateOn | String |  no  |  |
 | valueType | String |  no  |  |
 | scope | ArrayList<String>? |  yes  |  |

---


 
 
 #### [CouponAdd](#CouponAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dateMeta | [CouponDateMeta](#CouponDateMeta)? |  yes  |  |
 | ownership | [Ownership](#Ownership) |  no  |  |
 | author | [CouponAuthor](#CouponAuthor)? |  yes  |  |
 | state | [State](#State)? |  yes  |  |
 | restrictions | [Restrictions](#Restrictions)? |  yes  |  |
 | validation | [Validation](#Validation)? |  yes  |  |
 | action | [CouponAction](#CouponAction)? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | schedule | [CouponSchedule](#CouponSchedule)? |  yes  |  |
 | rule | ArrayList<[Rule](#Rule)> |  no  |  |
 | displayMeta | [DisplayMeta](#DisplayMeta) |  no  |  |
 | code | String |  no  |  |
 | typeSlug | String |  no  |  |
 | identifiers | [Identifier](#Identifier) |  no  |  |
 | validity | [Validity](#Validity) |  no  |  |
 | ruleDefinition | [RuleDefinition](#RuleDefinition) |  no  |  |
 | id | String? |  yes  | Coupon id |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  | True if more records are present for next pages |
 | itemTotal | Integer? |  yes  | Total coupon count in system |
 | current | Integer? |  yes  | Current page no |
 | nextId | String? |  yes  | Cursor id for next set of records. |
 | page | Integer? |  yes  | Page requested |
 | lastId | String? |  yes  | Last objects id |
 | type | String |  no  |  |
 | size | Integer? |  yes  | Current request page size |
 | hasPrevious | Boolean? |  yes  | True if more records are present for previous pages. Sent for cursor pagination |

---


 
 
 #### [CouponsResponse](#CouponsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[CouponAdd](#CouponAdd)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [SuccessMessage](#SuccessMessage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [OperationErrorResponse](#OperationErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [CouponUpdate](#CouponUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dateMeta | [CouponDateMeta](#CouponDateMeta)? |  yes  |  |
 | ownership | [Ownership](#Ownership) |  no  |  |
 | author | [CouponAuthor](#CouponAuthor)? |  yes  |  |
 | state | [State](#State)? |  yes  |  |
 | restrictions | [Restrictions](#Restrictions)? |  yes  |  |
 | validation | [Validation](#Validation)? |  yes  |  |
 | action | [CouponAction](#CouponAction)? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | schedule | [CouponSchedule](#CouponSchedule)? |  yes  |  |
 | rule | ArrayList<[Rule](#Rule)> |  no  |  |
 | displayMeta | [DisplayMeta](#DisplayMeta) |  no  |  |
 | code | String |  no  |  |
 | typeSlug | String |  no  |  |
 | identifiers | [Identifier](#Identifier) |  no  |  |
 | validity | [Validity](#Validity) |  no  |  |
 | ruleDefinition | [RuleDefinition](#RuleDefinition) |  no  |  |

---


 
 
 #### [CouponPartialUpdate](#CouponPartialUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | archive | Boolean? |  yes  | Send true to unpublish coupon |
 | schedule | [CouponSchedule](#CouponSchedule)? |  yes  |  |

---


 
 
 #### [DisplayMeta1](#DisplayMeta1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | description | String? |  yes  |  |
 | offerLabel | String? |  yes  |  |
 | name | String? |  yes  |  |
 | offerText | String? |  yes  |  |

---


 
 
 #### [Ownership1](#Ownership1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payableCategory | String |  no  |  |
 | payableBy | String |  no  |  |

---


 
 
 #### [CompareObject](#CompareObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | equals | Double? |  yes  |  |
 | greaterThan | Double? |  yes  |  |
 | lessThanEquals | Double? |  yes  |  |
 | lessThan | Double? |  yes  |  |
 | greaterThanEquals | Double? |  yes  |  |

---


 
 
 #### [ItemCriteria](#ItemCriteria)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartQuantity | [CompareObject](#CompareObject)? |  yes  |  |
 | availableZones | ArrayList<String>? |  yes  |  |
 | itemExcludeCompany | ArrayList<Integer>? |  yes  |  |
 | itemId | ArrayList<Integer>? |  yes  |  |
 | itemL1Category | ArrayList<Integer>? |  yes  |  |
 | cartTotal | [CompareObject](#CompareObject)? |  yes  |  |
 | cartUniqueItemQuantity | [CompareObject](#CompareObject)? |  yes  |  |
 | cartUniqueItemAmount | [CompareObject](#CompareObject)? |  yes  |  |
 | itemExcludeId | ArrayList<Integer>? |  yes  |  |
 | allItems | Boolean? |  yes  |  |
 | itemExcludeL1Category | ArrayList<Integer>? |  yes  |  |
 | itemSize | ArrayList<String>? |  yes  |  |
 | itemStore | ArrayList<Integer>? |  yes  |  |
 | itemExcludeSku | ArrayList<String>? |  yes  |  |
 | itemDepartment | ArrayList<Integer>? |  yes  |  |
 | itemExcludeStore | ArrayList<Integer>? |  yes  |  |
 | itemBrand | ArrayList<Integer>? |  yes  |  |
 | itemExcludeDepartment | ArrayList<Integer>? |  yes  |  |
 | itemExcludeCategory | ArrayList<Integer>? |  yes  |  |
 | itemCategory | ArrayList<Integer>? |  yes  |  |
 | buyRules | ArrayList<String>? |  yes  |  |
 | itemExcludeBrand | ArrayList<Integer>? |  yes  |  |
 | itemL2Category | ArrayList<Integer>? |  yes  |  |
 | itemCompany | ArrayList<Integer>? |  yes  |  |
 | itemTags | ArrayList<String>? |  yes  |  |
 | itemExcludeL2Category | ArrayList<Integer>? |  yes  |  |
 | itemSku | ArrayList<String>? |  yes  |  |

---


 
 
 #### [DiscountOffer](#DiscountOffer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maxDiscountAmount | Double? |  yes  |  |
 | discountPrice | Double? |  yes  |  |
 | apportionDiscount | Boolean? |  yes  |  |
 | partialCanRet | Boolean? |  yes  |  |
 | maxUsagePerTransaction | Integer? |  yes  |  |
 | minOfferQuantity | Integer? |  yes  |  |
 | code | String? |  yes  |  |
 | discountAmount | Double? |  yes  |  |
 | discountPercentage | Double? |  yes  |  |
 | maxOfferQuantity | Integer? |  yes  |  |

---


 
 
 #### [DiscountRule](#DiscountRule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | discountType | String |  no  |  |
 | buyCondition | String |  no  |  |
 | itemCriteria | [ItemCriteria](#ItemCriteria) |  no  |  |
 | offer | [DiscountOffer](#DiscountOffer) |  no  |  |

---


 
 
 #### [PaymentAllowValue1](#PaymentAllowValue1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Integer? |  yes  |  |

---


 
 
 #### [PromotionPaymentModes](#PromotionPaymentModes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | uses | [PaymentAllowValue1](#PaymentAllowValue1)? |  yes  |  |
 | codes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [UserRegistered](#UserRegistered)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | String? |  yes  |  |
 | start | String? |  yes  |  |

---


 
 
 #### [PostOrder1](#PostOrder1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cancellationAllowed | Boolean? |  yes  |  |
 | returnAllowed | Boolean? |  yes  |  |

---


 
 
 #### [UsesRemaining1](#UsesRemaining1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |

---


 
 
 #### [UsesRestriction1](#UsesRestriction1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | maximum | [UsesRemaining1](#UsesRemaining1)? |  yes  |  |
 | remaining | [UsesRemaining1](#UsesRemaining1)? |  yes  |  |

---


 
 
 #### [Restrictions1](#Restrictions1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payments | HashMap<String,Object>? |  yes  |  |
 | userRegistered | [UserRegistered](#UserRegistered)? |  yes  |  |
 | platforms | ArrayList<String>? |  yes  |  |
 | postOrder | [PostOrder1](#PostOrder1)? |  yes  |  |
 | userGroups | ArrayList<Integer>? |  yes  |  |
 | orderQuantity | Integer? |  yes  |  |
 | anonymousUsers | Boolean? |  yes  |  |
 | userId | ArrayList<String>? |  yes  |  |
 | uses | [UsesRestriction1](#UsesRestriction1) |  no  |  |
 | orderingStores | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [PromotionSchedule](#PromotionSchedule)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | end | String |  no  |  |
 | start | String |  no  |  |
 | published | Boolean |  no  |  |
 | nextSchedule | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | cron | String? |  yes  |  |
 | duration | Integer? |  yes  |  |

---


 
 
 #### [PromotionAction](#PromotionAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | actionDate | String |  no  |  |
 | actionType | String |  no  |  |

---


 
 
 #### [PromotionAuthor](#PromotionAuthor)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdBy | String? |  yes  |  |
 | modifiedBy | String? |  yes  |  |

---


 
 
 #### [Visibility](#Visibility)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponList | Boolean |  no  |  |
 | pdp | Boolean |  no  |  |

---


 
 
 #### [PromotionDateMeta](#PromotionDateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [PromotionListItem](#PromotionListItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackable | Boolean? |  yes  | Allows more than one promotion to get combined benefits |
 | calculateOn | String? |  yes  | Only available for Contract pricing and Ladder pricing promotion type |
 | applyExclusive | String? |  yes  | Doesn't allow other promotion after current promotion applied on cart or article |
 | promoGroup | String |  no  | Group into which promotion fall |
 | mode | String |  no  | Promotion mode |
 | applyAllDiscount | Boolean? |  yes  | Prevents more than one promotion discounts |
 | displayMeta | [DisplayMeta1](#DisplayMeta1) |  no  |  |
 | ownership | [Ownership1](#Ownership1) |  no  |  |
 | promotionType | String |  no  | Type of the promotion |
 | discountRules | ArrayList<[DiscountRule](#DiscountRule)> |  no  | Discount rules based on which promotion will be applied |
 | restrictions | [Restrictions1](#Restrictions1)? |  yes  |  |
 | currency | String? |  yes  | Currency used for promotion |
 | code | String? |  yes  | Promotion code |
 | schedule | [PromotionSchedule](#PromotionSchedule)? |  yes  |  |
 | postOrderAction | [PromotionAction](#PromotionAction)? |  yes  |  |
 | applyPriority | Integer? |  yes  | Priority based on which promotion are applied on articles |
 | author | [PromotionAuthor](#PromotionAuthor)? |  yes  |  |
 | visiblility | [Visibility](#Visibility)? |  yes  |  |
 | applicationId | String |  no  | App id in which promotion will be used |
 | buyRules | HashMap<String,[ItemCriteria](#ItemCriteria)> |  no  | Buy rules for the promotion |
 | customJson | HashMap<String,Object>? |  yes  | custom data stored in promotion |
 | dateMeta | [PromotionDateMeta](#PromotionDateMeta)? |  yes  |  |
 | id | String? |  yes  | Promotion id |

---


 
 
 #### [PromotionsResponse](#PromotionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[PromotionListItem](#PromotionListItem)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [PromotionAdd](#PromotionAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackable | Boolean? |  yes  |  |
 | calculateOn | String? |  yes  | Only available for Contract pricing and Ladder pricing promotion type |
 | applyExclusive | String? |  yes  |  |
 | promoGroup | String |  no  |  |
 | mode | String |  no  |  |
 | applyAllDiscount | Boolean? |  yes  |  |
 | displayMeta | [DisplayMeta1](#DisplayMeta1) |  no  |  |
 | ownership | [Ownership1](#Ownership1) |  no  |  |
 | promotionType | String |  no  |  |
 | discountRules | ArrayList<[DiscountRule](#DiscountRule)> |  no  |  |
 | restrictions | [Restrictions1](#Restrictions1)? |  yes  |  |
 | currency | String? |  yes  |  |
 | code | String? |  yes  |  |
 | schedule | [PromotionSchedule](#PromotionSchedule)? |  yes  |  |
 | postOrderAction | [PromotionAction](#PromotionAction)? |  yes  |  |
 | applyPriority | Integer? |  yes  |  |
 | author | [PromotionAuthor](#PromotionAuthor)? |  yes  |  |
 | visiblility | [Visibility](#Visibility)? |  yes  |  |
 | applicationId | String |  no  |  |
 | buyRules | HashMap<String,[ItemCriteria](#ItemCriteria)> |  no  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | dateMeta | [PromotionDateMeta](#PromotionDateMeta)? |  yes  |  |

---


 
 
 #### [PromotionUpdate](#PromotionUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackable | Boolean? |  yes  |  |
 | calculateOn | String? |  yes  | Only available for Contract pricing and Ladder pricing promotion type |
 | applyExclusive | String? |  yes  |  |
 | promoGroup | String |  no  |  |
 | mode | String |  no  |  |
 | applyAllDiscount | Boolean? |  yes  |  |
 | displayMeta | [DisplayMeta1](#DisplayMeta1) |  no  |  |
 | ownership | [Ownership1](#Ownership1) |  no  |  |
 | promotionType | String |  no  |  |
 | discountRules | ArrayList<[DiscountRule](#DiscountRule)> |  no  |  |
 | restrictions | [Restrictions1](#Restrictions1)? |  yes  |  |
 | currency | String? |  yes  |  |
 | code | String? |  yes  |  |
 | schedule | [PromotionSchedule](#PromotionSchedule)? |  yes  |  |
 | postOrderAction | [PromotionAction](#PromotionAction)? |  yes  |  |
 | applyPriority | Integer? |  yes  |  |
 | author | [PromotionAuthor](#PromotionAuthor)? |  yes  |  |
 | visiblility | [Visibility](#Visibility)? |  yes  |  |
 | applicationId | String |  no  |  |
 | buyRules | HashMap<String,[ItemCriteria](#ItemCriteria)> |  no  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | dateMeta | [PromotionDateMeta](#PromotionDateMeta)? |  yes  |  |

---


 
 
 #### [PromotionPartialUpdate](#PromotionPartialUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | archive | Boolean? |  yes  | Send true to unpublish promotion |
 | schedule | [PromotionSchedule](#PromotionSchedule)? |  yes  |  |

---


 
 
 #### [ActivePromosResponse](#ActivePromosResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entitySlug | String? |  yes  |  |
 | title | String? |  yes  | Name of the promotion |
 | modifiedOn | String? |  yes  | Coupon modification date |
 | example | String? |  yes  | Discount offers examples |
 | entityType | String? |  yes  | Type of entity to be selected from : ['coupon', 'promotion'] |
 | createdOn | String? |  yes  | Coupon creation date |
 | isHidden | Boolean? |  yes  | If the promo is active or not |
 | type | String? |  yes  | Coupon type |
 | subtitle | String? |  yes  | Small description of the current offer |
 | description | String? |  yes  | The description of the offer in the form of an HTML |

---


 
 
 #### [Charges](#Charges)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | charges | Integer? |  yes  |  |
 | threshold | Integer? |  yes  |  |

---


 
 
 #### [DeliveryCharges](#DeliveryCharges)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | charges | ArrayList<[Charges](#Charges)>? |  yes  |  |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [CartMetaConfigUpdate](#CartMetaConfigUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minCartValue | Integer? |  yes  |  |
 | bulkCoupons | Boolean? |  yes  |  |
 | maxCartItems | Integer? |  yes  |  |
 | giftDisplayText | String? |  yes  |  |
 | deliveryCharges | [DeliveryCharges](#DeliveryCharges)? |  yes  |  |
 | revenueEngineCoupon | Boolean? |  yes  |  |
 | giftPricing | Double? |  yes  |  |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [CartMetaConfigAdd](#CartMetaConfigAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | minCartValue | Integer? |  yes  |  |
 | bulkCoupons | Boolean? |  yes  |  |
 | maxCartItems | Integer? |  yes  |  |
 | giftDisplayText | String? |  yes  |  |
 | deliveryCharges | [DeliveryCharges](#DeliveryCharges)? |  yes  |  |
 | revenueEngineCoupon | Boolean? |  yes  |  |
 | giftPricing | Double? |  yes  |  |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [Article](#Article)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Double? |  yes  | value of price adjustment for article |
 | code | String? |  yes  | code to identify price adjustment on article |
 | type | String? |  yes  | type of price adjusment |
 | articleId | String |  no  | id of article |
 | quantity | Integer? |  yes  | total quantity of the article to be considered (currently used only in discount type) |
 | meta | HashMap<String,Object>? |  yes  | meta related to article |

---


 
 
 #### [PriceAdjustmentRestrictions](#PriceAdjustmentRestrictions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | postOrder | HashMap<String,Object>? |  yes  | This field holds the post-order restrictions, indicated by nested fields ['cancellation_allowed','return_allowed'] |

---


 
 
 #### [Collection](#Collection)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundBy | String |  no  |  |
 | collectedBy | String |  no  |  |

---


 
 
 #### [PriceAdjustmentUpdate](#PriceAdjustmentUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedBy | String? |  yes  | The entity that modified the field |
 | value | Double |  no  |  |
 | message | String |  no  | The message associated with the price adjustment |
 | applyExpiry | String? |  yes  | The date and time when the expiry should be applied |
 | restrictions | [PriceAdjustmentRestrictions](#PriceAdjustmentRestrictions)? |  yes  | restrictions applied to this particular item or product, including whether or not cancellation and return are allowed. |
 | articleLevelDistribution | Boolean |  no  | Flag indicating whether the distribution should is done at the article level |
 | collection | [Collection](#Collection) |  no  |  |
 | type | String |  no  | type of price adjusment |
 | allowedRefund | Boolean? |  yes  | Flag indicating whether refunds are allowed (default: False) |
 | isAuthenticated | Boolean |  no  | Flag indicating whether the user is authenticated |
 | articleIds | ArrayList<[Article](#Article)> |  no  | The list of article object in the price adjustment |
 | meta | HashMap<String,Object>? |  yes  |  |
 | cartId | String |  no  | The ID of the cart |

---


 
 
 #### [PriceAdjustment](#PriceAdjustment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Double |  no  |  |
 | message | String |  no  | The message associated with the price adjustment |
 | applyExpiry | String? |  yes  | The date and time when the expiry should be applied |
 | restrictions | [PriceAdjustmentRestrictions](#PriceAdjustmentRestrictions)? |  yes  | This field accepts the restrictions applied to this particular item or service, including whether or not cancellation and return are allowed, etc |
 | articleLevelDistribution | Boolean |  no  | Flag indicating whether the distribution should is done at the article level |
 | id | String? |  yes  |  |
 | collection | [Collection](#Collection) |  no  |  |
 | type | String |  no  | type of price adjusment |
 | allowedRefund | Boolean? |  yes  | Flag indicating whether refunds are allowed (default: False) |
 | isAuthenticated | Boolean |  no  | Flag indicating whether the user is authenticated |
 | articleIds | ArrayList<[Article](#Article)> |  no  | The list of article object in the price adjustment |
 | meta | HashMap<String,Object>? |  yes  |  |
 | cartId | String |  no  | The ID of the cart |

---


 
 
 #### [PriceAdjustmentResponse](#PriceAdjustmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | [PriceAdjustment](#PriceAdjustment)? |  yes  |  |

---


 
 
 #### [PriceAdjustmentAdd](#PriceAdjustmentAdd)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Double |  no  |  |
 | message | String |  no  | The message associated with the price adjustment |
 | applyExpiry | String? |  yes  | The date and time when the expiry should be applied |
 | restrictions | [PriceAdjustmentRestrictions](#PriceAdjustmentRestrictions)? |  yes  | This field accepts the restrictions applied to this particular item or service, including whether or not cancellation and return are allowed, etc |
 | createdBy | String? |  yes  | The entity that created the field |
 | articleLevelDistribution | Boolean |  no  | Flag indicating whether the distribution should is done at the article level |
 | collection | [Collection](#Collection) |  no  |  |
 | type | String |  no  | type of price adjusment |
 | allowedRefund | Boolean? |  yes  | Flag indicating whether refunds are allowed (default: False) |
 | isAuthenticated | Boolean |  no  | Flag indicating whether the user is authenticated |
 | articleIds | ArrayList<[Article](#Article)> |  no  | The list of article object in the price adjustment |
 | meta | HashMap<String,Object>? |  yes  |  |
 | cartId | String |  no  | The ID of the cart |

---


 
 
 #### [CartItem](#CartItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer? |  yes  |  |
 | productId | String |  no  |  |
 | size | String |  no  |  |

---


 
 
 #### [OpenapiCartDetailsRequest](#OpenapiCartDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartItems | ArrayList<[CartItem](#CartItem)> |  no  |  |

---


 
 
 #### [CouponBreakup](#CouponBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | maxDiscountValue | Double? |  yes  |  |
 | value | Double? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |
 | uid | String? |  yes  |  |
 | couponType | String? |  yes  |  |
 | subTitle | String? |  yes  |  |
 | couponValue | Double? |  yes  |  |
 | code | String? |  yes  |  |
 | type | String? |  yes  |  |
 | minimumCartValue | Double? |  yes  |  |
 | message | String? |  yes  |  |
 | description | String? |  yes  |  |

---


 
 
 #### [DisplayBreakup](#DisplayBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String? |  yes  |  |
 | value | Double? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | display | String? |  yes  |  |
 | message | ArrayList<String>? |  yes  |  |

---


 
 
 #### [LoyaltyPoints](#LoyaltyPoints)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isApplied | Boolean? |  yes  |  |
 | total | Double? |  yes  |  |
 | applicable | Double? |  yes  |  |
 | description | String? |  yes  |  |

---


 
 
 #### [RawBreakup](#RawBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | coupon | Double? |  yes  |  |
 | gstCharges | Double? |  yes  |  |
 | mrpTotal | Double? |  yes  |  |
 | fyndCash | Double? |  yes  |  |
 | vog | Double? |  yes  |  |
 | giftCard | Double? |  yes  |  |
 | codCharge | Double? |  yes  |  |
 | total | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | deliveryCharge | Double? |  yes  |  |
 | youSaved | Double? |  yes  |  |
 | subtotal | Double? |  yes  |  |
 | convenienceFee | Double? |  yes  |  |

---


 
 
 #### [CartBreakup](#CartBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | coupon | [CouponBreakup](#CouponBreakup)? |  yes  |  |
 | display | ArrayList<[DisplayBreakup](#DisplayBreakup)>? |  yes  |  |
 | loyaltyPoints | [LoyaltyPoints](#LoyaltyPoints)? |  yes  |  |
 | raw | [RawBreakup](#RawBreakup)? |  yes  |  |

---


 
 
 #### [ProductImage](#ProductImage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secureUrl | String? |  yes  |  |
 | url | String? |  yes  |  |
 | aspectRatio | String? |  yes  |  |

---


 
 
 #### [Tags](#Tags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [BaseInfo](#BaseInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [ActionQuery](#ActionQuery)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | productSlug | ArrayList<String>? |  yes  | Contains list of product slug |

---


 
 
 #### [ProductAction](#ProductAction)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | url | String? |  yes  |  |
 | query | [ActionQuery](#ActionQuery)? |  yes  |  |

---


 
 
 #### [CategoryInfo](#CategoryInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  | Product Category Id |
 | name | String? |  yes  |  |

---


 
 
 #### [CartProduct](#CartProduct)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String? |  yes  | Unique product url name generated via product name and other meta data |
 | images | ArrayList<[ProductImage](#ProductImage)>? |  yes  |  |
 | teaserTag | [Tags](#Tags)? |  yes  |  |
 | brand | [BaseInfo](#BaseInfo)? |  yes  |  |
 | action | [ProductAction](#ProductAction)? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | type | String? |  yes  |  |
 | name | String? |  yes  |  |
 | itemCode | String? |  yes  |  |
 | categories | ArrayList<[CategoryInfo](#CategoryInfo)>? |  yes  |  |
 | attributes | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [BasePrice](#BasePrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | effective | Double? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | marked | Double? |  yes  |  |

---


 
 
 #### [ArticlePriceInfo](#ArticlePriceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | converted | [BasePrice](#BasePrice)? |  yes  |  |
 | base | [BasePrice](#BasePrice)? |  yes  |  |

---


 
 
 #### [StoreInfo](#StoreInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | storeCode | String? |  yes  |  |

---


 
 
 #### [ProductArticle](#ProductArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sellerIdentifier | String? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | seller | [BaseInfo](#BaseInfo)? |  yes  |  |
 | cartItemMeta | HashMap<String,Object>? |  yes  |  |
 | parentItemIdentifiers | HashMap<String,Object>? |  yes  |  |
 | isGiftVisible | Boolean? |  yes  |  |
 | uid | String? |  yes  |  |
 | giftCard | HashMap<String,Object>? |  yes  |  |
 | productGroupTags | ArrayList<String>? |  yes  |  |
 | identifier | HashMap<String,Object>? |  yes  |  |
 | mtoQuantity | Integer? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | type | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | price | [ArticlePriceInfo](#ArticlePriceInfo)? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | size | String? |  yes  |  |
 | store | [StoreInfo](#StoreInfo)? |  yes  |  |
 | tags | ArrayList<String>? |  yes  | a list of article tags |

---


 
 
 #### [Ownership2](#Ownership2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | payableCategory | String? |  yes  | promo amount payable category |
 | payableBy | String? |  yes  | promo amount bearable party |

---


 
 
 #### [DiscountRulesApp](#DiscountRulesApp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | offer | HashMap<String,Object>? |  yes  | offer for promotion |
 | rawOffer | HashMap<String,Object>? |  yes  | raw offer details for promotion |
 | itemCriteria | HashMap<String,Object>? |  yes  | Item criteria of promotion |
 | matchedBuyRules | ArrayList<String>? |  yes  | Matched buy rules for promotion |

---


 
 
 #### [FreeGiftItem](#FreeGiftItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemName | String? |  yes  | Item name |
 | itemPriceDetails | HashMap<String,Object>? |  yes  | item price details |
 | itemBrandName | String? |  yes  | item brand name |
 | itemImagesUrl | ArrayList<String>? |  yes  | item images URL |
 | itemId | Integer? |  yes  | Item id |
 | itemSlug | String? |  yes  | item slug |

---


 
 
 #### [AppliedFreeArticles](#AppliedFreeArticles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | parentItemIdentifier | String? |  yes  | Parent item identifier for free article |
 | quantity | Integer? |  yes  | Free article quantity |
 | articleId | String? |  yes  | free article id |
 | freeGiftItemDetails | [FreeGiftItem](#FreeGiftItem)? |  yes  | Free gift items details |

---


 
 
 #### [BuyRules](#BuyRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartConditions | HashMap<String,Object>? |  yes  | Cart conditions details for promotion |
 | itemCriteria | HashMap<String,Object>? |  yes  | Item criteria of promotion |

---


 
 
 #### [AppliedPromotion](#AppliedPromotion)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articleQuantity | Integer? |  yes  | Quantity of article on which promotion is applicable |
 | ownership | [Ownership2](#Ownership2)? |  yes  | Ownership of promotion |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | discountRules | ArrayList<[DiscountRulesApp](#DiscountRulesApp)>? |  yes  | Discount rules for promotions |
 | appliedFreeArticles | ArrayList<[AppliedFreeArticles](#AppliedFreeArticles)>? |  yes  | Applied free article for free gift item promotions |
 | promotionName | String? |  yes  | Promotion name of current promotion |
 | buyRules | ArrayList<[BuyRules](#BuyRules)>? |  yes  | Buy rules for promotions |
 | offerText | String? |  yes  | Offer text of current promotion |
 | amount | Double? |  yes  | Per unit discount amount applied with current promotion |
 | promotionType | String? |  yes  | Promotion type of current promotion |
 | mrpPromotion | Boolean? |  yes  | If applied promotion is applied on product MRP or ESP |
 | promotionGroup | String? |  yes  | Promotion group for the promotion |
 | promoId | String? |  yes  | Promotion id |
 | meta | HashMap<String,Object>? |  yes  | Meta object for extra data |
 | code | String? |  yes  | Promotion code |

---


 
 
 #### [PromiseFormatted](#PromiseFormatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | String? |  yes  |  |
 | min | String? |  yes  |  |

---


 
 
 #### [PromiseISOFormat](#PromiseISOFormat)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | String? |  yes  | Max promise in ISO format. |
 | min | String? |  yes  | Min Promise in ISO format. |

---


 
 
 #### [PromiseTimestamp](#PromiseTimestamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | max | Double? |  yes  |  |
 | min | Double? |  yes  |  |

---


 
 
 #### [ShipmentPromise](#ShipmentPromise)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | formatted | [PromiseFormatted](#PromiseFormatted)? |  yes  |  |
 | timestamp | [PromiseTimestamp](#PromiseTimestamp)? |  yes  |  |
 | iso | [PromiseISOFormat](#PromiseISOFormat)? |  yes  |  |

---


 
 
 #### [CouponDetails](#CouponDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | discountTotalQuantity | Double? |  yes  |  |
 | discountSingleQuantity | Double? |  yes  |  |
 | code | String? |  yes  |  |

---


 
 
 #### [ProductPrice](#ProductPrice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marked | Double? |  yes  |  |
 | addOn | Double? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | effective | Double? |  yes  |  |
 | selling | Double? |  yes  |  |

---


 
 
 #### [ProductPriceInfo](#ProductPriceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | converted | [ProductPrice](#ProductPrice)? |  yes  |  |
 | base | [ProductPrice](#ProductPrice)? |  yes  |  |

---


 
 
 #### [CartProductIdentifer](#CartProductIdentifer)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  | Article idenfier generated by cart |

---


 
 
 #### [ProductAvailabilitySize](#ProductAvailabilitySize)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | display | String? |  yes  |  |
 | value | String? |  yes  |  |
 | isAvailable | Boolean? |  yes  |  |

---


 
 
 #### [ProductAvailability](#ProductAvailability)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | otherStoreQuantity | Integer? |  yes  |  |
 | deliverable | Boolean? |  yes  |  |
 | availableSizes | ArrayList<[ProductAvailabilitySize](#ProductAvailabilitySize)>? |  yes  |  |
 | outOfStock | Boolean? |  yes  |  |
 | sizes | ArrayList<String>? |  yes  |  |

---


 
 
 #### [PromoMeta](#PromoMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [CartProductInfo](#CartProductInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer? |  yes  |  |
 | product | [CartProduct](#CartProduct)? |  yes  |  |
 | productEanId | String? |  yes  |  |
 | parentItemIdentifiers | HashMap<String,Object>? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | article | [ProductArticle](#ProductArticle)? |  yes  |  |
 | promotionsApplied | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | key | String? |  yes  |  |
 | coupon | [CouponDetails](#CouponDetails)? |  yes  |  |
 | bulkOffer | HashMap<String,Object>? |  yes  |  |
 | price | [ProductPriceInfo](#ProductPriceInfo)? |  yes  |  |
 | couponMessage | String? |  yes  |  |
 | identifiers | [CartProductIdentifer](#CartProductIdentifer) |  no  |  |
 | message | String? |  yes  |  |
 | discount | String? |  yes  |  |
 | availability | [ProductAvailability](#ProductAvailability)? |  yes  |  |
 | moq | HashMap<String,Object>? |  yes  |  |
 | pricePerUnit | [ProductPriceInfo](#ProductPriceInfo)? |  yes  |  |
 | promoMeta | [PromoMeta](#PromoMeta)? |  yes  |  |
 | customOrder | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OpenapiCartDetailsResponse](#OpenapiCartDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |

---


 
 
 #### [OpenApiErrorResponse](#OpenApiErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | errors | HashMap<String,Object>? |  yes  | Contains field name which has error as key and error message as value |

---


 
 
 #### [ShippingAddress](#ShippingAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | state | String? |  yes  |  |
 | city | String? |  yes  |  |
 | phone | Integer? |  yes  |  |
 | areaCode | String |  no  |  |
 | countryIsoCode | String? |  yes  |  |
 | countryPhoneCode | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | addressType | String? |  yes  |  |
 | area | String? |  yes  |  |
 | areaCodeSlug | String? |  yes  |  |
 | name | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | email | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | address | String? |  yes  |  |

---


 
 
 #### [OpenApiCartServiceabilityRequest](#OpenApiCartServiceabilityRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartItems | ArrayList<[CartItem](#CartItem)> |  no  |  |
 | shippingAddress | [ShippingAddress](#ShippingAddress) |  no  |  |

---


 
 
 #### [OpenApiCartServiceabilityResponse](#OpenApiCartServiceabilityResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |

---


 
 
 #### [OpenApiFiles](#OpenApiFiles)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | values | ArrayList<String> |  no  |  |

---


 
 
 #### [CartItemMeta](#CartItemMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryItem | Boolean? |  yes  |  |
 | groupId | String? |  yes  |  |

---


 
 
 #### [MultiTenderPaymentMeta](#MultiTenderPaymentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentId | String? |  yes  |  |
 | paymentGateway | String? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | currentStatus | String? |  yes  |  |
 | orderId | String? |  yes  |  |

---


 
 
 #### [MultiTenderPaymentMethod](#MultiTenderPaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mode | String |  no  |  |
 | amount | Double |  no  | Payment amount |
 | meta | [MultiTenderPaymentMeta](#MultiTenderPaymentMeta)? |  yes  |  |
 | name | String? |  yes  | Payment mode name |

---


 
 
 #### [OpenApiOrderItem](#OpenApiOrderItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashbackApplied | Double |  no  |  |
 | quantity | Integer? |  yes  |  |
 | size | String |  no  |  |
 | couponEffectiveDiscount | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | deliveryCharges | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | files | ArrayList<[OpenApiFiles](#OpenApiFiles)>? |  yes  |  |
 | meta | [CartItemMeta](#CartItemMeta)? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | productId | Integer |  no  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | discount | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | paymentMethods | ArrayList<[MultiTenderPaymentMethod](#MultiTenderPaymentMethod)> |  no  |  |
 | employeeDiscount | Double? |  yes  |  |
 | codCharges | Double |  no  |  |

---


 
 
 #### [OpenApiPlatformCheckoutReq](#OpenApiPlatformCheckoutReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentMode | String? |  yes  |  |
 | cartValue | Double |  no  |  |
 | cartItems | ArrayList<[OpenApiOrderItem](#OpenApiOrderItem)> |  no  |  |
 | shippingAddress | [ShippingAddress](#ShippingAddress)? |  yes  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | comment | String? |  yes  |  |
 | paymentMethods | ArrayList<[MultiTenderPaymentMethod](#MultiTenderPaymentMethod)> |  no  |  |
 | employeeDiscount | HashMap<String,Object>? |  yes  |  |
 | coupon | String? |  yes  |  |
 | cashbackApplied | Double |  no  |  |
 | gstin | String? |  yes  |  |
 | billingAddress | [ShippingAddress](#ShippingAddress) |  no  |  |
 | couponCode | String |  no  |  |
 | couponValue | Double |  no  |  |
 | deliveryCharges | Double |  no  |  |
 | affiliateOrderId | String? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | orderId | String? |  yes  |  |
 | files | ArrayList<[OpenApiFiles](#OpenApiFiles)>? |  yes  |  |
 | codCharges | Double |  no  |  |

---


 
 
 #### [OpenApiCheckoutResponse](#OpenApiCheckoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | orderRefId | String? |  yes  | Order id sent in request |
 | orderId | String |  no  | Fynd order id |

---


 
 
 #### [AbandonedCart](#AbandonedCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expireAt | String |  no  |  |
 | promotion | HashMap<String,Object>? |  yes  |  |
 | isDefault | Boolean |  no  |  |
 | comment | String? |  yes  |  |
 | articles | ArrayList<HashMap<String,Object>> |  no  |  |
 | coupon | HashMap<String,Object>? |  yes  |  |
 | bulkCouponDiscount | Double? |  yes  |  |
 | id | String |  no  |  |
 | fyndCredits | HashMap<String,Object>? |  yes  |  |
 | fcIndexMap | ArrayList<Integer>? |  yes  |  |
 | orderId | String? |  yes  |  |
 | discount | Double? |  yes  |  |
 | codCharges | HashMap<String,Object>? |  yes  |  |
 | payments | HashMap<String,Object>? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | shipments | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | pickUpCustomerDetails | HashMap<String,Object>? |  yes  |  |
 | uid | Integer |  no  |  |
 | checkoutMode | String? |  yes  |  |
 | cartValue | Double? |  yes  |  |
 | isArchive | Boolean? |  yes  |  |
 | createdOn | String |  no  |  |
 | lastModified | String |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | cashback | HashMap<String,Object> |  no  |  |
 | paymentMethods | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | gstin | String? |  yes  |  |
 | deliveryCharges | HashMap<String,Object>? |  yes  |  |
 | mergeQty | Boolean? |  yes  |  |
 | userId | String |  no  |  |
 | appId | String? |  yes  |  |

---


 
 
 #### [AbandonedCartResponse](#AbandonedCartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[AbandonedCart](#AbandonedCart)>? |  yes  |  |
 | result | HashMap<String,Object>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |
 | success | Boolean? |  yes  | the request success is defined |
 | message | String? |  yes  | message of the response |

---


 
 
 #### [PaymentSelectionLock](#PaymentSelectionLock)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentIdentifier | String? |  yes  |  |
 | defaultOptions | String? |  yes  |  |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [CartCurrency](#CartCurrency)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String? |  yes  | Currency code defined by ISO 4217:2015 |
 | symbol | String? |  yes  |  |

---


 
 
 #### [CartDetailCoupon](#CartDetailCoupon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashbackAmount | Double? |  yes  |  |
 | cashbackMessagePrimary | String? |  yes  |  |
 | cashbackMessageSecondary | String? |  yes  |  |
 | couponCode | String? |  yes  |  |
 | couponDescription | String? |  yes  |  |
 | couponId | String? |  yes  |  |
 | couponSubtitle | String? |  yes  |  |
 | couponTitle | String? |  yes  |  |
 | couponType | String? |  yes  |  |
 | couponValue | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | maximumDiscountValue | Double? |  yes  |  |
 | message | String? |  yes  |  |
 | minimumCartValue | Double? |  yes  |  |

---


 
 
 #### [ChargesThreshold](#ChargesThreshold)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | charges | Double? |  yes  |  |
 | threshold | Double? |  yes  |  |

---


 
 
 #### [DeliveryChargesConfig](#DeliveryChargesConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |
 | charges | ArrayList<[ChargesThreshold](#ChargesThreshold)>? |  yes  |  |

---


 
 
 #### [CartCommonConfig](#CartCommonConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryChargesConfig | [DeliveryChargesConfig](#DeliveryChargesConfig)? |  yes  |  |

---


 
 
 #### [CartDetailResponse](#CartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartId | Integer? |  yes  |  |
 | uid | String? |  yes  |  |
 | couponText | String? |  yes  |  |
 | id | String? |  yes  |  |
 | panConfig | HashMap<String,Object>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | comment | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | commonConfig | [CartCommonConfig](#CartCommonConfig)? |  yes  |  |
 | coupon | [CartDetailCoupon](#CartDetailCoupon)? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | notification | HashMap<String,Object>? |  yes  |  |
 | staffUserId | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | gstin | String? |  yes  |  |
 | appliedPromoDetails | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | panNo | String? |  yes  |  |

---


 
 
 #### [AddProductCart](#AddProductCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer? |  yes  |  |
 | itemSize | String? |  yes  |  |
 | sellerId | Integer? |  yes  |  |
 | parentItemIdentifiers | ArrayList<HashMap<String,String>>? |  yes  |  |
 | productGroupTags | ArrayList<String>? |  yes  |  |
 | articleId | String? |  yes  |  |
 | articleAssignment | HashMap<String,Object>? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | display | String? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | pos | Boolean? |  yes  |  |
 | sellerIdentifier | String? |  yes  | Add items using seller identifier for store os |

---


 
 
 #### [AddCartRequest](#AddCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | newCart | Boolean? |  yes  |  |
 | items | ArrayList<[AddProductCart](#AddProductCart)>? |  yes  |  |

---


 
 
 #### [AddCartDetailResponse](#AddCartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | True if all items are added successfully. False if partially added or not added. |
 | cart | [CartDetailResponse](#CartDetailResponse)? |  yes  |  |
 | partial | Boolean? |  yes  | When adding multiple items check if all added. True if only few are added. |
 | message | String? |  yes  |  |

---


 
 
 #### [UpdateProductCart](#UpdateProductCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer? |  yes  |  |
 | itemSize | String? |  yes  |  |
 | parentItemIdentifiers | HashMap<String,Object>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | itemId | Integer? |  yes  |  |
 | itemIndex | Integer? |  yes  |  |
 | identifiers | [CartProductIdentifer](#CartProductIdentifer) |  no  |  |
 | articleId | String? |  yes  |  |

---


 
 
 #### [UpdateCartRequest](#UpdateCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[UpdateProductCart](#UpdateProductCart)>? |  yes  |  |
 | operation | String |  no  |  |

---


 
 
 #### [UpdateCartDetailResponse](#UpdateCartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | True if all items are added successfully. False if partially added or not added. |
 | cart | [CartDetailResponse](#CartDetailResponse)? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [OverrideCartItemPromo](#OverrideCartItemPromo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promoId | String |  no  |  |
 | promoAmount | String |  no  |  |
 | promoDesc | String? |  yes  |  |
 | rwrdTndr | String? |  yes  |  |
 | itemList | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | parentPromoId | String? |  yes  |  |

---


 
 
 #### [OverrideCartItem](#OverrideCartItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | sellerIdentifier | String? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | size | String |  no  |  |
 | priceMarked | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | promoList | ArrayList<[OverrideCartItemPromo](#OverrideCartItemPromo)>? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | itemId | Integer |  no  |  |
 | discount | Double |  no  |  |
 | priceEffective | Double |  no  |  |

---


 
 
 #### [OverrideCheckoutReq](#OverrideCheckoutReq)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | billingAddress | HashMap<String,Object>? |  yes  |  |
 | merchantCode | String |  no  |  |
 | paymentIdentifier | String |  no  |  |
 | currencyCode | String |  no  |  |
 | aggregator | String |  no  |  |
 | orderType | String |  no  |  |
 | cartItems | ArrayList<[OverrideCartItem](#OverrideCartItem)> |  no  |  |
 | orderingStore | Integer? |  yes  |  |
 | shippingAddress | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [OverrideCheckoutResponse](#OverrideCheckoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | HashMap<String,Object> |  no  |  |
 | cart | HashMap<String,Object> |  no  |  |
 | success | String |  no  |  |
 | orderId | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [GetShareCartLinkRequest](#GetShareCartLinkRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | Cart uid for generating sharing |
 | meta | HashMap<String,Object>? |  yes  | Staff, Ordering store or any other data. This data will be used to generate link as well as sent as shared details. |

---


 
 
 #### [GetShareCartLinkResponse](#GetShareCartLinkResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String? |  yes  | Short url unique id |
 | shareUrl | String? |  yes  | Short shareable final url |

---


 
 
 #### [SharedCartDetails](#SharedCartDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | HashMap<String,Object>? |  yes  | Share link device and other source information |
 | user | HashMap<String,Object>? |  yes  | User details of who generated share link |
 | token | String? |  yes  | Short link id |
 | createdOn | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  | Meta data sent while generating share cart link |

---


 
 
 #### [SharedCart](#SharedCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponText | String? |  yes  |  |
 | id | String? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | comment | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | sharedCartDetails | [SharedCartDetails](#SharedCartDetails)? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | uid | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | cartId | Integer? |  yes  |  |
 | gstin | String? |  yes  |  |

---


 
 
 #### [SharedCartResponse](#SharedCartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cart | [SharedCart](#SharedCart)? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [CartList](#CartList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartId | String? |  yes  |  |
 | pickUpCustomerDetails | HashMap<String,Object>? |  yes  |  |
 | cartValue | Double? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | currencyCode | String? |  yes  |  |
 | itemCounts | Integer? |  yes  |  |

---


 
 
 #### [MultiCartResponse](#MultiCartResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | data | ArrayList<[CartList](#CartList)>? |  yes  |  |

---


 
 
 #### [UpdateUserCartMapping](#UpdateUserCartMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String |  no  |  |

---


 
 
 #### [UserInfo](#UserInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gender | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |
 | id | String? |  yes  |  |
 | uid | String? |  yes  |  |
 | externalId | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | firstName | String? |  yes  |  |

---


 
 
 #### [UserCartMappingResponse](#UserCartMappingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponText | String? |  yes  |  |
 | user | [UserInfo](#UserInfo)? |  yes  |  |
 | id | String? |  yes  |  |
 | panConfig | HashMap<String,Object>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | comment | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | gstin | String? |  yes  |  |
 | appliedPromoDetails | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | panNo | String? |  yes  |  |

---


 
 
 #### [PlatformAddCartRequest](#PlatformAddCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | newCart | Boolean? |  yes  |  |
 | items | ArrayList<[AddProductCart](#AddProductCart)>? |  yes  |  |

---


 
 
 #### [PlatformUpdateCartRequest](#PlatformUpdateCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | items | ArrayList<[UpdateProductCart](#UpdateProductCart)>? |  yes  |  |
 | operation | String |  no  |  |

---


 
 
 #### [DeleteCartRequest](#DeleteCartRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartIdList | ArrayList<String>? |  yes  |  |

---


 
 
 #### [DeleteCartDetailResponse](#DeleteCartDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  | True if cart is archived successfully. False if not archived. |
 | message | String? |  yes  |  |

---


 
 
 #### [CartItemCountResponse](#CartItemCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userCartItemsCount | Integer? |  yes  | Item count present in cart |

---


 
 
 #### [Coupon](#Coupon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | maxDiscountValue | Double? |  yes  |  |
 | couponCode | String? |  yes  |  |
 | isApplied | Boolean? |  yes  |  |
 | couponType | String? |  yes  |  |
 | expiresOn | String? |  yes  |  |
 | couponValue | Double? |  yes  |  |
 | subTitle | String? |  yes  |  |
 | minimumCartValue | Double? |  yes  |  |
 | isApplicable | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | description | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | couponApplicableMessage | String? |  yes  |  |

---


 
 
 #### [PageCoupon](#PageCoupon)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | current | Integer? |  yes  |  |
 | total | Integer? |  yes  |  |
 | totalItemCount | Integer? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |

---


 
 
 #### [GetCouponResponse](#GetCouponResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | availableCouponList | ArrayList<[Coupon](#Coupon)>? |  yes  |  |
 | page | [PageCoupon](#PageCoupon)? |  yes  |  |

---


 
 
 #### [ApplyCouponRequest](#ApplyCouponRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponCode | String |  no  | Coupon code to be applied |

---


 
 
 #### [GeoLocation](#GeoLocation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | longitude | Double? |  yes  |  |
 | latitude | Double? |  yes  |  |

---


 
 
 #### [PlatformAddress](#PlatformAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | String? |  yes  |  |
 | id | String? |  yes  |  |
 | areaCodeSlug | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | geoLocation | [GeoLocation](#GeoLocation)? |  yes  |  |
 | country | String? |  yes  |  |
 | state | String? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | createdByUserId | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | email | String? |  yes  |  |
 | areaCode | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | name | String? |  yes  |  |
 | googleMapPoint | HashMap<String,Object>? |  yes  |  |
 | cartId | String? |  yes  |  |
 | city | String? |  yes  |  |
 | sector | String? |  yes  |  |
 | stateCode | String? |  yes  | State code for international address |
 | area | String? |  yes  |  |
 | userId | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | address | String? |  yes  |  |
 | countryPhoneCode | String? |  yes  |  |
 | countryIsoCode | String? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [PlatformGetAddressesResponse](#PlatformGetAddressesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address | ArrayList<[PlatformAddress](#PlatformAddress)>? |  yes  |  |

---


 
 
 #### [SaveAddressResponse](#SaveAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |

---


 
 
 #### [UpdateAddressResponse](#UpdateAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | isDefaultAddress | Boolean? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | isUpdated | Boolean? |  yes  |  |

---


 
 
 #### [DeleteAddressResponse](#DeleteAddressResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  |  |
 | isDeleted | Boolean? |  yes  |  |

---


 
 
 #### [PlatformSelectCartAddressRequest](#PlatformSelectCartAddressRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cartId | String? |  yes  |  |
 | billingAddressId | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | userId | String? |  yes  |  |

---


 
 
 #### [ShipmentArticle](#ShipmentArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | String? |  yes  |  |
 | quantity | String? |  yes  |  |
 | articleId | String? |  yes  |  |

---


 
 
 #### [PlatformShipmentResponse](#PlatformShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | Integer? |  yes  |  |
 | fulfillmentId | Integer? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | dpOptions | HashMap<String,Object>? |  yes  |  |
 | shipmentType | String? |  yes  |  |
 | orderType | String? |  yes  |  |
 | boxType | String? |  yes  |  |
 | promise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | dpId | String? |  yes  |  |
 | fulfillmentType | String? |  yes  |  |
 | articles | ArrayList<[ShipmentArticle](#ShipmentArticle)>? |  yes  |  |

---


 
 
 #### [PlatformCartShipmentsResponse](#PlatformCartShipmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponText | String? |  yes  |  |
 | id | String? |  yes  |  |
 | panConfig | HashMap<String,Object>? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | comment | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | staffUserId | String? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | shipments | ArrayList<[PlatformShipmentResponse](#PlatformShipmentResponse)>? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | gstin | String? |  yes  |  |
 | appliedPromoDetails | ArrayList<[AppliedPromotion](#AppliedPromotion)>? |  yes  |  |
 | error | Boolean? |  yes  |  |
 | panNo | String? |  yes  |  |

---


 
 
 #### [UpdateCartShipmentItem](#UpdateCartShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer? |  yes  | Quantity of product in shipment |
 | shipmentType | String |  no  | Shipment delivery type |
 | articleUid | String |  no  | Article mongo id |

---


 
 
 #### [UpdateCartShipmentRequest](#UpdateCartShipmentRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[UpdateCartShipmentItem](#UpdateCartShipmentItem)> |  no  |  |

---


 
 
 #### [PlatformCartMetaRequest](#PlatformCartMetaRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String? |  yes  |  |
 | pickUpCustomerDetails | HashMap<String,Object>? |  yes  | Customer contact details for customer pickup at store |
 | checkoutMode | String? |  yes  |  |
 | giftDetails | HashMap<String,Object>? |  yes  |  |
 | panNo | String? |  yes  |  |
 | comment | String? |  yes  |  |
 | staffUserId | String? |  yes  | staff user id |

---


 
 
 #### [CartMetaResponse](#CartMetaResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isValid | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [CartMetaMissingResponse](#CartMetaMissingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | ArrayList<String>? |  yes  |  |

---


 
 
 #### [StaffCheckout](#StaffCheckout)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | employeeCode | String? |  yes  |  |
 | id | String |  no  |  |
 | user | String |  no  |  |
 | lastName | String |  no  |  |
 | firstName | String |  no  |  |

---


 
 
 #### [CustomerDetails](#CustomerDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobile | String |  no  |  |

---


 
 
 #### [Files](#Files)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | values | ArrayList<String> |  no  |  |

---


 
 
 #### [CartCheckoutCustomMeta](#CartCheckoutCustomMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [PlatformCartCheckoutDetailRequest](#PlatformCartCheckoutDetailRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customMeta | ArrayList<[CartCheckoutCustomMeta](#CartCheckoutCustomMeta)>? |  yes  |  |
 | addressId | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | paymentParams | HashMap<String,Object>? |  yes  |  |
 | paymentAutoConfirm | Boolean? |  yes  |  |
 | id | String |  no  |  |
 | pos | Boolean? |  yes  |  |
 | billingAddressId | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |
 | aggregator | String? |  yes  |  |
 | pickAtStoreUid | Integer? |  yes  |  |
 | deviceId | String? |  yes  |  |
 | deliveryAddress | HashMap<String,Object>? |  yes  |  |
 | paymentMode | String |  no  |  |
 | checkoutMode | String? |  yes  |  |
 | customerDetails | HashMap<String,Object>? |  yes  | Customer details |
 | meta | HashMap<String,Object>? |  yes  |  |
 | staff | [StaffCheckout](#StaffCheckout)? |  yes  |  |
 | employeeCode | String? |  yes  |  |
 | billingAddress | HashMap<String,Object>? |  yes  |  |
 | callbackUrl | String? |  yes  |  |
 | userId | String |  no  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | orderType | String |  no  |  |
 | files | ArrayList<[Files](#Files)>? |  yes  | List of file url |
 | orderingStore | Integer? |  yes  |  |
 | paymentExtraIdentifiers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CheckCart](#CheckCart)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponText | String? |  yes  |  |
 | codMessage | String? |  yes  |  |
 | id | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | deliveryPromise | [ShipmentPromise](#ShipmentPromise)? |  yes  |  |
 | comment | String? |  yes  |  |
 | userType | String? |  yes  |  |
 | items | ArrayList<[CartProductInfo](#CartProductInfo)>? |  yes  |  |
 | errorMessage | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | paymentSelectionLock | [PaymentSelectionLock](#PaymentSelectionLock)? |  yes  |  |
 | deliveryChargeInfo | String? |  yes  |  |
 | restrictCheckout | Boolean? |  yes  |  |
 | orderId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | breakupValues | [CartBreakup](#CartBreakup)? |  yes  |  |
 | codCharges | Double? |  yes  |  |
 | isValid | Boolean? |  yes  |  |
 | uid | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | currency | [CartCurrency](#CartCurrency)? |  yes  |  |
 | lastModified | String? |  yes  |  |
 | buyNow | Boolean? |  yes  |  |
 | deliveryChargeOrderValue | Integer? |  yes  |  |
 | cartId | Integer? |  yes  |  |
 | storeEmps | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | gstin | String? |  yes  |  |
 | codAvailable | Boolean? |  yes  |  |
 | deliveryCharges | Double? |  yes  |  |

---


 
 
 #### [CartCheckoutResponse](#CartCheckoutResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appInterceptUrl | String? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |
 | cart | [CheckCart](#CheckCart)? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | callbackUrl | String? |  yes  |  |
 | paymentConfirmUrl | String? |  yes  |  |
 | orderId | String? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [CartDeliveryModesResponse](#CartDeliveryModesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pickupStores | ArrayList<Integer>? |  yes  | Store pick up available store uids |
 | availableModes | ArrayList<String>? |  yes  | Available delivery modes |

---


 
 
 #### [PickupStoreDetail](#PickupStoreDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | state | String? |  yes  |  |
 | city | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | areaCode | String? |  yes  |  |
 | uid | Integer? |  yes  |  |
 | areaCodeSlug | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | area | String? |  yes  |  |
 | id | Integer? |  yes  |  |
 | storeManagerName | String? |  yes  |  |
 | name | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | email | String? |  yes  |  |
 | pincode | Integer? |  yes  |  |
 | address | String? |  yes  |  |

---


 
 
 #### [StoreDetailsResponse](#StoreDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[PickupStoreDetail](#PickupStoreDetail)>? |  yes  |  |

---


 
 
 #### [UpdateCartPaymentRequest](#UpdateCartPaymentRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addressId | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | aggregatorName | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [CouponValidity](#CouponValidity)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String? |  yes  |  |
 | nextValidationRequired | Boolean? |  yes  |  |
 | valid | Boolean? |  yes  |  |
 | displayMessageEn | String? |  yes  |  |
 | code | String? |  yes  |  |
 | discount | Double? |  yes  |  |

---


 
 
 #### [PaymentCouponValidate](#PaymentCouponValidate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | message | String? |  yes  |  |
 | couponValidity | [CouponValidity](#CouponValidity)? |  yes  |  |

---


 
 
 #### [PaymentMeta](#PaymentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentGateway | String? |  yes  |  |
 | type | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |

---


 
 
 #### [PaymentMethod](#PaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mode | String |  no  |  |
 | payment | String? |  yes  |  |
 | paymentMeta | [PaymentMeta](#PaymentMeta) |  no  |  |
 | amount | Double? |  yes  |  |
 | name | String? |  yes  |  |
 | paymentExtraIdentifiers | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [PlatformCartCheckoutDetailV2Request](#PlatformCartCheckoutDetailV2Request)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addressId | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | paymentParams | HashMap<String,Object>? |  yes  |  |
 | customMeta | HashMap<String,Object>? |  yes  |  |
 | paymentAutoConfirm | Boolean? |  yes  |  |
 | id | String |  no  |  |
 | pos | Boolean? |  yes  |  |
 | billingAddressId | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |
 | aggregator | String? |  yes  |  |
 | pickAtStoreUid | Integer? |  yes  |  |
 | deviceId | String? |  yes  |  |
 | deliveryAddress | HashMap<String,Object>? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | checkoutMode | String? |  yes  |  |
 | customerDetails | HashMap<String,Object>? |  yes  | Customer details |
 | meta | HashMap<String,Object>? |  yes  |  |
 | paymentMethods | ArrayList<[PaymentMethod](#PaymentMethod)> |  no  |  |
 | staff | [StaffCheckout](#StaffCheckout)? |  yes  |  |
 | employeeCode | String? |  yes  |  |
 | billingAddress | HashMap<String,Object>? |  yes  |  |
 | callbackUrl | String? |  yes  |  |
 | userId | String |  no  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | orderType | String |  no  |  |
 | files | ArrayList<[Files](#Files)>? |  yes  | List of file url |
 | orderingStore | Integer? |  yes  |  |

---


 
 
 #### [UpdateCartPaymentRequestV2](#UpdateCartPaymentRequestV2)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | addressId | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | aggregatorName | String? |  yes  |  |
 | merchantCode | String? |  yes  |  |
 | paymentIdentifier | String? |  yes  |  |
 | id | String? |  yes  |  |
 | paymentMethods | ArrayList<[PaymentMethod](#PaymentMethod)>? |  yes  |  |

---



