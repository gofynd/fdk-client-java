



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

 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appDisplayName | Boolean? |  yes  |  |
 | stateType | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | forward | Boolean? |  yes  |  |
 | displayName | Boolean? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdAt | String? |  yes  |  |
 | bagList | ArrayList<Integer>? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | status | String? |  yes  |  |
 | id | Integer? |  yes  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | company | String |  no  |  |
 | createdOn | Integer |  no  |  |
 | id | Integer |  no  |  |
 | modifiedOn | Integer? |  yes  |  |
 | brandName | String |  no  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstTaxPercentage | Integer? |  yes  |  |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | gstinCode | String? |  yes  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnConfig | HashMap<String,Object>? |  yes  |  |
 | identifiers | HashMap<String,Object>? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amountPaid | Integer |  no  |  |
 | identifiers | HashMap<String,Object> |  no  |  |
 | size | String |  no  |  |
 | promotionEffectiveDiscount | Integer |  no  |  |
 | refundCredit | Integer |  no  |  |
 | gstTaxPercentage | Integer |  no  |  |
 | valueOfGood | Integer |  no  |  |
 | cashback | Integer |  no  |  |
 | codCharges | Integer |  no  |  |
 | couponEffectiveDiscount | Integer |  no  |  |
 | pmPriceSplit | HashMap<String,Object> |  no  |  |
 | priceEffective | Integer |  no  |  |
 | cashbackApplied | Integer |  no  |  |
 | gstFee | String |  no  |  |
 | discount | Integer |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | priceMarked | Integer |  no  |  |
 | totalUnits | Integer |  no  |  |
 | itemName | String |  no  |  |
 | brandCalculatedAmount | Integer |  no  |  |
 | transferPrice | Integer |  no  |  |
 | gstTag | String |  no  |  |
 | hsnCode | String |  no  |  |
 | couponValue | Integer |  no  |  |
 | deliveryCharge | Integer |  no  |  |
 | fyndCredits | Integer |  no  |  |

