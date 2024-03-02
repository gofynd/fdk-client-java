



##### [Back to Partner docs](./README.md)

## Webhook Methods
Webhook dispatcher with retry and one event to many subscriber vice versa

Default
* [fetchDeliverySummary](#fetchdeliverysummary)
* [getDeliveryDetailInsights](#getdeliverydetailinsights)
* [fetchDeliveryTs](#fetchdeliveryts)
* [fetchReportFilters](#fetchreportfilters)
* [cancelReportDownload](#cancelreportdownload)
* [getHistoricalReports](#gethistoricalreports)
* [getInvalidEventList](#getinvalideventlist)
* [fetchSubscribers](#fetchsubscribers)
* [updateSubscriber](#updatesubscriber)




## Methods with example and description



### fetchDeliverySummary
Webhook delivery summary




```java
partnerClient.webhook.fetchDeliverySummary( organizationId,  extensionId,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |   
| startDate | String | yes | start_date |   
| endDate | String | yes | end_date |  



Webhook delivery summary

*Returned Response:*




[DeliverySummaryResponse](#DeliverySummaryResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "delivery_event_level": [
      {
        "event": "product-size",
        "success": 1121,
        "failed": 0,
        "failed_percentage": 0,
        "removed_webhooks": 0,
        "total": 1121,
        "response_time": 95.08
      }
    ],
    "delivery_summary": {
      "success": 1121,
      "response_time": 95.08,
      "failed_percentage": 0,
      "removed_webhooks": 0
    }
  }
}
```
</details>

</details>









---


### getDeliveryDetailInsights
Get the insights of delivery details of the events that was pushed to subscribers




```java
partnerClient.webhook.getDeliveryDetailInsights( organizationId,  extensionId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |  
| body | [DeliveryDetailsRequest](#DeliveryDetailsRequest) | yes | Request body |


Get the delivery details insights

*Returned Response:*




[DeliveryDetailsResponse](#DeliveryDetailsResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "rows": [
      {
        "event_name": "product-size.create.v2.company",
        "response_code": 200,
        "response_message": "OK",
        "data": {
          "company_id": 327
        },
        "attempt": 1,
        "last_attempted_on": 1700472182926,
        "status": "SUCCESS",
        "name": "64b0b865c35f9905188806fe",
        "webhook_url": "https://unicommerce.connect.fyndx1.de/event/webhook",
        "response_time": 139,
        "message_id": "5TFWXZ5p2sEHpbGAEHEgiUfsMEACgRpePrjlld+J3+I=",
        "event_trace_id": "[\"silverbolt.6791e276-8786-11ee-a387-46ec7da68c2f\"]"
      }
    ]
  }
}
```
</details>

</details>









---


### fetchDeliveryTs
Webhook delivery ts




```java
partnerClient.webhook.fetchDeliveryTs( organizationId,  extensionId,  startDate,  endDate) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |   
| startDate | String | yes | start_date |   
| endDate | String | yes | end_date |  



Webhook delivery ts

*Returned Response:*




[DeliveryTsResponse](#DeliveryTsResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "delivery_ts": [
      {
        "timestamp": {
          "value": "2023-11-01T05:02:51.000Z"
        },
        "failed": 0,
        "removed_webhooks": 0,
        "success": 1121
      }
    ]
  }
}
```
</details>

</details>









---


### fetchReportFilters
Fetch webhook report filters




```java
partnerClient.webhook.fetchReportFilters( organizationId,  extensionId,  startDate,  endDate,  pageNo,  pageSize) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |   
| startDate | String | yes | start_date |   
| endDate | String | yes | end_date |   
| pageNo | Integer | yes | page_no |   
| pageSize | Integer | yes | page_size |  



Fetch webhook report filters

*Returned Response:*




[List<FilterReportResponse>](#List<FilterReportResponse>)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": [
    {
      "filter_name": "Event",
      "values": null
    },
    {
      "text": "article.delete-v1 (company)",
      "value": {
        "event_name": "article",
        "event_type": "delete",
        "event_category": "company",
        "version": "1"
      }
    },
    {
      "filter_name": "Subscriber Name",
      "values": null
    },
    {
      "text": "64206a45609cb12dd02310eb",
      "value": 1604
    },
    {
      "filter_name": "Company Name",
      "values": []
    }
  ]
}
```
</details>

</details>









---


### cancelReportDownload
Cancel report download job




```java
partnerClient.webhook.cancelReportDownload( organizationId,  extensionId,  filename) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |   
| filename | String | yes | filename |  



Cancel report download job

*Returned Response:*




[CancelDownloadResponse](#CancelDownloadResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Job cancelled successfully",
    "result": "SUCCESS"
  }
}
```
</details>

</details>









---


### getHistoricalReports
Get report download history.




```java
partnerClient.webhook.getHistoricalReports( organizationId,  extensionId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |  
| body | [HistoryPayload](#HistoryPayload) | yes | Request body |


Retrieve history reports for a specific company based on the provided filters.


*Returned Response:*




[HistoryResponse](#HistoryResponse)

It will give list of all the reports that was downloaded.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": [
    {
      "id": 25,
      "association": {
        "company_id": 24
      },
      "filters": {
        "status": "FAILED",
        "end_date": "2023-07-18T09:38:07.000Z",
        "start_date": "2023-07-17T09:38:07.000Z",
        "subscribers": [
          40
        ]
      },
      "filename": "exportJMehD_1689675047609",
      "status": "COMPLETED",
      "upload_service_response": {
        "cdn": {
          "urls": [
            {
              "url": "https://storage.googleapis.com/fynd-data-platform-fynd-x0/fp-analytics-query-result/exportJMehD_1689675047609/000000000000.csv.gz?GoogleAccessId=dms-to-bq%40fynd-1088.iam.gserviceaccount.com&Expires=1692267060&Signature=aPhTRMOJswVhx5jTYF7JV42aPQKJ4Mkzv9vJr8zqrbpso00GytuhmBnpP1Gxt%2BoTnIINyWUWAuchlm6paS9yKFrjCXemsqSM0hqTA8T0MUjng3swZAtZuWK4dVK2jMyOv88l1Xn8tkrwOFo7ohG3scFwgjplrU%2FkMUNZqxw4fdgdUUXZ%2BJrnGC5jlGkz5PTooRtForUXtTkA8Kf9mJvX3F6f6p5I2VvhzmXHGMabavEjgZ56JUe2%2B0o5POs4jN0s%2F6fZGOz4hhLa9hMIyQpjoodbcGO%2BRCKukxRbY1s00%2F1WNGLLYYuU4bvqtME60rCnj0FHEmbte4Tr73SmOU4xwg%3D%3D",
              "name": "000000000000.csv.gz"
            }
          ]
        }
      },
      "created_on": "2023-07-18T10:10:49.189Z",
      "updated_on": "2023-07-18T10:10:50.798Z",
      "message": "Completed in less than 1 min"
    }
  ]
}
```
</details>

</details>









---


### getInvalidEventList
Get invalid event list




```java
partnerClient.webhook.getInvalidEventList( organizationId,  extensionId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |  
| body | [InvalidEventsRequest](#InvalidEventsRequest) | yes | Request body |


Get invalid event list.


*Returned Response:*




[List<InvalidEventsResponse>](#List<InvalidEventsResponse>)

It will give list of all the invalid events that was failed to pushed to subscribers due to its schema mismatched.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": [
    {
      "event_name": "test",
      "event_type": "test",
      "version": "1",
      "category": "company",
      "count": 10
    }
  ]
}
```
</details>

</details>









---


### fetchSubscribers
Fetch subscriber by filters




```java
partnerClient.webhook.fetchSubscribers( organizationId,  extensionId) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |  



Fetch subscriber by filters

*Returned Response:*




[SubscriberConfigResponse](#SubscriberConfigResponse)

Success




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": [
    {
      "name": "xyz webhook",
      "webhook_url": "https://xyz.requestcatcher.com/test",
      "association": {
        "company_id": 1,
        "extension_id": "64affd97cbddb85348ca8f93",
        "application_id": [
          "63a0490757475baff6154585",
          "63a42b512df5d4731c5eb601"
        ]
      },
      "custom_headers": {},
      "status": "active",
      "email_id": "axyz@gofynd.com",
      "auth_meta": {},
      "event_id": [
        10,
        11,
        17
      ]
    }
  ]
}
```
</details>

</details>









---


### updateSubscriber
Update subscriber status by id.




```java
partnerClient.webhook.updateSubscriber( organizationId,  extensionId,  subscriberId, body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| organizationId | String | yes | organization_id |   
| extensionId | String | yes | extension_id |   
| subscriberId | Double | yes | subscriber_id |  
| body | [UpdateSubscriberRequest](#UpdateSubscriberRequest) | yes | Request body |


Update subscriber status by id.


*Returned Response:*




[UpdateSubscriberResponse](#UpdateSubscriberResponse)

It will give you subscriber config details of a selected subscribers.




<details>
<summary><i>&nbsp; Examples:</i></summary>


<details>
<summary><i>&nbsp; success</i></summary>

```json
{
  "value": {
    "message": "Subscriber with id 1 with extension id 64affd97cbddb85348ca8f93 updated successfully"
  }
}
```
</details>

</details>









---




### Schemas

 
 
 #### [UpdateSubscriberResponse](#UpdateSubscriberResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |

---


 
 
 #### [UpdateSubscriberRequest](#UpdateSubscriberRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String? |  yes  |  |

---


 
 
 #### [Association](#Association)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | applicationId | ArrayList<String>? |  yes  |  |
 | extensionId | String? |  yes  |  |
 | criteria | String? |  yes  |  |

---


 
 
 #### [AuthMeta](#AuthMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | secret | String? |  yes  |  |

---


 
 
 #### [SubscriberEventMapping](#SubscriberEventMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | eventId | Integer? |  yes  |  |
 | subscriberId | Integer? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [EventConfigResponse](#EventConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | eventCategory | String? |  yes  |  |
 | eventSchema | HashMap<String,Object>? |  yes  |  |
 | version | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | description | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | updatedOn | String? |  yes  |  |
 | subscriberEventMapping | [SubscriberEventMapping](#SubscriberEventMapping)? |  yes  |  |

---


 
 
 #### [SubscriberConfigResponse](#SubscriberConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[ItemSchema](#ItemSchema)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [InvalidEventsRequest](#InvalidEventsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventName | String? |  yes  |  |
 | version | String? |  yes  |  |
 | category | String? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |

---


 
 
 #### [InvalidEventsResponse](#InvalidEventsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | version | String? |  yes  |  |
 | category | String? |  yes  |  |
 | count | Double? |  yes  |  |

---


 
 
 #### [DownloadReponse](#DownloadReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fileName | String? |  yes  |  |

---


 
 
 #### [HistoryFilters](#HistoryFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | events | ArrayList<String>? |  yes  |  |
 | searchText | String? |  yes  |  |
 | status | String? |  yes  | The status of the history report (e.g., "FAILED"). |
 | endDate | String? |  yes  | The end date and time of the history report. |
 | startDate | String? |  yes  | The start date and time of the history report. |
 | subscribers | ArrayList<Integer>? |  yes  | An array of subscriber IDs associated with the history report. |

---


 
 
 #### [Url](#Url)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  | The URL of the uploaded report file. |
 | name | String? |  yes  | The name of the uploaded report file. |

---


 
 
 #### [CdnObject](#CdnObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | urls | ArrayList<[Url](#Url)>? |  yes  |  |

---


 
 
 #### [UploadServiceObject](#UploadServiceObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cdn | [CdnObject](#CdnObject)? |  yes  |  |

---


 
 
 #### [HistoryAssociation](#HistoryAssociation)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | subscriberIds | ArrayList<Integer>? |  yes  |  |

---


 
 
 #### [HistoryItems](#HistoryItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  | The ID of the history report. |
 | association | [HistoryAssociation](#HistoryAssociation)? |  yes  |  |
 | filters | [HistoryFilters](#HistoryFilters)? |  yes  |  |
 | filename | String? |  yes  | The filename of the history report. |
 | status | String? |  yes  | The status of the history report (e.g., "COMPLETED"). |
 | uploadServiceResponse | [UploadServiceObject](#UploadServiceObject)? |  yes  |  |
 | createdOn | String? |  yes  | The date and time when the history report was created. |
 | updatedOn | String? |  yes  | The date and time when the history report was last updated. |
 | message | String? |  yes  | A message related to the history report. |

---


 
 
 #### [HistoryResponse](#HistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[HistoryItems](#HistoryItems)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [HistoryPayload](#HistoryPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Integer? |  yes  |  |
 | type | String? |  yes  | The type of history report (e.g., "platform"). |
 | pageNo | Integer? |  yes  | The page number of the history report. |
 | pageSize | Integer? |  yes  | The number of records per page. |

---


 
 
 #### [CancelDownloadResponse](#CancelDownloadResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | result | String? |  yes  |  |

---


 
 
 #### [FilterReportResponse](#FilterReportResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filterName | String? |  yes  |  |
 | values | ArrayList<HashMap<String,Object>>? |  yes  |  |

---


 
 
 #### [DeliveryTsResponse](#DeliveryTsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryTs | ArrayList<[DeliveryTsSchema](#DeliveryTsSchema)>? |  yes  |  |

---


 
 
 #### [DeliveryTsSchema](#DeliveryTsSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | timestamp | String? |  yes  |  |
 | failed | Double? |  yes  |  |
 | removedWebhooks | Double? |  yes  |  |
 | success | Double? |  yes  |  |

---


 
 
 #### [DeliveryDetailsRequest](#DeliveryDetailsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | String? |  yes  |  |
 | pageNo | Double? |  yes  |  |
 | pageSize | Double? |  yes  |  |
 | startDate | String? |  yes  |  |
 | endDate | String? |  yes  |  |
 | event | ArrayList<[EventDeliveryDetailSchema](#EventDeliveryDetailSchema)>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [EventDeliveryDetailSchema](#EventDeliveryDetailSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | eventCategory | String? |  yes  |  |
 | version | String? |  yes  |  |

---


 
 
 #### [DeliveryDetailsResponse](#DeliveryDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rows | ArrayList<[EventProcessReportObject](#EventProcessReportObject)>? |  yes  |  |
 | page | [Page](#Page)? |  yes  |  |

---


 
 
 #### [EventProcessReportObject](#EventProcessReportObject)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventName | String? |  yes  | The name of the processed event. |
 | responseCode | Integer? |  yes  | The response code of the event. |
 | responseMessage | String? |  yes  | The response message of the event. |
 | data | String? |  yes  | The data associated with the event. |
 | attempt | Integer? |  yes  | The attempt number of the event. |
 | lastAttemptedOn | Double? |  yes  | The timestamp of the last attempted event. |
 | status | String? |  yes  | The status of the event (e.g., "FAILED"). |
 | name | String? |  yes  | The name of the event. |
 | webhookUrl | String? |  yes  | The webhook URL associated with the event. |
 | responseTime | Integer? |  yes  | The response time of the event. |
 | messageId | String? |  yes  |  |
 | eventTraceId | String? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | current | Double? |  yes  | The current page number. |
 | hasNext | Boolean? |  yes  | Indicates if there is a next page. |
 | hasPrevious | Boolean? |  yes  | Indicates if there is a previous page. |
 | totalPage | Integer? |  yes  |  |
 | itemTotal | Double? |  yes  | The total number of items. |
 | size | Double? |  yes  | The number of items per page. |
 | type | String? |  yes  | Type of the response (e.g., "number"). |

---


 
 
 #### [DeliveryEventLevelSchema](#DeliveryEventLevelSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | event | String? |  yes  |  |
 | success | Double? |  yes  |  |
 | failed | Double? |  yes  |  |
 | failedPercentage | Double? |  yes  |  |
 | removedWebhooks | Double? |  yes  |  |
 | total | Double? |  yes  |  |
 | responseTime | Double? |  yes  |  |

---


 
 
 #### [DeliverySummaryResponse](#DeliverySummaryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryEventLevel | ArrayList<[DeliveryEventLevelSchema](#DeliveryEventLevelSchema)>? |  yes  |  |
 | deliverySummary | [DeliverySummarySchema](#DeliverySummarySchema)? |  yes  |  |

---


 
 
 #### [DeliverySummarySchema](#DeliverySummarySchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Double? |  yes  |  |
 | responseTime | Double? |  yes  |  |
 | failedPercentage | Double? |  yes  |  |
 | removedWebhooks | Double? |  yes  |  |

---


 
 
 #### [ItemSchema](#ItemSchema)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | modifiedBy | String? |  yes  |  |
 | name | String? |  yes  |  |
 | webhookUrl | String? |  yes  |  |
 | association | [Association](#Association)? |  yes  |  |
 | customHeaders | HashMap<String,Object>? |  yes  |  |
 | status | String? |  yes  |  |
 | emailId | String? |  yes  |  |
 | updatedOn | String? |  yes  |  |
 | createdOn | String? |  yes  |  |
 | type | String? |  yes  |  |
 | authMeta | [AuthMeta](#AuthMeta)? |  yes  |  |
 | eventConfigs | ArrayList<[EventConfigResponse](#EventConfigResponse)>? |  yes  |  |
 | eventId | ArrayList<Integer>? |  yes  |  |

---



