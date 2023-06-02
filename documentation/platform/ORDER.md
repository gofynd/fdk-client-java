



##### [Back to Platform docs](./README.md)

## Order Methods
Handles all platform order and shipment api(s)
* [getShipments](#getshipments)
* [getShipmentById](#getshipmentbyid)
* [getAssetByShipmentIds](#getassetbyshipmentids)
* [getOrderById](#getorderbyid)
* [getLaneConfig](#getlaneconfig)
* [getApplicationShipments](#getapplicationshipments)
* [getOrders](#getorders)
* [getMetricCount](#getmetriccount)
* [getAppOrderShipmentDetails](#getappordershipmentdetails)
* [trackShipmentPlatform](#trackshipmentplatform)
* [getfilters](#getfilters)
* [createShipmentReport](#createshipmentreport)
* [getReportsShipmentListing](#getreportsshipmentlisting)
* [upsertJioCode](#upsertjiocode)
* [getBulkShipmentExcelFile](#getbulkshipmentexcelfile)
* [getBulkActionTemplate](#getbulkactiontemplate)
* [downloadBulkActionTemplate](#downloadbulkactiontemplate)
* [getShipmentReasons](#getshipmentreasons)
* [getBagById](#getbagbyid)
* [getBags](#getbags)
* [generatePOSReceiptByOrderId](#generateposreceiptbyorderid)
* [invalidateShipmentCache](#invalidateshipmentcache)
* [reassignLocation](#reassignlocation)
* [updateShipmentLock](#updateshipmentlock)
* [getAnnouncements](#getannouncements)
* [updateAddress](#updateaddress)
* [click2Call](#click2call)
* [updateShipmentStatus](#updateshipmentstatus)
* [processManifest](#processmanifest)
* [dispatchManifest](#dispatchmanifest)
* [getRoleBasedActions](#getrolebasedactions)
* [postShipmentHistory](#postshipmenthistory)
* [getShipmentHistory](#getshipmenthistory)
* [sendSmsNinja](#sendsmsninja)
* [updatePackagingDimensions](#updatepackagingdimensions)
* [createOrder](#createorder)
* [createChannelConfig](#createchannelconfig)
* [getChannelConfig](#getchannelconfig)
* [uploadConsent](#uploadconsent)
* [orderUpdate](#orderupdate)
* [checkOrderStatus](#checkorderstatus)
* [getStateTransitionMap](#getstatetransitionmap)



## Methods with example and description


### getShipments





```java
platformClient.order.getShipments( lane,  bagStatus,  statusOverrideLane,  timeToDispatch,  searchType,  searchValue,  searchId,  fromDate,  toDate,  dpIds,  orderingCompanyId,  stores,  salesChannels,  requestByExt,  pageNo,  pageSize,  isPrioritySort,  fetchActiveShipment,  excludeLockedShipments,  paymentMethods,  channelShipmentId,  channelOrderId,  customMeta,  orderingChannel,  companyAffiliateTag,  platformUserId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| lane | String? | no |  |   
| bagStatus | String? | no |  |   
| statusOverrideLane | Boolean? | no |  |   
| timeToDispatch | String? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannels | String? | no |  |   
| requestByExt | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isPrioritySort | Boolean? | no |  |   
| fetchActiveShipment | Boolean? | no |  |   
| excludeLockedShipments | Boolean? | no |  |   
| paymentMethods | String? | no |  |   
| channelShipmentId | String? | no |  |   
| channelOrderId | String? | no |  |   
| customMeta | String? | no |  |   
| orderingChannel | String? | no |  |   
| companyAffiliateTag | String? | no |  |   
| platformUserId | String? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentById





```java
platformClient.order.getShipmentById( channelShipmentId,  shipmentId,  orderingCompanyId,  requestByExt) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| channelShipmentId | String? | no |  |   
| shipmentId | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| requestByExt | String? | no |  |  





*Returned Response:*




[ShipmentInfoResponse](#ShipmentInfoResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "order": {
    "fynd_order_id": "FY62B13E2101810C19E4",
    "shipment_count": 1,
    "order_date": "2022-06-21T09:12:26+00:00"
  },
  "shipments": [
    {
      "shipment_id": "16557829457641286433",
      "payment_mode": "COD",
      "fulfilling_store": {
        "id": 1,
        "code": "HS-468a5",
        "fulfillment_channel": "pulse",
        "store_name": "Reliance Industries Ltd - Jio Market",
        "contact_person": "",
        "phone": "8268108880",
        "address": "high_street WEWORK, VIJAY DIAMONDS, ANDHERI MUMBAI MAHARASHTRA 400093",
        "city": "MUMBAI",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 400093
      },
      "delivery_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "billing_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst"
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY62B13E2101810C19E4",
        "affiliate_id": "000000000000000000000001",
        "ordering_channel": "FYND",
        "source": null,
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-06-21T09:12:26+00:00"
      },
      "gst_details": {
        "value_of_good": 475.24,
        "gst_fee": 23.76,
        "brand_calculated_amount": 499,
        "tax_collected_at_source": 0,
        "gstin_code": null
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-06-21T09:12:26+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-06-21T09:12:32+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-06-21T09:39:13+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        },
        {
          "status": "dp_assigned",
          "updated_at": "2022-06-21T09:40:04+00:00",
          "state_type": "operational",
          "app_display_name": "DP Assigned",
          "display_name": "DP Assigned",
          "forward": null
        },
        {
          "status": "bag_picked",
          "updated_at": "2022-06-21T09:40:12+00:00",
          "state_type": "operational",
          "app_display_name": "Shipped",
          "display_name": "In Transit",
          "forward": null
        },
        {
          "status": "out_for_delivery",
          "updated_at": "2022-06-21T09:40:29+00:00",
          "state_type": "operational",
          "app_display_name": "Out For Delivery",
          "display_name": "Out For Delivery",
          "forward": null
        },
        {
          "status": "delivery_done",
          "updated_at": "2022-06-21T09:40:37+00:00",
          "state_type": "operational",
          "app_display_name": "Delivered",
          "display_name": "Delivery Done",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 43880,
          "display_name": "Bag",
          "entity_type": "bag",
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": false,
            "is_customer_return_allowed": true,
            "allow_force_return": false,
            "is_active": false
          },
          "financial_breakup": [
            {
              "price_effective": 499,
              "discount": 0,
              "amount_paid": 549,
              "coupon_effective_discount": 0,
              "delivery_charge": 50,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 549,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 5,
              "value_of_good": 475.24,
              "price_marked": 499,
              "transfer_price": 0,
              "brand_calculated_amount": 499,
              "promotion_effective_discount": 0,
              "coupon_value": 0,
              "pm_price_split": {
                "COD": 549
              },
              "size": "5",
              "total_units": 1,
              "hsn_code": "62050000",
              "identifiers": {
                "sku_code": "CL-001L-L-PRPL-PINK-5"
              },
              "item_name": "Purple Flip Flops",
              "gst_fee": "23.76",
              "gst_tag": "IGST"
            }
          ],
          "current_status": "delivery_done",
          "item": {
            "name": "Purple Flip Flops",
            "brand": "Nike",
            "slug_key": "purple-flip-flops-ezmucvw4d3",
            "images": [
              "https://hdn-1.fynd.com/products/pictures/item/free/270x0/CL-001L-L-PRPL-PINK-6/Rvk5WbGg9Hx-1.jpg"
            ],
            "size": "5",
            "l1_category": "",
            "l3_category": "27"
          },
          "brand": {
            "modified_on": 1655707988,
            "logo": "https://hdn-1.jiomarketx0.de/x0/brands/pictures/square-logo/original/DbhIvd_tB-Logo.jpeg",
            "brand_name": "Nike",
            "company": null,
            "created_on": 1647793418,
            "id": 4
          },
          "gst_details": {
            "gstin_code": null,
            "gst_tag": "IGST",
            "hsn_code": "62050000",
            "value_of_good": 475.24,
            "gst_tax_percentage": 5,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 499,
            "gst_fee": "23.76"
          },
          "article": {
            "uid": "6237fdfec0903e7ae543c201",
            "identifiers": {
              "sku_code": "CL-001L-L-PRPL-PINK-5"
            },
            "return_config": {
              "time": 30,
              "unit": "days",
              "returnable": true
            }
          },
          "quantity": 1
        }
      ],
      "delivery_slot": {
        "slot": "By 03:00 AM",
        "upper_bound": "2022-06-21T03:42:23+00:00",
        "lower_bound": "2022-06-21T03:42:23+00:00",
        "date": "2022-06-21T03:42:23+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": [
        {
          "slug": "COD",
          "payment_id": "COD",
          "payment_amt": 549,
          "payment_cart": null,
          "payment_desc": "COD",
          "bdcustomer_id": null,
          "order_inv_num": null,
          "mode_of_payment": "COD",
          "payment_gateway_logo": null,
          "transaction_ref_number": ""
        }
      ],
      "vertical": "GROCERIES",
      "payments": {
        "mode": "COD",
        "logo": "https://hdn-1.fynd.com/payment/Pos+Logo.png",
        "source": "Jio Partner Pay"
      },
      "priority_text": null,
      "status": {
        "created_at": 1655804437,
        "shipment_id": "16557829457641286433",
        "status": "delivery_done",
        "bag_list": [
          "43880"
        ],
        "id": 19980
      },
      "prices": {
        "amount_paid": 549,
        "refund_amount": 549,
        "price_marked": 499,
        "cod_charges": 0,
        "discount": 0,
        "cashback_applied": 0,
        "delivery_charge": 50,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 499,
        "refund_credit": 0,
        "value_of_good": 475.24,
        "pm_price_split": {
          "COD": 549
        },
        "brand_calculated_amount": 499,
        "coupon_effective_discount": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 0
      },
      "picked_date": "",
      "tracking_list": [
        {
          "status": "Order Placed",
          "time": "2022-06-21T09:12:32+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Order Confirmed",
          "time": "2022-06-21T09:39:13+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Invoiced",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivery Partner Assigned",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Packed",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "In Transit",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Out For Delivery",
          "time": "2022-06-21T09:40:29+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivered",
          "time": "2022-06-21T09:40:37+00:00",
          "is_passed": true,
          "is_current": true
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/fynd_logo.png",
      "packaging_type": "POLYB_DFLT_L"
    }
  ]
}
```
</details>









---


### getAssetByShipmentIds
Get Invoice or Label or Pos of a shipment




```java
platformClient.order.getAssetByShipmentIds( shipmentIds,  invoice,  expiresIn) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| shipmentIds | String | yes |  |   
| invoice | Boolean? | no |  |   
| expiresIn | String? | no |  |  



Use this API to retrieve shipments invoice, label and pos.

*Returned Response:*




[ResponseGetAssetShipment](#ResponseGetAssetShipment)

Success. Check the example shown below or refer `ShipmentByIds` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrderById





```java
platformClient.order.getOrderById( orderId) {
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
{
  "success": true,
  "order": {
    "fynd_order_id": "FY637CFCC00177713D47",
    "meta": {
      "files": [],
      "staff": {},
      "cart_id": 1835,
      "comment": "",
      "extra_meta": {},
      "order_tags": null,
      "order_type": "HomeDelivery",
      "employee_id": null,
      "payment_type": "self",
      "mongo_cart_id": 1835,
      "order_platform": "platform-site",
      "ordering_store": null,
      "order_child_entities": [
        "bag",
        "shipment"
      ]
    },
    "affiliate_id": "62f35968d101a6d38c886d85",
    "ordering_channel": "Ecomm",
    "source": "uniket-desktop",
    "tax_details": {
      "gstin": null
    },
    "order_date": "2022-11-22T22:15:53+00:00",
    "prices": {
      "amount_paid": 948.5,
      "refund_amount": 948.5,
      "price_marked": 1398,
      "cod_charges": 0,
      "discount": 349.5,
      "cashback_applied": 0,
      "delivery_charge": 0,
      "fynd_credits": 0,
      "cashback": 0,
      "price_effective": 1048.5,
      "refund_credit": 0,
      "value_of_good": 803.82,
      "coupon_value": 0,
      "tax_collected_at_source": 0,
      "promotion_effective_discount": 100,
      "amount_paid_roundoff": 948
    },
    "raw_user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
    "comment": ""
  },
  "shipments": [
    {
      "shipment_id": "16691355532841431595",
      "fulfilling_store": {
        "id": 5,
        "code": "SF94",
        "fulfillment_channel": "pulse",
        "store_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
        "contact_person": "Anju Abraham",
        "phone": "918898846722",
        "address": "store 1ST FLOOR, WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR, KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTR Mumbai Maharashtra 400093",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400093",
        "meta": {
          "stage": "verified",
          "timing": [
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "monday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "tuesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "wednesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "thursday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "friday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "saturday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "sunday"
            }
          ],
          "documents": {},
          "gst_number": null,
          "display_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
          "gst_credentials": {
            "e_invoice": {
              "enabled": false
            },
            "e_waybill": {
              "enabled": false
            }
          },
          "notification_emails": [
            "anjuabraham@gofynd.com"
          ],
          "product_return_config": {
            "on_same_store": true
          },
          "additional_contact_details": {
            "number": [
              "91 - 8898846722"
            ]
          },
          "ewaybill_portal_details": null
        },
        "fulfilment_type": null
      },
      "delivery_details": {
        "name": "Vaishakh Shetty",
        "email": "",
        "phone": "9892133001",
        "address": "home Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Mumbai,Maharashtra Mumbai Maharashtra 400083",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400083",
        "state_code": "27"
      },
      "billing_details": {
        "name": "Vaishakh Shetty",
        "email": "",
        "phone": "9892133001",
        "address": "home Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Mumbai,Maharashtra Mumbai Maharashtra 400083",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400083",
        "state_code": "27"
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst",
        "dp_otp": ""
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY637CFCC00177713D47",
        "meta": {
          "files": [],
          "staff": {},
          "cart_id": 1835,
          "comment": "",
          "extra_meta": {},
          "order_tags": null,
          "order_type": "HomeDelivery",
          "employee_id": null,
          "payment_type": "self",
          "mongo_cart_id": 1835,
          "order_platform": "platform-site",
          "ordering_store": null,
          "order_child_entities": [
            "bag",
            "shipment"
          ]
        },
        "affiliate_id": "62f35968d101a6d38c886d85",
        "ordering_channel": "Ecomm",
        "source": "uniket-desktop",
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-11-22T22:15:53+00:00",
        "prices": {
          "amount_paid": 948.5,
          "refund_amount": 948.5,
          "price_marked": 1398,
          "cod_charges": 0,
          "discount": 349.5,
          "cashback_applied": 0,
          "delivery_charge": 0,
          "fynd_credits": 0,
          "cashback": 0,
          "price_effective": 1048.5,
          "refund_credit": 0,
          "value_of_good": 803.82,
          "coupon_value": 0,
          "tax_collected_at_source": 0,
          "promotion_effective_discount": 100,
          "amount_paid_roundoff": 948
        },
        "raw_user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
        "comment": ""
      },
      "gst_details": {
        "value_of_good": 401.91,
        "gst_fee": 72.34,
        "brand_calculated_amount": 474.25,
        "tax_collected_at_source": 0,
        "gstin_code": "null"
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-11-22T22:15:54+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-11-22T22:15:59+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-11-22T22:54:50+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 20472628,
          "display_name": "Bag",
          "entity_type": "bag",
          "meta": {
            "custom_message": "Please send the shipment as soon as possible."
          },
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": true,
            "is_customer_return_allowed": false,
            "is_active": true
          },
          "financial_breakup": [
            {
              "price_effective": 524.25,
              "discount": 174.75,
              "amount_paid": 474.25,
              "coupon_effective_discount": 0,
              "delivery_charge": 0,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 474.25,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 18,
              "value_of_good": 401.91,
              "price_marked": 699,
              "transfer_price": 0,
              "brand_calculated_amount": 474.25,
              "tax_collected_at_source": 0,
              "tcs_percentage": 0,
              "promotion_effective_discount": 50,
              "coupon_value": 0,
              "amount_paid_roundoff": 474,
              "size": "OS",
              "total_units": 1,
              "hsn_code": "20472574",
              "identifiers": {
                "ean": "6902395784364",
                "sku_code": "1020820"
              },
              "item_name": "L'Oreal Paris Rouge Signature Matte Liquid Lipstick, 146 I Enlight",
              "gst_fee": 72.34,
              "gst_tag": "SGST"
            }
          ],
          "current_status": "bag_confirmed",
          "item": {
            "name": "L'Oreal Paris Rouge Signature Matte Liquid Lipstick, 146 I Enlight",
            "brand": "L'Oreal Paris",
            "slug_key": "loreal-paris-rouge-signature-matte-liquid-lipstick-146-i-enlight-96a1wferol05",
            "images": [
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/shj00c0H4T-1020820_1.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/iM7wvxxxT5-1020820_2.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/TcPMevsr6O-1020820_3.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/BAiV5xox57-1020820_4.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/6wXPvugMto-1020820_5.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/LvlirqfHho-1020820_6.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/KKnZHIJwO-1020820_7.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/NheQB3HLlq-1020820_8.jpg"
            ],
            "size": "OS",
            "l1_category": [
              "Makeup"
            ],
            "l3_category": 134
          },
          "brand": {
            "credit_note_expiry_days": null,
            "modified_on": "2022-11-22T09:08:25",
            "id": 2,
            "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/tira-n/wrkr/tiraz0/brands/pictures/square-logo/original/iCMr3gmUF-Logo.jpeg",
            "created_on": "2022-08-09T13:17:41",
            "credit_note_allowed": false,
            "start_date": null,
            "company": null,
            "script_last_ran": null,
            "pickup_location": null,
            "brand_name": "L'Oreal Paris",
            "invoice_prefix": null,
            "is_virtual_invoice": false
          },
          "gst_details": {
            "gstin_code": "null",
            "gst_tag": "SGST",
            "hsn_code": "20472574",
            "value_of_good": 401.91,
            "gst_tax_percentage": 18,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 474.25,
            "tax_collected_at_source": 0,
            "hsn_code_id": "62f3ad402cbb29a3a1c9186b",
            "gst_fee": 72.34,
            "igst_tax_percentage": 0,
            "sgst_tax_percentage": 9,
            "cgst_tax_percentage": 9,
            "igst_gst_fee": "0",
            "cgst_gst_fee": "36.17",
            "sgst_gst_fee": "36.17"
          },
          "article": {
            "uid": "62f495f2a604499934540c69",
            "identifiers": {
              "ean": "6902395784364",
              "sku_code": "1020820"
            },
            "return_config": {
              "time": 7,
              "unit": "days",
              "returnable": true
            }
          },
          "affiliate_bag_details": {
            "coupon_code": null
          },
          "quantity": 1,
          "identifier": null,
          "applied_promos": [
            {
              "amount": 50,
              "promo_id": "637cfcb19d43e76334b9fb6c",
              "buy_rules": [
                {
                  "item_criteria": {
                    "item_brand": [
                      2
                    ]
                  },
                  "cart_conditions": {}
                }
              ],
              "mrp_promotion": false,
              "discount_rules": [
                {
                  "type": "amount",
                  "value": 100
                }
              ],
              "promotion_name": "VS",
              "promotion_type": "amount",
              "article_quantity": 2
            }
          ],
          "mark_as_returnable": false
        }
      ],
      "custom_message": "Please send the shipment as soon as possible.",
      "company_id": 2,
      "user": {
        "user_oid": "637cbf77e7706fbc79baa669",
        "gender": "female",
        "first_name": "Vaishakh",
        "id": 18052704,
        "mobile": "9892133001",
        "mongo_user_id": "637cbf77e7706fbc79baa669",
        "email": "vaishakhshetty@gofynd.com",
        "last_name": "Shetty",
        "is_anonymous_user": false
      },
      "pickup_slot": {},
      "delivery_slot": {
        "slot": "By 16:00 PM",
        "upper_bound": "2022-11-25T16:45:50+00:00",
        "lower_bound": "2022-11-23T16:45:50+00:00",
        "date": "2022-11-25T16:45:50+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": {
        "PP": {
          "amount": 474.25,
          "mode": "PP",
          "name": "PartnerPay",
          "collect_by": "seller",
          "refund_by": "seller",
          "meta": {}
        }
      },
      "vertical": null,
      "priority_text": null,
      "status": {
        "created_at": "2022-11-22T22:54:50+00:00",
        "id": 88117778,
        "meta": {
          "request_meta": {},
          "state_manager_used": "entity",
          "kafka_emission_status": 1
        },
        "status": "bag_confirmed",
        "shipment_id": "16691355532841431595",
        "bag_list": [
          "20472628"
        ],
        "current_shipment_status": "bag_confirmed",
        "status_created_at": "2022-11-22T22:54:50"
      },
      "prices": {
        "amount_paid": 474.25,
        "refund_amount": 474.25,
        "price_marked": 699,
        "cod_charges": 0,
        "discount": 174.75,
        "cashback_applied": 0,
        "delivery_charge": 0,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 524.25,
        "refund_credit": 0,
        "value_of_good": 401.91,
        "coupon_value": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 50,
        "amount_paid_roundoff": 474
      },
      "tracking_list": [
        {
          "text": "Placed",
          "status": "processing",
          "is_passed": true,
          "time": "2022-11-22T22:15:59+00:00"
        },
        {
          "text": "Bag Confirmed",
          "status": "confirmed",
          "is_passed": true,
          "time": "2022-11-22T22:54:50+00:00"
        },
        {
          "text": "Dp Assigned",
          "status": "dp_assigned",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "In Transit",
          "status": "in_transit",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "Out For Delivery",
          "status": "out_for_delivery",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "Delivered",
          "status": "delivered",
          "is_passed": false,
          "time": ""
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/ecomm_logo.png",
      "packaging_type": "POLYB_DFLT_L",
      "enable_dp_tracking": false,
      "invoice": {
        "updated_date": "1970-01-01T00:00:00",
        "store_invoice_id": null,
        "invoice_url": "",
        "label_url": "",
        "external_invoice_id": ""
      },
      "can_process": true,
      "estimated_sla_time": null,
      "tracking_url": "",
      "meta": {
        "dp_id": "9",
        "weight": 300,
        "external": {},
        "formatted": {
          "max": "Fri, 25 Nov",
          "min": "Wed, 23 Nov"
        },
        "timestamp": {
          "max": 1669394750,
          "min": 1669221950
        },
        "bag_weight": {
          "20472628": 300
        },
        "debug_info": {
          "stormbreaker_uuid": "998171bb-67af-412a-a00a-12d436418ff2"
        },
        "dp_options": {},
        "order_type": null,
        "dp_sort_key": "fm_priority",
        "packaging_name": "POLYB_DFLT_L",
        "assign_dp_from_sb": true,
        "same_store_available": true,
        "fulfill_virtual_invoice": false,
        "fulfilment_priority_text": null,
        "auto_trigger_dp_assignment_ACF": true
      },
      "shipment_created_at": "2022-11-22T22:15:53+00:00",
      "mark_as_returnable": false,
      "ordering_store": {
        "id": 5,
        "code": "SF94",
        "fulfillment_channel": "pulse",
        "store_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
        "contact_person": "Anju Abraham",
        "phone": "918898846722",
        "address": "store 1ST FLOOR, WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR, KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTR Mumbai Maharashtra 400093",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400093",
        "meta": {
          "stage": "verified",
          "timing": [
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "monday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "tuesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "wednesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "thursday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "friday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "saturday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "sunday"
            }
          ],
          "documents": {},
          "gst_number": null,
          "display_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
          "gst_credentials": {
            "e_invoice": {
              "enabled": false
            },
            "e_waybill": {
              "enabled": false
            }
          },
          "notification_emails": [
            "anjuabraham@gofynd.com"
          ],
          "product_return_config": {
            "on_same_store": true
          },
          "additional_contact_details": {
            "number": [
              "91 - 8898846722"
            ]
          },
          "ewaybill_portal_details": null
        },
        "fulfilment_type": null
      },
      "custom_meta": {}
    }
  ]
}
```
</details>









---


### getLaneConfig





```java
platformClient.order.getLaneConfig( superLane,  groupEntity,  fromDate,  toDate,  dpIds,  stores,  salesChannels,  paymentMode,  bagStatus,  searchType,  searchValue,  tags,  timeToDispatch,  paymentMethods) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| superLane | String? | no |  |   
| groupEntity | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannels | String? | no |  |   
| paymentMode | String? | no |  |   
| bagStatus | String? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |   
| tags | String? | no |  |   
| timeToDispatch | String? | no |  |   
| paymentMethods | String? | no |  |  





*Returned Response:*




[LaneConfigResponse](#LaneConfigResponse)

Response containing count of shipments of the given status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "super_lanes": [
    {
      "text": "Unfulfilled",
      "value": "unfulfilled",
      "options": [
        {
          "text": "New",
          "value": "new",
          "total_items": 18,
          "index": 1,
          "actions": []
        },
        {
          "text": "Confirmed",
          "value": "confirmed",
          "total_items": 0,
          "index": 2,
          "actions": []
        },
        {
          "text": "To Be Packed",
          "value": "to_be_packed",
          "total_items": 0,
          "index": 3,
          "actions": []
        },
        {
          "text": "Ready To Dispatch",
          "value": "ready_for_dispatch",
          "total_items": 0,
          "index": 4,
          "actions": []
        }
      ],
      "total_items": 18
    },
    {
      "text": "Return",
      "value": "return",
      "options": [
        {
          "text": "Return Initiated",
          "value": "return_initiated",
          "total_items": 0,
          "index": 9,
          "actions": []
        },
        {
          "text": "Return In Transit",
          "value": "return_in_transit",
          "total_items": 0,
          "index": 10,
          "actions": []
        },
        {
          "text": "Return Delivered",
          "value": "return_delivered",
          "total_items": 0,
          "index": 11,
          "actions": []
        },
        {
          "text": "Return Accepted",
          "value": "return_accepted",
          "total_items": 0,
          "index": 12,
          "actions": []
        }
      ],
      "total_items": 0
    }
  ]
}
```
</details>









---


### getApplicationShipments





```java
platformClient.application("<APPLICATION_ID>").order.getApplicationShipments( lane,  searchType,  searchId,  fromDate,  toDate,  dpIds,  orderingCompanyId,  stores,  salesChannel,  requestByExt,  pageNo,  pageSize,  customerId,  isPrioritySort) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| applicationId | String | yes |  |   
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| requestByExt | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| customerId | String? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrders





```java
platformClient.order.getOrders( lane,  searchType,  bagStatus,  timeToDispatch,  paymentMethods,  tags,  searchValue,  fromDate,  toDate,  dpIds,  stores,  salesChannels,  pageNo,  pageSize,  isPrioritySort,  customMeta,  platformUserId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| lane | String? | no |  |   
| searchType | String? | no |  |   
| bagStatus | String? | no |  |   
| timeToDispatch | String? | no |  |   
| paymentMethods | String? | no |  |   
| tags | String? | no |  |   
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannels | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isPrioritySort | Boolean? | no |  |   
| customMeta | String? | no |  |   
| platformUserId | String? | no |  |  





*Returned Response:*




[OrderListingResponse](#OrderListingResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getMetricCount





```java
platformClient.order.getMetricCount( fromDate,  toDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[MetricCountResponse](#MetricCountResponse)

Response containing count of shipments of the given metrics




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAppOrderShipmentDetails





```java
platformClient.application("<APPLICATION_ID>").order.getAppOrderShipmentDetails( orderId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| applicationId | String | yes |  |   
| orderId | String | yes |  |  





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We render shipment details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "order": {
    "fynd_order_id": "FY62B13E2101810C19E4",
    "shipment_count": 1,
    "order_date": "2022-06-21T09:12:26+00:00"
  },
  "shipments": [
    {
      "shipment_id": "16557829457641286433",
      "payment_mode": "COD",
      "fulfilling_store": {
        "id": 1,
        "code": "HS-468a5",
        "fulfillment_channel": "pulse",
        "store_name": "Reliance Industries Ltd - Jio Market",
        "contact_person": "",
        "phone": "8268108880",
        "address": "high_street WEWORK, VIJAY DIAMONDS, ANDHERI MUMBAI MAHARASHTRA 400093",
        "city": "MUMBAI",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 400093
      },
      "delivery_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "billing_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst"
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY62B13E2101810C19E4",
        "affiliate_id": "000000000000000000000001",
        "ordering_channel": "FYND",
        "source": null,
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-06-21T09:12:26+00:00"
      },
      "gst_details": {
        "value_of_good": 475.24,
        "gst_fee": 23.76,
        "brand_calculated_amount": 499,
        "tax_collected_at_source": 0,
        "gstin_code": null
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-06-21T09:12:26+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-06-21T09:12:32+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-06-21T09:39:13+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        },
        {
          "status": "dp_assigned",
          "updated_at": "2022-06-21T09:40:04+00:00",
          "state_type": "operational",
          "app_display_name": "DP Assigned",
          "display_name": "DP Assigned",
          "forward": null
        },
        {
          "status": "bag_picked",
          "updated_at": "2022-06-21T09:40:12+00:00",
          "state_type": "operational",
          "app_display_name": "Shipped",
          "display_name": "In Transit",
          "forward": null
        },
        {
          "status": "out_for_delivery",
          "updated_at": "2022-06-21T09:40:29+00:00",
          "state_type": "operational",
          "app_display_name": "Out For Delivery",
          "display_name": "Out For Delivery",
          "forward": null
        },
        {
          "status": "delivery_done",
          "updated_at": "2022-06-21T09:40:37+00:00",
          "state_type": "operational",
          "app_display_name": "Delivered",
          "display_name": "Delivery Done",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 43880,
          "display_name": "Bag",
          "entity_type": "bag",
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": false,
            "is_customer_return_allowed": true,
            "allow_force_return": false,
            "is_active": false
          },
          "financial_breakup": [
            {
              "price_effective": 499,
              "discount": 0,
              "amount_paid": 549,
              "coupon_effective_discount": 0,
              "delivery_charge": 50,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 549,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 5,
              "value_of_good": 475.24,
              "price_marked": 499,
              "transfer_price": 0,
              "brand_calculated_amount": 499,
              "promotion_effective_discount": 0,
              "coupon_value": 0,
              "pm_price_split": {
                "COD": 549
              },
              "size": "5",
              "total_units": 1,
              "hsn_code": "62050000",
              "identifiers": {
                "sku_code": "CL-001L-L-PRPL-PINK-5"
              },
              "item_name": "Purple Flip Flops",
              "gst_fee": "23.76",
              "gst_tag": "IGST"
            }
          ],
          "current_status": "delivery_done",
          "item": {
            "name": "Purple Flip Flops",
            "brand": "Nike",
            "slug_key": "purple-flip-flops-ezmucvw4d3",
            "images": [
              "https://hdn-1.fynd.com/products/pictures/item/free/270x0/CL-001L-L-PRPL-PINK-6/Rvk5WbGg9Hx-1.jpg"
            ],
            "size": "5",
            "l1_category": "",
            "l3_category": "27"
          },
          "brand": {
            "modified_on": 1655707988,
            "logo": "https://hdn-1.jiomarketx0.de/x0/brands/pictures/square-logo/original/DbhIvd_tB-Logo.jpeg",
            "brand_name": "Nike",
            "company": null,
            "created_on": 1647793418,
            "id": 4
          },
          "gst_details": {
            "gstin_code": null,
            "gst_tag": "IGST",
            "hsn_code": "62050000",
            "value_of_good": 475.24,
            "gst_tax_percentage": 5,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 499,
            "gst_fee": "23.76"
          },
          "article": {
            "uid": "6237fdfec0903e7ae543c201",
            "identifiers": {
              "sku_code": "CL-001L-L-PRPL-PINK-5"
            },
            "return_config": {
              "time": 30,
              "unit": "days",
              "returnable": true
            }
          },
          "quantity": 1
        }
      ],
      "delivery_slot": {
        "slot": "By 03:00 AM",
        "upper_bound": "2022-06-21T03:42:23+00:00",
        "lower_bound": "2022-06-21T03:42:23+00:00",
        "date": "2022-06-21T03:42:23+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": [
        {
          "slug": "COD",
          "payment_id": "COD",
          "payment_amt": 549,
          "payment_cart": null,
          "payment_desc": "COD",
          "bdcustomer_id": null,
          "order_inv_num": null,
          "mode_of_payment": "COD",
          "payment_gateway_logo": null,
          "transaction_ref_number": ""
        }
      ],
      "vertical": "GROCERIES",
      "payments": {
        "mode": "COD",
        "logo": "https://hdn-1.fynd.com/payment/Pos+Logo.png",
        "source": "Jio Partner Pay"
      },
      "priority_text": null,
      "status": {
        "created_at": 1655804437,
        "shipment_id": "16557829457641286433",
        "status": "delivery_done",
        "bag_list": [
          "43880"
        ],
        "id": 19980
      },
      "prices": {
        "amount_paid": 549,
        "refund_amount": 549,
        "price_marked": 499,
        "cod_charges": 0,
        "discount": 0,
        "cashback_applied": 0,
        "delivery_charge": 50,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 499,
        "refund_credit": 0,
        "value_of_good": 475.24,
        "pm_price_split": {
          "COD": 549
        },
        "brand_calculated_amount": 499,
        "coupon_effective_discount": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 0
      },
      "picked_date": "",
      "tracking_list": [
        {
          "status": "Order Placed",
          "time": "2022-06-21T09:12:32+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Order Confirmed",
          "time": "2022-06-21T09:39:13+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Invoiced",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivery Partner Assigned",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Packed",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "In Transit",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Out For Delivery",
          "time": "2022-06-21T09:40:29+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivered",
          "time": "2022-06-21T09:40:37+00:00",
          "is_passed": true,
          "is_current": true
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/fynd_logo.png",
      "packaging_type": "POLYB_DFLT_L"
    }
  ]
}
```
</details>









---


### trackShipmentPlatform
Track shipment




```java
platformClient.application("<APPLICATION_ID>").order.trackShipmentPlatform( shipmentId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | String | yes |  |   
| applicationId | String | yes |  |   
| shipmentId | String | yes |  |  



Track Shipment by shipment id, for application based on application Id

*Returned Response:*




[PlatformShipmentTrack](#PlatformShipmentTrack)

Success. Check the example shown below or refer `PlatformShipmentTrack` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "meta": {},
  "results": [
    {
      "updated_at": "24 Nov, 12:39 PM",
      "last_location_recieved_at": "Thane",
      "reason": "Fyndr",
      "shipment_type": "forward",
      "status": "dp_assigned",
      "updated_time": "2022-11-24T12:39:38+05:30",
      "account_name": "fyndr",
      "awb": "2125658183710",
      "raw_status": "dp_assigned",
      "meta": null
    }
  ]
}
```
</details>









---


### getfilters





```java
platformClient.order.getfilters( view,  groupEntity) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of company |   
| view | String | yes | Name of View |   
| groupEntity | String? | no | Group Entity Name |  





*Returned Response:*




[FiltersResponse](#FiltersResponse)

List of filters




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "global": [
    {
      "text": "Fulfilling Stores",
      "value": "stores",
      "type": "single_select",
      "options": null
    },
    {
      "text": "Search Types",
      "value": "search_type",
      "type": "single_select",
      "options": [
        {
          "text": "Auto",
          "value": "auto",
          "placeholder_text": "Search by Shipment ID, Order ID or Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "Shipment ID",
          "value": "shipment_id",
          "placeholder_text": "Search by Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Bag ID",
          "value": "bag_id",
          "placeholder_text": "Search by Bag ID",
          "min_search_size": 4,
          "show_ui": true
        },
        {
          "text": "Order ID",
          "value": "order_id",
          "placeholder_text": "Search by Order ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Order ID",
          "value": "external_order_id",
          "placeholder_text": "Search by External Order ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Bag ID",
          "value": "external_bag_id",
          "placeholder_text": "Search by External Bag ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Shipment ID",
          "value": "external_shipment_id",
          "placeholder_text": "Search by External Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Channel Shipment ID",
          "value": "channel_shipment_id",
          "placeholder_text": "Search by Channel Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Invoice",
          "value": "invoice_id",
          "placeholder_text": "Search by Invoice",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "AWB",
          "value": "awb_no",
          "placeholder_text": "Search by AWB",
          "min_search_size": 10,
          "show_ui": true
        },
        {
          "text": "SKU",
          "value": "sku",
          "placeholder_text": "Search by SKU",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "EAN",
          "value": "ean",
          "placeholder_text": "Search by EAN",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "ALU",
          "value": "alu",
          "placeholder_text": "Search by ALU",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "UPC",
          "value": "upc",
          "placeholder_text": "Search by UPC",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Registered Phone",
          "value": "registered_phone",
          "placeholder_text": "Search by Customer Registered Phone",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Name",
          "value": "name",
          "placeholder_text": "Search by Customer Name",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Phone",
          "value": "phone",
          "placeholder_text": "Search by Customer Phone",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Email",
          "value": "email",
          "placeholder_text": "Search by Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "Return ID",
          "value": "return_id",
          "placeholder_text": "Search by Return ID",
          "min_search_size": 5,
          "show_ui": true
        }
      ]
    }
  ],
  "advance": {
    "Unfulfilled": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Assigning DP",
            "value": "assigning_dp"
          },
          {
            "text": "Packed",
            "value": "bag_packed"
          },
          {
            "text": "Invoiced",
            "value": "bag_invoiced"
          },
          {
            "text": "Cancelled At DP",
            "value": "cancelled_at_dp"
          },
          {
            "text": "Not Picked",
            "value": "bag_not_picked"
          },
          {
            "text": "Placed",
            "value": "placed"
          },
          {
            "text": "Verified",
            "value": "bag_verified"
          },
          {
            "text": "Store Reassigned",
            "value": "store_reassigned"
          },
          {
            "text": "DP Assigned",
            "value": "dp_assigned"
          },
          {
            "text": "Ready For DP Assignment",
            "value": "ready_for_dp_assignment"
          },
          {
            "text": "Out For Pickup",
            "value": "out_for_pickup"
          },
          {
            "text": "DP Not Assigned",
            "value": "dp_not_assigned"
          },
          {
            "text": "Confirmed",
            "value": "bag_confirmed"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "Processed": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Delivered",
            "value": "delivery_done"
          },
          {
            "text": "Return Request Rejected",
            "value": "return_request_cancelled"
          },
          {
            "text": "Cancelled Operations",
            "value": "cancelled_operations"
          },
          {
            "text": "Out for Delivery",
            "value": "out_for_delivery"
          },
          {
            "text": "Delivery Attempt Failed",
            "value": "delivery_attempt_failed"
          },
          {
            "text": "Handed Over To DG",
            "value": "handed_over_to_dg"
          },
          {
            "text": "Handed Over To Customer",
            "value": "handed_over_to_customer"
          },
          {
            "text": "Cancelled Seller",
            "value": "cancelled_seller"
          },
          {
            "text": "Cancelled Customer",
            "value": "cancelled_customer"
          },
          {
            "text": "Rejected By Customer",
            "value": "rejected_by_customer"
          },
          {
            "text": "Return Requested",
            "value": "return_pre_qc"
          },
          {
            "text": "Refund Without Return",
            "value": "refund_without_return"
          },
          {
            "text": "Cancelled",
            "value": "cancelled_fynd"
          },
          {
            "text": "Lost",
            "value": "bag_lost"
          },
          {
            "text": "Picked",
            "value": "bag_picked"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "Return": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Rto In Transit",
            "value": "rto_in_transit"
          },
          {
            "text": "Return DP Out For Pickup",
            "value": "return_dp_out_for_pickup"
          },
          {
            "text": "Return Cancelled Failed At DP",
            "value": "return_cancelled_failed_at_dp"
          },
          {
            "text": "Return Lost",
            "value": "return_bag_lost"
          },
          {
            "text": "Credit Note Generated",
            "value": "credit_note_generated"
          },
          {
            "text": "Return Initiated",
            "value": "return_initiated"
          },
          {
            "text": "Return Packed",
            "value": "return_bag_packed"
          },
          {
            "text": "Rto Out For Delivery",
            "value": "rto_bag_out_for_delivery"
          },
          {
            "text": "Return Not Picked",
            "value": "return_bag_not_picked"
          },
          {
            "text": "Return Rejected By DP",
            "value": "return_rejected_by_dp"
          },
          {
            "text": "Assigning_return DP",
            "value": "assigning_return_dp"
          },
          {
            "text": "Return To Origin",
            "value": "return_to_origin"
          },
          {
            "text": "Return DP Assigned",
            "value": "return_dp_assigned"
          },
          {
            "text": "Return Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Return Out For Delivery",
            "value": "return_bag_out_for_delivery"
          },
          {
            "text": "Return DP Not Assigned",
            "value": "return_dp_not_assigned"
          },
          {
            "text": "Return Picked",
            "value": "return_bag_picked"
          },
          {
            "text": "Return Completed",
            "value": "return_completed"
          },
          {
            "text": "Return DP Cancelled",
            "value": "return_dp_cancelled"
          },
          {
            "text": "Rto Accepted",
            "value": "rto_bag_accepted"
          },
          {
            "text": "Return Cancelled At DP",
            "value": "return_cancelled_at_dp"
          },
          {
            "text": "Return Assigning DP",
            "value": "return_assigning_dp"
          },
          {
            "text": "Deadstock",
            "value": "deadstock"
          },
          {
            "text": "Rto Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "Return In Transit",
            "value": "return_bag_in_transit"
          },
          {
            "text": "Return Not Delivered",
            "value": "return_bag_not_delivered"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "ActionCentre": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Placed",
            "value": "placed"
          },
          {
            "text": "Bag Confirmed",
            "value": "bag_confirmed"
          },
          {
            "text": "Bag Invoiced",
            "value": "bag_invoiced"
          },
          {
            "text": "DP Assigned",
            "value": "dp_assigned"
          },
          {
            "text": "DP Not Assigned",
            "value": "dp_not_assigned"
          },
          {
            "text": "Assigning DP",
            "value": "assigning_dp"
          },
          {
            "text": "Bag Picked",
            "value": "bag_picked"
          },
          {
            "text": "Out for delivery",
            "value": "out_for_delivery"
          },
          {
            "text": "Handed Over To Dg",
            "value": "handed_over_to_dg"
          },
          {
            "text": "Bag Lost",
            "value": "bag_lost"
          },
          {
            "text": "Rejected By Customer",
            "value": "rejected_by_customer"
          },
          {
            "text": "Delivery Attempt Failed",
            "value": "delivery_attempt_failed"
          },
          {
            "text": "Delivered",
            "value": "delivery_done"
          },
          {
            "text": "Return Request Cancelled",
            "value": "return_request_cancelled"
          },
          {
            "text": "Handed over to customer",
            "value": "handed_over_to_customer"
          },
          {
            "text": "Refund without Return",
            "value": "refund_without_return"
          },
          {
            "text": "Return Initiated",
            "value": "return_initiated"
          },
          {
            "text": "RTO Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "Return DP Assigned",
            "value": "return_dp_assigned"
          },
          {
            "text": "Return Rejected By DP",
            "value": "return_rejected_by_dp"
          },
          {
            "text": "Return Bag Picked",
            "value": "return_bag_picked"
          },
          {
            "text": "Return Bag Out for Delivery",
            "value": "return_bag_out_for_delivery"
          },
          {
            "text": "Return DP not Assigned",
            "value": "return_dp_not_assigned"
          },
          {
            "text": "Return Bag Not Delivered",
            "value": "return_bag_not_delivered"
          },
          {
            "text": "Return To Origin",
            "value": "return_to_origin"
          },
          {
            "text": "RTO In Transit",
            "value": "rto_in_transit"
          },
          {
            "text": "Return Bag In Transit",
            "value": "return_bag_in_transit"
          },
          {
            "text": "Return DP Cancelled",
            "value": "return_dp_cancelled"
          },
          {
            "text": "Return Bag Lost",
            "value": "return_bag_lost"
          },
          {
            "text": "Assigning DP Return",
            "value": "assigning_return_dp"
          },
          {
            "text": "Return Cancelled At DP",
            "value": "return_cancelled_at_dp"
          },
          {
            "text": "Return DP Out for Pickup",
            "value": "return_dp_out_for_pickup"
          },
          {
            "text": "Return Cancelled Failed at DP",
            "value": "return_cancelled_failed_at_dp"
          },
          {
            "text": "RTO Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "RTO Bag Out for Delivery",
            "value": "rto_bag_out_for_delivery"
          },
          {
            "text": "Return Assigning DP",
            "value": "return_assigning_dp"
          },
          {
            "text": "Return Bag Packed",
            "value": "return_bag_packed"
          },
          {
            "text": "Return Bag Not Picked",
            "value": "return_bag_not_picked"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          },
          {
            "text": "Return Completed",
            "value": "refund_initiated"
          },
          {
            "text": "Return Rejected By Store",
            "value": "return_rejected_by_store"
          },
          {
            "text": "Return Bag Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Rto Bag Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Bag Accepted",
            "value": "rto_bag_accepted"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          },
          {
            "text": "Return Completed",
            "value": "refund_initiated"
          },
          {
            "text": "Return Rejected By Store",
            "value": "return_rejected_by_store"
          },
          {
            "text": "Return Bag Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Rto Bag Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Bag Accepted",
            "value": "rto_bag_accepted"
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ]
  },
  "advance_filter": {
    "unfulfilled": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Assigning DP",
            "value": "assigning_dp"
          },
          {
            "text": "Packed",
            "value": "bag_packed"
          },
          {
            "text": "Invoiced",
            "value": "bag_invoiced"
          },
          {
            "text": "Cancelled At DP",
            "value": "cancelled_at_dp"
          },
          {
            "text": "Not Picked",
            "value": "bag_not_picked"
          },
          {
            "text": "Placed",
            "value": "placed"
          },
          {
            "text": "Verified",
            "value": "bag_verified"
          },
          {
            "text": "Store Reassigned",
            "value": "store_reassigned"
          },
          {
            "text": "DP Assigned",
            "value": "dp_assigned"
          },
          {
            "text": "Ready For DP Assignment",
            "value": "ready_for_dp_assignment"
          },
          {
            "text": "Out For Pickup",
            "value": "out_for_pickup"
          },
          {
            "text": "DP Not Assigned",
            "value": "dp_not_assigned"
          },
          {
            "text": "Confirmed",
            "value": "bag_confirmed"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "processed": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Delivered",
            "value": "delivery_done"
          },
          {
            "text": "Return Request Rejected",
            "value": "return_request_cancelled"
          },
          {
            "text": "Cancelled Operations",
            "value": "cancelled_operations"
          },
          {
            "text": "Out for Delivery",
            "value": "out_for_delivery"
          },
          {
            "text": "Delivery Attempt Failed",
            "value": "delivery_attempt_failed"
          },
          {
            "text": "Handed Over To DG",
            "value": "handed_over_to_dg"
          },
          {
            "text": "Handed Over To Customer",
            "value": "handed_over_to_customer"
          },
          {
            "text": "Cancelled Seller",
            "value": "cancelled_seller"
          },
          {
            "text": "Cancelled Customer",
            "value": "cancelled_customer"
          },
          {
            "text": "Rejected By Customer",
            "value": "rejected_by_customer"
          },
          {
            "text": "Return Requested",
            "value": "return_pre_qc"
          },
          {
            "text": "Refund Without Return",
            "value": "refund_without_return"
          },
          {
            "text": "Cancelled",
            "value": "cancelled_fynd"
          },
          {
            "text": "Lost",
            "value": "bag_lost"
          },
          {
            "text": "Picked",
            "value": "bag_picked"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "returned": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Rto In Transit",
            "value": "rto_in_transit"
          },
          {
            "text": "Return DP Out For Pickup",
            "value": "return_dp_out_for_pickup"
          },
          {
            "text": "Return Cancelled Failed At DP",
            "value": "return_cancelled_failed_at_dp"
          },
          {
            "text": "Return Lost",
            "value": "return_bag_lost"
          },
          {
            "text": "Credit Note Generated",
            "value": "credit_note_generated"
          },
          {
            "text": "Return Initiated",
            "value": "return_initiated"
          },
          {
            "text": "Return Packed",
            "value": "return_bag_packed"
          },
          {
            "text": "Rto Out For Delivery",
            "value": "rto_bag_out_for_delivery"
          },
          {
            "text": "Return Not Picked",
            "value": "return_bag_not_picked"
          },
          {
            "text": "Return Rejected By DP",
            "value": "return_rejected_by_dp"
          },
          {
            "text": "Assigning_return DP",
            "value": "assigning_return_dp"
          },
          {
            "text": "Return To Origin",
            "value": "return_to_origin"
          },
          {
            "text": "Return DP Assigned",
            "value": "return_dp_assigned"
          },
          {
            "text": "Return Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Return Out For Delivery",
            "value": "return_bag_out_for_delivery"
          },
          {
            "text": "Return DP Not Assigned",
            "value": "return_dp_not_assigned"
          },
          {
            "text": "Return Picked",
            "value": "return_bag_picked"
          },
          {
            "text": "Return Completed",
            "value": "return_completed"
          },
          {
            "text": "Return DP Cancelled",
            "value": "return_dp_cancelled"
          },
          {
            "text": "Rto Accepted",
            "value": "rto_bag_accepted"
          },
          {
            "text": "Return Cancelled At DP",
            "value": "return_cancelled_at_dp"
          },
          {
            "text": "Return Assigning DP",
            "value": "return_assigning_dp"
          },
          {
            "text": "Deadstock",
            "value": "deadstock"
          },
          {
            "text": "Rto Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "Return In Transit",
            "value": "return_bag_in_transit"
          },
          {
            "text": "Return Not Delivered",
            "value": "return_bag_not_delivered"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "placeholder_text": "Select time to dispatch",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "action_centre": [
      {
        "text": "Tags",
        "value": "tags",
        "type": "multi_select",
        "placeholder_text": "Select tags",
        "required": false,
        "options": []
      },
      {
        "text": "Sales Channel",
        "value": "sales_channels",
        "placeholder_text": "Select sales channels",
        "type": "multi_select",
        "required": false,
        "options": []
      },
      {
        "text": "Delivery Partner",
        "value": "dp_ids",
        "type": "multi_select",
        "placeholder_text": "Select delivery partners",
        "required": true,
        "options": []
      },
      {
        "text": "Shipment Status",
        "value": "bag_status",
        "type": "multi_select",
        "options": [
          {
            "text": "Placed",
            "value": "placed"
          },
          {
            "text": "Bag Confirmed",
            "value": "bag_confirmed"
          },
          {
            "text": "Bag Invoiced",
            "value": "bag_invoiced"
          },
          {
            "text": "DP Assigned",
            "value": "dp_assigned"
          },
          {
            "text": "DP Not Assigned",
            "value": "dp_not_assigned"
          },
          {
            "text": "Assigning DP",
            "value": "assigning_dp"
          },
          {
            "text": "Bag Picked",
            "value": "bag_picked"
          },
          {
            "text": "Out for delivery",
            "value": "out_for_delivery"
          },
          {
            "text": "Handed Over To Dg",
            "value": "handed_over_to_dg"
          },
          {
            "text": "Bag Lost",
            "value": "bag_lost"
          },
          {
            "text": "Rejected By Customer",
            "value": "rejected_by_customer"
          },
          {
            "text": "Delivery Attempt Failed",
            "value": "delivery_attempt_failed"
          },
          {
            "text": "Delivered",
            "value": "delivery_done"
          },
          {
            "text": "Return Request Cancelled",
            "value": "return_request_cancelled"
          },
          {
            "text": "Handed over to customer",
            "value": "handed_over_to_customer"
          },
          {
            "text": "Refund without Return",
            "value": "refund_without_return"
          },
          {
            "text": "Return Initiated",
            "value": "return_initiated"
          },
          {
            "text": "RTO Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "Return DP Assigned",
            "value": "return_dp_assigned"
          },
          {
            "text": "Return Rejected By DP",
            "value": "return_rejected_by_dp"
          },
          {
            "text": "Return Bag Picked",
            "value": "return_bag_picked"
          },
          {
            "text": "Return Bag Out for Delivery",
            "value": "return_bag_out_for_delivery"
          },
          {
            "text": "Return DP not Assigned",
            "value": "return_dp_not_assigned"
          },
          {
            "text": "Return Bag Not Delivered",
            "value": "return_bag_not_delivered"
          },
          {
            "text": "Return To Origin",
            "value": "return_to_origin"
          },
          {
            "text": "RTO In Transit",
            "value": "rto_in_transit"
          },
          {
            "text": "Return Bag In Transit",
            "value": "return_bag_in_transit"
          },
          {
            "text": "Return DP Cancelled",
            "value": "return_dp_cancelled"
          },
          {
            "text": "Return Bag Lost",
            "value": "return_bag_lost"
          },
          {
            "text": "Assigning DP Return",
            "value": "assigning_return_dp"
          },
          {
            "text": "Return Cancelled At DP",
            "value": "return_cancelled_at_dp"
          },
          {
            "text": "Return DP Out for Pickup",
            "value": "return_dp_out_for_pickup"
          },
          {
            "text": "Return Cancelled Failed at DP",
            "value": "return_cancelled_failed_at_dp"
          },
          {
            "text": "RTO Initiated",
            "value": "rto_initiated"
          },
          {
            "text": "RTO Bag Out for Delivery",
            "value": "rto_bag_out_for_delivery"
          },
          {
            "text": "Return Assigning DP",
            "value": "return_assigning_dp"
          },
          {
            "text": "Return Bag Packed",
            "value": "return_bag_packed"
          },
          {
            "text": "Return Bag Not Picked",
            "value": "return_bag_not_picked"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          },
          {
            "text": "Return Completed",
            "value": "refund_initiated"
          },
          {
            "text": "Return Rejected By Store",
            "value": "return_rejected_by_store"
          },
          {
            "text": "Return Bag Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Rto Bag Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Bag Accepted",
            "value": "rto_bag_accepted"
          },
          {
            "text": "Return Accepted",
            "value": "return_accepted"
          },
          {
            "text": "Return Completed",
            "value": "refund_initiated"
          },
          {
            "text": "Return Rejected By Store",
            "value": "return_rejected_by_store"
          },
          {
            "text": "Return Bag Delivered",
            "value": "return_bag_delivered"
          },
          {
            "text": "Rto Bag Delivered",
            "value": "rto_bag_delivered"
          },
          {
            "text": "Rto Bag Accepted",
            "value": "rto_bag_accepted"
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "placeholder_text": "Select payment methods",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ]
  },
  "global_filter": [
    {
      "text": "Fulfilling Stores",
      "value": "stores",
      "type": "single_select",
      "options": null
    },
    {
      "text": "Search Types",
      "value": "search_type",
      "type": "single_select",
      "options": [
        {
          "text": "Auto",
          "value": "auto",
          "placeholder_text": "Search by Shipment ID, Order ID or Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "Shipment ID",
          "value": "shipment_id",
          "placeholder_text": "Search by Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Bag ID",
          "value": "bag_id",
          "placeholder_text": "Search by Bag ID",
          "min_search_size": 4,
          "show_ui": true
        },
        {
          "text": "Order ID",
          "value": "order_id",
          "placeholder_text": "Search by Order ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Order ID",
          "value": "external_order_id",
          "placeholder_text": "Search by External Order ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Bag ID",
          "value": "external_bag_id",
          "placeholder_text": "Search by External Bag ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "External Shipment ID",
          "value": "external_shipment_id",
          "placeholder_text": "Search by External Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Channel Shipment ID",
          "value": "channel_shipment_id",
          "placeholder_text": "Search by Channel Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Invoice",
          "value": "invoice_id",
          "placeholder_text": "Search by Invoice",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "AWB",
          "value": "awb_no",
          "placeholder_text": "Search by AWB",
          "min_search_size": 10,
          "show_ui": true
        },
        {
          "text": "SKU",
          "value": "sku",
          "placeholder_text": "Search by SKU",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "EAN",
          "value": "ean",
          "placeholder_text": "Search by EAN",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "ALU",
          "value": "alu",
          "placeholder_text": "Search by ALU",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "UPC",
          "value": "upc",
          "placeholder_text": "Search by UPC",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Registered Phone",
          "value": "registered_phone",
          "placeholder_text": "Search by Customer Registered Phone",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Name",
          "value": "name",
          "placeholder_text": "Search by Customer Name",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Phone",
          "value": "phone",
          "placeholder_text": "Search by Customer Phone",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Email",
          "value": "email",
          "placeholder_text": "Search by Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "Return ID",
          "value": "return_id",
          "placeholder_text": "Search by Return ID",
          "min_search_size": 5,
          "show_ui": true
        }
      ]
    }
  ]
}
```
</details>









---


### createShipmentReport





```java
platformClient.order.createShipmentReport( fromDate,  toDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[Success](#Success)

We have accepted report generation request.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getReportsShipmentListing





```java
platformClient.order.getReportsShipmentListing( pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |  





*Returned Response:*




[OmsReports](#OmsReports)

We have are getting the info.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertJioCode





```java
platformClient.order.upsertJioCode(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [JioCodeUpsertPayload](#JioCodeUpsertPayload) | yes | Request body |




*Returned Response:*




[JioCodeUpsertResponse](#JioCodeUpsertResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkShipmentExcelFile





```java
platformClient.order.getBulkShipmentExcelFile( salesChannels,  dpIds,  fromDate,  toDate,  stores,  tags,  bagStatus,  paymentMethods,  fileType,  timeToDispatch,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of company |   
| salesChannels | String? | no | Comma seperated values of sales channel ids |   
| dpIds | String? | no | Comma seperated values of delivery partner ids |   
| fromDate | String? | no | Start Date in DD-MM-YYYY format |   
| toDate | String? | no | End Date in DD-MM-YYYY format |   
| stores | String? | no | Comma seperated values of store ids |   
| tags | String? | no | Comma seperated values of tags |   
| bagStatus | String? | no | Comma seperated values of bag statuses |   
| paymentMethods | String? | no | Comma seperated values of payment methods |   
| fileType | String? | no | File type to be downloaded |   
| timeToDispatch | Integer? | no | Sla breached or not breached |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |  





*Returned Response:*




[FileResponse](#FileResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "file_name": "placed_352_1668856953.7936668.xlsx",
  "operation": "putObject",
  "size": 13245,
  "namespace": "misc",
  "content_type": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
  "file_path": "/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx",
  "method": "PUT",
  "tags": [],
  "upload": {
    "url": "https://fynd-staging-assets.s3-accelerate.amazonaws.com/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx?Content-Type=application%2Fvnd.openxmlformats-officedocument.spreadsheetml.sheet&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJUADR2WMPQT6ZJ2Q%2F20221119%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221119T112233Z&X-Amz-Expires=1800&X-Amz-Signature=3408400dbe95ff12d0ea5487846aab74b0f2ae6963a58ac980fb46c11cd0b7be&X-Amz-SignedHeaders=host%3Bx-amz-acl&x-amz-acl=public-read",
    "expiry": 1800
  },
  "cdn": {
    "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx"
  }
}
```
</details>









---


### getBulkActionTemplate





```java
platformClient.order.getBulkActionTemplate() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of company |  





*Returned Response:*




[BulkActionTemplateResponse](#BulkActionTemplateResponse)

Slug names




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "template_x_slug": [
    {
      "text": "Partial Cancellation",
      "value": "PARTIAL_CANCELLATION"
    }
  ]
}
```
</details>









---


### downloadBulkActionTemplate





```java
platformClient.order.downloadBulkActionTemplate( templateSlug) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Id of company |   
| templateSlug | String? | no | Slug name of template to be downloaded |  





*Returned Response:*




[FileResponse](#FileResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "file_name": "placed_352_1668856953.7936668.xlsx",
  "operation": "putObject",
  "size": 13245,
  "namespace": "misc",
  "content_type": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
  "file_path": "/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx",
  "method": "PUT",
  "tags": [],
  "upload": {
    "url": "https://fynd-staging-assets.s3-accelerate.amazonaws.com/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx?Content-Type=application%2Fvnd.openxmlformats-officedocument.spreadsheetml.sheet&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJUADR2WMPQT6ZJ2Q%2F20221119%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221119T112233Z&X-Amz-Expires=1800&X-Amz-Signature=3408400dbe95ff12d0ea5487846aab74b0f2ae6963a58ac980fb46c11cd0b7be&X-Amz-SignedHeaders=host%3Bx-amz-acl&x-amz-acl=public-read",
    "expiry": 1800
  },
  "cdn": {
    "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx"
  }
}
```
</details>









---


### getShipmentReasons
Get reasons behind full or partial cancellation of a shipment




```java
platformClient.order.getShipmentReasons( shipmentId,  bagId,  state) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| shipmentId | String | yes | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| bagId | String | yes | ID of the bag. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| state | String | yes | State for which reasons are required. |  



Use this API to retrieve the issues that led to the cancellation of bags within a shipment.

*Returned Response:*




[PlatformShipmentReasonsResponse](#PlatformShipmentReasonsResponse)

Success. Check the example shown below or refer `PlatformShipmentReasonsResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "reasons": [
    {
      "id": 84,
      "display_name": "Not Available to accept the Order",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 85,
      "display_name": "Store Bulk Order",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 86,
      "display_name": "Cancelled due to delayed delivery",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 87,
      "display_name": "Others",
      "qc_type": [],
      "question_set": []
    }
  ]
}
```
</details>









---


### getBagById





```java
platformClient.order.getBagById( bagId,  channelBagId,  channelId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| bagId | String? | no |  |   
| channelBagId | String? | no |  |   
| channelId | String? | no |  |  





*Returned Response:*




[BagDetailsPlatformResponse](#BagDetailsPlatformResponse)

Successfully retrived shipment details!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBags





```java
platformClient.order.getBags( bagIds,  shipmentIds,  orderIds,  channelBagIds,  channelShipmentIds,  channelOrderIds,  channelId,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| bagIds | String? | no |  |   
| shipmentIds | String? | no |  |   
| orderIds | String? | no |  |   
| channelBagIds | String? | no |  |   
| channelShipmentIds | String? | no |  |   
| channelOrderIds | String? | no |  |   
| channelId | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |  





*Returned Response:*




[GetBagsPlatformResponse](#GetBagsPlatformResponse)

Successfully retrived all the given shipments details!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### generatePOSReceiptByOrderId





```java
platformClient.order.generatePOSReceiptByOrderId( orderId,  documentType) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| orderId | String | yes |  |   
| documentType | String? | no |  |  





*Returned Response:*




[GeneratePosOrderReceiptResponse](#GeneratePosOrderReceiptResponse)

We are processing the request!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### invalidateShipmentCache





```java
platformClient.order.invalidateShipmentCache(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload) | yes | Request body |


Invalidate shipment Cache

*Returned Response:*




[InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

Successfully updated shipment cache!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "response": [
    {
      "message": "Shipment sync initiated",
      "status": 200,
      "shipment_id": "16838049724111283577",
      "error": ""
    },
    {
      "message": "Cannot update cache if shipment in pending, payment_failed or awaiting_payment_confirmation",
      "status": 400,
      "shipment_id": "16836368409661507353",
      "error": ""
    },
    {
      "message": "Problem while deleting the cache",
      "status": 500,
      "shipment_id": "16838049724111283577",
      "error": "Internal Exception"
    }
  ]
}
```
</details>









---


### reassignLocation





```java
platformClient.order.reassignLocation(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [StoreReassign](#StoreReassign) | yes | Request body |


Reassign Location

*Returned Response:*




[StoreReassignResponse](#StoreReassignResponse)

Successfully reassigned location!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateShipmentLock





```java
platformClient.order.updateShipmentLock(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [UpdateShipmentLockPayload](#UpdateShipmentLockPayload) | yes | Request body |


update shipment/bag lock and check status

*Returned Response:*




[UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

Successfully update the Lock and get check status of the shipment/Bag




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "shipments checked successfully",
  "check_response": [
    {
      "bags": [
        {
          "bag_id": 175644,
          "is_locked": false,
          "affiliate_bag_id": "def134",
          "affiliate_order_id": "def134"
        }
      ],
      "lock_status": "complete",
      "is_bag_locked": false,
      "is_shipment_locked": true,
      "shipment_id": "16189206454951802898",
      "affiliate_id": "5c764a6534add21972ef7b08",
      "affiliate_shipment_id": "def134",
      "original_filter": {
        "shipment_id": "16189206454951802898"
      },
      "status": "dp_assigned"
    }
  ]
}
```
</details>









---


### getAnnouncements





```java
platformClient.order.getAnnouncements( date) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| date | String? | no | Date On which the announcement is Active (Date should in ISO Datetime format IST Time) |  





*Returned Response:*




[AnnouncementsResponse](#AnnouncementsResponse)

Announcements retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateAddress





```java
platformClient.order.updateAddress( shipmentId,  name,  address,  addressType,  pincode,  phone,  email,  landmark,  addressCategory,  city,  state,  country) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | String | yes |  |   
| name | String? | no |  |   
| address | String? | no |  |   
| addressType | String? | no |  |   
| pincode | String? | no |  |   
| phone | String? | no |  |   
| email | String? | no |  |   
| landmark | String? | no |  |   
| addressCategory | String | yes |  |   
| city | String? | no |  |   
| state | String? | no |  |   
| country | String? | no |  |   
| companyId | Integer | yes |  |  





*Returned Response:*




[BaseResponse](#BaseResponse)

Update Address will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### click2Call





```java
platformClient.order.click2Call( caller,  receiver,  bagId,  callerId,  method) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| caller | String | yes | Call Number |   
| receiver | String | yes | Receiver Number |   
| bagId | String | yes | Bag Id for the query |   
| callerId | String? | no | Caller Id |   
| method | String? | no | Provider Method to Call |   
| companyId | Integer | yes | Company Id |  





*Returned Response:*




[Click2CallResponse](#Click2CallResponse)

Process call on request!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "call_id": "c2c_646b00bc-984c-4c10-bb8d-0e850a1e0022"
}
```
</details>









---


### updateShipmentStatus





```java
platformClient.order.updateShipmentStatus(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | company id from where are transitioning the shipment state or data |  
| body | [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest) | yes | Request body |


This API is for Shipment State transition or Shipment data update or both below example is for partial state transition with data update

*Returned Response:*




[UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

NOTE success response can contains success and failed result as well




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "statuses": [
    {
      "shipments": [
        {
          "status": 200,
          "final_state": {
            "bag_confirmed": "bag_confirmed",
            "shipment_id": "16836279770211860494"
          },
          "identifier": "16836279770211860494"
        }
      ]
    },
    {
      "shipments": [
        {
          "status": 400,
          "message": "Invalid State Transition bag_confirmed detected for given entity",
          "code": null,
          "exception": "ValidationError",
          "stack_trace": null,
          "meta": null,
          "identifier": "16836279770211860494"
        }
      ]
    }
  ]
}
```
</details>









---


### processManifest





```java
platformClient.order.processManifest(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### dispatchManifest





```java
platformClient.order.dispatchManifest(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [DispatchManifest](#DispatchManifest) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Shipment Dispatched mapped with manifest!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRoleBasedActions





```java
platformClient.order.getRoleBasedActions() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  





*Returned Response:*




[GetActionsResponse](#GetActionsResponse)

You will get an array of actions allowed for that particular user based on their role




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "permissions": [
    {
      "slug": "create_invoice_s3",
      "display_text": "Create Invoice (s3)",
      "id": 2,
      "description": "Create Invoice (s3)"
    },
    {
      "slug": "call",
      "display_text": "Call",
      "id": 3,
      "description": "Call"
    }
  ]
}
```
</details>









---


### postShipmentHistory





```java
platformClient.order.postShipmentHistory(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [PostShipmentHistory](#PostShipmentHistory) | yes | Request body |




*Returned Response:*




[ShipmentHistoryResponse](#ShipmentHistoryResponse)

It shows the journey of the shipment!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "activity_history": [
    {
      "message": {
        "message": "Bag status changed to pending",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    },
    {
      "message": {
        "message": "Bag status changed to placed",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    }
  ],
  "success": true
}
```
</details>









---


### getShipmentHistory





```java
platformClient.order.getShipmentHistory( shipmentId,  bagId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id |   
| shipmentId | String? | no | Shipment Id |   
| bagId | Integer? | no | Bag/Product Id |  





*Returned Response:*




[ShipmentHistoryResponse](#ShipmentHistoryResponse)

It shows the journey of the shipment!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "activity_history": [
    {
      "message": {
        "message": "Bag status changed to pending",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    },
    {
      "message": {
        "message": "Bag status changed to placed",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    }
  ]
}
```
</details>









---


### sendSmsNinja





```java
platformClient.order.sendSmsNinja(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes | Company Id |  
| body | [SendSmsPayload](#SendSmsPayload) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Sms Sent successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "message": "Successfully emitted aldaviz-delayed-shipment-event"
}
```
</details>









---


### updatePackagingDimensions





```java
platformClient.order.updatePackagingDimensions(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createOrder





```java
platformClient.order.createOrder(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [CreateOrderAPI](#CreateOrderAPI) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Successfully created an order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createChannelConfig





```java
platformClient.order.createChannelConfig(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [CreateChannelConfigData](#CreateChannelConfigData) | yes | Request body |


createChannelConfig

*Returned Response:*




[CreateChannelConfigResponse](#CreateChannelConfigResponse)

Successfully updateShipmentStatus!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "acknowledged": true,
    "is_upserted": false,
    "is_inserted": false
  }
}
```
</details>









---


### getChannelConfig





```java
platformClient.order.getChannelConfig() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  



getChannelConfig

*Returned Response:*




[CreateChannelConfigData](#CreateChannelConfigData)

Successfully created the config data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "config_data": {
    "payment_info": {
      "payment_methods": [
        {
          "mode": "COD",
          "collect_by": "gringotts",
          "refund_by": "gringotts"
        }
      ],
      "source": "fynd",
      "mode_of_payment": "COD"
    },
    "dp_configuration": {
      "shipping_by": "fynd"
    },
    "logo_url": {},
    "location_reassignment": false,
    "lock_states": [
      "bag_packed"
    ],
    "shipment_assignment": "16703096324891701814"
  }
}
```
</details>









---


### uploadConsent





```java
platformClient.order.uploadConsent(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [UploadConsent](#UploadConsent) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Successful Manifest upload!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### orderUpdate





```java
platformClient.order.orderUpdate(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [PlatformOrderUpdate](#PlatformOrderUpdate) | yes | Request body |




*Returned Response:*




[ResponseDetail](#ResponseDetail)

We are processing the order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### checkOrderStatus





```java
platformClient.order.checkOrderStatus(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  
| body | [OrderStatus](#OrderStatus) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Order Status retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getStateTransitionMap





```java
platformClient.order.getStateTransitionMap() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  





*Returned Response:*




[BagStateTransitionMap](#BagStateTransitionMap)

State Transition Mapping, for next possible state




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "fynd": {
    "placed": [
      "bag_not_confirmed",
      "cancelled_customer",
      "cancelled_fynd",
      "bag_confirmed",
      "store_reassigned"
    ],
    "bag_confirmed": [
      "handed_over_to_customer",
      "bag_invoiced"
    ],
    "dp_assigned": [
      "handed_over_to_customer",
      "bag_packed"
    ],
    "bag_packed": [
      "bag_not_picked",
      "cancelled_customer"
    ],
    "handed_over_to_dg": [
      "cancelled_at_dp",
      "credit_note_generated"
    ],
    "out_for_delivery": [
      "delivery_done"
    ],
    "delivery_done": [
      "bag_lost",
      "return_initiated"
    ],
    "return_initiated": [
      "return_accepted"
    ],
    "bag_picked": [
      "refund_completed",
      "out_for_delivery",
      "delivery_done"
    ],
    "pending": [
      "pending",
      "placed",
      "payment_failed",
      "manual_refund"
    ],
    "payment_failed": [
      "awaiting_payment_confirmation",
      "placed",
      "manual_refund"
    ],
    "return_pre_qc": [
      "return_initiated",
      "return_request_cancelled",
      "manual_refund"
    ],
    "bag_not_packed": [
      "manual_refund"
    ],
    "bag_rescheduled": [
      "manual_refund"
    ],
    "fluid_state": [
      "manual_refund"
    ],
    "handed_over_to_customer": [
      "manual_refund",
      "return_initiated"
    ],
    "hold": [
      "manual_refund"
    ],
    "product_not_available": [
      "manual_refund"
    ],
    "qc_fail": [
      "manual_refund"
    ],
    "qc_pass": [
      "manual_refund"
    ],
    "refund_done": [
      "manual_refund"
    ],
    "refund_processing": [
      "manual_refund"
    ],
    "return_assigning_dp": [
      "manual_refund"
    ],
    "return_bag_packed": [
      "manual_refund"
    ],
    "return_dp_cancelled": [
      "manual_refund"
    ],
    "unhold": [
      "manual_refund"
    ],
    "web_store_rescheduled": [
      "manual_refund"
    ],
    "credit_note_cancelled": [
      "refund_initiated"
    ]
  },
  "affiliate": {
    "placed": [
      "bag_not_confirmed",
      "store_reassigned",
      "product_not_available"
    ],
    "store_reassigned": [
      "bag_not_confirmed"
    ],
    "bag_confirmed": [
      "bag_invoiced",
      "cancelled_fynd"
    ],
    "dp_assigned": [
      "bag_packed"
    ],
    "pending": [
      "payment_failed",
      "placed",
      "manual_refund"
    ],
    "ready_for_dp_assignment": [
      "dp_assigned"
    ],
    "credit_note_generated": [
      "refund_pending",
      "refund_initiated"
    ],
    "assigning_return_dp": [
      "manual_refund"
    ],
    "bag_not_packed": [
      "manual_refund"
    ],
    "bag_rescheduled": [
      "manual_refund"
    ],
    "fluid_state": [
      "manual_refund"
    ],
    "handed_over_to_customer": [
      "manual_refund",
      "return_initiated"
    ],
    "hold": [
      "manual_refund"
    ],
    "product_not_available": [
      "manual_refund"
    ],
    "qc_fail": [
      "manual_refund"
    ],
    "qc_pass": [
      "manual_refund"
    ],
    "refund_done": [
      "manual_refund"
    ],
    "refund_processing": [
      "manual_refund"
    ],
    "return_assigning_dp": [
      "manual_refund"
    ],
    "return_bag_packed": [
      "manual_refund"
    ],
    "return_dp_cancelled": [
      "manual_refund"
    ],
    "unhold": [
      "manual_refund"
    ],
    "web_store_rescheduled": [
      "manual_refund"
    ],
    "credit_note_cancelled": [
      "refund_initiated"
    ]
  }
}
```
</details>









---



### Schemas

 
 
 #### [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | String? |  yes  |  |
 | brandStoreTags | String? |  yes  |  |
 | address | String? |  yes  |  |
 | city | String? |  yes  |  |
 | locationType | String? |  yes  |  |
 | storeEmail | String? |  yes  |  |
 | name | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | fulfillingStoreId | Integer |  no  |  |
 | code | String |  no  |  |
 | state | String? |  yes  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponValue | Double? |  yes  |  |
 | refundCredit | Double? |  yes  |  |
 | transferPrice | Double? |  yes  |  |
 | cashbackApplied | Double? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | codCharges | Double? |  yes  |  |
 | promotionEffectiveDiscount | Double? |  yes  |  |
 | amountPaidRoundoff | Double? |  yes  |  |
 | brandCalculatedAmount | Double? |  yes  |  |
 | taxCollectedAtSource | Double? |  yes  |  |
 | pmPriceSplit | Double? |  yes  |  |
 | giftPrice | Double? |  yes  |  |
 | fyndCredits | Double? |  yes  |  |
 | couponEffectiveDiscount | Double? |  yes  |  |
 | amountPaid | Double? |  yes  |  |
 | priceMarked | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | valueOfGood | Double? |  yes  |  |
 | refundAmount | Double? |  yes  |  |
 | cashback | Double? |  yes  |  |
 | deliveryCharge | Double? |  yes  |  |

---


 
 
 #### [PlatformDeliveryAddress](#PlatformDeliveryAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String? |  yes  |  |
 | longitude | Integer? |  yes  |  |
 | address1 | String? |  yes  |  |
 | country | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | city | String? |  yes  |  |
 | area | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | email | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | latitude | Integer? |  yes  |  |
 | version | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | addressCategory | String? |  yes  |  |
 | state | String? |  yes  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | bagList | ArrayList<String>? |  yes  |  |
 | title | String |  no  |  |
 | shipmentStatusId | Integer? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | currentShipmentStatus | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | statusCreatedAt | String? |  yes  |  |

---


 
 
 #### [ShipmentTags](#ShipmentTags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String? |  yes  |  |
 | displayText | String? |  yes  |  |
 | slug | String? |  yes  |  |

---


 
 
 #### [Formatted](#Formatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fMax | String? |  yes  |  |
 | fMin | String? |  yes  |  |

---


 
 
 #### [ShipmentTimeStamp](#ShipmentTimeStamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tMax | String? |  yes  |  |
 | tMin | String? |  yes  |  |

---


 
 
 #### [LockData](#LockData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mto | Boolean? |  yes  |  |
 | lockMessage | String? |  yes  |  |
 | locked | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentItemMeta](#ShipmentItemMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentWeight | Double? |  yes  |  |
 | tags | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | shipmentTags | ArrayList<[ShipmentTags](#ShipmentTags)>? |  yes  |  |
 | packagingName | String? |  yes  |  |
 | orderType | String? |  yes  |  |
 | parentDpId | String? |  yes  |  |
 | activityComment | String? |  yes  |  |
 | sla | Double? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | autoTriggerDpAssignmentAcf | Boolean? |  yes  |  |
 | isInternational | Boolean? |  yes  |  |
 | debugInfo | HashMap<String,Object>? |  yes  |  |
 | dpSortKey | String? |  yes  |  |
 | formatted | [Formatted](#Formatted)? |  yes  |  |
 | dpOptions | HashMap<String,Object>? |  yes  |  |
 | shipmentVolumetricWeight | Double? |  yes  |  |
 | pdfMedia | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | storeInvoiceUpdatedDate | String? |  yes  |  |
 | bagWeight | HashMap<String,Object>? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |
 | timestamp | [ShipmentTimeStamp](#ShipmentTimeStamp)? |  yes  |  |
 | shippingZone | String? |  yes  |  |
 | external | HashMap<String,Object>? |  yes  |  |
 | lockData | [LockData](#LockData)? |  yes  |  |
 | weight | Double? |  yes  |  |
 | shipmentChargeableWeight | Double? |  yes  |  |
 | ewaybillInfo | HashMap<String,Object>? |  yes  |  |
 | existingDpList | ArrayList<String>? |  yes  |  |
 | sameStoreAvailable | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentListingChannel](#ShipmentListingChannel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | isAffiliate | Boolean? |  yes  |  |
 | channelShipmentId | String? |  yes  |  |

---


 
 
 #### [BagReturnableCancelableStatus](#BagReturnableCancelableStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | upc | String? |  yes  |  |
 | alu | String? |  yes  |  |
 | skuCode | String? |  yes  |  |
 | isbn | String? |  yes  |  |
 | ean | String? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | [Identifier](#Identifier) |  no  |  |
 | gstTaxPercentage | Integer |  no  |  |
 | couponValue | Double |  no  |  |
 | refundCredit | Integer |  no  |  |
 | transferPrice | Integer |  no  |  |
 | cashbackApplied | Integer |  no  |  |
 | priceEffective | Integer |  no  |  |
 | codCharges | Integer |  no  |  |
 | totalUnits | Integer |  no  |  |
 | gstFee | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | amountPaidRoundoff | Integer? |  yes  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | size | String |  no  |  |
 | fyndCredits | Integer |  no  |  |
 | gstTag | String |  no  |  |
 | couponEffectiveDiscount | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | discount | Integer |  no  |  |
 | priceMarked | Integer |  no  |  |
 | valueOfGood | Double |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | cashback | Integer |  no  |  |
 | itemName | String |  no  |  |
 | deliveryCharge | Integer |  no  |  |
 | hsnCode | String |  no  |  |

---


 
 
 #### [BagStateMapper](#BagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stateType | String |  no  |  |
 | displayName | String |  no  |  |
 | bsId | Integer |  no  |  |
 | appFacing | Boolean? |  yes  |  |
 | appStateName | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | journeyType | String |  no  |  |
 | name | String |  no  |  |
 | notifyCustomer | Boolean? |  yes  |  |
 | appDisplayName | String? |  yes  |  |

---


 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | stateType | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | kafkaSync | Boolean? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | deliveryAwbNumber | String? |  yes  |  |
 | stateId | Integer? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper)? |  yes  |  |
 | reasons | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | bshId | Integer? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | appDisplayName | String? |  yes  |  |
 | deliveryPartnerId | Integer? |  yes  |  |
 | forward | Boolean? |  yes  |  |

---


 
 
 #### [Dates](#Dates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderCreated | String? |  yes  |  |
 | deliveryDate | String? |  yes  |  |

---


 
 
 #### [PlatformArticleAttributes](#PlatformArticleAttributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currency | String? |  yes  |  |

---


 
 
 #### [PlatformItem](#PlatformItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | branchUrl | String? |  yes  |  |
 | id | Integer? |  yes  |  |
 | l3Category | Integer? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | code | String? |  yes  |  |
 | attributes | [PlatformArticleAttributes](#PlatformArticleAttributes)? |  yes  |  |
 | brandId | Integer? |  yes  |  |
 | l2Category | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | slugKey | String? |  yes  |  |
 | l3CategoryName | String? |  yes  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | departmentId | Integer? |  yes  |  |
 | size | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | lastUpdatedAt | String? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |
 | brand | String? |  yes  |  |
 | images | ArrayList<String>? |  yes  |  |
 | color | String? |  yes  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  |  |
 | unit | String? |  yes  |  |
 | time | Integer? |  yes  |  |

---


 
 
 #### [Dimensions](#Dimensions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  |  |
 | height | Double? |  yes  |  |
 | width | Double? |  yes  |  |
 | unit | String? |  yes  |  |
 | length | Double? |  yes  |  |

---


 
 
 #### [Weight](#Weight)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  |  |
 | unit | String? |  yes  |  |
 | shipping | Integer? |  yes  |  |

---


 
 
 #### [Article](#Article)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifiers | HashMap<String,Object> |  no  |  |
 | espModified | Boolean? |  yes  |  |
 | rawMeta | String? |  yes  |  |
 | aSet | HashMap<String,Object>? |  yes  |  |
 | returnConfig | [ReturnConfig](#ReturnConfig)? |  yes  |  |
 | currency | HashMap<String,Object>? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | size | String |  no  |  |
 | dimensions | [Dimensions](#Dimensions)? |  yes  |  |
 | id | String |  no  |  |
 | weight | [Weight](#Weight)? |  yes  |  |
 | code | String? |  yes  |  |
 | childDetails | HashMap<String,Object>? |  yes  |  |
 | sellerIdentifier | String |  no  |  |
 | uid | String |  no  |  |

---


 
 
 #### [ReplacementDetails](#ReplacementDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | originalAffiliateOrderId | String? |  yes  |  |
 | replacementType | String? |  yes  |  |

---


 
 
 #### [AffiliateMeta](#AffiliateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | replacementDetails | [ReplacementDetails](#ReplacementDetails)? |  yes  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | channelShipmentId | String? |  yes  |  |
 | sizeLevelTotalQty | Integer? |  yes  |  |
 | marketplaceInvoiceId | String? |  yes  |  |
 | couponCode | String? |  yes  |  |
 | boxType | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | channelOrderId | String? |  yes  |  |
 | orderItemId | String? |  yes  |  |
 | employeeDiscount | Double? |  yes  |  |
 | isPriority | Boolean? |  yes  |  |
 | quantity | Integer? |  yes  |  |

---


 
 
 #### [AffiliateBagDetails](#AffiliateBagDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String |  no  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | affiliateOrderId | String |  no  |  |
 | affiliateMeta | [AffiliateMeta](#AffiliateMeta) |  no  |  |
 | employeeDiscount | Double? |  yes  |  |

---


 
 
 #### [GSTDetailsData](#GSTDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hsnCode | String? |  yes  |  |
 | cgstGstFee | String? |  yes  |  |
 | gstTaxPercentage | Double? |  yes  |  |
 | gstFee | Double |  no  |  |
 | igstTaxPercentage | Double? |  yes  |  |
 | valueOfGood | Double |  no  |  |
 | sgstTaxPercentage | Double? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | igstGstFee | String? |  yes  |  |
 | sgstGstFee | String? |  yes  |  |
 | cgstTaxPercentage | Double? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | gstinCode | String |  no  |  |
 | hsnCodeId | String? |  yes  |  |
 | taxCollectedAtSource | Double |  no  |  |

---


 
 
 #### [ShipmentListingBrand](#ShipmentListingBrand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | logoBase64 | String? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [BagReturnableCancelableStatus](#BagReturnableCancelableStatus) |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)> |  no  |  |
 | entityType | String? |  yes  |  |
 | bagExpiryDate | String? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | currentStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | dates | [Dates](#Dates)? |  yes  |  |
 | item | [PlatformItem](#PlatformItem)? |  yes  |  |
 | bagType | String? |  yes  |  |
 | article | [Article](#Article)? |  yes  |  |
 | affiliateBagDetails | [AffiliateBagDetails](#AffiliateBagDetails)? |  yes  |  |
 | lineNumber | Integer? |  yes  |  |
 | size | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | gst | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | displayName | String? |  yes  |  |
 | brand | [ShipmentListingBrand](#ShipmentListingBrand)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | productQuantity | Integer |  no  |  |
 | currentOperationalStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | bagStatus | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | reasons | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | mobile | String? |  yes  |  |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | isAnonymousUser | Boolean? |  yes  |  |
 | avisUserId | String? |  yes  |  |
 | uid | Integer? |  yes  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | canProcess | Boolean? |  yes  |  |
 | fulfillingStore | [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | invoiceId | String? |  yes  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress)? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | statusCreatedAt | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | orderingChannnel | String? |  yes  |  |
 | orderId | String |  no  |  |
 | previousShipmentId | String? |  yes  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | estimatedSlaTime | String? |  yes  |  |
 | totalBags | Integer |  no  |  |
 | customerNote | String? |  yes  |  |
 | meta | [ShipmentItemMeta](#ShipmentItemMeta)? |  yes  |  |
 | channel | [ShipmentListingChannel](#ShipmentListingChannel)? |  yes  |  |
 | orderDate | String? |  yes  |  |
 | lockStatus | Boolean? |  yes  |  |
 | displayName | String? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | shipmentCreatedAt | String |  no  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | paymentMethods | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean? |  yes  |  |
 | type | String? |  yes  |  |
 | total | Integer? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | size | Integer? |  yes  |  |
 | current | Integer? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | totalCount | Integer? |  yes  |  |
 | lane | String? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | bagList | ArrayList<String>? |  yes  |  |
 | displayName | String? |  yes  |  |
 | id | Integer? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String |  no  |  |
 | storeName | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | id | Integer |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | meta | HashMap<String,Object> |  no  |  |
 | code | String |  no  |  |
 | state | String |  no  |  |

---


 
 
 #### [DebugInfo](#DebugInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stormbreakerUuid | String? |  yes  |  |

---


 
 
 #### [BuyerDetails](#BuyerDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | Integer |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | name | String |  no  |  |
 | ajioSiteId | String? |  yes  |  |
 | gstin | String |  no  |  |
 | state | String |  no  |  |

---


 
 
 #### [EinvoiceInfo](#EinvoiceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | creditNote | HashMap<String,Object>? |  yes  |  |
 | invoice | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ShipmentMeta](#ShipmentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentWeight | Double? |  yes  |  |
 | shipmentTags | ArrayList<[ShipmentTags](#ShipmentTags)>? |  yes  |  |
 | packagingName | String? |  yes  |  |
 | returnAwbNumber | String? |  yes  |  |
 | dpId | String? |  yes  |  |
 | returnStoreNode | Integer? |  yes  |  |
 | orderType | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | returnAffiliateOrderId | String? |  yes  |  |
 | parentDpId | String? |  yes  |  |
 | b2CBuyerDetails | HashMap<String,Object>? |  yes  |  |
 | marketplaceStoreId | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | autoTriggerDpAssignmentAcf | Boolean |  no  |  |
 | debugInfo | [DebugInfo](#DebugInfo)? |  yes  |  |
 | dpSortKey | String? |  yes  |  |
 | forwardAffiliateShipmentId | String? |  yes  |  |
 | formatted | [Formatted](#Formatted)? |  yes  |  |
 | dpOptions | HashMap<String,Object>? |  yes  |  |
 | returnDetails | HashMap<String,Object>? |  yes  |  |
 | shipmentVolumetricWeight | Double? |  yes  |  |
 | forwardAffiliateOrderId | String? |  yes  |  |
 | storeInvoiceUpdatedDate | String? |  yes  |  |
 | awbNumber | String? |  yes  |  |
 | bagWeight | HashMap<String,Object>? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |
 | timestamp | [ShipmentTimeStamp](#ShipmentTimeStamp)? |  yes  |  |
 | boxType | String? |  yes  |  |
 | b2BBuyerDetails | [BuyerDetails](#BuyerDetails)? |  yes  |  |
 | external | HashMap<String,Object>? |  yes  |  |
 | returnAffiliateShipmentId | String? |  yes  |  |
 | lockData | [LockData](#LockData)? |  yes  |  |
 | weight | Integer |  no  |  |
 | dimension | [Dimensions](#Dimensions)? |  yes  |  |
 | ewaybillInfo | HashMap<String,Object>? |  yes  |  |
 | dpName | String? |  yes  |  |
 | poNumber | String? |  yes  |  |
 | sameStoreAvailable | Boolean |  no  |  |
 | einvoiceInfo | [EinvoiceInfo](#EinvoiceInfo)? |  yes  |  |

---


 
 
 #### [PDFLinks](#PDFLinks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | b2B | String? |  yes  |  |
 | poInvoice | String? |  yes  |  |
 | deliveryChallanA4 | String? |  yes  |  |
 | invoicePos | String? |  yes  |  |
 | label | String? |  yes  |  |
 | labelA6 | String? |  yes  |  |
 | creditNoteUrl | String? |  yes  |  |
 | invoice | String? |  yes  |  |
 | invoiceType | String |  no  |  |
 | labelA4 | String? |  yes  |  |
 | labelType | String |  no  |  |
 | labelPos | String? |  yes  |  |
 | invoiceA6 | String? |  yes  |  |
 | invoiceA4 | String? |  yes  |  |

---


 
 
 #### [AffiliateDetails](#AffiliateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String |  no  |  |
 | affiliateOrderId | String |  no  |  |
 | shipmentMeta | [ShipmentMeta](#ShipmentMeta) |  no  |  |
 | companyAffiliateTag | String? |  yes  |  |
 | pdfLinks | [PDFLinks](#PDFLinks)? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | affiliateMeta | [AffiliateMeta](#AffiliateMeta) |  no  |  |
 | adId | String? |  yes  |  |
 | affiliateStoreId | String |  no  |  |
 | affiliateShipmentId | String |  no  |  |

---


 
 
 #### [DPDetailsData](#DPDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackUrl | String? |  yes  |  |
 | country | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | id | Integer? |  yes  |  |
 | name | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderValue | String? |  yes  |  |
 | codCharges | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | source | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | orderingChannelLogo | HashMap<String,Object>? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | orderDate | String? |  yes  |  |
 | taxDetails | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [InvoiceInfo](#InvoiceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | labelUrl | String? |  yes  |  |
 | invoiceUrl | String? |  yes  |  |
 | updatedDate | String? |  yes  |  |
 | creditNoteId | String? |  yes  |  |
 | storeInvoiceId | String? |  yes  |  |
 | externalInvoiceId | String? |  yes  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |
 | source | String? |  yes  |  |
 | mode | String? |  yes  |  |

---


 
 
 #### [OrderingStoreDetails](#OrderingStoreDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String |  no  |  |
 | storeName | String |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | meta | HashMap<String,Object> |  no  |  |
 | state | String |  no  |  |
 | code | String |  no  |  |
 | orderingStoreId | Integer |  no  |  |

---


 
 
 #### [PhoneDetails](#PhoneDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobileNumber | String? |  yes  |  |
 | countryCode | Integer? |  yes  |  |

---


 
 
 #### [ContactDetails](#ContactDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | emails | ArrayList<String>? |  yes  |  |
 | phone | ArrayList<[PhoneDetails](#PhoneDetails)>? |  yes  |  |

---


 
 
 #### [CompanyDetails](#CompanyDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyName | String? |  yes  |  |
 | companyCin | String? |  yes  |  |
 | companyContact | [ContactDetails](#ContactDetails)? |  yes  |  |
 | address | HashMap<String,Object>? |  yes  |  |
 | companyGst | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | address1 | String? |  yes  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | address | String |  no  |  |
 | city | String |  no  |  |
 | area | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | name | String |  no  |  |
 | email | String? |  yes  |  |
 | phone | String |  no  |  |
 | addressType | String? |  yes  |  |
 | state | String |  no  |  |

---


 
 
 #### [ShipmentDetails](#ShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lockStatus | Boolean? |  yes  |  |
 | actionToStatus | HashMap<String,Object>? |  yes  |  |
 | lockMessage | String? |  yes  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | isPassed | Boolean? |  yes  |  |
 | text | String |  no  |  |
 | isCurrent | Boolean? |  yes  |  |
 | time | String? |  yes  |  |

---


 
 
 #### [ItemCriterias](#ItemCriterias)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemBrand | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [BuyRules](#BuyRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCriteria | [ItemCriterias](#ItemCriterias)? |  yes  |  |
 | cartConditions | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DiscountRules](#DiscountRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | value | Integer? |  yes  |  |

---


 
 
 #### [AppliedPromos](#AppliedPromos)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articleQuantity | Integer? |  yes  |  |
 | promotionName | String? |  yes  |  |
 | buyRules | ArrayList<[BuyRules](#BuyRules)>? |  yes  |  |
 | amount | Double? |  yes  |  |
 | promotionType | String? |  yes  |  |
 | mrpPromotion | Boolean? |  yes  |  |
 | discountRules | ArrayList<[DiscountRules](#DiscountRules)>? |  yes  |  |
 | promoId | String? |  yes  |  |

---


 
 
 #### [CurrentStatus](#CurrentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stateType | String? |  yes  |  |
 | status | String? |  yes  |  |
 | kafkaSync | Boolean? |  yes  |  |
 | storeId | Integer? |  yes  |  |
 | deliveryAwbNumber | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | stateId | Integer? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | currentStatusId | Integer |  no  |  |
 | updatedAt | String? |  yes  |  |
 | deliveryPartnerId | Integer? |  yes  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cgstGstFee | String? |  yes  |  |
 | gstTaxPercentage | Integer? |  yes  |  |
 | gstFee | Double? |  yes  |  |
 | igstTaxPercentage | Double? |  yes  |  |
 | valueOfGood | Double? |  yes  |  |
 | sgstTaxPercentage | Double? |  yes  |  |
 | taxCollectedAtSource | Double? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | brandCalculatedAmount | Double? |  yes  |  |
 | igstGstFee | String? |  yes  |  |
 | sgstGstFee | String? |  yes  |  |
 | cgstTaxPercentage | Double? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | hsnCodeId | String? |  yes  |  |
 | hsnCode | String? |  yes  |  |

---


 
 
 #### [ReturnConfig1](#ReturnConfig1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  |  |
 | unit | String? |  yes  |  |
 | time | Double? |  yes  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnConfig | [ReturnConfig1](#ReturnConfig1)? |  yes  |  |
 | identifiers | HashMap<String,Object>? |  yes  |  |
 | size | String? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [AffiliateBagsDetails](#AffiliateBagsDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | couponCode | String? |  yes  |  |
 | affiliateBagId | String? |  yes  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |

---


 
 
 #### [GiftCard](#GiftCard)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | giftMessage | String? |  yes  |  |
 | isGiftApplied | Boolean? |  yes  |  |
 | displayText | String? |  yes  |  |
 | giftPrice | Integer? |  yes  |  |

---


 
 
 #### [B2BPODetails](#B2BPODetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | poLineAmount | Double? |  yes  |  |
 | poTaxAmount | Double? |  yes  |  |
 | itemBasePrice | Double? |  yes  |  |
 | totalGstPercentage | Double? |  yes  |  |
 | partialCanRet | Boolean? |  yes  |  |
 | dockerNumber | String? |  yes  |  |

---


 
 
 #### [BagMeta](#BagMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | giftCard | [GiftCard](#GiftCard)? |  yes  |  |
 | b2BPoDetails | [B2BPODetails](#B2BPODetails)? |  yes  |  |
 | customJson | HashMap<String,Object>? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | partialCanRet | Boolean? |  yes  |  |
 | groupId | String? |  yes  |  |
 | customMessage | String? |  yes  |  |
 | docketNumber | String? |  yes  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandName | String? |  yes  |  |
 | id | Integer |  no  |  |
 | company | String |  no  |  |
 | logo | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | modifiedOn | String? |  yes  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | prices | [Prices](#Prices)? |  yes  |  |
 | appliedPromos | ArrayList<[AppliedPromos](#AppliedPromos)>? |  yes  |  |
 | financialBreakup | [FinancialBreakup](#FinancialBreakup)? |  yes  |  |
 | entityType | String? |  yes  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress)? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | currentStatus | [CurrentStatus](#CurrentStatus)? |  yes  |  |
 | item | [PlatformItem](#PlatformItem)? |  yes  |  |
 | identifier | String? |  yes  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | affiliateBagDetails | [AffiliateBagsDetails](#AffiliateBagsDetails)? |  yes  |  |
 | parentPromoBags | HashMap<String,Object>? |  yes  |  |
 | lineNumber | Integer? |  yes  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | meta | [BagMeta](#BagMeta)? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | groupId | String? |  yes  |  |
 | quantity | Integer? |  yes  |  |

---


 
 
 #### [PlatformShipment](#PlatformShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | coupon | HashMap<String,Object>? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | invoiceId | String? |  yes  |  |
 | dpAssignment | Boolean? |  yes  |  |
 | shipmentId | String |  no  |  |
 | affiliateDetails | [AffiliateDetails](#AffiliateDetails)? |  yes  |  |
 | dpDetails | [DPDetailsData](#DPDetailsData)? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | customMessage | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | customMeta | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | invoice | [InvoiceInfo](#InvoiceInfo)? |  yes  |  |
 | isDpAssignEnabled | Boolean? |  yes  |  |
 | operationalStatus | String? |  yes  |  |
 | vertical | String? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | shipmentStatus | String? |  yes  |  |
 | orderingStore | [OrderingStoreDetails](#OrderingStoreDetails)? |  yes  |  |
 | pickedDate | String? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | estimatedSlaTime | String? |  yes  |  |
 | totalBags | Integer? |  yes  |  |
 | gstDetails | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | totalItems | Integer? |  yes  |  |
 | fulfilmentPriority | Integer? |  yes  |  |
 | canUpdateDimension | Boolean? |  yes  |  |
 | packagingType | String? |  yes  |  |
 | companyDetails | [CompanyDetails](#CompanyDetails)? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | meta | [ShipmentMeta](#ShipmentMeta)? |  yes  |  |
 | forwardShipmentId | String? |  yes  |  |
 | userAgent | String? |  yes  |  |
 | shipmentDetails | [ShipmentDetails](#ShipmentDetails)? |  yes  |  |
 | deliverySlot | HashMap<String,Object>? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | enableDpTracking | Boolean? |  yes  |  |
 | lockStatus | Boolean? |  yes  |  |
 | platformLogo | String? |  yes  |  |
 | bags | ArrayList<[OrderBags](#OrderBags)>? |  yes  |  |
 | shipmentCreatedAt | String? |  yes  |  |
 | journeyType | String? |  yes  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | shipmentQuantity | Integer? |  yes  |  |
 | paymentMethods | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ShipmentInfoResponse](#ShipmentInfoResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)>? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [AssetByShipment](#AssetByShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | assets | HashMap<String,String>? |  yes  |  |
 | shipmentId | String |  no  |  |
 | expiresIn | String |  no  |  |

---


 
 
 #### [ResponseGetAssetShipment](#ResponseGetAssetShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | presignedType | String |  no  |  |
 | result | ArrayList<[AssetByShipment](#AssetByShipment)> |  no  |  |

---


 
 
 #### [BillingStaffDetails](#BillingStaffDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | firstName | String? |  yes  |  |
 | staffId | Integer? |  yes  |  |
 | employeeCode | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | user | String? |  yes  |  |

---


 
 
 #### [TransactionData](#TransactionData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | amountPaid | Double? |  yes  |  |
 | paymentId | String? |  yes  |  |
 | terminalId | String? |  yes  |  |
 | entity | String? |  yes  |  |
 | transactionId | String? |  yes  |  |
 | uniqueReferenceNumber | String? |  yes  |  |
 | currency | String? |  yes  |  |

---


 
 
 #### [PlatformUserDetails](#PlatformUserDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | platformUserFirstName | String? |  yes  |  |
 | platformUserId | String? |  yes  |  |
 | platformUserLastName | String? |  yes  |  |
 | platformUserEmployeeCode | String? |  yes  |  |

---


 
 
 #### [OrderMeta](#OrderMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | billingStaffDetails | [BillingStaffDetails](#BillingStaffDetails)? |  yes  |  |
 | orderPlatform | String? |  yes  |  |
 | orderType | String? |  yes  |  |
 | paymentType | String? |  yes  |  |
 | transactionData | [TransactionData](#TransactionData)? |  yes  |  |
 | companyLogo | String? |  yes  |  |
 | currencySymbol | String? |  yes  |  |
 | orderingStore | Integer? |  yes  |  |
 | mongoCartId | Integer? |  yes  |  |
 | orderTags | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | orderChildEntities | ArrayList<String>? |  yes  |  |
 | platformUserDetails | [PlatformUserDetails](#PlatformUserDetails)? |  yes  |  |
 | employeeId | Integer? |  yes  |  |
 | staff | HashMap<String,Object>? |  yes  |  |
 | customerNote | String? |  yes  |  |
 | files | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | comment | String? |  yes  |  |
 | extraMeta | HashMap<String,Object>? |  yes  |  |
 | cartId | Integer? |  yes  |  |

---


 
 
 #### [TaxDetails](#TaxDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String? |  yes  |  |
 | panNo | String? |  yes  |  |

---


 
 
 #### [OrderDict](#OrderDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | prices | [Prices](#Prices)? |  yes  |  |
 | meta | [OrderMeta](#OrderMeta)? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | orderDate | String |  no  |  |
 | paymentMethods | HashMap<String,Object>? |  yes  |  |
 | taxDetails | [TaxDetails](#TaxDetails)? |  yes  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)>? |  yes  |  |
 | order | [OrderDict](#OrderDict)? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalItems | Integer? |  yes  |  |
 | value | String? |  yes  |  |
 | text | String? |  yes  |  |
 | index | Integer? |  yes  |  |
 | actions | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalItems | Integer? |  yes  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |
 | text | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [PlatformBreakupValues](#PlatformBreakupValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | display | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [PlatformChannel](#PlatformChannel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [PlatformOrderItems](#PlatformOrderItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderValue | Double? |  yes  |  |
 | totalOrderValue | Double? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | orderCreatedTime | String? |  yes  |  |
 | orderId | String? |  yes  |  |
 | breakupValues | ArrayList<[PlatformBreakupValues](#PlatformBreakupValues)>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | channel | [PlatformChannel](#PlatformChannel)? |  yes  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)>? |  yes  |  |
 | userInfo | [UserDataInfo](#UserDataInfo)? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |
 | totalCount | Integer? |  yes  |  |
 | lane | String? |  yes  |  |
 | items | ArrayList<[PlatformOrderItems](#PlatformOrderItems)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [Options](#Options)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | value | Integer? |  yes  |  |

---


 
 
 #### [MetricsCount](#MetricsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | key | String |  no  |  |
 | options | ArrayList<[Options](#Options)>? |  yes  |  |
 | text | String |  no  |  |
 | value | Integer |  no  |  |

---


 
 
 #### [MetricCountResponse](#MetricCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[MetricsCount](#MetricsCount)>? |  yes  |  |

---


 
 
 #### [PlatformTrack](#PlatformTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | awb | String? |  yes  |  |
 | status | String? |  yes  |  |
 | reason | String? |  yes  |  |
 | shipmentType | String? |  yes  |  |
 | rawStatus | String? |  yes  |  |
 | accountName | String? |  yes  |  |
 | updatedTime | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | lastLocationRecievedAt | String? |  yes  |  |

---


 
 
 #### [PlatformShipmentTrack](#PlatformShipmentTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object>? |  yes  |  |
 | results | ArrayList<[PlatformTrack](#PlatformTrack)>? |  yes  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Object? |  yes  |  |
 | showUi | Boolean? |  yes  |  |
 | text | String |  no  |  |
 | name | String? |  yes  |  |
 | placeholderText | String? |  yes  |  |
 | minSearchSize | Integer? |  yes  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |
 | text | String |  no  |  |
 | type | String |  no  |  |
 | required | Boolean? |  yes  |  |
 | placeholderText | String? |  yes  |  |

---


 
 
 #### [AdvanceFilterInfo](#AdvanceFilterInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | processed | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | appliedFilters | HashMap<String,Object>? |  yes  |  |
 | unfulfilled | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | page | HashMap<String,Object>? |  yes  |  |
 | actionCentre | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | returned | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---


 
 
 #### [FiltersResponse](#FiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | advanceFilter | [AdvanceFilterInfo](#AdvanceFilterInfo)? |  yes  |  |
 | globalFilter | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---


 
 
 #### [Success](#Success)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [OmsReports](#OmsReports)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | reportRequestedAt | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | reportId | String? |  yes  |  |
 | reportType | String? |  yes  |  |
 | reportCreatedAt | String? |  yes  |  |
 | s3Key | String? |  yes  |  |
 | requestDetails | HashMap<String,Object>? |  yes  |  |
 | reportName | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertDataSet](#JioCodeUpsertDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | String? |  yes  |  |
 | articleId | String? |  yes  |  |
 | jioCode | String? |  yes  |  |
 | itemId | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertPayload](#JioCodeUpsertPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[JioCodeUpsertDataSet](#JioCodeUpsertDataSet)>? |  yes  |  |

---


 
 
 #### [NestedErrorSchemaDataSet](#NestedErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertResponse](#JioCodeUpsertResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | error | ArrayList<[NestedErrorSchemaDataSet](#NestedErrorSchemaDataSet)>? |  yes  |  |
 | data | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | traceId | String? |  yes  |  |
 | identifier | String? |  yes  |  |

---


 
 
 #### [FileUploadResponse](#FileUploadResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | expiry | Integer? |  yes  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [URL](#URL)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |

---


 
 
 #### [FileResponse](#FileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String>? |  yes  |  |
 | filePath | String? |  yes  |  |
 | namespace | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | upload | [FileUploadResponse](#FileUploadResponse)? |  yes  |  |
 | contentType | String? |  yes  |  |
 | method | String? |  yes  |  |
 | size | Integer? |  yes  |  |
 | operation | String? |  yes  |  |
 | cdn | [URL](#URL)? |  yes  |  |

---


 
 
 #### [BulkActionTemplate](#BulkActionTemplate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | text | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [BulkActionTemplateResponse](#BulkActionTemplateResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | templateXSlug | ArrayList<[BulkActionTemplate](#BulkActionTemplate)>? |  yes  |  |

---


 
 
 #### [QuestionSet](#QuestionSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String? |  yes  |  |
 | id | Integer? |  yes  |  |

---


 
 
 #### [Reason](#Reason)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | qcType | ArrayList<String>? |  yes  |  |
 | questionSet | ArrayList<[QuestionSet](#QuestionSet)>? |  yes  |  |
 | displayName | String? |  yes  |  |
 | id | Integer? |  yes  |  |

---


 
 
 #### [PlatformShipmentReasonsResponse](#PlatformShipmentReasonsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reasons | ArrayList<[Reason](#Reason)>? |  yes  |  |

---


 
 
 #### [BagReturnableCancelableStatus1](#BagReturnableCancelableStatus1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |

---


 
 
 #### [Attributes](#Attributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandName | String? |  yes  |  |
 | primaryMaterial | String? |  yes  |  |
 | marketerAddress | String? |  yes  |  |
 | gender | ArrayList<String>? |  yes  |  |
 | name | String? |  yes  |  |
 | marketerName | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | essential | String? |  yes  |  |
 | primaryColorHex | String? |  yes  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | branchUrl | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | l3Category | Integer? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | l1CategoryId | Integer? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | code | String? |  yes  |  |
 | l2CategoryId | Integer? |  yes  |  |
 | attributes | [Attributes](#Attributes) |  no  |  |
 | brandId | Integer |  no  |  |
 | l2Category | ArrayList<String>? |  yes  |  |
 | name | String |  no  |  |
 | itemId | Integer |  no  |  |
 | slugKey | String |  no  |  |
 | l3CategoryName | String? |  yes  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | departmentId | Integer? |  yes  |  |
 | size | String |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | webstoreProductUrl | String? |  yes  |  |
 | lastUpdatedAt | String? |  yes  |  |
 | image | ArrayList<String> |  no  |  |
 | brand | String |  no  |  |
 | color | String? |  yes  |  |

---


 
 
 #### [StoreAddress](#StoreAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String |  no  |  |
 | longitude | Double |  no  |  |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | updatedAt | String |  no  |  |
 | country | String |  no  |  |
 | pincode | Integer |  no  |  |
 | area | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | email | String? |  yes  |  |
 | createdAt | String |  no  |  |
 | version | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | address1 | String |  no  |  |
 | countryCode | String |  no  |  |
 | addressType | String |  no  |  |
 | latitude | Double |  no  |  |
 | addressCategory | String |  no  |  |
 | state | String |  no  |  |

---


 
 
 #### [StoreEinvoice](#StoreEinvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | user | String? |  yes  |  |
 | enabled | Boolean |  no  |  |
 | password | String? |  yes  |  |

---


 
 
 #### [StoreEwaybill](#StoreEwaybill)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [StoreGstCredentials](#StoreGstCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eInvoice | [StoreEinvoice](#StoreEinvoice)? |  yes  |  |
 | eWaybill | [StoreEwaybill](#StoreEwaybill)? |  yes  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dsType | String |  no  |  |
 | value | String |  no  |  |
 | legalName | String |  no  |  |
 | url | String? |  yes  |  |
 | verified | Boolean |  no  |  |

---


 
 
 #### [StoreDocuments](#StoreDocuments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst | [Document](#Document)? |  yes  |  |

---


 
 
 #### [EInvoicePortalDetails](#EInvoicePortalDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | user | String? |  yes  |  |
 | password | String? |  yes  |  |

---


 
 
 #### [StoreMeta](#StoreMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String |  no  |  |
 | gstCredentials | [StoreGstCredentials](#StoreGstCredentials) |  no  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | additionalContactDetails | HashMap<String,Object>? |  yes  |  |
 | documents | [StoreDocuments](#StoreDocuments)? |  yes  |  |
 | gstNumber | String? |  yes  |  |
 | stage | String |  no  |  |
 | productReturnConfig | HashMap<String,Object>? |  yes  |  |
 | timing | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | einvoicePortalDetails | [EInvoicePortalDetails](#EInvoicePortalDetails)? |  yes  |  |
 | ewaybillPortalDetails | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Store](#Store)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | contactPerson | String |  no  |  |
 | longitude | Double |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | isEnabledForRecon | Boolean? |  yes  |  |
 | mallArea | String? |  yes  |  |
 | city | String |  no  |  |
 | locationType | String |  no  |  |
 | phone | Integer |  no  |  |
 | isArchived | Boolean? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | code | String? |  yes  |  |
 | storeAddressJson | [StoreAddress](#StoreAddress)? |  yes  |  |
 | packagingMaterialCount | Integer? |  yes  |  |
 | brandId | Object? |  yes  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | name | String |  no  |  |
 | address2 | String? |  yes  |  |
 | orderIntegrationId | String? |  yes  |  |
 | alohomoraUserId | Integer? |  yes  |  |
 | parentStoreId | Integer? |  yes  |  |
 | sId | String |  no  |  |
 | vatNo | String? |  yes  |  |
 | brandStoreTags | ArrayList<String>? |  yes  |  |
 | storeEmail | String |  no  |  |
 | createdAt | String |  no  |  |
 | meta | [StoreMeta](#StoreMeta) |  no  |  |
 | companyId | Integer |  no  |  |
 | address1 | String |  no  |  |
 | isActive | Boolean? |  yes  |  |
 | mallName | String? |  yes  |  |
 | storeActiveFrom | String? |  yes  |  |
 | latitude | Double |  no  |  |
 | state | String |  no  |  |
 | loginUsername | String |  no  |  |

---


 
 
 #### [BagGSTDetails](#BagGSTDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cgstGstFee | String |  no  |  |
 | gstTaxPercentage | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | igstTaxPercentage | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | sgstTaxPercentage | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | igstGstFee | String |  no  |  |
 | sgstGstFee | String |  no  |  |
 | cgstTaxPercentage | Double |  no  |  |
 | gstTag | String |  no  |  |
 | gstinCode | String? |  yes  |  |
 | hsnCodeId | String |  no  |  |
 | hsnCode | String |  no  |  |

---


 
 
 #### [ArticleDetails](#ArticleDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoicePrefix | String? |  yes  |  |
 | brandId | Integer |  no  |  |
 | creditNoteExpiryDays | Integer? |  yes  |  |
 | brandName | String |  no  |  |
 | scriptLastRan | String? |  yes  |  |
 | creditNoteAllowed | Boolean? |  yes  |  |
 | company | String |  no  |  |
 | logo | String? |  yes  |  |
 | isVirtualInvoice | Boolean? |  yes  |  |
 | createdOn | Integer? |  yes  |  |
 | pickupLocation | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | modifiedOn | Integer? |  yes  |  |

---


 
 
 #### [BagDetailsPlatformResponse](#BagDetailsPlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | [BagReturnableCancelableStatus1](#BagReturnableCancelableStatus1) |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | bagStatusHistory | [BagStatusHistory](#BagStatusHistory)? |  yes  |  |
 | restorePromos | HashMap<String,Object>? |  yes  |  |
 | appliedPromos | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | prices | [Prices](#Prices) |  no  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)> |  no  |  |
 | entityType | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | affiliateDetails | [AffiliateDetails](#AffiliateDetails)? |  yes  |  |
 | originalBagList | ArrayList<Integer>? |  yes  |  |
 | bagUpdateTime | Double? |  yes  |  |
 | currentStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | dates | [Dates](#Dates)? |  yes  |  |
 | item | [Item](#Item) |  no  |  |
 | identifier | String? |  yes  |  |
 | operationalStatus | String? |  yes  |  |
 | orderingStore | [Store](#Store)? |  yes  |  |
 | orderIntegrationId | String? |  yes  |  |
 | bId | Integer |  no  |  |
 | gstDetails | [BagGSTDetails](#BagGSTDetails) |  no  |  |
 | bType | String? |  yes  |  |
 | article | [Article](#Article) |  no  |  |
 | affiliateBagDetails | [AffiliateBagDetails](#AffiliateBagDetails) |  no  |  |
 | parentPromoBags | HashMap<String,Object>? |  yes  |  |
 | lineNumber | Integer? |  yes  |  |
 | articleDetails | [ArticleDetails](#ArticleDetails)? |  yes  |  |
 | noOfBagsOrder | Integer? |  yes  |  |
 | qcRequired | Object? |  yes  |  |
 | meta | [BagMeta](#BagMeta)? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | brand | [Brand](#Brand) |  no  |  |
 | journeyType | String |  no  |  |
 | restoreCoupon | Boolean? |  yes  |  |
 | currentOperationalStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | bagStatus | ArrayList<[BagStatusHistory](#BagStatusHistory)> |  no  |  |
 | reasons | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | quantity | Double? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [BagsPage](#BagsPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | hasNext | Boolean |  no  |  |
 | itemTotal | Integer |  no  |  |
 | pageType | String |  no  |  |
 | size | Integer |  no  |  |
 | current | Integer |  no  |  |

---


 
 
 #### [GetBagsPlatformResponse](#GetBagsPlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [BagsPage](#BagsPage) |  no  |  |
 | items | ArrayList<[BagDetailsPlatformResponse](#BagDetailsPlatformResponse)> |  no  |  |

---


 
 
 #### [GeneratePosOrderReceiptResponse](#GeneratePosOrderReceiptResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | paymentReceipt | String? |  yes  |  |
 | orderId | String? |  yes  |  |
 | invoiceReceipt | String? |  yes  |  |

---


 
 
 #### [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentIds | ArrayList<String>? |  yes  | Shipment Ids to clear cache |
 | bagIds | ArrayList<String>? |  yes  | Bag Ids to clear cache of shipment Ids mapped to it |
 | affiliateBagIds | ArrayList<String>? |  yes  | Affiliate Bag Ids to clear cache of shipment Ids mapped to it |

---


 
 
 #### [InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Integer? |  yes  |  |
 | message | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | response | ArrayList<[InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)>? |  yes  |  |

---


 
 
 #### [ErrorResponse1](#ErrorResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Integer? |  yes  |  |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | errorTrace | String? |  yes  |  |

---


 
 
 #### [StoreReassign](#StoreReassign)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | String? |  yes  |  |
 | reasonIds | ArrayList<Integer>? |  yes  |  |
 | affiliateBagId | String? |  yes  |  |
 | storeId | Integer |  no  |  |
 | fyndOrderId | String? |  yes  |  |
 | setId | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | mongoArticleId | String? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |

---


 
 
 #### [StoreReassignResponse](#StoreReassignResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [Entities](#Entities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String? |  yes  | Shipment ID if 'entity_type': shipments \| Bag Id if 'entity_type': bags |
 | affiliateBagId | String? |  yes  | Application/Affiliate Bag ID, Required if the ID is missing |
 | reasonText | String |  no  | Reason For Shipment/Bag Action |
 | affiliateId | String? |  yes  | Application/Affiliate ID, Required if the ID is missing |
 | affiliateOrderId | String? |  yes  | Application/Affiliate Order ID, Required if the ID is missing |
 | affiliateShipmentId | String? |  yes  | Application/Affiliate Shipment ID, Required if the ID is missing |

---


 
 
 #### [UpdateShipmentLockPayload](#UpdateShipmentLockPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | actionType | String |  no  | Expected action_type: [complete, operational, financial] |
 | entities | ArrayList<[Entities](#Entities)> |  no  | Shipment/Entity |
 | entityType | String |  no  | Expected entity_type: [bags, shipments] |
 | action | String |  no  | Expected Actions: [lock, unlock, check] |

---


 
 
 #### [Bags](#Bags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagId | Integer? |  yes  | Bag Id |
 | affiliateBagId | String? |  yes  | Application/Affiliate Bag ID, Required if the ID is missing |
 | isLocked | Boolean? |  yes  | Is Bag Locked |
 | affiliateOrderId | String? |  yes  | Application/Affiliate Order ID, Required if the ID is missing |

---


 
 
 #### [OriginalFilter](#OriginalFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  | Affiliate ID |
 | affiliateShipmentId | String? |  yes  | Affiliate Shipment ID |

---


 
 
 #### [CheckResponse](#CheckResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  | Shipment ID |
 | bags | ArrayList<[Bags](#Bags)>? |  yes  |  |
 | status | String? |  yes  | Status |
 | isBagLocked | Boolean? |  yes  | Is Bag Locked |
 | lockStatus | String? |  yes  | Lock Status: Expected lock_status: [complete, operational, financial] |
 | affiliateId | String? |  yes  | Affiliate ID |
 | isShipmentLocked | Boolean? |  yes  | Is Shipment Locked |
 | affiliateShipmentId | String? |  yes  | Affiliate Shipment ID |
 | originalFilter | [OriginalFilter](#OriginalFilter)? |  yes  | Filter |

---


 
 
 #### [UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | checkResponse | ArrayList<[CheckResponse](#CheckResponse)>? |  yes  | Entity Lock Status, If the action input as 'check' |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [AnnouncementResponse](#AnnouncementResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer |  no  |  |
 | fromDatetime | String? |  yes  |  |
 | title | String? |  yes  |  |
 | description | String? |  yes  |  |
 | companyId | Integer? |  yes  |  |
 | toDatetime | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | platformId | String? |  yes  |  |
 | platformName | String? |  yes  |  |
 | logoUrl | String? |  yes  |  |

---


 
 
 #### [AnnouncementsResponse](#AnnouncementsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | announcements | ArrayList<[AnnouncementResponse](#AnnouncementResponse)>? |  yes  |  |

---


 
 
 #### [BaseResponse](#BaseResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [Click2CallResponse](#Click2CallResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Boolean |  no  |  |
 | callId | String |  no  |  |

---


 
 
 #### [ErrorDetail](#ErrorDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [Products](#Products)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  | Product/Bag Article/Item Identifier |
 | lineNumber | Integer? |  yes  | Product/Bag Line number for the Product/Bag Identifier |
 | quantity | Integer? |  yes  |  |

---


 
 
 #### [ProductsReasonsFilters](#ProductsReasonsFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  | Product/Bag Article/Item Identifier |
 | lineNumber | Integer? |  yes  | Product/Bag Line number for the Product/Bag Identifier |
 | quantity | Integer? |  yes  |  |

---


 
 
 #### [ProductsReasonsData](#ProductsReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Integer? |  yes  |  |

---


 
 
 #### [ProductsReasons](#ProductsReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductsReasonsFilters](#ProductsReasonsFilters)>? |  yes  |  |
 | data | [ProductsReasonsData](#ProductsReasonsData)? |  yes  |  |

---


 
 
 #### [EntityReasonData](#EntityReasonData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Integer? |  yes  |  |

---


 
 
 #### [EntitiesReasons](#EntitiesReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | data | [EntityReasonData](#EntityReasonData)? |  yes  |  |

---


 
 
 #### [ReasonsData](#ReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | ArrayList<[ProductsReasons](#ProductsReasons)>? |  yes  |  |
 | entities | ArrayList<[EntitiesReasons](#EntitiesReasons)>? |  yes  |  |

---


 
 
 #### [ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  | Product/Bag Article/Item Identifier |
 | lineNumber | Integer? |  yes  | Product/Bag Line number for the Product/Bag Identifier |

---


 
 
 #### [ProductsDataUpdates](#ProductsDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)>? |  yes  | Filter for the Product/Bag |
 | data | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [EntitiesDataUpdates](#EntitiesDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | data | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [DataUpdates](#DataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | ArrayList<[ProductsDataUpdates](#ProductsDataUpdates)>? |  yes  |  |
 | entities | ArrayList<[EntitiesDataUpdates](#EntitiesDataUpdates)>? |  yes  |  |

---


 
 
 #### [ShipmentsRequest](#ShipmentsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | products | ArrayList<[Products](#Products)>? |  yes  | Product/Bag to be updated |
 | reasons | [ReasonsData](#ReasonsData)? |  yes  |  |
 | identifier | String |  no  | Shipment ID |
 | dataUpdates | [DataUpdates](#DataUpdates)? |  yes  |  |

---


 
 
 #### [StatuesRequest](#StatuesRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |
 | excludeBagsNextState | String? |  yes  | State to be change for Remaining Bag/Products |
 | shipments | ArrayList<[ShipmentsRequest](#ShipmentsRequest)>? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lockAfterTransition | Boolean? |  yes  | Lock Shipment After Transition |
 | task | Boolean? |  yes  | To Run Status Update as a background Task |
 | unlockBeforeTransition | Boolean? |  yes  | Unlock Shipment After Transition |
 | statuses | ArrayList<[StatuesRequest](#StatuesRequest)>? |  yes  |  |
 | forceTransition | Boolean? |  yes  | Force Transition |

---


 
 
 #### [ShipmentsResponse](#ShipmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | status | Integer? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | stackTrace | String? |  yes  |  |
 | code | String? |  yes  |  |
 | finalState | HashMap<String,Object>? |  yes  |  |
 | exception | String? |  yes  |  |
 | identifier | String? |  yes  |  |

---


 
 
 #### [StatuesResponse](#StatuesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[ShipmentsResponse](#ShipmentsResponse)>? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statuses | ArrayList<[StatuesResponse](#StatuesResponse)>? |  yes  |  |

---


 
 
 #### [OrderUser](#OrderUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | email | String |  no  |  |
 | lastName | String |  no  |  |
 | mobile | Integer |  no  |  |
 | state | String |  no  |  |
 | firstName | String |  no  |  |
 | city | String |  no  |  |
 | phone | Integer |  no  |  |
 | address2 | String? |  yes  |  |
 | address1 | String? |  yes  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [MarketPlacePdf](#MarketPlacePdf)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | label | String? |  yes  |  |
 | invoice | String? |  yes  |  |

---


 
 
 #### [AffiliateBag](#AffiliateBag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priceEffective | Double |  no  |  |
 | affiliateStoreId | String |  no  |  |
 | pdfLinks | [MarketPlacePdf](#MarketPlacePdf)? |  yes  |  |
 | deliveryCharge | Double |  no  |  |
 | companyId | Integer |  no  |  |
 | quantity | Integer |  no  |  |
 | unitPrice | Double |  no  |  |
 | sku | String |  no  |  |
 | itemSize | String |  no  |  |
 | affiliateMeta | HashMap<String,Object> |  no  |  |
 | fyndStoreId | String |  no  |  |
 | modifiedOn | String |  no  |  |
 | transferPrice | Integer |  no  |  |
 | storeId | Integer |  no  |  |
 | hsnCodeId | String |  no  |  |
 | avlQty | Integer |  no  |  |
 | discount | Double |  no  |  |
 | identifier | HashMap<String,Object> |  no  |  |
 | itemId | Integer |  no  |  |
 | id | String |  no  |  |
 | priceMarked | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | sellerIdentifier | String |  no  |  |

---


 
 
 #### [ArticleDetails1](#ArticleDetails1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | category | HashMap<String,Object> |  no  |  |
 | weight | HashMap<String,Object> |  no  |  |
 | dimension | HashMap<String,Object> |  no  |  |
 | brandId | Integer |  no  |  |
 | quantity | Integer |  no  |  |
 | attributes | HashMap<String,Object> |  no  |  |

---


 
 
 #### [LocationDetails](#LocationDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentType | String |  no  |  |
 | fulfillmentId | Integer |  no  |  |
 | articles | ArrayList<[ArticleDetails1](#ArticleDetails1)> |  no  |  |

---


 
 
 #### [ShipmentDetails1](#ShipmentDetails1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | articles | ArrayList<[ArticleDetails1](#ArticleDetails1)> |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | boxType | String? |  yes  |  |
 | shipments | Integer |  no  |  |
 | fulfillmentId | Integer |  no  |  |
 | dpId | Integer? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |

---


 
 
 #### [ShipmentConfig](#ShipmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentMode | String |  no  |  |
 | locationDetails | [LocationDetails](#LocationDetails)? |  yes  |  |
 | shipment | ArrayList<[ShipmentDetails1](#ShipmentDetails1)> |  no  |  |
 | journey | String |  no  |  |
 | source | String |  no  |  |
 | toPincode | String |  no  |  |
 | identifier | String |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [ShipmentData](#ShipmentData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentData | [ShipmentConfig](#ShipmentConfig) |  no  |  |

---


 
 
 #### [OrderPriority](#OrderPriority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfilmentPriorityText | String? |  yes  |  |
 | fulfilmentPriority | Integer? |  yes  |  |
 | affiliatePriorityCode | String? |  yes  |  |

---


 
 
 #### [UserData](#UserData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingUser | [OrderUser](#OrderUser)? |  yes  |  |
 | billingUser | [OrderUser](#OrderUser)? |  yes  |  |

---


 
 
 #### [OrderInfo](#OrderInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderValue | Double |  no  |  |
 | paymentMode | String |  no  |  |
 | shippingAddress | [OrderUser](#OrderUser) |  no  |  |
 | bags | ArrayList<[AffiliateBag](#AffiliateBag)> |  no  |  |
 | coupon | String? |  yes  |  |
 | deliveryCharges | Double |  no  |  |
 | items | HashMap<String,Object> |  no  |  |
 | shipment | [ShipmentData](#ShipmentData)? |  yes  |  |
 | billingAddress | [OrderUser](#OrderUser) |  no  |  |
 | payment | HashMap<String,Object>? |  yes  |  |
 | codCharges | Double |  no  |  |
 | orderPriority | [OrderPriority](#OrderPriority)? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | discount | Double |  no  |  |
 | user | [UserData](#UserData) |  no  |  |

---


 
 
 #### [AffiliateStoreIdMapping](#AffiliateStoreIdMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Integer |  no  |  |
 | marketplaceStoreId | String |  no  |  |

---


 
 
 #### [AffiliateAppConfigMeta](#AffiliateAppConfigMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [AffiliateAppConfig](#AffiliateAppConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | secret | String |  no  |  |
 | id | String |  no  |  |
 | updatedAt | String |  no  |  |
 | description | String? |  yes  |  |
 | owner | String |  no  |  |
 | token | String |  no  |  |
 | createdAt | String |  no  |  |
 | meta | ArrayList<[AffiliateAppConfigMeta](#AffiliateAppConfigMeta)>? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | forceReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpAssignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | postOrderReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modeOfPayment | String? |  yes  |  |
 | source | String? |  yes  |  |

---


 
 
 #### [AffiliateInventoryConfig](#AffiliateInventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)? |  yes  |  |
 | inventory | [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)? |  yes  |  |
 | logistics | [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)? |  yes  |  |
 | articleAssignment | [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)? |  yes  |  |
 | payment | [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)? |  yes  |  |

---


 
 
 #### [AffiliateConfig](#AffiliateConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | app | [AffiliateAppConfig](#AffiliateAppConfig)? |  yes  |  |
 | inventory | [AffiliateInventoryConfig](#AffiliateInventoryConfig)? |  yes  |  |

---


 
 
 #### [Affiliate](#Affiliate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | config | [AffiliateConfig](#AffiliateConfig)? |  yes  |  |
 | id | String |  no  |  |
 | token | String |  no  |  |

---


 
 
 #### [OrderConfig](#OrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagEndState | String? |  yes  |  |
 | affiliateStoreIdMapping | ArrayList<[AffiliateStoreIdMapping](#AffiliateStoreIdMapping)> |  no  |  |
 | createUser | Boolean? |  yes  |  |
 | articleLookup | String? |  yes  |  |
 | storeLookup | String? |  yes  |  |
 | affiliate | [Affiliate](#Affiliate) |  no  |  |

---


 
 
 #### [CreateOrderPayload](#CreateOrderPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String |  no  |  |
 | orderInfo | [OrderInfo](#OrderInfo) |  no  |  |
 | orderConfig | [OrderConfig](#OrderConfig) |  no  |  |

---


 
 
 #### [CreateOrderResponse](#CreateOrderResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [DispatchManifest](#DispatchManifest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ActionInfo](#ActionInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | description | String |  no  |  |
 | id | Integer |  no  |  |
 | displayText | String |  no  |  |

---


 
 
 #### [GetActionsResponse](#GetActionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | permissions | [ActionInfo](#ActionInfo) |  no  |  |

---


 
 
 #### [PostHistoryFilters](#PostHistoryFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String |  no  |  |
 | identifier | String? |  yes  |  |
 | lineNumber | String? |  yes  |  |

---


 
 
 #### [PostHistoryData](#PostHistoryData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userName | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [PostActivityHistory](#PostActivityHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[PostHistoryFilters](#PostHistoryFilters)> |  no  |  |
 | data | [PostHistoryData](#PostHistoryData) |  no  |  |

---


 
 
 #### [PostHistoryDict](#PostHistoryDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | [PostActivityHistory](#PostActivityHistory) |  no  |  |

---


 
 
 #### [PostShipmentHistory](#PostShipmentHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | ArrayList<[PostHistoryDict](#PostHistoryDict)>? |  yes  |  |

---


 
 
 #### [HistoryDict](#HistoryDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | displayMessage | String? |  yes  |  |
 | l2Detail | String? |  yes  |  |
 | ticketUrl | String? |  yes  |  |
 | createdat | String |  no  |  |
 | type | String |  no  |  |
 | assignedAgent | String? |  yes  |  |
 | l1Detail | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | bagId | Integer? |  yes  |  |
 | ticketId | String? |  yes  |  |
 | l3Detail | String? |  yes  |  |
 | user | String |  no  |  |

---


 
 
 #### [ShipmentHistoryResponse](#ShipmentHistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | ArrayList<[HistoryDict](#HistoryDict)> |  no  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SmsDataPayload](#SmsDataPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |
 | message | String |  no  |  |
 | paymentMode | String |  no  |  |
 | shipmentId | Integer |  no  |  |
 | phoneNumber | Integer |  no  |  |
 | amountPaid | Integer |  no  |  |
 | customerName | String |  no  |  |
 | brandName | String |  no  |  |
 | countryCode | String |  no  |  |

---


 
 
 #### [SendSmsPayload](#SendSmsPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagId | Integer |  no  |  |
 | slug | String |  no  |  |
 | data | [SmsDataPayload](#SmsDataPayload)? |  yes  |  |

---


 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stateManagerUsed | String? |  yes  |  |
 | kafkaEmissionStatus | Integer? |  yes  |  |

---


 
 
 #### [ShipmentDetail](#ShipmentDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  |  |
 | bagList | ArrayList<Integer>? |  yes  |  |
 | remarks | String? |  yes  |  |
 | id | Integer |  no  |  |
 | status | String? |  yes  |  |
 | meta | [Meta](#Meta) |  no  |  |

---


 
 
 #### [OrderStatusData](#OrderStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderDetails | [OrderDetails](#OrderDetails) |  no  |  |
 | shipmentDetails | ArrayList<[ShipmentDetail](#ShipmentDetail)>? |  yes  |  |
 | errors | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderStatusResult](#OrderStatusResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | ArrayList<[OrderStatusData](#OrderStatusData)>? |  yes  |  |
 | success | String |  no  |  |

---


 
 
 #### [TaxInfo](#TaxInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String? |  yes  |  |
 | b2BGstinNumber | String? |  yes  |  |

---


 
 
 #### [PaymentMethod](#PaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundBy | String |  no  |  |
 | transactionData | HashMap<String,Object>? |  yes  |  |
 | collectBy | String |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | mode | String |  no  |  |
 | amount | Double |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [PaymentInfo](#PaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryMode | String |  no  |  |
 | paymentMethods | ArrayList<[PaymentMethod](#PaymentMethod)>? |  yes  |  |

---


 
 
 #### [ShippingInfo](#ShippingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | houseNo | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | state | String |  no  |  |
 | geoLocation | HashMap<String,Object>? |  yes  |  |
 | middleName | String? |  yes  |  |
 | country | String |  no  |  |
 | primaryEmail | String |  no  |  |
 | address2 | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | customerCode | String? |  yes  |  |
 | shippingType | String? |  yes  |  |
 | stateCode | String? |  yes  |  |
 | title | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | floorNo | String? |  yes  |  |
 | firstName | String |  no  |  |
 | city | String |  no  |  |
 | primaryMobileNumber | String |  no  |  |
 | gender | String? |  yes  |  |
 | alternateEmail | String? |  yes  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | externalCustomerCode | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | address1 | String |  no  |  |
 | pincode | String |  no  |  |
 | slot | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [BillingInfo](#BillingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | houseNo | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | state | String |  no  |  |
 | middleName | String? |  yes  |  |
 | country | String |  no  |  |
 | primaryEmail | String |  no  |  |
 | address2 | String? |  yes  |  |
 | countryCode | String? |  yes  |  |
 | customerCode | String? |  yes  |  |
 | stateCode | String? |  yes  |  |
 | title | String? |  yes  |  |
 | floorNo | String? |  yes  |  |
 | firstName | String |  no  |  |
 | city | String |  no  |  |
 | primaryMobileNumber | String |  no  |  |
 | gender | String? |  yes  |  |
 | alternateEmail | String? |  yes  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | externalCustomerCode | String? |  yes  |  |
 | address1 | String |  no  |  |
 | pincode | String |  no  |  |

---


 
 
 #### [Tax](#Tax)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amount | HashMap<String,Object> |  no  |  |
 | name | String |  no  |  |
 | rate | Double |  no  |  |
 | breakup | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [Charge](#Charge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tax | [Tax](#Tax)? |  yes  |  |
 | type | String |  no  |  |
 | code | String? |  yes  |  |
 | amount | HashMap<String,Object> |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [LineItem](#LineItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | externalLineId | String? |  yes  |  |
 | quantity | Integer? |  yes  |  |
 | sellerIdentifier | String |  no  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | customMessasge | String? |  yes  |  |
 | charges | ArrayList<[Charge](#Charge)>? |  yes  |  |

---


 
 
 #### [ProcessingDates](#ProcessingDates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packByDate | String? |  yes  |  |
 | customerPickupSlot | HashMap<String,Object>? |  yes  |  |
 | dispatchAfterDate | String? |  yes  |  |
 | dpPickupSlot | HashMap<String,Object>? |  yes  |  |
 | dispatchByDate | String? |  yes  |  |
 | confirmByDate | String? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | locationId | Integer |  no  |  |
 | lineItems | ArrayList<[LineItem](#LineItem)> |  no  |  |
 | externalShipmentId | String? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | priority | Integer? |  yes  |  |
 | processingDates | [ProcessingDates](#ProcessingDates)? |  yes  |  |

---


 
 
 #### [CreateOrderAPI](#CreateOrderAPI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | currencyInfo | HashMap<String,Object>? |  yes  |  |
 | config | HashMap<String,Object>? |  yes  |  |
 | meta | HashMap<String,Object>? |  yes  |  |
 | taxInfo | [TaxInfo](#TaxInfo)? |  yes  |  |
 | paymentInfo | [PaymentInfo](#PaymentInfo) |  no  |  |
 | shippingInfo | [ShippingInfo](#ShippingInfo) |  no  |  |
 | externalOrderId | String? |  yes  |  |
 | billingInfo | [BillingInfo](#BillingInfo) |  no  |  |
 | shipments | ArrayList<[Shipment](#Shipment)> |  no  |  |
 | externalCreationDate | String? |  yes  |  |
 | charges | ArrayList<[Charge](#Charge)>? |  yes  |  |

---


 
 
 #### [CreateOrderErrorReponse](#CreateOrderErrorReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | status | Integer |  no  |  |
 | stackTrace | String? |  yes  |  |
 | code | String? |  yes  |  |
 | meta | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | info | Object? |  yes  |  |
 | requestId | String? |  yes  |  |

---


 
 
 #### [PaymentMethods](#PaymentMethods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mode | String? |  yes  |  |
 | collectBy | String? |  yes  |  |
 | refundBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | modeOfPayment | String? |  yes  |  |
 | paymentMethods | ArrayList<[PaymentMethods](#PaymentMethods)>? |  yes  |  |

---


 
 
 #### [DpConfiguration](#DpConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfig](#CreateChannelConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentInfo | [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)? |  yes  |  |
 | shipmentAssignment | String? |  yes  |  |
 | locationReassignment | Boolean? |  yes  |  |
 | lockStates | ArrayList<String>? |  yes  |  |
 | dpConfiguration | [DpConfiguration](#DpConfiguration)? |  yes  |  |
 | logoUrl | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [CreateChannelConfigData](#CreateChannelConfigData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configData | [CreateChannelConfig](#CreateChannelConfig)? |  yes  |  |

---


 
 
 #### [CreateChannelConfigResponse](#CreateChannelConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isUpserted | Boolean? |  yes  |  |
 | isInserted | Boolean? |  yes  |  |
 | acknowledged | Boolean? |  yes  |  |

---


 
 
 #### [CreateChannelConifgErrorResponse](#CreateChannelConifgErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String? |  yes  |  |

---


 
 
 #### [UploadConsent](#UploadConsent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |
 | consentUrl | String |  no  |  |

---


 
 
 #### [PlatformOrderUpdate](#PlatformOrderUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |

---


 
 
 #### [ResponseDetail](#ResponseDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | ArrayList<String>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [FyndOrderIdList](#FyndOrderIdList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderStatus](#OrderStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderDetails | ArrayList<[FyndOrderIdList](#FyndOrderIdList)>? |  yes  |  |
 | startDate | String |  no  |  |
 | endDate | String |  no  |  |
 | mobile | Integer |  no  |  |

---


 
 
 #### [BagStateTransitionMap](#BagStateTransitionMap)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliate | HashMap<String,Object>? |  yes  |  |
 | fynd | HashMap<String,Object>? |  yes  |  |

---