---


 
 
 #### [OrderBagItem](#OrderBagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | brand | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | slugKey | String |  no  |  |
 | size | String |  no  |  |
 | l3Category | Integer |  no  |  |
 | image | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | quantity | Integer |  no  |  |
 | currentStatus | String |  no  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | entityType | String |  no  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | displayName | String |  no  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)>? |  yes  |  |
 | item | [OrderBagItem](#OrderBagItem)? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannelLogo | HashMap<String,Object>? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | taxDetails | HashMap<String,Object>? |  yes  |  |
 | source | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | orderValue | String? |  yes  |  |
 | orderDate | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | codCharges | String? |  yes  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | name | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | email | String |  no  |  |
 | state | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | trackUrl | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | country | String? |  yes  |  |
 | name | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | id | String? |  yes  |  |
 | pincode | String? |  yes  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isCurrent | Boolean? |  yes  |  |
 | time | String? |  yes  |  |
 | isPassed | Boolean? |  yes  |  |
 | status | String |  no  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | gstinCode | String |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amountPaidRoundoff | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | priceEffective | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | cashback | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | discount | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | fyndCredits | Double |  no  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | source | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | mode | String |  no  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Object> |  no  |  |
 | country | String |  no  |  |
 | pincode | String |  no  |  |
 | contactPerson | String |  no  |  |
 | address | String |  no  |  |
 | phone | String |  no  |  |
 | storeName | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | id | String |  no  |  |
 | state | String |  no  |  |
 | code | String |  no  |  |
 | city | String |  no  |  |

---


 
 
 #### [ShipmentInfoResponse](#ShipmentInfoResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | refundDetails | HashMap<String,Object>? |  yes  |  |
 | emailId | String |  no  |  |
 | invoice | HashMap<String,Object> |  no  |  |
 | statusProgress | Integer |  no  |  |
 | orderStatus | HashMap<String,Object> |  no  |  |
 | pickedDate | String |  no  |  |
 | forwardOrderStatus | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | creditNoteId | String |  no  |  |
 | beneficiaryDetails | Boolean? |  yes  |  |
 | isInvoiced | Boolean |  no  |  |
 | forwardShipmentStatus | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | totalItems | Integer? |  yes  |  |
 | packagingType | String |  no  |  |
 | items | ArrayList<HashMap<String,Object>> |  no  |  |
 | userInfo | HashMap<String,Object>? |  yes  |  |
 | orderingStore | HashMap<String,Object> |  no  |  |
 | vertical | String? |  yes  |  |
 | fyndstoreEmp | HashMap<String,Object> |  no  |  |
 | dueDate | String? |  yes  |  |
 | bankData | HashMap<String,Object>? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | kiranaStoreId | String? |  yes  |  |
 | shipmentId | String |  no  |  |
 | securedDeliveryFlag | String? |  yes  |  |
 | paymentMode | String |  no  |  |
 | enableDpTracking | String |  no  |  |
 | enableTracking | Boolean? |  yes  |  |
 | isFyndStore | String? |  yes  |  |
 | escalation | HashMap<String,Object>? |  yes  |  |
 | platformLogo | Boolean |  no  |  |
 | refundText | String? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | lockStatus | String |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | mid | String? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | currentShipmentStatus | HashMap<String,Object> |  no  |  |
 | userId | String |  no  |  |
 | goGreen | Boolean? |  yes  |  |
 | isFyndCoupon | Boolean |  no  |  |
 | payButton | String? |  yes  |  |
 | isPdsr | String? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | priorityText | String? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | deliveryStatus | ArrayList<HashMap<String,Object>> |  no  |  |
 | orderCreatedTime | String? |  yes  |  |
 | coupon | HashMap<String,Object>? |  yes  |  |
 | company | HashMap<String,Object> |  no  |  |
 | trackingUrl | String |  no  |  |
 | journeyType | String |  no  |  |
 | orderType | String |  no  |  |
 | userAgent | String |  no  |  |
 | childNodes | ArrayList<String>? |  yes  |  |
 | isPackagingOrder | Boolean |  no  |  |
 | isNotFyndSource | Boolean |  no  |  |
 | replacementDetails | String? |  yes  |  |
 | forwardTrackingList | ArrayList<HashMap<String,Object>>? |  yes  |  |
 | canBreak | String |  no  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |

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
 | currentState | ArrayList<String>? |  yes  |  |
 | text | String |  no  |  |
 | totalShipments | Integer |  no  |  |
 | nextState | ArrayList<String>? |  yes  |  |
 | index | Integer |  no  |  |
 | value | String |  no  |  |

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
 | fyndOrderId | String |  no  |  |
 | shipmentCount | Integer |  no  |  |
 | orderDate | String |  no  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | pickedDate | String |  no  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | totalItems | Integer? |  yes  |  |
 | packagingType | String |  no  |  |
 | vertical | String? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | enableDpTracking | String |  no  |  |
 | platformLogo | String |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | shipmentQuantity | Integer |  no  |  |
 | priorityText | String? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | journeyType | String |  no  |  |
 | userAgent | String |  no  |  |
 | deliverySlot | HashMap<String,Object> |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [OrderDict](#OrderDict)? |  yes  |  |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | type | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isAnonymousUser | Boolean |  no  |  |
 | lastName | String |  no  |  |
 | avisUserId | String |  no  |  |
 | mobile | String |  no  |  |
 | firstName | String |  no  |  |
 | email | String |  no  |  |
 | gender | String |  no  |  |
 | uid | Integer |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | opsStatus | String |  no  |  |
 | actualStatus | String |  no  |  |
 | status | String |  no  |  |
 | title | String |  no  |  |
 | hexCode | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | canCancel | Boolean |  no  |  |
 | canReturn | Boolean |  no  |  |
 | departmentId | Integer |  no  |  |
 | name | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | size | String |  no  |  |
 | l3Category | Integer |  no  |  |
 | color | String? |  yes  |  |
 | l3CategoryName | String |  no  |  |
 | id | Integer |  no  |  |
 | code | String |  no  |  |
 | image | ArrayList<String>? |  yes  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalShipmentBags | Integer |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | bagId | Integer |  no  |  |
 | itemQuantity | Integer |  no  |  |
 | orderingChannel | String |  no  |  |
 | shipmentId | String |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | status | HashMap<String,Object> |  no  |  |
 | item | [Item](#Item)? |  yes  |  |

---


 
 
 #### [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | createdAt | String |  no  |  |
 | channel | HashMap<String,Object>? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | application | HashMap<String,Object>? |  yes  |  |
 | totalBagsCount | Integer |  no  |  |
 | fulfillingCentre | String |  no  |  |
 | totalShipmentsInOrder | Integer |  no  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | id | String |  no  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | sla | HashMap<String,Object>? |  yes  |  |
 | shipmentCreatedAt | Integer |  no  |  |
 | fulfillingStore | [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | appliedFilters | HashMap<String,Object>? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | page | HashMap<String,Object>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | amountPaid | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | gstFee | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | discount | String? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |
 | orderId | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | shipmentId | String |  no  |  |
 | totalItems | String |  no  |  |
 | rtdDone | String |  no  |  |

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


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | email | String? |  yes  |  |
 | gender | String? |  yes  |  |
 | mobile | Integer |  no  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amountPaid | Integer? |  yes  |  |
 | couponValue | String? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | refundAmount | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | cashback | Integer? |  yes  |  |
 | discount | Integer? |  yes  |  |
 | priceMarked | Integer? |  yes  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | codCharges | Integer? |  yes  |  |
 | fyndCredits | Integer? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandCalculatedAmount | Integer? |  yes  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | valueOfGood | Integer? |  yes  |  |
 | priceEffective | Integer? |  yes  |  |
 | totalBags | Integer |  no  |  |
 | deliveryCharge | Integer? |  yes  |  |
 | refundCredit | Integer? |  yes  |  |
 | cashbackApplied | Integer? |  yes  |  |
 | taxCollectedAtSource | Integer? |  yes  |  |
 | shipmentStatus | HashMap<String,Object> |  no  |  |
 | cashback | Integer? |  yes  |  |
 | shipmentId | String |  no  |  |
 | totalItems | Integer |  no  |  |
 | fyndCredits | Integer? |  yes  |  |
 | couponEffectiveDiscount | Integer? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |
 | orderCreatedTime | String |  no  |  |
 | orderId | String |  no  |  |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |

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
 | total | Integer |  no  |  |
 | prepaid | Integer |  no  |  |
 | cod | Integer |  no  |  |

---


 
 
 #### [MetricsCount](#MetricsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pendingPickup | Integer |  no  |  |
 | returned | Integer |  no  |  |
 | pendingRtd | Integer |  no  |  |
 | cancelled | Integer |  no  |  |
 | pendingAcceptance | ArrayList<[PendingAcceptance](#PendingAcceptance)>? |  yes  |  |

---


 
 
 #### [MetricCountResponse](#MetricCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | ArrayList<[MetricsCount](#MetricsCount)>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [FiltersResponse](#FiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryPartners | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | channels | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---



