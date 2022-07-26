



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getLaneConfig](#getlaneconfig)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentList](#getshipmentlist)
* [getShipmentToManifest](#getshipmenttomanifest)
* [getOrders](#getorders)
* [getMetricCount](#getmetriccount)
* [getfilters](#getfilters)



## Methods with example and description


### getShipmentDetails





```java
client.orders.getShipmentDetails( shipmentId,  orderingCompanyId,  requestByExt) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| shipmentId | String | yes |  |   
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


### getLaneConfig





```java
client.orders.getLaneConfig( superLane,  groupEntity,  fromDate,  toDate,  dpIds,  stores,  salesChannel,  paymentMode,  bagStatus) {
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
| salesChannel | String? | no |  |   
| paymentMode | String? | no |  |   
| bagStatus | String? | no |  |  





*Returned Response:*




[LaneConfigResponse](#LaneConfigResponse)

Response containing count of shipments of the given status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrderShipmentDetails





```java
client.orders.getOrderShipmentDetails( orderId) {
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


### getShipmentList





```java
client.orders.getShipmentList( lane,  searchType,  searchId,  fromDate,  toDate,  dpIds,  orderingCompanyId,  stores,  salesChannel,  requestByExt,  pageNo,  pageSize,  customerId,  isPrioritySort) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
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


### getShipmentToManifest





```java
client.orders.getShipmentToManifest( groupEntity,  salesChannel,  dpIds) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| groupEntity | String | yes |  |   
| salesChannel | String? | no |  |   
| dpIds | String? | no |  |  





*Returned Response:*




[ManifestShipmentResponse](#ManifestShipmentResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrders





```java
client.orders.getOrders( lane,  searchType,  searchValue,  fromDate,  toDate,  dpIds,  stores,  salesChannel,  pageNo,  pageSize,  isPrioritySort) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| pageNo | Integer? | no |  |   
| pageSize | Integer? | no |  |   
| isPrioritySort | Boolean? | no |  |  





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
client.orders.getMetricCount() {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |  





*Returned Response:*




[MetricCountResponse](#MetricCountResponse)

Response containing count of shipments of the given metrics




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getfilters





```java
client.orders.getfilters( view) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| companyId | Integer | yes |  |   
| view | String | yes |  |  





*Returned Response:*




[FiltersResponse](#FiltersResponse)

List of filters




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "delivery_partners": [
    {
      "text": "Ecomm",
      "value": 1,
      "name": "ecom_jio"
    },
    {
      "text": "Grab",
      "value": 12,
      "name": "grab_jio"
    },
    {
      "text": "Ecomm Express",
      "value": 13,
      "name": "ecom_express_3P"
    },
    {
      "text": "Delivery Express",
      "value": 14,
      "name": "delhivery_express_3P"
    },
    {
      "text": "Xpressbees Express",
      "value": 15,
      "name": "xpressbees_express_3P"
    },
    {
      "text": "Delhiver Express",
      "value": 19,
      "name": "delhivery_jio_surface"
    }
  ],
  "channels": [
    {
      "text": "JIOMARKET",
      "value": "0000000000000000000000045",
      "name": "JIOMARKET"
    },
    {
      "text": "JIOMART",
      "value": "5ea6821b3425bb07c82a2551",
      "name": "JIOMART"
    }
  ]
}
```
</details>









---



### Schemas

 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | address | String |  no  |  |
 | contactPerson | String |  no  |  |
 | meta | HashMap<String,Object> |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | code | String |  no  |  |
 | storeName | String |  no  |  |
 | phone | String |  no  |  |
 | id | String |  no  |  |
 | pincode | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | gstinCode | String |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priceEffective | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | discount | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | cashback | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | fyndCredits | Double |  no  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | address | String |  no  |  |
 | name | String |  no  |  |
 | phone | String |  no  |  |
 | pincode | String |  no  |  |
 | state | String |  no  |  |
 | country | String |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannelLogo | HashMap<String,Object>? |  yes  |  |
 | orderValue | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | orderDate | String? |  yes  |  |
 | taxDetails | HashMap<String,Object>? |  yes  |  |
 | codCharges | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | source | String? |  yes  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pincode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | country | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | appDisplayName | Boolean? |  yes  |  |
 | stateType | Boolean? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | forward | Boolean? |  yes  |  |
 | displayName | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdAt | String? |  yes  |  |
 | status | String? |  yes  |  |
 | bagList | ArrayList<Integer>? |  yes  |  |
 | id | Integer? |  yes  |  |
 | shipmentId | String? |  yes  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | mode | String |  no  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isPassed | Boolean? |  yes  |  |
 | isCurrent | Boolean? |  yes  |  |
 | time | String? |  yes  |  |
 | status | String |  no  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandName | String |  no  |  |
 | logo | String |  no  |  |
 | createdOn | Integer |  no  |  |
 | id | Integer |  no  |  |
 | company | String |  no  |  |
 | modifiedOn | Integer? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Integer |  no  |  |
 | brandCalculatedAmount | Integer |  no  |  |
 | refundCredit | Integer |  no  |  |
 | size | String |  no  |  |
 | cashbackApplied | Integer |  no  |  |
 | gstFee | String |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | hsnCode | String |  no  |  |
 | promotionEffectiveDiscount | Integer |  no  |  |
 | deliveryCharge | Integer |  no  |  |
 | itemName | String |  no  |  |
 | gstTaxPercentage | Integer |  no  |  |
 | couponEffectiveDiscount | Integer |  no  |  |
 | fyndCredits | Integer |  no  |  |
 | priceEffective | Integer |  no  |  |
 | valueOfGood | Integer |  no  |  |
 | discount | Integer |  no  |  |
 | totalUnits | Integer |  no  |  |
 | amountPaid | Integer |  no  |  |
 | cashback | Integer |  no  |  |
 | priceMarked | Integer |  no  |  |
 | pmPriceSplit | HashMap<String,Object> |  no  |  |
 | identifiers | HashMap<String,Object> |  no  |  |
 | transferPrice | Integer |  no  |  |
 | couponValue | Integer |  no  |  |
 | gstTag | String |  no  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | uid | String? |  yes  |  |
 | identifiers | HashMap<String,Object>? |  yes  |  |
 | returnConfig | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |

---


 
 
 #### [OrderBagItem](#OrderBagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brand | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |
 | l3Category | Integer |  no  |  |
 | slugKey | String |  no  |  |
 | size | String |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | gstTaxPercentage | Integer? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | gstTag | String? |  yes  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entityType | String |  no  |  |
 | currentStatus | String |  no  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)>? |  yes  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | quantity | Integer |  no  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | item | [OrderBagItem](#OrderBagItem)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | displayName | String |  no  |  |

---


 
 
 #### [ShipmentInfoResponse](#ShipmentInfoResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packagingType | String |  no  |  |
 | payButton | String? |  yes  |  |
 | kiranaStoreId | String? |  yes  |  |
 | journeyType | String |  no  |  |
 | bankData | HashMap<String,Object>? |  yes  |  |
 | deliveryStatus | ArrayList<HashMap<String,Object>> |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | invoice | HashMap<String,Object> |  no  |  |
 | forwardOrderStatus | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | company | HashMap<String,Object> |  no  |  |
 | vertical | String? |  yes  |  |
 | childNodes | ArrayList<String>? |  yes  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |
 | isPackagingOrder | Boolean |  no  |  |
 | forwardTrackingList | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | userAgent | String |  no  |  |
 | enableDpTracking | String |  no  |  |
 | userId | String |  no  |  |
 | securedDeliveryFlag | String? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | orderingStore | HashMap<String,Object> |  no  |  |
 | isInvoiced | Boolean |  no  |  |
 | dueDate | String? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | coupon | HashMap<String,Object>? |  yes  |  |
 | beneficiaryDetails | Boolean? |  yes  |  |
 | mid | String? |  yes  |  |
 | orderStatus | HashMap<String,Object> |  no  |  |
 | canReturn | Boolean? |  yes  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | userInfo | HashMap<String,Object>? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | trackingUrl | String |  no  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | totalItems | Integer? |  yes  |  |
 | refundText | String? |  yes  |  |
 | isPdsr | String? |  yes  |  |
 | orderType | String |  no  |  |
 | shipmentId | String |  no  |  |
 | replacementDetails | String? |  yes  |  |
 | fyndstoreEmp | HashMap<String,Object> |  no  |  |
 | statusProgress | Integer |  no  |  |
 | goGreen | Boolean? |  yes  |  |
 | isFyndStore | String? |  yes  |  |
 | paymentMode | String |  no  |  |
 | isNotFyndSource | Boolean |  no  |  |
 | items | ArrayList<HashMap<String,Object>> |  no  |  |
 | creditNoteId | String |  no  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | orderCreatedTime | String? |  yes  |  |
 | enableTracking | Boolean? |  yes  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | escalation | HashMap<String,Object>? |  yes  |  |
 | refundDetails | HashMap<String,Object>? |  yes  |  |
 | pickedDate | String |  no  |  |
 | canBreak | String |  no  |  |
 | lockStatus | String |  no  |  |
 | forwardShipmentStatus | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | currentShipmentStatus | HashMap<String,Object> |  no  |  |
 | isFyndCoupon | Boolean |  no  |  |
 | platformLogo | Boolean |  no  |  |
 | emailId | String |  no  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | nextState | ArrayList<String>? |  yes  |  |
 | text | String |  no  |  |
 | index | Integer |  no  |  |
 | value | String |  no  |  |
 | totalShipments | Integer |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [OrderDict](#OrderDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderDate | String |  no  |  |
 | shipmentCount | Integer |  no  |  |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | packagingType | String |  no  |  |
 | journeyType | String |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | vertical | String? |  yes  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | userAgent | String |  no  |  |
 | enableDpTracking | String |  no  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | totalItems | Integer? |  yes  |  |
 | shipmentId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | pickedDate | String |  no  |  |
 | platformLogo | String |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [OrderDict](#OrderDict)? |  yes  |  |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | actualStatus | String |  no  |  |
 | title | String |  no  |  |
 | hexCode | String |  no  |  |
 | opsStatus | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3CategoryName | String |  no  |  |
 | canCancel | Boolean |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |
 | code | String |  no  |  |
 | size | String |  no  |  |
 | l3Category | Integer |  no  |  |
 | departmentId | Integer |  no  |  |
 | id | Integer |  no  |  |
 | canReturn | Boolean |  no  |  |
 | color | String? |  yes  |  |
 | name | String |  no  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalShipmentBags | Integer |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | orderingChannel | String |  no  |  |
 | status | HashMap<String,Object> |  no  |  |
 | itemQuantity | Integer |  no  |  |
 | item | [Item](#Item)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | bagId | Integer |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastName | String |  no  |  |
 | mobile | String |  no  |  |
 | isAnonymousUser | Boolean |  no  |  |
 | avisUserId | String |  no  |  |
 | firstName | String |  no  |  |
 | gender | String |  no  |  |
 | uid | Integer |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillingCentre | String |  no  |  |
 | totalBagsCount | Integer |  no  |  |
 | channel | HashMap<String,Object>? |  yes  |  |
 | shipmentCreatedAt | Integer |  no  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | createdAt | String |  no  |  |
 | sla | HashMap<String,Object>? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | fulfillingStore | [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)? |  yes  |  |
 | id | String |  no  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | application | HashMap<String,Object>? |  yes  |  |
 | totalShipmentsInOrder | Integer |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | appliedFilters | HashMap<String,Object>? |  yes  |  |
 | page | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstFee | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | discount | String? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rtdDone | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | totalItems | String |  no  |  |
 | orderId | String |  no  |  |
 | shipmentId | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [ErrorSchemaDataSet](#ErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | discount | Integer? |  yes  |  |
 | refundAmount | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | couponValue | String? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priceEffective | Integer? |  yes  |  |
 | shipmentStatus | HashMap<String,Object> |  no  |  |
 | valueOfGood | Integer? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | totalItems | Integer |  no  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | shipmentId | String |  no  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | totalBags | Integer |  no  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |

---


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | Integer |  no  |  |
 | email | String? |  yes  |  |
 | name | String |  no  |  |
 | gender | String? |  yes  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |
 | orderCreatedTime | String |  no  |  |
 | orderId | String |  no  |  |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orders | ArrayList<[OrderDataSet](#OrderDataSet)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [OrderErrorSchemaDataSet](#OrderErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reason | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [PendingAcceptance](#PendingAcceptance)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | prepaid | Integer |  no  |  |
 | total | Integer |  no  |  |
 | cod | Integer |  no  |  |

---


 
 
 #### [MetricsCount](#MetricsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returned | Integer |  no  |  |
 | cancelled | Integer |  no  |  |
 | pendingRtd | Integer |  no  |  |
 | pendingPickup | Integer |  no  |  |
 | pendingAcceptance | ArrayList<[PendingAcceptance](#PendingAcceptance)>? |  yes  |  |

---


 
 
 #### [MetricCountResponse](#MetricCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | ArrayList<[MetricsCount](#MetricsCount)>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [FilterDict](#FilterDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | name | String |  no  |  |
 | text | String |  no  |  |

---


 
 
 #### [Filters](#Filters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | options | ArrayList<[FilterDict](#FilterDict)>? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [FiltersResponse](#FiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channels | ArrayList<[Filters](#Filters)>? |  yes  |  |
 | deliveryPartners | ArrayList<[Filters](#Filters)>? |  yes  |  |

---



