



##### [Back to Public docs](./README.md)

## Webhook Methods
Webhook dispatcher with retry and one event to many subscriber vice versa

Default
* [fetchAllWebhookEvents](#fetchallwebhookevents)
* [queryWebhookEventDetails](#querywebhookeventdetails)




## Methods with example and description



### fetchAllWebhookEvents
Get All Webhook Events




```java
publicClient.webhook.fetchAllWebhookEvents() {
  //use response
}
```




Get All Webhook Events

*Returned Response:*




[EventConfigResponse](#EventConfigResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### queryWebhookEventDetails
Send webhook event name, type, version, category in request body to get complete details of event from server




```java
publicClient.webhook.queryWebhookEventDetails(body body) {
  //use response
}
```



| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [List<EventConfigBase>](#List<EventConfigBase>) | yes | Request body |


Get Webhook Event Details for provided events

*Returned Response:*




[EventConfigResponse](#EventConfigResponse)

Success




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---




### Schemas

 
 
 #### [EventConfig](#EventConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Integer? |  yes  |  |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | eventCategory | String? |  yes  |  |
 | version | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | description | String? |  yes  |  |
 | createdOn | String? |  yes  |  |

---


 
 
 #### [EventConfigResponse](#EventConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventConfigs | ArrayList<[EventConfig](#EventConfig)>? |  yes  |  |

---


 
 
 #### [EventConfigBase](#EventConfigBase)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eventName | String? |  yes  |  |
 | eventType | String? |  yes  |  |
 | eventCategory | String? |  yes  |  |
 | version | String? |  yes  |  |

---



