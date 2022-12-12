

package com.sdk.platform;

import com.fasterxml.jackson.annotation.*;
import com.sdk.application.*;
import lombok.*;

import java.util.*;

public class PlatformModels {


/*
    Model: ApplicationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationResponse {
    
    
    
    
    @JsonProperty("application")
    private Application application;
    
    
    
    
}

/*
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Currency {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
}

/*
    Model: Domain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Domain {
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: ApplicationWebsite
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationWebsite {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
    
}

/*
    Model: ApplicationCors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCors {
    
    
    
    
    @JsonProperty("domains")
    private List<String> domains;
    
    
    
    
}

/*
    Model: ApplicationAuth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationAuth {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: ApplicationRedirections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationRedirections {
    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ApplicationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationMeta {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SecureUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SecureUrl {
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: Application
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Application {
    
    
    
    
    @JsonProperty("website")
    private ApplicationWebsite website;
    
    
    
    
    @JsonProperty("cors")
    private ApplicationCors cors;
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("cache_ttl")
    private Integer cacheTtl;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("redirections")
    private List<ApplicationRedirections> redirections;
    
    
    
    
    @JsonProperty("meta")
    private List<ApplicationMeta> meta;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    @JsonProperty("app_type")
    private String appType;
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
}

/*
    Model: NotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotFound {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequest {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: LocationDefaultLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDefaultLanguage {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: LocationDefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDefaultCurrency {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: LocationCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationCountry {
    
    
    
    
    @JsonProperty("capital")
    private String capital;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("parent")
    private String parent;
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("default_currency")
    private LocationDefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("default_language")
    private LocationDefaultLanguage defaultLanguage;
    
    
    
    
}

/*
    Model: Locations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Locations {
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}




/*
    Model: TicketList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketList {
    
    
    
    
    @JsonProperty("items")
    private List<Ticket> items;
    
    
    
    
    @JsonProperty("filters")
    private Filter filters;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Page
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page {
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: TicketHistoryList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketHistoryList {
    
    
    
    
    @JsonProperty("items")
    private List<TicketHistory> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CustomFormList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomFormList {
    
    
    
    
    @JsonProperty("items")
    private List<CustomForm> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CreateCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateCustomFormPayload {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    @JsonProperty("priority")
    private PriorityEnum priority;
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
}

/*
    Model: EditCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditCustomFormPayload {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("priority")
    private PriorityEnum priority;
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
}

/*
    Model: EditTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditTicketPayload {
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("sub_category")
    private String subCategory;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("priority")
    private PriorityEnum priority;
    
    
    
    
    @JsonProperty("assigned_to")
    private AgentChangePayload assignedTo;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: AgentChangePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AgentChangePayload {
    
    
    
    
    @JsonProperty("agent_id")
    private String agentId;
    
    
    
    
}

/*
    Model: CreateVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateVideoRoomResponse {
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
    
}

/*
    Model: CloseVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CloseVideoRoomResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: CreateVideoRoomPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateVideoRoomPayload {
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
    
    @JsonProperty("notify")
    private List<NotifyUser> notify;
    
    
    
    
}

/*
    Model: NotifyUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotifyUser {
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
}

/*
    Model: Filter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Filter {
    
    
    
    
    @JsonProperty("priorities")
    private List<Priority> priorities;
    
    
    
    
    @JsonProperty("categories")
    private List<TicketCategory> categories;
    
    
    
    
    @JsonProperty("statuses")
    private List<Status> statuses;
    
    
    
    
    @JsonProperty("assignees")
    private List<Object> assignees;
    
    
    
    
}

/*
    Model: TicketHistoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketHistoryPayload {
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("type")
    private HistoryTypeEnum type;
    
    
    
    
}

/*
    Model: CustomFormSubmissionPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomFormSubmissionPayload {
    
    
    
    
    @JsonProperty("response")
    private List<Object> response;
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
    
}

/*
    Model: GetTokenForVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetTokenForVideoRoomResponse {
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
    
}

/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetParticipantsInsideVideoRoomResponse {
    
    
    
    
    @JsonProperty("participants")
    private List<Participant> participants;
    
    
    
    
}

/*
    Model: Participant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Participant {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("identity")
    private String identity;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: Email
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Email {
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: Debug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Debug {
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: SubmitCustomFormResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubmitCustomFormResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("ticket")
    private Ticket ticket;
    
    
    
    
}

/*
    Model: TicketContext
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketContext {
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
}

/*
    Model: CreatedOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedOn {
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
}

/*
    Model: TicketAsset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketAsset {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private TicketAssetTypeEnum type;
    
    
    
    
}

/*
    Model: TicketContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketContent {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    @Getter(AccessLevel.NONE)
    private String description_b64;

    public String getDescription_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.description_b64));
    }
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
    
}

/*
    Model: AddTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddTicketPayload {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("priority")
    private PriorityEnum priority;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: Priority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Priority {
    
    
    
    
    @JsonProperty("key")
    private PriorityEnum key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: Status
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Status {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: TicketCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketCategory {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("form")
    private CustomForm form;
    
    
    
    
    @JsonProperty("sub_categories")
    private List<TicketSubCategory> subCategories;
    
    
    
    
    @JsonProperty("feedback_form")
    private TicketFeedbackForm feedbackForm;
    
    
    
    
}

/*
    Model: TicketSubCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketSubCategory {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: TicketFeedbackForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketFeedbackForm {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("display")
    private List<Object> display;
    
    
    
    
}

/*
    Model: TicketFeedbackList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketFeedbackList {
    
    
    
    
    @JsonProperty("items")
    private List<TicketFeedback> items;
    
    
    
    
}

/*
    Model: TicketFeedbackPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketFeedbackPayload {
    
    
    
    
    @JsonProperty("form_response")
    private Object formResponse;
    
    
    
    
}

/*
    Model: SubmitButton
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubmitButton {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("title_color")
    private String titleColor;
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: PollForAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PollForAssignment {
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    @JsonProperty("failure_message")
    private String failureMessage;
    
    
    
    
}

/*
    Model: CustomForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomForm {
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    @JsonProperty("submit_button")
    private SubmitButton submitButton;
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: CommunicationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommunicationDetails {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SupportGeneralConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SupportGeneralConfig {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("support_email")
    private CommunicationDetails supportEmail;
    
    
    
    
    @JsonProperty("support_phone")
    private CommunicationDetails supportPhone;
    
    
    
    
    @JsonProperty("support_faq")
    private CommunicationDetails supportFaq;
    
    
    
    
    @JsonProperty("show_communication_info")
    private Boolean showCommunicationInfo;
    
    
    
    
    @JsonProperty("show_support_dris")
    private Boolean showSupportDris;
    
    
    
    
    @JsonProperty("integration")
    private Object integration;
    
    
    
    
}

/*
    Model: FeedbackResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FeedbackResponseItem {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: TicketFeedback
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketFeedback {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("response")
    private List<FeedbackResponseItem> response;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: TicketHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TicketHistory {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Ticket
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ticket {
    
    
    
    
    @JsonProperty("context")
    private TicketContext context;
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    @JsonProperty("response_id")
    private String responseId;
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("category")
    private TicketCategory category;
    
    
    
    
    @JsonProperty("sub_category")
    private TicketSubCategory subCategory;
    
    
    
    
    @JsonProperty("source")
    private TicketSourceEnum source;
    
    
    
    
    @JsonProperty("status")
    private Status status;
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("assigned_to")
    private Object assignedTo;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("is_feedback_pending")
    private Boolean isFeedbackPending;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}


    
    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    @Getter
    public enum PriorityEnum {

        
        low("low"), 
        
        medium("medium"), 
        
        high("high"), 
        
        urgent("urgent");
        

        private String priority;
        PriorityEnum(String priority) {
            this.priority = priority;
        }
    }


    
    /*
        Enum: HistoryTypeEnum
        Used By: Lead
    */
    @Getter
    public enum HistoryTypeEnum {

        
        rating("rating"), 
        
        log("log"), 
        
        comment("comment");
        

        private String priority;
        HistoryTypeEnum(String priority) {
            this.priority = priority;
        }
    }


    
    /*
        Enum: TicketAssetTypeEnum
        Used By: Lead
    */
    @Getter
    public enum TicketAssetTypeEnum {

        
        image("image"), 
        
        video("video"), 
        
        file("file"), 
        
        youtube("youtube"), 
        
        product("product"), 
        
        collection("collection"), 
        
        brand("brand"), 
        
        shipment("shipment"), 
        
        order("order");
        

        private String priority;
        TicketAssetTypeEnum(String priority) {
            this.priority = priority;
        }
    }


    
    /*
        Enum: TicketSourceEnum
        Used By: Lead
    */
    @Getter
    public enum TicketSourceEnum {

        
        platformPanel("platform_panel"), 
        
        salesChannel("sales_channel");
        

        private String priority;
        TicketSourceEnum(String priority) {
            this.priority = priority;
        }
    }




/*
    Model: AvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSchema {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sections")
    private List<AvailablePageSchemaSections> sections;
    
    
    
    
    @JsonProperty("sections_meta")
    private List<AvailablePageSectionMetaAttributes> sectionsMeta;
    
    
    
    
    @JsonProperty("theme")
    private String theme;
    
    
    
    
    @JsonProperty("seo")
    private AvailablePageSeo seo;
    
    
    
    
    @JsonProperty("props")
    private List<Object> props;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: AvailablePageSectionMetaAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSectionMetaAttributes {
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
}

/*
    Model: AvailablePageSeo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSeo {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: AvailablePageSchemaSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageSchemaSections {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    @JsonProperty("preset")
    private Object preset;
    
    
    
    
    @JsonProperty("predicate")
    private AvailablePagePredicate predicate;
    
    
    
    
}

/*
    Model: AvailablePageScreenPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageScreenPredicate {
    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    @JsonProperty("desktop")
    private Boolean desktop;
    
    
    
    
    @JsonProperty("tablet")
    private Boolean tablet;
    
    
    
    
}

/*
    Model: AvailablePageUserPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageUserPredicate {
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
}

/*
    Model: AvailablePageRoutePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePageRoutePredicate {
    
    
    
    
    @JsonProperty("selected")
    private String selected;
    
    
    
    
    @JsonProperty("exact_url")
    private String exactUrl;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
}

/*
    Model: AvailablePagePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AvailablePagePredicate {
    
    
    
    
    @JsonProperty("screen")
    private AvailablePageScreenPredicate screen;
    
    
    
    
    @JsonProperty("user")
    private AvailablePageUserPredicate user;
    
    
    
    
    @JsonProperty("route")
    private AvailablePageRoutePredicate route;
    
    
    
    
}

/*
    Model: AllAvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllAvailablePageSchema {
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
    
}

/*
    Model: PaginationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaginationSchema {
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
}

/*
    Model: ThemesListingResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemesListingResponseSchema {
    
    
    
    
    @JsonProperty("items")
    private List<ThemesSchema> items;
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
    
}

/*
    Model: AddThemeRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddThemeRequestSchema {
    
    
    
    
    @JsonProperty("theme_id")
    private String themeId;
    
    
    
    
}

/*
    Model: UpgradableThemeSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpgradableThemeSchema {
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    @JsonProperty("applied_theme")
    private String appliedTheme;
    
    
    
    
    @JsonProperty("upgrade")
    private Boolean upgrade;
    
    
    
    
}

/*
    Model: FontsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FontsSchema {
    
    
    
    
    @JsonProperty("items")
    private FontsSchemaItems items;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: BlitzkriegApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlitzkriegApiErrorSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BlitzkriegNotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlitzkriegNotFoundSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlitzkriegInternalServerErrorSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: FontsSchemaItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FontsSchemaItems {
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    @JsonProperty("variants")
    private List<String> variants;
    
    
    
    
    @JsonProperty("subsets")
    private List<String> subsets;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("files")
    private FontsSchemaItemsFiles files;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
}

/*
    Model: FontsSchemaItemsFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FontsSchemaItemsFiles {
    
    
    
    
    @JsonProperty("regular")
    private String regular;
    
    
    
    
    @JsonProperty("italic")
    private String italic;
    
    
    
    
    @JsonProperty("bold")
    private String bold;
    
    
    
    
}

/*
    Model: ThemesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThemesSchema {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("applied")
    private Boolean applied;
    
    
    
    
    @JsonProperty("customized")
    private Boolean customized;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("parent_theme_version")
    private String parentThemeVersion;
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    @JsonProperty("information")
    private Information information;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("src")
    private Src src;
    
    
    
    
    @JsonProperty("assets")
    private AssetsSchema assets;
    
    
    
    
    @JsonProperty("available_sections")
    private List<availableSectionSchema> availableSections;
    
    
    
    
    @JsonProperty("styles")
    private Object styles;
    
    
    
    
    @JsonProperty("config")
    private Config config;
    
    
    
    
    @JsonProperty("font")
    private Font font;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("colors")
    private Colors colors;
    
    
    
    
}

/*
    Model: availableSectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class availableSectionSchema {
    
    
    
    
    @JsonProperty("blocks")
    private List<Blocks> blocks;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
    
}

/*
    Model: Information
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Information {
    
    
    
    
    @JsonProperty("images")
    private Images images;
    
    
    
    
    @JsonProperty("features")
    private List<String> features;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: Images
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Images {
    
    
    
    
    @JsonProperty("desktop")
    private List<String> desktop;
    
    
    
    
    @JsonProperty("android")
    private List<String> android;
    
    
    
    
    @JsonProperty("ios")
    private List<String> ios;
    
    
    
    
    @JsonProperty("thumbnail")
    private List<String> thumbnail;
    
    
    
    
}

/*
    Model: Src
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Src {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: AssetsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AssetsSchema {
    
    
    
    
    @JsonProperty("umd_js")
    private UmdJs umdJs;
    
    
    
    
    @JsonProperty("common_js")
    private CommonJs commonJs;
    
    
    
    
    @JsonProperty("css")
    private Css css;
    
    
    
    
}

/*
    Model: UmdJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UmdJs {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("links")
    private List<String> links;
    
    
    
    
}

/*
    Model: CommonJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonJs {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: Css
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Css {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("links")
    private List<String> links;
    
    
    
    
}

/*
    Model: Sections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Sections {
    
    
    
    
    @JsonProperty("attributes")
    private String attributes;
    
    
    
    
}

/*
    Model: Config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Config {
    
    
    
    
    @JsonProperty("preset")
    private Preset preset;
    
    
    
    
    @JsonProperty("global_schema")
    private GlobalSchema globalSchema;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("list")
    private List<ListSchemaItem> list;
    
    
    
    
}

/*
    Model: Preset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Preset {
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
    
}

/*
    Model: GlobalSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSchema {
    
    
    
    
    @JsonProperty("props")
    private List<GlobalSchemaProps> props;
    
    
    
    
}

/*
    Model: ListSchemaItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListSchemaItem {
    
    
    
    
    @JsonProperty("global_config")
    private Object globalConfig;
    
    
    
    
    @JsonProperty("page")
    private List<ConfigPage> page;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: Colors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Colors {
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("secondary_color")
    private String secondaryColor;
    
    
    
    
    @JsonProperty("accent_color")
    private String accentColor;
    
    
    
    
    @JsonProperty("link_color")
    private String linkColor;
    
    
    
    
    @JsonProperty("button_secondary_color")
    private String buttonSecondaryColor;
    
    
    
    
}

/*
    Model: Custom
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Custom {
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
    
}

/*
    Model: ConfigPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigPage {
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
    @JsonProperty("page")
    private String page;
    
    
    
    
}

/*
    Model: Font
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Font {
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    @JsonProperty("variants")
    private Variants variants;
    
    
    
    
}

/*
    Model: Variants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Variants {
    
    
    
    
    @JsonProperty("medium")
    private Medium medium;
    
    
    
    
    @JsonProperty("semi_bold")
    private SemiBold semiBold;
    
    
    
    
    @JsonProperty("bold")
    private Bold bold;
    
    
    
    
    @JsonProperty("light")
    private Light light;
    
    
    
    
    @JsonProperty("regular")
    private Regular regular;
    
    
    
    
}

/*
    Model: Medium
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Medium {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: SemiBold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SemiBold {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Bold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Bold {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Light
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Light {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Regular
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Regular {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
    
}

/*
    Model: Blocks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Blocks {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
    
}

/*
    Model: GlobalSchemaProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalSchemaProps {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
}

/*
    Model: BlocksProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlocksProps {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}




/*
    Model: BlockUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlockUserRequestSchema {
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
}

/*
    Model: ArchiveUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArchiveUserRequestSchema {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: DeleteApplicationUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteApplicationUserRequestSchema {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("reason_id")
    private String reasonId;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: UnDeleteUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnDeleteUserRequestSchema {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("reason_id")
    private String reasonId;
    
    
    
    
}

/*
    Model: EditEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditEmailRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendVerificationLinkMobileRequestSchema {
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
}

/*
    Model: EditMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditMobileRequestSchema {
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: EditProfileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditProfileRequestSchema {
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private EditProfileMobileSchema mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: EditProfileMobileSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditProfileMobileSchema {
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: SendEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendEmailOtpRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailOtpRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: VerifyOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpRequestSchema {
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: SendMobileOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendMobileOtpRequestSchema {
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    @JsonProperty("force")
    private String force;
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
}

/*
    Model: UpdatePasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePasswordRequestSchema {
    
    
    
    
    @JsonProperty("old_password")
    private String oldPassword;
    
    
    
    
    @JsonProperty("new_password")
    private String newPassword;
    
    
    
    
}

/*
    Model: FormRegisterRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FormRegisterRequestSchema {
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("phone")
    private FormRegisterRequestSchemaPhone phone;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: TokenRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TokenRequestBodySchema {
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: ForgotPasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ForgotPasswordRequestSchema {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
}

/*
    Model: CodeRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CodeRequestBodySchema {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: SendResetPasswordEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendResetPasswordEmailRequestSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
}

/*
    Model: PasswordLoginRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PasswordLoginRequestSchema {
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: SendOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpRequestSchema {
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: OAuthRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestSchema {
    
    
    
    
    @JsonProperty("is_signed_in")
    private Boolean isSignedIn;
    
    
    
    
    @JsonProperty("oauth2")
    private OAuthRequestSchemaOauth2 oauth2;
    
    
    
    
    @JsonProperty("profile")
    private OAuthRequestSchemaProfile profile;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestAppleSchema {
    
    
    
    
    @JsonProperty("user_identifier")
    private String userIdentifier;
    
    
    
    
    @JsonProperty("oauth")
    private OAuthRequestAppleSchemaOauth oauth;
    
    
    
    
    @JsonProperty("profile")
    private OAuthRequestAppleSchemaProfile profile;
    
    
    
    
}

/*
    Model: UserObjectSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserObjectSchema {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: AuthSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthSuccess {
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: SendOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpResponse {
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: ProfileEditSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileEditSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
}

/*
    Model: LoginSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoginSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: VerifyOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
}

/*
    Model: ResetPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResetPasswordSuccess {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: RegisterFormSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterFormSuccess {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: VerifyEmailSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailSuccess {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: HasPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HasPasswordSuccess {
    
    
    
    
    @JsonProperty("result")
    private Boolean result;
    
    
    
    
}

/*
    Model: LogoutSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogoutSuccess {
    
    
    
    
    @JsonProperty("logout")
    private Boolean logout;
    
    
    
    
}

/*
    Model: BlockUserSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlockUserSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ArchiveUserSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArchiveUserSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: DeleteUserSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteUserSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UnDeleteUserSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnDeleteUserSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: OtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtpSuccess {
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: EmailOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailOtpSuccess {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SessionListSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionListSuccess {
    
    
    
    
    @JsonProperty("sessions")
    private List<String> sessions;
    
    
    
    
}

/*
    Model: VerifyMobileOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyMobileOTPSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
    
}

/*
    Model: VerifyEmailOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyEmailOTPSuccess {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: SendMobileVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendMobileVerifyLinkSuccess {
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
    
}

/*
    Model: SendEmailVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendEmailVerifyLinkSuccess {
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
}

/*
    Model: UserSearchResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSearchResponseSchema {
    
    
    
    
    @JsonProperty("users")
    private List<UserSchema> users;
    
    
    
    
}

/*
    Model: CustomerListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomerListResponseSchema {
    
    
    
    
    @JsonProperty("items")
    private List<UserSchema> items;
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
    
}

/*
    Model: SessionListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionListResponseSchema {
    
    
    
    
    @JsonProperty("items")
    private List<String> items;
    
    
    
    
}

/*
    Model: SessionDeleteResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SessionDeleteResponseSchema {
    
    
    
    
    @JsonProperty("items")
    private List<String> items;
    
    
    
    
}

/*
    Model: UnauthorizedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnauthorizedSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: UnauthenticatedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnauthenticatedSchema {
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
}

/*
    Model: NotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotFoundSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AuthenticationInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthenticationInternalServerErrorSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AuthenticationApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthenticationApiErrorSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    
    
    
    
}

/*
    Model: ProfileEditSuccessSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileEditSuccessSchema {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
}

/*
    Model: FormRegisterRequestSchemaPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FormRegisterRequestSchemaPhone {
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
}

/*
    Model: OAuthRequestSchemaOauth2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestSchemaOauth2 {
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("refresh_token")
    private String refreshToken;
    
    
    
    
}

/*
    Model: OAuthRequestSchemaProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestSchemaProfile {
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchemaOauth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestAppleSchemaOauth {
    
    
    
    
    @JsonProperty("identity_token")
    private String identityToken;
    
    
    
    
}

/*
    Model: OAuthRequestAppleSchemaProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthRequestAppleSchemaProfile {
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
}

/*
    Model: AuthSuccessUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthSuccessUser {
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("debug")
    private AuthSuccessUserDebug debug;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("emails")
    private AuthSuccessUserEmails emails;
    
    
    
    
}

/*
    Model: AuthSuccessUserDebug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthSuccessUserDebug {
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: AuthSuccessUserEmails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthSuccessUserEmails {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: CreateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserRequestSchema {
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CreateUserResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserResponseSchema {
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
}

/*
    Model: CreateUserSessionRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserSessionRequestSchema {
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: CreateUserSessionResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUserSessionResponseSchema {
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    @JsonProperty("secure")
    private Boolean secure;
    
    
    
    
    @JsonProperty("http_only")
    private Boolean httpOnly;
    
    
    
    
    @JsonProperty("cookie")
    private Object cookie;
    
    
    
    
}

/*
    Model: PlatformSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformSchema {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("look_and_feel")
    private LookAndFeel lookAndFeel;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("forgot_password")
    private Boolean forgotPassword;
    
    
    
    
    @JsonProperty("login")
    private Login login;
    
    
    
    
    @JsonProperty("skip_captcha")
    private Boolean skipCaptcha;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private MetaSchema meta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("social")
    private Social social;
    
    
    
    
    @JsonProperty("required_fields")
    private RequiredFields requiredFields;
    
    
    
    
    @JsonProperty("register_required_fields")
    private RegisterRequiredFields registerRequiredFields;
    
    
    
    
    @JsonProperty("skip_login")
    private Boolean skipLogin;
    
    
    
    
    @JsonProperty("flash_card")
    private FlashCard flashCard;
    
    
    
    
    @JsonProperty("subtext")
    private String subtext;
    
    
    
    
    @JsonProperty("social_tokens")
    private SocialTokens socialTokens;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("register")
    private Boolean register;
    
    
    
    
    @JsonProperty("mobile_image")
    private String mobileImage;
    
    
    
    
    @JsonProperty("desktop_image")
    private String desktopImage;
    
    
    
    
    @JsonProperty("delete_account_day")
    private Integer deleteAccountDay;
    
    
    
    
    @JsonProperty("delete_account_reasons")
    private List<DeleteAccountReasons> deleteAccountReasons;
    
    
    
    
    @JsonProperty("delete_account_consent")
    private Object deleteAccountConsent;
    
    
    
    
}

/*
    Model: LookAndFeel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LookAndFeel {
    
    
    
    
    @JsonProperty("card_position")
    private String cardPosition;
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: Login
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Login {
    
    
    
    
    @JsonProperty("password")
    private Boolean password;
    
    
    
    
    @JsonProperty("otp")
    private Boolean otp;
    
    
    
    
}

/*
    Model: MetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaSchema {
    
    
    
    
    @JsonProperty("fynd_default")
    private Boolean fyndDefault;
    
    
    
    
}

/*
    Model: Social
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Social {
    
    
    
    
    @JsonProperty("account_kit")
    private Boolean accountKit;
    
    
    
    
    @JsonProperty("facebook")
    private Boolean facebook;
    
    
    
    
    @JsonProperty("google")
    private Boolean google;
    
    
    
    
    @JsonProperty("apple")
    private Boolean apple;
    
    
    
    
}

/*
    Model: RequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RequiredFields {
    
    
    
    
    @JsonProperty("email")
    private PlatformEmail email;
    
    
    
    
    @JsonProperty("mobile")
    private PlatformMobile mobile;
    
    
    
    
}

/*
    Model: PlatformEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformEmail {
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: PlatformMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformMobile {
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: RegisterRequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterRequiredFields {
    
    
    
    
    @JsonProperty("email")
    private RegisterRequiredFieldsEmail email;
    
    
    
    
    @JsonProperty("mobile")
    private RegisterRequiredFieldsMobile mobile;
    
    
    
    
}

/*
    Model: RegisterRequiredFieldsEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterRequiredFieldsEmail {
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: RegisterRequiredFieldsMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegisterRequiredFieldsMobile {
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
}

/*
    Model: FlashCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FlashCard {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("text_color")
    private String textColor;
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
}

/*
    Model: SocialTokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SocialTokens {
    
    
    
    
    @JsonProperty("facebook")
    private Facebook facebook;
    
    
    
    
    @JsonProperty("account_kit")
    private Accountkit accountKit;
    
    
    
    
    @JsonProperty("google")
    private Google google;
    
    
    
    
}

/*
    Model: DeleteAccountReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteAccountReasons {
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("reason_id")
    private String reasonId;
    
    
    
    
    @JsonProperty("show_text_area")
    private Boolean showTextArea;
    
    
    
    
}

/*
    Model: DeleteAccountConsent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteAccountConsent {
    
    
    
    
    @JsonProperty("consent_text")
    private String consentText;
    
    
    
    
}

/*
    Model: Facebook
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Facebook {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Accountkit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Accountkit {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Google
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Google {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: UpdateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateUserRequestSchema {
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("external_id")
    private String externalId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: UserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSchema {
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("phone_numbers")
    private List<PhoneNumber> phoneNumbers;
    
    
    
    
    @JsonProperty("emails")
    private List<Email> emails;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    @JsonProperty("debug")
    private Debug debug;
    
    
    
    
    @JsonProperty("has_old_password_hash")
    private Boolean hasOldPasswordHash;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: PhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneNumber {
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
}




/*
    Model: ApplicationLegal
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLegal {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("tnc")
    private String tnc;
    
    
    
    
    @JsonProperty("policy")
    private String policy;
    
    
    
    
    @JsonProperty("shipping")
    private String shipping;
    
    
    
    
    @JsonProperty("returns")
    private String returns;
    
    
    
    
    @JsonProperty("faq")
    private List<ApplicationLegalFAQ> faq;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: ApplicationLegalFAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationLegalFAQ {
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: PathMappingSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PathMappingSchema {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("redirections")
    private List<RedirectionSchema> redirections;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: RedirectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedirectionSchema {
    
    
    
    
    @JsonProperty("redirect_from")
    private String redirectFrom;
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
}

/*
    Model: SeoComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoComponent {
    
    
    
    
    @JsonProperty("seo")
    private SeoSchema seo;
    
    
    
    
}

/*
    Model: SeoSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoSchema {
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("robots_txt")
    private String robotsTxt;
    
    
    
    
    @JsonProperty("sitemap_enabled")
    private Boolean sitemapEnabled;
    
    
    
    
    @JsonProperty("custom_meta_tags")
    private List<Object> customMetaTags;
    
    
    
    
    @JsonProperty("details")
    private Detail details;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: CustomMetaTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomMetaTag {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: Detail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Detail {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: AnnouncementPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementPageSchema {
    
    
    
    
    @JsonProperty("page_slug")
    private String pageSlug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: EditorMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EditorMeta {
    
    
    
    
    @JsonProperty("foreground_color")
    private String foregroundColor;
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: AnnouncementAuthorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementAuthorSchema {
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: AdminAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AdminAnnouncementSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    @JsonProperty("pages")
    private List<AnnouncementPageSchema> pages;
    
    
    
    
    @JsonProperty("editor_meta")
    private EditorMeta editorMeta;
    
    
    
    
    @JsonProperty("author")
    private AnnouncementAuthorSchema author;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
}

/*
    Model: ScheduleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ScheduleSchema {
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
    
}

/*
    Model: NextSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NextSchedule {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: AnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementSchema {
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    @JsonProperty("schedule")
    private ScheduleStartSchema schedule;
    
    
    
    
}

/*
    Model: ScheduleStartSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ScheduleStartSchema {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: BlogGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogGetResponse {
    
    
    
    
    @JsonProperty("items")
    private List<BlogSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResourceContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourceContent {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: Asset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Asset {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: Author
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Author {
    
    
    
    
    @JsonProperty("designation")
    private String designation;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BlogSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
}

/*
    Model: SEO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEO {
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("image")
    private SEOImage image;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: SEOImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SEOImage {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: DateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DateMeta {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: BlogRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogRequest {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
}

/*
    Model: GetAnnouncementListSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAnnouncementListSchema {
    
    
    
    
    @JsonProperty("items")
    private List<AdminAnnouncementSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: CreateAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAnnouncementSchema {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private AdminAnnouncementSchema data;
    
    
    
    
}

/*
    Model: DataLoaderResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderResponseSchema {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("__source")
    private DataLoaderSourceSchema source;
    
    
    
    
}

/*
    Model: DataLoaderResetResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderResetResponseSchema {
    
    
    
    
    @JsonProperty("reset")
    private String reset;
    
    
    
    
}

/*
    Model: Navigation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Navigation {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("navigation")
    private NavigationReference navigation;
    
    
    
    
}

/*
    Model: LocaleLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocaleLanguage {
    
    
    
    
    @JsonProperty("hi")
    private Language hi;
    
    
    
    
    @JsonProperty("ar")
    private Language ar;
    
    
    
    
    @JsonProperty("en_us")
    private Language enUs;
    
    
    
    
}

/*
    Model: Language
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Language {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Action {
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionPage {
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,List<String>> params;
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,List<String>> query;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private PageType type;
    
    
    
    
}

/*
    Model: NavigationReference
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationReference {
    
    
    
    
    @JsonProperty("acl")
    private List<String> acl;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_locale_language")
    private LocaleLanguage localeLanguage;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("sort_order")
    private Integer sortOrder;
    
    
    
    
    @JsonProperty("sub_navigation")
    private List<NavigationReference> subNavigation;
    
    
    
    
}

/*
    Model: LandingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPage {
    
    
    
    
    @JsonProperty("data")
    private LandingPageSchema data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ConfigurationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationSchema {
    
    
    
    
    @JsonProperty("sleep_time")
    private Integer sleepTime;
    
    
    
    
    @JsonProperty("start_on_launch")
    private Boolean startOnLaunch;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("slide_direction")
    private String slideDirection;
    
    
    
    
}

/*
    Model: SlideshowMedia
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlideshowMedia {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("auto_decide_duration")
    private Boolean autoDecideDuration;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
}

/*
    Model: Slideshow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Slideshow {
    
    
    
    
    @JsonProperty("data")
    private SlideshowSchema data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: AnnouncementsResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementsResponseSchema {
    
    
    
    
    @JsonProperty("announcements")
    private HashMap<String,List<AnnouncementSchema>> announcements;
    
    
    
    
    @JsonProperty("refresh_rate")
    private Integer refreshRate;
    
    
    
    
    @JsonProperty("refresh_pages")
    private List<String> refreshPages;
    
    
    
    
}

/*
    Model: FaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FaqResponseSchema {
    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
    
}

/*
    Model: UpdateHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateHandpickedSchema {
    
    
    
    
    @JsonProperty("tag")
    private HandpickedTagSchema tag;
    
    
    
    
}

/*
    Model: HandpickedTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HandpickedTagSchema {
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: RemoveHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RemoveHandpickedSchema {
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: CreateTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTagSchema {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("pages")
    private List<Object> pages;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
}

/*
    Model: CreateTagRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateTagRequestSchema {
    
    
    
    
    @JsonProperty("tags")
    private List<CreateTagSchema> tags;
    
    
    
    
}

/*
    Model: DataLoaderSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderSchema {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    @JsonProperty("operation_id")
    private String operationId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("__source")
    private DataLoaderSourceSchema source;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: DataLoaderSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoaderSourceSchema {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: DataLoadersSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataLoadersSchema {
    
    
    
    
    @JsonProperty("items")
    private List<DataLoaderSchema> items;
    
    
    
    
}

/*
    Model: TagDeleteSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagDeleteSuccessResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ContentAPIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContentAPIError {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Double status;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CommonError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonError {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategorySchema {
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("children")
    private List<String> children;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: ChildrenSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChildrenSchema {
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: CategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryRequestSchema {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: FAQCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FAQCategorySchema {
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("children")
    private List<ChildrenSchema> children;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: FaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FaqSchema {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: FAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FAQ {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
}

/*
    Model: CreateFaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateFaqResponseSchema {
    
    
    
    
    @JsonProperty("faq")
    private FaqSchema faq;
    
    
    
    
}

/*
    Model: CreateFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateFaqSchema {
    
    
    
    
    @JsonProperty("faq")
    private FAQ faq;
    
    
    
    
}

/*
    Model: GetFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqSchema {
    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
    
}

/*
    Model: UpdateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateFaqCategoryRequestSchema {
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
    
}

/*
    Model: CreateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateFaqCategoryRequestSchema {
    
    
    
    
    @JsonProperty("category")
    private CategoryRequestSchema category;
    
    
    
    
}

/*
    Model: CreateFaqCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateFaqCategorySchema {
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
    
}

/*
    Model: GetFaqCategoriesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqCategoriesSchema {
    
    
    
    
    @JsonProperty("categories")
    private List<CategorySchema> categories;
    
    
    
    
}

/*
    Model: GetFaqCategoryBySlugSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetFaqCategoryBySlugSchema {
    
    
    
    
    @JsonProperty("category")
    private FAQCategorySchema category;
    
    
    
    
}

/*
    Model: LandingPageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPageGetResponse {
    
    
    
    
    @JsonProperty("items")
    private List<LandingPageSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: LandingPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPageSchema {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: DefaultNavigationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultNavigationResponse {
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
}

/*
    Model: NavigationGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationGetResponse {
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Orientation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Orientation {
    
    
    
    
    @JsonProperty("portrait")
    private List<String> portrait;
    
    
    
    
    @JsonProperty("landscape")
    private List<String> landscape;
    
    
    
    
}

/*
    Model: NavigationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    @JsonProperty("version")
    private Double version;
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
    
}

/*
    Model: NavigationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NavigationRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
    
}

/*
    Model: CustomPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomPageSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
}

/*
    Model: ContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContentSchema {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: CustomPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomPage {
    
    
    
    
    @JsonProperty("data")
    private CustomPageSchema data;
    
    
    
    
}

/*
    Model: FeatureImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FeatureImage {
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: PageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageGetResponse {
    
    
    
    
    @JsonProperty("items")
    private List<PageSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PageSpec
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSpec {
    
    
    
    
    @JsonProperty("specifications")
    private List<Object> specifications;
    
    
    
    
}

/*
    Model: PageSpecParam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSpecParam {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
}

/*
    Model: PageSpecItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSpecItem {
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("params")
    private List<PageSpecParam> params;
    
    
    
    
    @JsonProperty("query")
    private List<PageSpecParam> query;
    
    
    
    
}

/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("component_ids")
    private List<String> componentIds;
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    @JsonProperty("content_path")
    private String contentPath;
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("page_meta")
    private List<Object> pageMeta;
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("visibility")
    private Object visibility;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
}

/*
    Model: CreatedBySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreatedBySchema {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: PageContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageContent {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: PageMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageMeta {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: PageRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageRequest {
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: CronSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CronSchedule {
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
}

/*
    Model: PagePublishRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PagePublishRequest {
    
    
    
    
    @JsonProperty("publish")
    private Boolean publish;
    
    
    
    
}

/*
    Model: PageMetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageMetaSchema {
    
    
    
    
    @JsonProperty("system_pages")
    private List<NavigationSchema> systemPages;
    
    
    
    
    @JsonProperty("custom_pages")
    private List<PageSchema> customPages;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
}

/*
    Model: SlideshowGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlideshowGetResponse {
    
    
    
    
    @JsonProperty("items")
    private List<SlideshowSchema> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SlideshowSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlideshowSchema {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    @JsonProperty("media")
    private List<SlideshowMedia> media;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: SlideshowRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlideshowRequest {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    @JsonProperty("media")
    private SlideshowMedia media;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: Support
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Support {
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("contact")
    private ContactSchema contact;
    
    
    
    
}

/*
    Model: PhoneProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneProperties {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
}

/*
    Model: PhoneSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PhoneSchema {
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneProperties> phone;
    
    
    
    
}

/*
    Model: EmailProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProperties {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: EmailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailSchema {
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("email")
    private List<EmailProperties> email;
    
    
    
    
}

/*
    Model: ContactSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactSchema {
    
    
    
    
    @JsonProperty("phone")
    private PhoneSchema phone;
    
    
    
    
    @JsonProperty("email")
    private EmailSchema email;
    
    
    
    
}

/*
    Model: TagsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagsSchema {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("tags")
    private List<TagSchema> tags;
    
    
    
    
}

/*
    Model: TagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagSchema {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    @JsonProperty("pages")
    private List<Object> pages;
    
    
    
    
    @JsonProperty("__source")
    private TagSourceSchema source;
    
    
    
    
}

/*
    Model: TagSourceSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TagSourceSchema {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}


    
    /*
        Enum: PageType
        Used By: Content
    */
    @Getter
    public enum PageType {

        
        aboutUs("about-us"), 
        
        addresses("addresses"), 
        
        blog("blog"), 
        
        brands("brands"), 
        
        cards("cards"), 
        
        cart("cart"), 
        
        categories("categories"), 
        
        brand("brand"), 
        
        category("category"), 
        
        collection("collection"), 
        
        collections("collections"), 
        
        contactUs("contact-us"), 
        
        externalLink("external"), 
        
        faq("faq"), 
        
        freshchat("freshchat"), 
        
        home("home"), 
        
        notificationSettings("notification-settings"), 
        
        orders("orders"), 
        
        page("page"), 
        
        policy("policy"), 
        
        product("product"), 
        
        productReviews("product-reviews"), 
        
        addProductReview("add-product-review"), 
        
        productRequest("product-request"), 
        
        products("products"), 
        
        profile("profile"), 
        
        profileBasic("profile-basic"), 
        
        profileCompany("profile-company"), 
        
        profileEmails("profile-emails"), 
        
        profilePhones("profile-phones"), 
        
        rateUs("rate-us"), 
        
        referEarn("refer-earn"), 
        
        settings("settings"), 
        
        sharedCart("shared-cart"), 
        
        tnc("tnc"), 
        
        trackOrder("track-order"), 
        
        wishlist("wishlist"), 
        
        sections("sections"), 
        
        form("form"), 
        
        cartDelivery("cart-delivery"), 
        
        cartPayment("cart-payment"), 
        
        cartReview("cart-review"), 
        
        login("login"), 
        
        register("register"), 
        
        shippingPolicy("shipping-policy"), 
        
        returnPolicy("return-policy");
        

        private String priority;
        PageType(String priority) {
            this.priority = priority;
        }
    }




/*
    Model: UnauthenticatedUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnauthenticatedUser {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: UnauthenticatedApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnauthenticatedApplication {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: ResourceNotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResourceNotFound {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InternalServerError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalServerError {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: CheckValidityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckValidityResponse {
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
    
}

/*
    Model: PlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlanRecurring {
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_count")
    private Double intervalCount;
    
    
    
    
}

/*
    Model: Plan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Plan {
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Double trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: DetailedPlanComponents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DetailedPlanComponents {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("links")
    private Object links;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
}

/*
    Model: DetailedPlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DetailedPlan {
    
    
    
    
    @JsonProperty("recurring")
    private PlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Double trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("components")
    private List<DetailedPlanComponents> components;
    
    
    
    
}

/*
    Model: SubscriptionTrialPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionTrialPeriod {
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: EntityChargePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityChargePrice {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
}

/*
    Model: EntityChargeRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityChargeRecurring {
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
}

/*
    Model: ChargeLineItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ChargeLineItem {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    @JsonProperty("recurring")
    private EntityChargeRecurring recurring;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
}

/*
    Model: CreateSubscriptionCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSubscriptionCharge {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    @JsonProperty("line_items")
    private List<ChargeLineItem> lineItems;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("return_url")
    private String returnUrl;
    
    
    
    
}

/*
    Model: CurrentPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrentPeriod {
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: SubscriptionCharge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCharge {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("term")
    private String term;
    
    
    
    
    @JsonProperty("pricing_type")
    private String pricingType;
    
    
    
    
    @JsonProperty("price")
    private EntityChargePrice price;
    
    
    
    
    @JsonProperty("recurring")
    private EntityChargeRecurring recurring;
    
    
    
    
    @JsonProperty("capped_amount")
    private Double cappedAmount;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("billing_date")
    private String billingDate;
    
    
    
    
    @JsonProperty("current_period")
    private CurrentPeriod currentPeriod;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_test")
    private Boolean isTest;
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
}

/*
    Model: EntitySubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitySubscription {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("activated_on")
    private String activatedOn;
    
    
    
    
    @JsonProperty("cancelled_on")
    private String cancelledOn;
    
    
    
    
    @JsonProperty("trial_days")
    private Integer trialDays;
    
    
    
    
    @JsonProperty("trial_period")
    private SubscriptionTrialPeriod trialPeriod;
    
    
    
    
    @JsonProperty("metadata")
    private Object metadata;
    
    
    
    
    @JsonProperty("line_items")
    private List<SubscriptionCharge> lineItems;
    
    
    
    
}

/*
    Model: CreateSubscriptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSubscriptionResponse {
    
    
    
    
    @JsonProperty("subscription")
    private EntitySubscription subscription;
    
    
    
    
    @JsonProperty("confirm_url")
    private String confirmUrl;
    
    
    
    
}

/*
    Model: InvoiceDetailsPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPeriod {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoiceDetailsClient
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsClient {
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: InvoiceDetailsStatusTrail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsStatusTrail {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataChecks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPaymentMethodsDataChecks {
    
    
    
    
    @JsonProperty("cvc_check")
    private String cvcCheck;
    
    
    
    
    @JsonProperty("address_line1_check")
    private String addressLine1Check;
    
    
    
    
    @JsonProperty("address_postal_code_check")
    private String addressPostalCodeCheck;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataNetworks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPaymentMethodsDataNetworks {
    
    
    
    
    @JsonProperty("available")
    private List<String> available;
    
    
    
    
    @JsonProperty("preferred")
    private String preferred;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsDataThreeDSecureUsage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPaymentMethodsDataThreeDSecureUsage {
    
    
    
    
    @JsonProperty("supported")
    private Boolean supported;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethodsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPaymentMethodsData {
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("last4")
    private String last4;
    
    
    
    
    @JsonProperty("checks")
    private InvoiceDetailsPaymentMethodsDataChecks checks;
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("funding")
    private String funding;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("networks")
    private InvoiceDetailsPaymentMethodsDataNetworks networks;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("fingerprint")
    private String fingerprint;
    
    
    
    
    @JsonProperty("generated_from")
    private String generatedFrom;
    
    
    
    
    @JsonProperty("three_d_secure_usage")
    private InvoiceDetailsPaymentMethodsDataThreeDSecureUsage threeDSecureUsage;
    
    
    
    
}

/*
    Model: InvoiceDetailsPaymentMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsPaymentMethods {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
    @JsonProperty("data")
    private InvoiceDetailsPaymentMethodsData data;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: InvoicePaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicePaymentMethod {
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
}

/*
    Model: InvoiceDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetails {
    
    
    
    
    @JsonProperty("period")
    private InvoiceDetailsPeriod period;
    
    
    
    
    @JsonProperty("client")
    private InvoiceDetailsClient client;
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    @JsonProperty("attemp")
    private Integer attemp;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("status_trail")
    private List<InvoiceDetailsStatusTrail> statusTrail;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("hash_identifier")
    private String hashIdentifier;
    
    
    
    
    @JsonProperty("payment_method")
    private InvoicePaymentMethod paymentMethod;
    
    
    
    
}

/*
    Model: InvoiceItemsPlanRecurring
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPlanRecurring {
    
    
    
    
    @JsonProperty("interval")
    private String interval;
    
    
    
    
    @JsonProperty("interval_count")
    private Integer intervalCount;
    
    
    
    
}

/*
    Model: InvoiceItemsPlan
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPlan {
    
    
    
    
    @JsonProperty("recurring")
    private InvoiceItemsPlanRecurring recurring;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
    @JsonProperty("plan_group")
    private String planGroup;
    
    
    
    
    @JsonProperty("tag_lines")
    private List<String> tagLines;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("trial_period")
    private Integer trialPeriod;
    
    
    
    
    @JsonProperty("addons")
    private List<String> addons;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: InvoiceItemsPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItemsPeriod {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoiceItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceItems {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("plan")
    private InvoiceItemsPlan plan;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("period")
    private InvoiceItemsPeriod period;
    
    
    
    
    @JsonProperty("unit_amount")
    private Double unitAmount;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: Invoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Invoice {
    
    
    
    
    @JsonProperty("invoice")
    private InvoiceDetails invoice;
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
    
}

/*
    Model: InvoicesDataClient
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataClient {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("address_lines")
    private List<String> addressLines;
    
    
    
    
}

/*
    Model: InvoicesDataPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataPeriod {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: InvoicesDataPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesDataPaymentMethod {
    
    
    
    
    @JsonProperty("pg_payment_method_id")
    private String pgPaymentMethodId;
    
    
    
    
}

/*
    Model: InvoicesData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoicesData {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("client")
    private InvoicesDataClient client;
    
    
    
    
    @JsonProperty("auto_advance")
    private Boolean autoAdvance;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("paid")
    private Boolean paid;
    
    
    
    
    @JsonProperty("attemp")
    private Integer attemp;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
    @JsonProperty("pg_data")
    private Object pgData;
    
    
    
    
    @JsonProperty("period")
    private InvoicesDataPeriod period;
    
    
    
    
    @JsonProperty("receipt_number")
    private String receiptNumber;
    
    
    
    
    @JsonProperty("statement_descriptor")
    private String statementDescriptor;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("status_trail")
    private List<InvoiceDetailsStatusTrail> statusTrail;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("subscription")
    private String subscription;
    
    
    
    
    @JsonProperty("next_action_time")
    private String nextActionTime;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("hash_identifier")
    private String hashIdentifier;
    
    
    
    
    @JsonProperty("payment_method")
    private InvoicesDataPaymentMethod paymentMethod;
    
    
    
    
    @JsonProperty("invoice_items")
    private List<InvoiceItems> invoiceItems;
    
    
    
    
}

/*
    Model: Invoices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Invoices {
    
    
    
    
    @JsonProperty("data")
    private List<InvoicesData> data;
    
    
    
    
    @JsonProperty("start")
    private Integer start;
    
    
    
    
    @JsonProperty("end")
    private Integer end;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("page")
    private Integer page;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
}

/*
    Model: Phone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Phone {
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("phone_country_code")
    private String phoneCountryCode;
    
    
    
    
}

/*
    Model: SubscriptionBillingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionBillingAddress {
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("line1")
    private String line1;
    
    
    
    
    @JsonProperty("line2")
    private String line2;
    
    
    
    
    @JsonProperty("postal_code")
    private String postalCode;
    
    
    
    
}

/*
    Model: SubscriptionCustomer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCustomer {
    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: SubscriptionCustomerCreate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCustomerCreate {
    
    
    
    
    @JsonProperty("phone")
    private Phone phone;
    
    
    
    
    @JsonProperty("billing_address")
    private SubscriptionBillingAddress billingAddress;
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: SubscriptionCurrentPeriod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionCurrentPeriod {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: SubscriptionPauseCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionPauseCollection {
    
    
    
    
    @JsonProperty("behavior")
    private String behavior;
    
    
    
    
    @JsonProperty("resume_at")
    private String resumeAt;
    
    
    
    
}

/*
    Model: SubscriptionTrial
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionTrial {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: SubscriptionInvoiceSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionInvoiceSettings {
    
    
    
    
    @JsonProperty("generation")
    private Boolean generation;
    
    
    
    
    @JsonProperty("charging")
    private Boolean charging;
    
    
    
    
}

/*
    Model: Subscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Subscription {
    
    
    
    
    @JsonProperty("current_period")
    private SubscriptionCurrentPeriod currentPeriod;
    
    
    
    
    @JsonProperty("pause_collection")
    private SubscriptionPauseCollection pauseCollection;
    
    
    
    
    @JsonProperty("trial")
    private SubscriptionTrial trial;
    
    
    
    
    @JsonProperty("invoice_settings")
    private SubscriptionInvoiceSettings invoiceSettings;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("cancel_at_period_end")
    private Boolean cancelAtPeriodEnd;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("product_suite_id")
    private String productSuiteId;
    
    
    
    
    @JsonProperty("plan_data")
    private Plan planData;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("collection_method")
    private String collectionMethod;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    @JsonProperty("latest_invoice")
    private String latestInvoice;
    
    
    
    
}

/*
    Model: SubscriptionStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionStatus {
    
    
    
    
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    
    
    
    
    @JsonProperty("subscription")
    private Subscription subscription;
    
    
    
    
}

/*
    Model: SubscriptionLimitApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitApplication {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("hard_limit")
    private Integer hardLimit;
    
    
    
    
    @JsonProperty("soft_limit")
    private Integer softLimit;
    
    
    
    
}

/*
    Model: SubscriptionLimitMarketplace
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitMarketplace {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SubscriptionLimitOtherPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitOtherPlatform {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SubscriptionLimitTeam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitTeam {
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitProducts {
    
    
    
    
    @JsonProperty("bulk")
    private Boolean bulk;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitExtensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitExtensions {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimitIntegrations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimitIntegrations {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
}

/*
    Model: SubscriptionLimit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionLimit {
    
    
    
    
    @JsonProperty("application")
    private SubscriptionLimitApplication application;
    
    
    
    
    @JsonProperty("marketplace")
    private SubscriptionLimitMarketplace marketplace;
    
    
    
    
    @JsonProperty("other_platform")
    private SubscriptionLimitOtherPlatform otherPlatform;
    
    
    
    
    @JsonProperty("team")
    private SubscriptionLimitTeam team;
    
    
    
    
    @JsonProperty("products")
    private SubscriptionLimitProducts products;
    
    
    
    
    @JsonProperty("extensions")
    private SubscriptionLimitExtensions extensions;
    
    
    
    
    @JsonProperty("integrations")
    private SubscriptionLimitIntegrations integrations;
    
    
    
    
    @JsonProperty("is_trial_plan")
    private Boolean isTrialPlan;
    
    
    
    
}

/*
    Model: SubscriptionActivateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionActivateReq {
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    @JsonProperty("plan_id")
    private String planId;
    
    
    
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    
    
    
}

/*
    Model: SubscriptionActivateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionActivateRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
    
}

/*
    Model: CancelSubscriptionReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelSubscriptionReq {
    
    
    
    
    @JsonProperty("unique_id")
    private String uniqueId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product_suite")
    private String productSuite;
    
    
    
    
    @JsonProperty("subscription_id")
    private String subscriptionId;
    
    
    
    
}

/*
    Model: CancelSubscriptionRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelSubscriptionRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private Subscription data;
    
    
    
    
}




/*
    Model: StatsImported
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsImported {
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: StatsProcessedEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsProcessedEmail {
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("suppressed")
    private Integer suppressed;
    
    
    
    
}

/*
    Model: StatsProcessedSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsProcessedSms {
    
    
    
    
    @JsonProperty("success")
    private Integer success;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("suppressed")
    private Integer suppressed;
    
    
    
    
}

/*
    Model: StatsProcessed
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsProcessed {
    
    
    
    
    @JsonProperty("email")
    private StatsProcessedEmail email;
    
    
    
    
    @JsonProperty("sms")
    private StatsProcessedSms sms;
    
    
    
    
}

/*
    Model: Stats
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Stats {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("imported")
    private Object imported;
    
    
    
    
    @JsonProperty("processed")
    private Object processed;
    
    
    
    
}

/*
    Model: GetStats
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetStats {
    
    
    
    
    @JsonProperty("items")
    private List<Stats> items;
    
    
    
    
}

/*
    Model: CampaignReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CampaignReq {
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
}

/*
    Model: RecipientHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RecipientHeaders {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: CampaignEmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CampaignEmailTemplate {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: CampignEmailProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CampignEmailProvider {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    @JsonProperty("from_email")
    private String fromEmail;
    
    
    
    
}

/*
    Model: CampaignEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CampaignEmail {
    
    
    
    
    @JsonProperty("template")
    private CampaignEmailTemplate template;
    
    
    
    
    @JsonProperty("provider")
    private CampignEmailProvider provider;
    
    
    
    
}

/*
    Model: Campaign
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Campaign {
    
    
    
    
    @JsonProperty("recipient_headers")
    private RecipientHeaders recipientHeaders;
    
    
    
    
    @JsonProperty("email")
    private CampaignEmail email;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("datasource")
    private String datasource;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Campaigns
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Campaigns {
    
    
    
    
    @JsonProperty("items")
    private List<Campaign> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: BigqueryHeadersReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BigqueryHeadersReq {
    
    
    
    
    @JsonProperty("query")
    private String query;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: BigqueryHeadersResHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BigqueryHeadersResHeaders {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: BigqueryHeadersRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BigqueryHeadersRes {
    
    
    
    
    @JsonProperty("headers")
    private List<BigqueryHeadersResHeaders> headers;
    
    
    
    
}

/*
    Model: GetNRecordsCsvReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetNRecordsCsvReq {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("header")
    private Boolean header;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: GetNRecordsCsvResItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetNRecordsCsvResItems {
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("firstname")
    private String firstname;
    
    
    
    
    @JsonProperty("lastname")
    private String lastname;
    
    
    
    
    @JsonProperty("orderid")
    private String orderid;
    
    
    
    
}

/*
    Model: GetNRecordsCsvRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetNRecordsCsvRes {
    
    
    
    
    @JsonProperty("items")
    private List<GetNRecordsCsvResItems> items;
    
    
    
    
}

/*
    Model: AudienceReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AudienceReq {
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
}

/*
    Model: Audience
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Audience {
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("headers")
    private List<String> headers;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("file_url")
    private String fileUrl;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("records_count")
    private Integer recordsCount;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Audiences
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Audiences {
    
    
    
    
    @JsonProperty("items")
    private List<Audience> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EmailProviderReqFrom
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProviderReqFrom {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: EmailProviderReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProviderReq {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("from_address")
    private List<EmailProviderReqFrom> fromAddress;
    
    
    
    
}

/*
    Model: EmailProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProvider {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("from_address")
    private List<EmailProviderReqFrom> fromAddress;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailProviders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailProviders {
    
    
    
    
    @JsonProperty("items")
    private List<EmailProvider> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EmailTemplateDeleteSuccessRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateDeleteSuccessRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: EmailTemplateDeleteFailureRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateDeleteFailureRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: EmailTemplateKeys
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateKeys {
    
    
    
    
    @JsonProperty("to")
    private String to;
    
    
    
    
    @JsonProperty("cc")
    private String cc;
    
    
    
    
    @JsonProperty("bcc")
    private String bcc;
    
    
    
    
}

/*
    Model: EmailTemplateHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateHeaders {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: EmailTemplateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateReq {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("keys")
    private EmailTemplateKeys keys;
    
    
    
    
    @JsonProperty("static_to")
    private List<String> staticTo;
    
    
    
    
    @JsonProperty("static_cc")
    private List<String> staticCc;
    
    
    
    
    @JsonProperty("static_bcc")
    private List<String> staticBcc;
    
    
    
    
    @JsonProperty("reply_to")
    private String replyTo;
    
    
    
    
    @JsonProperty("headers")
    private List<EmailTemplateHeaders> headers;
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
}

/*
    Model: TemplateAndType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateAndType {
    
    
    
    
    @JsonProperty("template_type")
    private String templateType;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EmailTemplateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplateRes {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("static_to")
    private List<String> staticTo;
    
    
    
    
    @JsonProperty("static_cc")
    private List<String> staticCc;
    
    
    
    
    @JsonProperty("static_bcc")
    private List<String> staticBcc;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("keys")
    private EmailTemplateKeys keys;
    
    
    
    
    @JsonProperty("reply_to")
    private String replyTo;
    
    
    
    
    @JsonProperty("headers")
    private List<EmailTemplateHeaders> headers;
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplate {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("static_to")
    private List<Object> staticTo;
    
    
    
    
    @JsonProperty("static_cc")
    private List<Object> staticCc;
    
    
    
    
    @JsonProperty("static_bcc")
    private List<Object> staticBcc;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    @JsonProperty("headers")
    private List<Object> headers;
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SystemEmailTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemEmailTemplate {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("static_to")
    private List<Object> staticTo;
    
    
    
    
    @JsonProperty("static_cc")
    private List<Object> staticCc;
    
    
    
    
    @JsonProperty("static_bcc")
    private List<Object> staticBcc;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("from_name")
    private String fromName;
    
    
    
    
    @JsonProperty("subject")
    private TemplateAndType subject;
    
    
    
    
    @JsonProperty("html")
    private TemplateAndType html;
    
    
    
    
    @JsonProperty("text")
    private TemplateAndType text;
    
    
    
    
    @JsonProperty("headers")
    private List<Object> headers;
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EmailTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailTemplates {
    
    
    
    
    @JsonProperty("items")
    private List<EmailTemplate> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SystemEmailTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemEmailTemplates {
    
    
    
    
    @JsonProperty("items")
    private List<SystemEmailTemplate> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: PayloadEmailTemplateStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadEmailTemplateStructure {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: PayloadEmailProviderStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadEmailProviderStructure {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: PayloadEmailStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadEmailStructure {
    
    
    
    
    @JsonProperty("template")
    private PayloadEmailTemplateStructure template;
    
    
    
    
    @JsonProperty("provider")
    private PayloadEmailProviderStructure provider;
    
    
    
    
}

/*
    Model: PayloadSmsTemplateStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadSmsTemplateStructure {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: PayloadSmsProviderStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadSmsProviderStructure {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: PayloadSmsStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadSmsStructure {
    
    
    
    
    @JsonProperty("template")
    private PayloadSmsTemplateStructure template;
    
    
    
    
    @JsonProperty("provider")
    private PayloadSmsProviderStructure provider;
    
    
    
    
}

/*
    Model: PayloadStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayloadStructure {
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("email")
    private PayloadEmailStructure email;
    
    
    
    
    @JsonProperty("sms")
    private PayloadSmsStructure sms;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
}

/*
    Model: MetaStructure
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaStructure {
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("trace")
    private String trace;
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
}

/*
    Model: EngineRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EngineRequest {
    
    
    
    
    @JsonProperty("payload")
    private PayloadStructure payload;
    
    
    
    
    @JsonProperty("meta")
    private MetaStructure meta;
    
    
    
    
}

/*
    Model: EngineResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EngineResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplateSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSubscriptionTemplateSms {
    
    
    
    
    @JsonProperty("subscribed")
    private Boolean subscribed;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplateEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSubscriptionTemplateEmail {
    
    
    
    
    @JsonProperty("subscribed")
    private Boolean subscribed;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: EventSubscriptionTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSubscriptionTemplate {
    
    
    
    
    @JsonProperty("sms")
    private EventSubscriptionTemplateSms sms;
    
    
    
    
    @JsonProperty("email")
    private EventSubscriptionTemplateEmail email;
    
    
    
    
}

/*
    Model: EventSubscription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSubscription {
    
    
    
    
    @JsonProperty("template")
    private EventSubscriptionTemplate template;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("event")
    private String event;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: EventSubscriptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventSubscriptions {
    
    
    
    
    @JsonProperty("items")
    private List<EventSubscription> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: TriggerJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TriggerJobResponse {
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: TriggerJobRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TriggerJobRequest {
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
}

/*
    Model: Job
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Job {
    
    
    
    
    @JsonProperty("completed")
    private Boolean completed;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("campaign")
    private String campaign;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Jobs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Jobs {
    
    
    
    
    @JsonProperty("items")
    private List<Job> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobLog
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobLog {
    
    
    
    
    @JsonProperty("imported")
    private Object imported;
    
    
    
    
    @JsonProperty("processed")
    private Object processed;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("job")
    private String job;
    
    
    
    
    @JsonProperty("campaign")
    private String campaign;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: JobLogs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobLogs {
    
    
    
    
    @JsonProperty("items")
    private List<JobLog> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: LogEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogEmail {
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: LogPushnotification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogPushnotification {
    
    
    
    
    @JsonProperty("pushtokens")
    private List<String> pushtokens;
    
    
    
    
}

/*
    Model: LogMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogMeta {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("offset")
    private String offset;
    
    
    
    
    @JsonProperty("partition")
    private String partition;
    
    
    
    
    @JsonProperty("topic")
    private String topic;
    
    
    
    
}

/*
    Model: Log
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Log {
    
    
    
    
    @JsonProperty("email")
    private LogEmail email;
    
    
    
    
    @JsonProperty("pushnotification")
    private LogPushnotification pushnotification;
    
    
    
    
    @JsonProperty("meta")
    private LogMeta meta;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("service")
    private String service;
    
    
    
    
    @JsonProperty("step")
    private String step;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Logs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Logs {
    
    
    
    
    @JsonProperty("items")
    private List<Log> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SendOtpSmsCommsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpSmsCommsTemplate {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SendOtpEmailCommsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpEmailCommsTemplate {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SendOtpCommsReqData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsReqData {
    
    
    
    
    @JsonProperty("send_same_otp_to_channel")
    private Boolean sendSameOtpToChannel;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("to")
    private String to;
    
    
    
    
}

/*
    Model: SendOtpCommsReqSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsReqSms {
    
    
    
    
    @JsonProperty("otp_length")
    private Integer otpLength;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("template")
    private SendOtpSmsCommsTemplate template;
    
    
    
    
}

/*
    Model: SendOtpCommsReqEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsReqEmail {
    
    
    
    
    @JsonProperty("otp_length")
    private Integer otpLength;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("template")
    private SendOtpSmsCommsTemplate template;
    
    
    
    
}

/*
    Model: SendOtpCommsResSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsResSms {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
}

/*
    Model: SendOtpCommsResEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsResEmail {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("to")
    private String to;
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
}

/*
    Model: SendOtpCommsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsReq {
    
    
    
    
    @JsonProperty("data")
    private SendOtpCommsReqData data;
    
    
    
    
    @JsonProperty("sms")
    private SendOtpCommsReqSms sms;
    
    
    
    
    @JsonProperty("email")
    private SendOtpCommsReqEmail email;
    
    
    
    
}

/*
    Model: SendOtpCommsRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendOtpCommsRes {
    
    
    
    
    @JsonProperty("sms")
    private SendOtpCommsResSms sms;
    
    
    
    
    @JsonProperty("email")
    private SendOtpCommsResEmail email;
    
    
    
    
}

/*
    Model: VerifyOtpCommsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpCommsReq {
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
}

/*
    Model: VerifyOtpCommsSuccessRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpCommsSuccessRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: VerifyOtpCommsErrorRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifyOtpCommsErrorRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: PushtokenReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PushtokenReq {
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
}

/*
    Model: PushtokenRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PushtokenRes {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("expired_at")
    private String expiredAt;
    
    
    
    
}

/*
    Model: SmsProviderReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsProviderReq {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("authkey")
    private String authkey;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
}

/*
    Model: SmsProvider
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsProvider {
    
    
    
    
    @JsonProperty("rpt")
    private Integer rpt;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("authkey")
    private String authkey;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsProviders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsProviders {
    
    
    
    
    @JsonProperty("items")
    private List<SmsProvider> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SmsTemplateDeleteSuccessRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplateDeleteSuccessRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SmsTemplateDeleteFailureRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplateDeleteFailureRes {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SmsTemplateMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplateMessage {
    
    
    
    
    @JsonProperty("template_type")
    private String templateType;
    
    
    
    
    @JsonProperty("template")
    private String template;
    
    
    
    
}

/*
    Model: SmsTemplateReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplateReq {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    @JsonProperty("attachments")
    private List<Object> attachments;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
}

/*
    Model: SmsTemplateRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplateRes {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplate {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SystemSmsTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemSmsTemplate {
    
    
    
    
    @JsonProperty("is_system")
    private Boolean isSystem;
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tags")
    private List<Object> tags;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("message")
    private SmsTemplateMessage message;
    
    
    
    
    @JsonProperty("template_variables")
    private Object templateVariables;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: SmsTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsTemplates {
    
    
    
    
    @JsonProperty("items")
    private List<SmsTemplate> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SystemSmsTemplates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemSmsTemplates {
    
    
    
    
    @JsonProperty("items")
    private List<SystemSmsTemplate> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Notification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Notification {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("body")
    private String body;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("deeplink")
    private String deeplink;
    
    
    
    
    @JsonProperty("click_action")
    private String clickAction;
    
    
    
    
}

/*
    Model: SystemNotificationUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemNotificationUser {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: SystemNotificationSettings
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemNotificationSettings {
    
    
    
    
    @JsonProperty("sound")
    private Boolean sound;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("time_to_live")
    private String timeToLive;
    
    
    
    
}

/*
    Model: SystemNotification
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemNotification {
    
    
    
    
    @JsonProperty("notification")
    private Notification notification;
    
    
    
    
    @JsonProperty("user")
    private SystemNotificationUser user;
    
    
    
    
    @JsonProperty("settings")
    private SystemNotificationUser settings;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("group")
    private String group;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: SystemNotificationsPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemNotificationsPage {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
}

/*
    Model: SystemNotifications
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SystemNotifications {
    
    
    
    
    @JsonProperty("items")
    private List<SystemNotification> items;
    
    
    
    
    @JsonProperty("last_read_anchor")
    private Integer lastReadAnchor;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}




/*
    Model: PaymentGatewayConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigResponse {
    
    
    
    
    @JsonProperty("display_fields")
    private List<String> displayFields;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("aggregators")
    private List<Object> aggregators;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("excluded_fields")
    private List<String> excludedFields;
    
    
    
    
}

/*
    Model: ErrorCodeDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorCodeDescription {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PaymentGatewayConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfig {
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("merchant_salt")
    private String merchantSalt;
    
    
    
    
}

/*
    Model: PaymentGatewayConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayConfigRequest {
    
    
    
    
    @JsonProperty("aggregator_name")
    private PaymentGatewayConfig aggregatorName;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: PaymentGatewayToBeReviewed
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentGatewayToBeReviewed {
    
    
    
    
    @JsonProperty("aggregator")
    private List<String> aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ErrorCodeAndDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorCodeAndDescription {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: HttpErrorCodeAndResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpErrorCodeAndResponse {
    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PaymentModeLogo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeLogo {
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
}

/*
    Model: IntentAppErrorList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentAppErrorList {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
}

/*
    Model: IntentApp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntentApp {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("logos")
    private PaymentModeLogo logos;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
}

/*
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeList {
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    @JsonProperty("intent_flow")
    private Boolean intentFlow;
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    @JsonProperty("compliant_with_tokenisation_guidelines")
    private Boolean compliantWithTokenisationGuidelines;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    @JsonProperty("intent_app_error_dict_list")
    private List<IntentAppErrorList> intentAppErrorDictList;
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    @JsonProperty("intent_app")
    private List<IntentApp> intentApp;
    
    
    
    
}

/*
    Model: RootPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RootPaymentMode {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    @JsonProperty("save_card")
    private Boolean saveCard;
    
    
    
    
    @JsonProperty("is_pay_by_card_pl")
    private Boolean isPayByCardPl;
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
}

/*
    Model: PaymentOptions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptions {
    
    
    
    
    @JsonProperty("payment_option")
    private List<RootPaymentMode> paymentOption;
    
    
    
    
}

/*
    Model: PaymentOptionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentOptionsResponse {
    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptions paymentOptions;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: PayoutsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutsResponse {
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("customers")
    private Object customers;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private Object uniqueTransferNo;
    
    
    
    
    @JsonProperty("payouts_aggregators")
    private List<Object> payoutsAggregators;
    
    
    
    
    @JsonProperty("more_attributes")
    private Object moreAttributes;
    
    
    
    
}

/*
    Model: PayoutBankDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutBankDetails {
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
}

/*
    Model: PayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutRequest {
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("bank_details")
    private PayoutBankDetails bankDetails;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
}

/*
    Model: PayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PayoutResponse {
    
    
    
    
    @JsonProperty("transfer_type")
    private String transferType;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("payment_status")
    private String paymentStatus;
    
    
    
    
    @JsonProperty("unique_transfer_no")
    private String uniqueTransferNo;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("bank_details")
    private Object bankDetails;
    
    
    
    
    @JsonProperty("payouts")
    private Object payouts;
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    @JsonProperty("users")
    private Object users;
    
    
    
    
}

/*
    Model: UpdatePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutResponse {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UpdatePayoutRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatePayoutRequest {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: DeletePayoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeletePayoutResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionPaymentMethodResponse {
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: DeleteSubscriptionPaymentMethodResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteSubscriptionPaymentMethodResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SubscriptionConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriptionConfigResponse {
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("config")
    private Object config;
    
    
    
    
}

/*
    Model: SaveSubscriptionSetupIntentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentRequest {
    
    
    
    
    @JsonProperty("unique_external_id")
    private String uniqueExternalId;
    
    
    
    
}

/*
    Model: SaveSubscriptionSetupIntentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SaveSubscriptionSetupIntentResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: RefundAccountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RefundAccountResponse {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("is_verified_flag")
    private Boolean isVerifiedFlag;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: NotFoundResourceError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NotFoundResourceError {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: BankDetailsForOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BankDetailsForOTP {
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
}

/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddBeneficiaryDetailsOTPRequest {
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("details")
    private BankDetailsForOTP details;
    
    
    
    
}

/*
    Model: IfscCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IfscCodeResponse {
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: OrderBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryDetails {
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
}

/*
    Model: OrderBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBeneficiaryResponse {
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
    
}

/*
    Model: MultiTenderPaymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMeta {
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("payment_gateway")
    private String paymentGateway;
    
    
    
    
    @JsonProperty("payment_id")
    private String paymentId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
}

/*
    Model: MultiTenderPaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MultiTenderPaymentMethod {
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("meta")
    private MultiTenderPaymentMeta meta;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: PaymentConfirmationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationRequest {
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
}

/*
    Model: PaymentConfirmationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentConfirmationResponse {
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}




/*
    Model: ShipmentStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentStatus {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("hex_code")
    private String hexCode;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("actual_status")
    private String actualStatus;
    
    
    
    
    @JsonProperty("ops_status")
    private String opsStatus;
    
    
    
    
}

/*
    Model: ShipmentItemFulFillingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentItemFulFillingStore {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: UserDataInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDataInfo {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    @JsonProperty("avis_user_id")
    private String avisUserId;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("is_anonymous_user")
    private Boolean isAnonymousUser;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: PlatformItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformItem {
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: Prices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Prices {
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
}

/*
    Model: GSTDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GSTDetailsData {
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
}

/*
    Model: BagUnit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagUnit {
    
    
    
    
    @JsonProperty("item_quantity")
    private Integer itemQuantity;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("total_shipment_bags")
    private Integer totalShipmentBags;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("gst")
    private GSTDetailsData gst;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: PaymentModeInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeInfo {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ShipmentItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentItem {
    
    
    
    
    @JsonProperty("total_bags_count")
    private Integer totalBagsCount;
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    @JsonProperty("application")
    private Object application;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private ShipmentItemFulFillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("user")
    private UserDataInfo user;
    
    
    
    
    @JsonProperty("sla")
    private Object sla;
    
    
    
    
    @JsonProperty("payment_methods")
    private Object paymentMethods;
    
    
    
    
    @JsonProperty("total_shipments_in_order")
    private Integer totalShipmentsInOrder;
    
    
    
    
    @JsonProperty("fulfilling_centre")
    private String fulfillingCentre;
    
    
    
    
    @JsonProperty("shipment_created_at")
    private Integer shipmentCreatedAt;
    
    
    
    
    @JsonProperty("bags")
    private List<BagUnit> bags;
    
    
    
    
    @JsonProperty("payment_mode_info")
    private PaymentModeInfo paymentModeInfo;
    
    
    
    
    @JsonProperty("channel")
    private Object channel;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: FilterInfoOption
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterInfoOption {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: FiltersInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FiltersInfo {
    
    
    
    
    @JsonProperty("options")
    private List<FilterInfoOption> options;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ShipmentInternalPlatformViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentInternalPlatformViewResponse {
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
    @JsonProperty("items")
    private List<ShipmentItem> items;
    
    
    
    
    @JsonProperty("filters")
    private List<FiltersInfo> filters;
    
    
    
    
    @JsonProperty("applied_filters")
    private Object appliedFilters;
    
    
    
    
}

/*
    Model: Error
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Error {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UserDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetailsData {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
}

/*
    Model: TrackingList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TrackingList {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
    
}

/*
    Model: FulfillingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FulfillingStore {
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
}

/*
    Model: BagConfigs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagConfigs {
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("allow_force_return")
    private Boolean allowForceReturn;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
}

/*
    Model: PlatformDeliveryAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformDeliveryAddress {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("longitude")
    private Integer longitude;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("latitude")
    private Integer latitude;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
}

/*
    Model: Identifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Identifier {
    
    
    
    
    @JsonProperty("ean")
    private String ean;
    
    
    
    
}

/*
    Model: FinancialBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FinancialBreakup {
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Integer taxCollectedAtSource;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Integer brandCalculatedAmount;
    
    
    
    
    @JsonProperty("price_effective")
    private Integer priceEffective;
    
    
    
    
    @JsonProperty("pm_price_split")
    private Object pmPriceSplit;
    
    
    
    
    @JsonProperty("value_of_good")
    private Integer valueOfGood;
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    @JsonProperty("gst_fee")
    private String gstFee;
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Integer deliveryCharge;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("price_marked")
    private Integer priceMarked;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Integer fyndCredits;
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Integer amountPaidRoundoff;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Integer cashbackApplied;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Integer promotionEffectiveDiscount;
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    @JsonProperty("cashback")
    private Integer cashback;
    
    
    
    
    @JsonProperty("discount")
    private Integer discount;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Integer couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("refund_credit")
    private Integer refundCredit;
    
    
    
    
    @JsonProperty("coupon_value")
    private Integer couponValue;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
}

/*
    Model: DiscountRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRules {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
}

/*
    Model: ItemCriterias
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemCriterias {
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
    
}

/*
    Model: BuyRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyRules {
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriterias itemCriteria;
    
    
    
    
    @JsonProperty("cart_conditions")
    private Object cartConditions;
    
    
    
    
}

/*
    Model: AppliedPromos
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedPromos {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRules> discountRules;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
}

/*
    Model: BagGST
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagGST {
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("gst_fee")
    private Integer gstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Integer brandCalculatedAmount;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Integer gstTaxPercentage;
    
    
    
    
    @JsonProperty("value_of_good")
    private Integer valueOfGood;
    
    
    
    
}

/*
    Model: OrderBagArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBagArticle {
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: OrderBrandName
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBrandName {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
}

/*
    Model: OrderBags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderBags {
    
    
    
    
    @JsonProperty("bag_configs")
    private BagConfigs bagConfigs;
    
    
    
    
    @JsonProperty("delivery_address")
    private PlatformDeliveryAddress deliveryAddress;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<AppliedPromos> appliedPromos;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGST gstDetails;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("item")
    private PlatformItem item;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("article")
    private OrderBagArticle article;
    
    
    
    
    @JsonProperty("brand")
    private OrderBrandName brand;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("current_status")
    private String currentStatus;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
}

/*
    Model: DPDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DPDetailsData {
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
    
    @JsonProperty("eway_bill_id")
    private String ewayBillId;
    
    
    
    
    @JsonProperty("awb_no")
    private String awbNo;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
}

/*
    Model: BagStateMapper
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagStateMapper {
    
    
    
    
    @JsonProperty("app_state_name")
    private String appStateName;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("bs_id")
    private Integer bsId;
    
    
    
    
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;
    
    
    
    
    @JsonProperty("app_display_name")
    private String appDisplayName;
    
    
    
    
    @JsonProperty("app_facing")
    private Boolean appFacing;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BagStatusHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagStatusHistory {
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("state_id")
    private Integer stateId;
    
    
    
    
    @JsonProperty("forward")
    private Boolean forward;
    
    
    
    
    @JsonProperty("state_type")
    private String stateType;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("display_name")
    private Boolean displayName;
    
    
    
    
    @JsonProperty("delivery_partner_id")
    private Integer deliveryPartnerId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bsh_id")
    private Integer bshId;
    
    
    
    
    @JsonProperty("delivery_awb_number")
    private String deliveryAwbNumber;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("bag_state_mapper")
    private BagStateMapper bagStateMapper;
    
    
    
    
    @JsonProperty("kafka_sync")
    private Boolean kafkaSync;
    
    
    
    
    @JsonProperty("app_display_name")
    private Boolean appDisplayName;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: ShipmentStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentStatusData {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: ShipmentPayments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentPayments {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
}

/*
    Model: OrderDetailsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetailsData {
    
    
    
    
    @JsonProperty("tax_details")
    private Object taxDetails;
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("order_value")
    private String orderValue;
    
    
    
    
    @JsonProperty("ordering_channel")
    private String orderingChannel;
    
    
    
    
    @JsonProperty("ordering_channel_logo")
    private Object orderingChannelLogo;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("cod_charges")
    private String codCharges;
    
    
    
    
}

/*
    Model: ShipmentInfoResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentInfoResponse {
    
    
    
    
    @JsonProperty("current_shipment_status")
    private Object currentShipmentStatus;
    
    
    
    
    @JsonProperty("child_nodes")
    private List<String> childNodes;
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("mid")
    private String mid;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("ordering_store")
    private Object orderingStore;
    
    
    
    
    @JsonProperty("company")
    private Object company;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("forward_tracking_list")
    private List<Object> forwardTrackingList;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("refund_text")
    private String refundText;
    
    
    
    
    @JsonProperty("fyndstore_emp")
    private Object fyndstoreEmp;
    
    
    
    
    @JsonProperty("is_fynd_store")
    private String isFyndStore;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("is_fynd_coupon")
    private Boolean isFyndCoupon;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("lock_status")
    private String lockStatus;
    
    
    
    
    @JsonProperty("secured_delivery_flag")
    private String securedDeliveryFlag;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("credit_note_id")
    private String creditNoteId;
    
    
    
    
    @JsonProperty("is_pdsr")
    private String isPdsr;
    
    
    
    
    @JsonProperty("is_invoiced")
    private Boolean isInvoiced;
    
    
    
    
    @JsonProperty("can_break")
    private String canBreak;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("user_info")
    private Object userInfo;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
    @JsonProperty("is_packaging_order")
    private Boolean isPackagingOrder;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("platform_logo")
    private Boolean platformLogo;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private String enableDpTracking;
    
    
    
    
    @JsonProperty("forward_shipment_status")
    private List<Object> forwardShipmentStatus;
    
    
    
    
    @JsonProperty("kirana_store_id")
    private String kiranaStoreId;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("delivery_status")
    private List<Object> deliveryStatus;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    @JsonProperty("escalation")
    private Object escalation;
    
    
    
    
    @JsonProperty("is_not_fynd_source")
    private Boolean isNotFyndSource;
    
    
    
    
    @JsonProperty("replacement_details")
    private String replacementDetails;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("order_status")
    private Object orderStatus;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("beneficiary_details")
    private Boolean beneficiaryDetails;
    
    
    
    
    @JsonProperty("forward_order_status")
    private List<Object> forwardOrderStatus;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("status_progress")
    private Integer statusProgress;
    
    
    
    
    @JsonProperty("refund_details")
    private Object refundDetails;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("pay_button")
    private String payButton;
    
    
    
    
    @JsonProperty("bank_data")
    private Object bankData;
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("go_green")
    private Boolean goGreen;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: PlatformShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipment {
    
    
    
    
    @JsonProperty("shipment_images")
    private List<String> shipmentImages;
    
    
    
    
    @JsonProperty("billing_details")
    private UserDetailsData billingDetails;
    
    
    
    
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    
    
    
    
    @JsonProperty("tracking_list")
    private List<TrackingList> trackingList;
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    @JsonProperty("priority_text")
    private String priorityText;
    
    
    
    
    @JsonProperty("bags")
    private List<OrderBags> bags;
    
    
    
    
    @JsonProperty("dp_details")
    private DPDetailsData dpDetails;
    
    
    
    
    @JsonProperty("gst_details")
    private GSTDetailsData gstDetails;
    
    
    
    
    @JsonProperty("picked_date")
    private String pickedDate;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    @JsonProperty("delivery_details")
    private UserDetailsData deliveryDetails;
    
    
    
    
    @JsonProperty("delivery_slot")
    private Object deliverySlot;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("bag_status_history")
    private List<BagStatusHistory> bagStatusHistory;
    
    
    
    
    @JsonProperty("platform_logo")
    private String platformLogo;
    
    
    
    
    @JsonProperty("enable_dp_tracking")
    private String enableDpTracking;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("status")
    private ShipmentStatusData status;
    
    
    
    
    @JsonProperty("shipment_quantity")
    private Integer shipmentQuantity;
    
    
    
    
    @JsonProperty("payments")
    private ShipmentPayments payments;
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("vertical")
    private String vertical;
    
    
    
    
    @JsonProperty("order")
    private OrderDetailsData order;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: OrderDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDict {
    
    
    
    
    @JsonProperty("order_date")
    private String orderDate;
    
    
    
    
    @JsonProperty("shipment_count")
    private Integer shipmentCount;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
}

/*
    Model: ShipmentDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetailsResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("custom_meta")
    private List<Object> customMeta;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("order")
    private OrderDict order;
    
    
    
    
}

/*
    Model: SubLane
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubLane {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("actions")
    private List<Object> actions;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
}

/*
    Model: SuperLane
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuperLane {
    
    
    
    
    @JsonProperty("options")
    private List<SubLane> options;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("total_items")
    private Integer totalItems;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: LaneConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LaneConfigResponse {
    
    
    
    
    @JsonProperty("super_lanes")
    private List<SuperLane> superLanes;
    
    
    
    
}

/*
    Model: PlatformBreakupValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformBreakupValues {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: PlatformChannel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformChannel {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: PlatformOrderItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformOrderItems {
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("breakup_values")
    private List<PlatformBreakupValues> breakupValues;
    
    
    
    
    @JsonProperty("shipments")
    private List<PlatformShipment> shipments;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("total_order_value")
    private Double totalOrderValue;
    
    
    
    
    @JsonProperty("channel")
    private PlatformChannel channel;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("user_info")
    private UserDataInfo userInfo;
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
}

/*
    Model: OrderListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderListingResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<PlatformOrderItems> items;
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: Options
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Options {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
}

/*
    Model: MetricsCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricsCount {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("options")
    private List<Options> options;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
}

/*
    Model: MetricCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricCountResponse {
    
    
    
    
    @JsonProperty("items")
    private List<MetricsCount> items;
    
    
    
    
}

/*
    Model: PlatformTrack
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformTrack {
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("last_location_recieved_at")
    private String lastLocationRecievedAt;
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    @JsonProperty("raw_status")
    private String rawStatus;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
    
}

/*
    Model: PlatformShipmentTrack
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipmentTrack {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("results")
    private List<PlatformTrack> results;
    
    
    
    
}

/*
    Model: FiltersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FiltersResponse {
    
    
    
    
    @JsonProperty("advance")
    private List<Object> advance;
    
    
    
    
}

/*
    Model: Success
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Success {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: OmsReports
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OmsReports {
    
    
    
    
    @JsonProperty("report_type")
    private String reportType;
    
    
    
    
    @JsonProperty("report_created_at")
    private String reportCreatedAt;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("request_details")
    private Object requestDetails;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("report_requested_at")
    private String reportRequestedAt;
    
    
    
    
    @JsonProperty("s3_key")
    private String s3Key;
    
    
    
    
    @JsonProperty("report_name")
    private String reportName;
    
    
    
    
    @JsonProperty("report_id")
    private String reportId;
    
    
    
    
}

/*
    Model: JioCodeUpsertDataSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertDataSet {
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
    
}

/*
    Model: JioCodeUpsertPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertPayload {
    
    
    
    
    @JsonProperty("data")
    private List<JioCodeUpsertDataSet> data;
    
    
    
    
}

/*
    Model: NestedErrorSchemaDataSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NestedErrorSchemaDataSet {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: JioCodeUpsertResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JioCodeUpsertResponse {
    
    
    
    
    @JsonProperty("error")
    private List<NestedErrorSchemaDataSet> error;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: BulkInvoicingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInvoicingResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: BulkInvoiceLabelResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInvoiceLabelResponse {
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("label")
    private Object label;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("invoice")
    private Object invoice;
    
    
    
    
    @JsonProperty("do_invoice_label_generated")
    private Boolean doInvoiceLabelGenerated;
    
    
    
    
    @JsonProperty("invoice_status")
    private String invoiceStatus;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("store_id")
    private String storeId;
    
    
    
    
}

/*
    Model: URL
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class URL {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: FileUploadResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileUploadResponse {
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: FileResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileResponse {
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("cdn")
    private URL cdn;
    
    
    
    
    @JsonProperty("upload")
    private FileUploadResponse upload;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
}

/*
    Model: bulkListingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class bulkListingData {
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("processing")
    private Integer processing;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("successful_shipments")
    private List<Object> successfulShipments;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("user_name")
    private String userName;
    
    
    
    
    @JsonProperty("excel_url")
    private String excelUrl;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("processing_shipments")
    private List<String> processingShipments;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("successful")
    private Integer successful;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("failed_shipments")
    private List<Object> failedShipments;
    
    
    
    
}

/*
    Model: BulkListingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListingPage {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: BulkListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListingResponse {
    
    
    
    
    @JsonProperty("data")
    private List<bulkListingData> data;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("page")
    private BulkListingPage page;
    
    
    
    
}

/*
    Model: ManifestPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestPage {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
}

/*
    Model: DateRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DateRange {
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
}

/*
    Model: ManifestFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestFilter {
    
    
    
    
    @JsonProperty("sales_channel_name")
    private String salesChannelName;
    
    
    
    
    @JsonProperty("dp_ids")
    private String dpIds;
    
    
    
    
    @JsonProperty("lane")
    private String lane;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("sales_channels")
    private String salesChannels;
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("stores")
    private String stores;
    
    
    
    
    @JsonProperty("date_range")
    private DateRange dateRange;
    
    
    
    
}

/*
    Model: GeneratedManifestItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneratedManifestItem {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("filters")
    private ManifestFilter filters;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: GeneratedManifestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneratedManifestResponse {
    
    
    
    
    @JsonProperty("page")
    private ManifestPage page;
    
    
    
    
    @JsonProperty("items")
    private List<GeneratedManifestItem> items;
    
    
    
    
}

/*
    Model: ManifestDetailItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestDetailItem {
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    @JsonProperty("invoice_id")
    private String invoiceId;
    
    
    
    
    @JsonProperty("item_qty")
    private Integer itemQty;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: ManifestDetailTotalShipmentPricesCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestDetailTotalShipmentPricesCount {
    
    
    
    
    @JsonProperty("shipment_count")
    private Integer shipmentCount;
    
    
    
    
    @JsonProperty("total_price")
    private Double totalPrice;
    
    
    
    
}

/*
    Model: ManifestDetailMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestDetailMeta {
    
    
    
    
    @JsonProperty("total_shipment_prices_count")
    private ManifestDetailTotalShipmentPricesCount totalShipmentPricesCount;
    
    
    
    
    @JsonProperty("filters")
    private ManifestFilter filters;
    
    
    
    
}

/*
    Model: ManifestDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestDetail {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("filters")
    private ManifestFilter filters;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("user_id")
    private Integer userId;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("meta")
    private ManifestDetailMeta meta;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: ManifestDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestDetailResponse {
    
    
    
    
    @JsonProperty("page")
    private ManifestPage page;
    
    
    
    
    @JsonProperty("items")
    private List<ManifestDetailItem> items;
    
    
    
    
    @JsonProperty("manifest_details")
    private List<ManifestDetail> manifestDetails;
    
    
    
    
    @JsonProperty("additional_shipment_count")
    private Integer additionalShipmentCount;
    
    
    
    
}

/*
    Model: QuestionSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuestionSet {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
}

/*
    Model: Reason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Reason {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("question_set")
    private List<QuestionSet> questionSet;
    
    
    
    
    @JsonProperty("qc_type")
    private List<String> qcType;
    
    
    
    
}

/*
    Model: PlatformShipmentReasonsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PlatformShipmentReasonsResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("reasons")
    private List<Reason> reasons;
    
    
    
    
}

/*
    Model: BulkActionPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionPayload {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: BulkActionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionResponse {
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: BulkActionDetailsDataField
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionDetailsDataField {
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("processing_shipments_count")
    private Integer processingShipmentsCount;
    
    
    
    
    @JsonProperty("successful_shipments_count")
    private Integer successfulShipmentsCount;
    
    
    
    
    @JsonProperty("successful_shipment_ids")
    private List<String> successfulShipmentIds;
    
    
    
    
    @JsonProperty("failed_shipments_count")
    private Integer failedShipmentsCount;
    
    
    
    
    @JsonProperty("total_shipments_count")
    private Integer totalShipmentsCount;
    
    
    
    
}

/*
    Model: BulkActionDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkActionDetailsResponse {
    
    
    
    
    @JsonProperty("error")
    private List<String> error;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("uploaded_by")
    private String uploadedBy;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("uploaded_on")
    private String uploadedOn;
    
    
    
    
    @JsonProperty("data")
    private List<BulkActionDetailsDataField> data;
    
    
    
    
}

/*
    Model: StoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreAddress {
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Document
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Document {
    
    
    
    
    @JsonProperty("legal_name")
    private String legalName;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("ds_type")
    private String dsType;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
}

/*
    Model: StoreDocuments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDocuments {
    
    
    
    
    @JsonProperty("gst")
    private Document gst;
    
    
    
    
}

/*
    Model: EInvoicePortalDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoicePortalDetails {
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: StoreEinvoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreEinvoice {
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
}

/*
    Model: StoreEwaybill
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreEwaybill {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: StoreGstCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreGstCredentials {
    
    
    
    
    @JsonProperty("e_invoice")
    private StoreEinvoice eInvoice;
    
    
    
    
    @JsonProperty("e_waybill")
    private StoreEwaybill eWaybill;
    
    
    
    
}

/*
    Model: StoreMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreMeta {
    
    
    
    
    @JsonProperty("product_return_config")
    private Object productReturnConfig;
    
    
    
    
    @JsonProperty("additional_contact_details")
    private Object additionalContactDetails;
    
    
    
    
    @JsonProperty("documents")
    private StoreDocuments documents;
    
    
    
    
    @JsonProperty("einvoice_portal_details")
    private EInvoicePortalDetails einvoicePortalDetails;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("timing")
    private List<Object> timing;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("gst_credentials")
    private StoreGstCredentials gstCredentials;
    
    
    
    
    @JsonProperty("gst_number")
    private String gstNumber;
    
    
    
    
    @JsonProperty("ewaybill_portal_details")
    private Object ewaybillPortalDetails;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
}

/*
    Model: Store
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Store {
    
    
    
    
    @JsonProperty("brand_store_tags")
    private List<String> brandStoreTags;
    
    
    
    
    @JsonProperty("mall_area")
    private String mallArea;
    
    
    
    
    @JsonProperty("vat_no")
    private String vatNo;
    
    
    
    
    @JsonProperty("fulfillment_channel")
    private String fulfillmentChannel;
    
    
    
    
    @JsonProperty("store_address_json")
    private StoreAddress storeAddressJson;
    
    
    
    
    @JsonProperty("s_id")
    private String sId;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("location_type")
    private String locationType;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("parent_store_id")
    private Integer parentStoreId;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("is_enabled_for_recon")
    private Boolean isEnabledForRecon;
    
    
    
    
    @JsonProperty("mall_name")
    private String mallName;
    
    
    
    
    @JsonProperty("store_active_from")
    private String storeActiveFrom;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("brand_id")
    private Object brandId;
    
    
    
    
    @JsonProperty("alohomora_user_id")
    private Integer alohomoraUserId;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("packaging_material_count")
    private Integer packagingMaterialCount;
    
    
    
    
    @JsonProperty("meta")
    private StoreMeta meta;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    @JsonProperty("login_username")
    private String loginUsername;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Attributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Attributes {
    
    
    
    
    @JsonProperty("marketer_name")
    private String marketerName;
    
    
    
    
    @JsonProperty("essential")
    private String essential;
    
    
    
    
    @JsonProperty("primary_material")
    private String primaryMaterial;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("marketer_address")
    private String marketerAddress;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("gender")
    private List<String> gender;
    
    
    
    
    @JsonProperty("primary_color_hex")
    private String primaryColorHex;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: Item
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Item {
    
    
    
    
    @JsonProperty("l3_category")
    private Integer l3Category;
    
    
    
    
    @JsonProperty("l3_category_name")
    private String l3CategoryName;
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    @JsonProperty("webstore_product_url")
    private String webstoreProductUrl;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("department_id")
    private Integer departmentId;
    
    
    
    
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    
    
    
    
    @JsonProperty("l1_category_id")
    private Integer l1CategoryId;
    
    
    
    
    @JsonProperty("l2_category_id")
    private Integer l2CategoryId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("l2_category")
    private List<String> l2Category;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand")
    private String brand;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("branch_url")
    private String branchUrl;
    
    
    
    
    @JsonProperty("attributes")
    private Attributes attributes;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("l1_category")
    private List<String> l1Category;
    
    
    
    
}

/*
    Model: AffiliateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateMeta {
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("size_level_total_qty")
    private Integer sizeLevelTotalQty;
    
    
    
    
    @JsonProperty("order_item_id")
    private String orderItemId;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("channel_order_id")
    private String channelOrderId;
    
    
    
    
    @JsonProperty("channel_shipment_id")
    private String channelShipmentId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("is_priority")
    private Boolean isPriority;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
}

/*
    Model: AffiliateBagDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateBagDetails {
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
}

/*
    Model: PDFLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PDFLinks {
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("invoice_pos")
    private String invoicePos;
    
    
    
    
    @JsonProperty("po_invoice")
    private String poInvoice;
    
    
    
    
    @JsonProperty("invoice_a4")
    private String invoiceA4;
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("invoice_a6")
    private String invoiceA6;
    
    
    
    
    @JsonProperty("credit_note_url")
    private String creditNoteUrl;
    
    
    
    
    @JsonProperty("label_a6")
    private String labelA6;
    
    
    
    
    @JsonProperty("invoice_type")
    private String invoiceType;
    
    
    
    
    @JsonProperty("b2b")
    private String b2B;
    
    
    
    
    @JsonProperty("label_a4")
    private String labelA4;
    
    
    
    
    @JsonProperty("label_pos")
    private String labelPos;
    
    
    
    
}

/*
    Model: BuyerDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuyerDetails {
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("ajio_site_id")
    private String ajioSiteId;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: DebugInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DebugInfo {
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
    
}

/*
    Model: EInvoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EInvoice {
    
    
    
    
    @JsonProperty("irn")
    private String irn;
    
    
    
    
    @JsonProperty("signed_qr_code")
    private String signedQrCode;
    
    
    
    
    @JsonProperty("acknowledge_no")
    private Integer acknowledgeNo;
    
    
    
    
    @JsonProperty("acknowledge_date")
    private String acknowledgeDate;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
    @JsonProperty("error_code")
    private String errorCode;
    
    
    
    
    @JsonProperty("signed_invoice")
    private String signedInvoice;
    
    
    
    
}

/*
    Model: EinvoiceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EinvoiceInfo {
    
    
    
    
    @JsonProperty("invoice")
    private EInvoice invoice;
    
    
    
    
    @JsonProperty("credit_note")
    private EInvoice creditNote;
    
    
    
    
}

/*
    Model: LockData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LockData {
    
    
    
    
    @JsonProperty("mto")
    private Boolean mto;
    
    
    
    
    @JsonProperty("locked")
    private Boolean locked;
    
    
    
    
    @JsonProperty("lock_message")
    private String lockMessage;
    
    
    
    
}

/*
    Model: ShipmentTimeStamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentTimeStamp {
    
    
    
    
    @JsonProperty("t_min")
    private String tMin;
    
    
    
    
    @JsonProperty("t_max")
    private String tMax;
    
    
    
    
}

/*
    Model: Formatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Formatted {
    
    
    
    
    @JsonProperty("f_max")
    private String fMax;
    
    
    
    
    @JsonProperty("f_min")
    private String fMin;
    
    
    
    
}

/*
    Model: ShipmentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentMeta {
    
    
    
    
    @JsonProperty("b2c_buyer_details")
    private Object b2CBuyerDetails;
    
    
    
    
    @JsonProperty("auto_trigger_dp_assignment_acf")
    private Boolean autoTriggerDpAssignmentAcf;
    
    
    
    
    @JsonProperty("weight")
    private Integer weight;
    
    
    
    
    @JsonProperty("return_awb_number")
    private String returnAwbNumber;
    
    
    
    
    @JsonProperty("packaging_name")
    private String packagingName;
    
    
    
    
    @JsonProperty("b2b_buyer_details")
    private BuyerDetails b2BBuyerDetails;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("ewaybill_info")
    private Object ewaybillInfo;
    
    
    
    
    @JsonProperty("awb_number")
    private String awbNumber;
    
    
    
    
    @JsonProperty("debug_info")
    private DebugInfo debugInfo;
    
    
    
    
    @JsonProperty("einvoice_info")
    private EinvoiceInfo einvoiceInfo;
    
    
    
    
    @JsonProperty("dp_id")
    private String dpId;
    
    
    
    
    @JsonProperty("lock_data")
    private LockData lockData;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
    @JsonProperty("return_affiliate_shipment_id")
    private String returnAffiliateShipmentId;
    
    
    
    
    @JsonProperty("dp_sort_key")
    private String dpSortKey;
    
    
    
    
    @JsonProperty("po_number")
    private String poNumber;
    
    
    
    
    @JsonProperty("forward_affiliate_shipment_id")
    private String forwardAffiliateShipmentId;
    
    
    
    
    @JsonProperty("bag_weight")
    private Object bagWeight;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("return_store_node")
    private Integer returnStoreNode;
    
    
    
    
    @JsonProperty("due_date")
    private String dueDate;
    
    
    
    
    @JsonProperty("forward_affiliate_order_id")
    private String forwardAffiliateOrderId;
    
    
    
    
    @JsonProperty("same_store_available")
    private Boolean sameStoreAvailable;
    
    
    
    
    @JsonProperty("external")
    private Object external;
    
    
    
    
    @JsonProperty("shipment_weight")
    private Double shipmentWeight;
    
    
    
    
    @JsonProperty("dp_name")
    private String dpName;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    @JsonProperty("assign_dp_from_sb")
    private Boolean assignDpFromSb;
    
    
    
    
    @JsonProperty("return_details")
    private Object returnDetails;
    
    
    
    
    @JsonProperty("return_affiliate_order_id")
    private String returnAffiliateOrderId;
    
    
    
    
    @JsonProperty("timestamp")
    private ShipmentTimeStamp timestamp;
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
    
    @JsonProperty("store_invoice_updated_date")
    private String storeInvoiceUpdatedDate;
    
    
    
    
    @JsonProperty("shipment_volumetric_weight")
    private Double shipmentVolumetricWeight;
    
    
    
    
}

/*
    Model: AffiliateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateDetails {
    
    
    
    
    @JsonProperty("affiliate_meta")
    private AffiliateMeta affiliateMeta;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("pdf_links")
    private PDFLinks pdfLinks;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("company_affiliate_tag")
    private String companyAffiliateTag;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("ad_id")
    private String adId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("shipment_meta")
    private ShipmentMeta shipmentMeta;
    
    
    
    
}

/*
    Model: BagGSTDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagGSTDetails {
    
    
    
    
    @JsonProperty("igst_tax_percentage")
    private Double igstTaxPercentage;
    
    
    
    
    @JsonProperty("is_default_hsn_code")
    private Boolean isDefaultHsnCode;
    
    
    
    
    @JsonProperty("tax_collected_at_source")
    private Double taxCollectedAtSource;
    
    
    
    
    @JsonProperty("sgst_tax_percentage")
    private Double sgstTaxPercentage;
    
    
    
    
    @JsonProperty("gst_fee")
    private Double gstFee;
    
    
    
    
    @JsonProperty("cgst_gst_fee")
    private String cgstGstFee;
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    @JsonProperty("sgst_gst_fee")
    private String sgstGstFee;
    
    
    
    
    @JsonProperty("gstin_code")
    private String gstinCode;
    
    
    
    
    @JsonProperty("cgst_tax_percentage")
    private Double cgstTaxPercentage;
    
    
    
    
    @JsonProperty("igst_gst_fee")
    private String igstGstFee;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
}

/*
    Model: Dates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dates {
    
    
    
    
    @JsonProperty("delivery_date")
    private Object deliveryDate;
    
    
    
    
    @JsonProperty("order_created")
    private String orderCreated;
    
    
    
    
}

/*
    Model: Weight
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Weight {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("shipping")
    private Integer shipping;
    
    
    
    
}

/*
    Model: Dimensions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Dimensions {
    
    
    
    
    @JsonProperty("width")
    private Integer width;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("length")
    private Integer length;
    
    
    
    
    @JsonProperty("height")
    private Integer height;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
}

/*
    Model: ReturnConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig {
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
}

/*
    Model: Article
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Article {
    
    
    
    
    @JsonProperty("a_set")
    private Object aSet;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("esp_modified")
    private Object espModified;
    
    
    
    
    @JsonProperty("weight")
    private Weight weight;
    
    
    
    
    @JsonProperty("child_details")
    private Object childDetails;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: BagReturnableCancelableStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagReturnableCancelableStatus {
    
    
    
    
    @JsonProperty("is_returnable")
    private Boolean isReturnable;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("can_be_cancelled")
    private Boolean canBeCancelled;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("is_customer_return_allowed")
    private Boolean isCustomerReturnAllowed;
    
    
    
    
}

/*
    Model: Brand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Brand {
    
    
    
    
    @JsonProperty("credit_note_expiry_days")
    private Integer creditNoteExpiryDays;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("invoice_prefix")
    private String invoicePrefix;
    
    
    
    
    @JsonProperty("pickup_location")
    private String pickupLocation;
    
    
    
    
    @JsonProperty("is_virtual_invoice")
    private Boolean isVirtualInvoice;
    
    
    
    
    @JsonProperty("script_last_ran")
    private String scriptLastRan;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("credit_note_allowed")
    private Boolean creditNoteAllowed;
    
    
    
    
}

/*
    Model: B2BPODetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class B2BPODetails {
    
    
    
    
    @JsonProperty("docker_number")
    private String dockerNumber;
    
    
    
    
    @JsonProperty("po_line_amount")
    private Double poLineAmount;
    
    
    
    
    @JsonProperty("item_base_price")
    private Double itemBasePrice;
    
    
    
    
    @JsonProperty("po_tax_amount")
    private Double poTaxAmount;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("total_gst_percentage")
    private Double totalGstPercentage;
    
    
    
    
}

/*
    Model: BagMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagMeta {
    
    
    
    
    @JsonProperty("b2b_po_details")
    private B2BPODetails b2BPoDetails;
    
    
    
    
}

/*
    Model: ArticleDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDetails {
    
    
    
    
    @JsonProperty("status")
    private Object status;
    
    
    
    
}

/*
    Model: BagDetailsPlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BagDetailsPlatformResponse {
    
    
    
    
    @JsonProperty("restore_promos")
    private Object restorePromos;
    
    
    
    
    @JsonProperty("bag_update_time")
    private Double bagUpdateTime;
    
    
    
    
    @JsonProperty("ordering_store")
    private Store orderingStore;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    @JsonProperty("affiliate_bag_details")
    private AffiliateBagDetails affiliateBagDetails;
    
    
    
    
    @JsonProperty("affiliate_details")
    private AffiliateDetails affiliateDetails;
    
    
    
    
    @JsonProperty("order_integration_id")
    private String orderIntegrationId;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("reasons")
    private List<Object> reasons;
    
    
    
    
    @JsonProperty("gst_details")
    private BagGSTDetails gstDetails;
    
    
    
    
    @JsonProperty("current_operational_status")
    private BagStatusHistory currentOperationalStatus;
    
    
    
    
    @JsonProperty("qc_required")
    private Object qcRequired;
    
    
    
    
    @JsonProperty("bag_status")
    private List<BagStatusHistory> bagStatus;
    
    
    
    
    @JsonProperty("original_bag_list")
    private List<Integer> originalBagList;
    
    
    
    
    @JsonProperty("parent_promo_bags")
    private Object parentPromoBags;
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    @JsonProperty("bag_status_history")
    private BagStatusHistory bagStatusHistory;
    
    
    
    
    @JsonProperty("applied_promos")
    private List<Object> appliedPromos;
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("dates")
    private Dates dates;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
    
    @JsonProperty("article")
    private Article article;
    
    
    
    
    @JsonProperty("status")
    private BagReturnableCancelableStatus status;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("meta")
    private BagMeta meta;
    
    
    
    
    @JsonProperty("current_status")
    private BagStatusHistory currentStatus;
    
    
    
    
    @JsonProperty("restore_coupon")
    private Boolean restoreCoupon;
    
    
    
    
    @JsonProperty("b_id")
    private Integer bId;
    
    
    
    
    @JsonProperty("no_of_bags_order")
    private Integer noOfBagsOrder;
    
    
    
    
    @JsonProperty("b_type")
    private String bType;
    
    
    
    
    @JsonProperty("quantity")
    private Double quantity;
    
    
    
    
    @JsonProperty("article_details")
    private ArticleDetails articleDetails;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("operational_status")
    private String operationalStatus;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
}

/*
    Model: ErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: Page1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Page1 {
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: GetBagsPlatformResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBagsPlatformResponse {
    
    
    
    
    @JsonProperty("page")
    private Page1 page;
    
    
    
    
    @JsonProperty("items")
    private List<BagDetailsPlatformResponse> items;
    
    
    
    
}

/*
    Model: InvalidateShipmentCachePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCachePayload {
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
}

/*
    Model: InvalidateShipmentCacheNestedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCacheNestedResponse {
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: InvalidateShipmentCacheResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidateShipmentCacheResponse {
    
    
    
    
    @JsonProperty("response")
    private List<InvalidateShipmentCacheNestedResponse> response;
    
    
    
    
}

/*
    Model: ErrorResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorResponse1 {
    
    
    
    
    @JsonProperty("error_trace")
    private String errorTrace;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: StoreReassign
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreReassign {
    
    
    
    
    @JsonProperty("set_id")
    private String setId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("mongo_article_id")
    private String mongoArticleId;
    
    
    
    
    @JsonProperty("item_id")
    private String itemId;
    
    
    
    
    @JsonProperty("reason_ids")
    private List<Integer> reasonIds;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
}

/*
    Model: StoreReassignResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreReassignResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: Entities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Entities {
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
}

/*
    Model: UpdateShipmentLockPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentLockPayload {
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("entities")
    private List<Entities> entities;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
    
}

/*
    Model: Bags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Bags {
    
    
    
    
    @JsonProperty("is_locked")
    private Boolean isLocked;
    
    
    
    
    @JsonProperty("affiliate_bag_id")
    private String affiliateBagId;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
}

/*
    Model: OriginalFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OriginalFilter {
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
}

/*
    Model: CheckResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CheckResponse {
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("is_bag_locked")
    private Boolean isBagLocked;
    
    
    
    
    @JsonProperty("lock_status")
    private Boolean lockStatus;
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("is_shipment_locked")
    private Boolean isShipmentLocked;
    
    
    
    
    @JsonProperty("original_filter")
    private OriginalFilter originalFilter;
    
    
    
    
}

/*
    Model: UpdateShipmentLockResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentLockResponse {
    
    
    
    
    @JsonProperty("check_response")
    private List<CheckResponse> checkResponse;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: AnnouncementResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementResponse {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("from_datetime")
    private String fromDatetime;
    
    
    
    
    @JsonProperty("to_datetime")
    private String toDatetime;
    
    
    
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    
    
    
    @JsonProperty("platform_name")
    private String platformName;
    
    
    
    
    @JsonProperty("platform_id")
    private String platformId;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: AnnouncementsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AnnouncementsResponse {
    
    
    
    
    @JsonProperty("announcements")
    private List<AnnouncementResponse> announcements;
    
    
    
    
}

/*
    Model: BaseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BaseResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: Click2CallResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Click2CallResponse {
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
    @JsonProperty("call_id")
    private String callId;
    
    
    
    
}

/*
    Model: EntityReasonData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityReasonData {
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
}

/*
    Model: EntitiesReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitiesReasons {
    
    
    
    
    @JsonProperty("data")
    private EntityReasonData data;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
    
}

/*
    Model: ProductsReasonsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsData {
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
}

/*
    Model: ProductsReasonsFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasonsFilters {
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ProductsReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsReasons {
    
    
    
    
    @JsonProperty("data")
    private ProductsReasonsData data;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsReasonsFilters> filters;
    
    
    
    
}

/*
    Model: ReasonsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReasonsData {
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesReasons> entities;
    
    
    
    
    @JsonProperty("products")
    private List<ProductsReasons> products;
    
    
    
    
}

/*
    Model: EntitiesDataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntitiesDataUpdates {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("filters")
    private List<Object> filters;
    
    
    
    
}

/*
    Model: ProductsDataUpdatesFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsDataUpdatesFilters {
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ProductsDataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductsDataUpdates {
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductsDataUpdatesFilters> filters;
    
    
    
    
}

/*
    Model: DataUpdates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataUpdates {
    
    
    
    
    @JsonProperty("entities")
    private List<EntitiesDataUpdates> entities;
    
    
    
    
    @JsonProperty("products")
    private List<ProductsDataUpdates> products;
    
    
    
    
}

/*
    Model: Products
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Products {
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("line_number")
    private Integer lineNumber;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ShipmentsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsRequest {
    
    
    
    
    @JsonProperty("reasons")
    private ReasonsData reasons;
    
    
    
    
    @JsonProperty("data_updates")
    private DataUpdates dataUpdates;
    
    
    
    
    @JsonProperty("products")
    private List<Products> products;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: StatuesRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatuesRequest {
    
    
    
    
    @JsonProperty("exclude_bags_next_state")
    private String excludeBagsNextState;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsRequest> shipments;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: UpdateShipmentStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentStatusRequest {
    
    
    
    
    @JsonProperty("task")
    private Boolean task;
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
    
    @JsonProperty("lock_after_transition")
    private Boolean lockAfterTransition;
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesRequest> statuses;
    
    
    
    
    @JsonProperty("unlock_before_transition")
    private Boolean unlockBeforeTransition;
    
    
    
    
}

/*
    Model: ShipmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentsResponse {
    
    
    
    
    @JsonProperty("final_state")
    private Object finalState;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: StatuesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatuesResponse {
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentsResponse> shipments;
    
    
    
    
}

/*
    Model: UpdateShipmentStatusResponseBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateShipmentStatusResponseBody {
    
    
    
    
    @JsonProperty("statuses")
    private List<StatuesResponse> statuses;
    
    
    
    
}

/*
    Model: OrderUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderUser {
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
}

/*
    Model: ArticleDetails1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleDetails1 {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("weight")
    private Object weight;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("category")
    private Object category;
    
    
    
    
    @JsonProperty("dimension")
    private Object dimension;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
}

/*
    Model: ShipmentDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetails {
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    @JsonProperty("affiliate_shipment_id")
    private String affiliateShipmentId;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: LocationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDetails {
    
    
    
    
    @JsonProperty("articles")
    private List<ArticleDetails1> articles;
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
    
}

/*
    Model: ShipmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentConfig {
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("shipment")
    private List<ShipmentDetails> shipment;
    
    
    
    
    @JsonProperty("location_details")
    private LocationDetails locationDetails;
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: ShipmentData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentData {
    
    
    
    
    @JsonProperty("shipment_data")
    private ShipmentConfig shipmentData;
    
    
    
    
}

/*
    Model: MarketPlacePdf
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MarketPlacePdf {
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
}

/*
    Model: AffiliateBag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateBag {
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("sku")
    private String sku;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("fynd_store_id")
    private String fyndStoreId;
    
    
    
    
    @JsonProperty("unit_price")
    private Double unitPrice;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("affiliate_meta")
    private Object affiliateMeta;
    
    
    
    
    @JsonProperty("pdf_links")
    private MarketPlacePdf pdfLinks;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("affiliate_store_id")
    private String affiliateStoreId;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("avl_qty")
    private Integer avlQty;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("transfer_price")
    private Integer transferPrice;
    
    
    
    
}

/*
    Model: UserData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserData {
    
    
    
    
    @JsonProperty("billing_user")
    private OrderUser billingUser;
    
    
    
    
    @JsonProperty("shipping_user")
    private OrderUser shippingUser;
    
    
    
    
}

/*
    Model: OrderPriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderPriority {
    
    
    
    
    @JsonProperty("fulfilment_priority")
    private Integer fulfilmentPriority;
    
    
    
    
    @JsonProperty("affiliate_priority_code")
    private String affiliatePriorityCode;
    
    
    
    
    @JsonProperty("fulfilment_priority_text")
    private String fulfilmentPriorityText;
    
    
    
    
}

/*
    Model: OrderInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderInfo {
    
    
    
    
    @JsonProperty("billing_address")
    private OrderUser billingAddress;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("shipping_address")
    private OrderUser shippingAddress;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
    @JsonProperty("shipment")
    private ShipmentData shipment;
    
    
    
    
    @JsonProperty("bags")
    private List<AffiliateBag> bags;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("user")
    private UserData user;
    
    
    
    
    @JsonProperty("order_priority")
    private OrderPriority orderPriority;
    
    
    
    
    @JsonProperty("payment")
    private Object payment;
    
    
    
    
    @JsonProperty("order_value")
    private Double orderValue;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
}

/*
    Model: AffiliateInventoryStoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryStoreConfig {
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
}

/*
    Model: AffiliateInventoryArticleAssignmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryArticleAssignmentConfig {
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
}

/*
    Model: AffiliateInventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryPaymentConfig {
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
}

/*
    Model: AffiliateInventoryLogisticsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryLogisticsConfig {
    
    
    
    
    @JsonProperty("dp_assignment")
    private Boolean dpAssignment;
    
    
    
    
}

/*
    Model: AffiliateInventoryOrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryOrderConfig {
    
    
    
    
    @JsonProperty("force_reassignment")
    private Boolean forceReassignment;
    
    
    
    
}

/*
    Model: AffiliateInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateInventoryConfig {
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryStoreConfig inventory;
    
    
    
    
    @JsonProperty("article_assignment")
    private AffiliateInventoryArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("payment")
    private AffiliateInventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("logistics")
    private AffiliateInventoryLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("order")
    private AffiliateInventoryOrderConfig order;
    
    
    
    
}

/*
    Model: AffiliateAppConfigMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateAppConfigMeta {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: AffiliateAppConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateAppConfig {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("meta")
    private List<AffiliateAppConfigMeta> meta;
    
    
    
    
}

/*
    Model: AffiliateConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateConfig {
    
    
    
    
    @JsonProperty("inventory")
    private AffiliateInventoryConfig inventory;
    
    
    
    
    @JsonProperty("app")
    private AffiliateAppConfig app;
    
    
    
    
}

/*
    Model: Affiliate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Affiliate {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config")
    private AffiliateConfig config;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
}

/*
    Model: AffiliateStoreIdMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AffiliateStoreIdMapping {
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("marketplace_store_id")
    private String marketplaceStoreId;
    
    
    
    
}

/*
    Model: OrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderConfig {
    
    
    
    
    @JsonProperty("bag_end_state")
    private String bagEndState;
    
    
    
    
    @JsonProperty("create_user")
    private Boolean createUser;
    
    
    
    
    @JsonProperty("article_lookup")
    private String articleLookup;
    
    
    
    
    @JsonProperty("affiliate")
    private Affiliate affiliate;
    
    
    
    
    @JsonProperty("store_lookup")
    private String storeLookup;
    
    
    
    
    @JsonProperty("affiliate_store_id_mapping")
    private List<AffiliateStoreIdMapping> affiliateStoreIdMapping;
    
    
    
    
}

/*
    Model: CreateOrderPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderPayload {
    
    
    
    
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
    
    
    
    
    @JsonProperty("affiliate_id")
    private String affiliateId;
    
    
    
    
    @JsonProperty("order_config")
    private OrderConfig orderConfig;
    
    
    
    
}

/*
    Model: CreateOrderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderResponse {
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
}

/*
    Model: DispatchManifest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DispatchManifest {
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
}

/*
    Model: SuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: ActionInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionInfo {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("display_text")
    private String displayText;
    
    
    
    
}

/*
    Model: GetActionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetActionsResponse {
    
    
    
    
    @JsonProperty("permissions")
    private ActionInfo permissions;
    
    
    
    
}

/*
    Model: HistoryDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryDict {
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    @JsonProperty("l2_detail")
    private String l2Detail;
    
    
    
    
    @JsonProperty("ticket_url")
    private String ticketUrl;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("l3_detail")
    private String l3Detail;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
    @JsonProperty("createdat")
    private String createdat;
    
    
    
    
    @JsonProperty("l1_detail")
    private String l1Detail;
    
    
    
    
}

/*
    Model: ShipmentHistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentHistoryResponse {
    
    
    
    
    @JsonProperty("activity_history")
    private List<HistoryDict> activityHistory;
    
    
    
    
}

/*
    Model: ErrorDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorDetail {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SmsDataPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SmsDataPayload {
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("customer_name")
    private String customerName;
    
    
    
    
    @JsonProperty("amount_paid")
    private Integer amountPaid;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
    @JsonProperty("shipment_id")
    private Integer shipmentId;
    
    
    
    
    @JsonProperty("phone_number")
    private Integer phoneNumber;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: SendSmsPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SendSmsPayload {
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("data")
    private SmsDataPayload data;
    
    
    
    
    @JsonProperty("bag_id")
    private Integer bagId;
    
    
    
    
}

/*
    Model: OrderDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderDetails {
    
    
    
    
    @JsonProperty("fynd_order_id")
    private String fyndOrderId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
}

/*
    Model: Meta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Meta {
    
    
    
    
    @JsonProperty("state_manager_used")
    private String stateManagerUsed;
    
    
    
    
    @JsonProperty("kafka_emission_status")
    private Integer kafkaEmissionStatus;
    
    
    
    
}

/*
    Model: ShipmentDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentDetail {
    
    
    
    
    @JsonProperty("remarks")
    private String remarks;
    
    
    
    
    @JsonProperty("bag_list")
    private List<Integer> bagList;
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
}

/*
    Model: OrderStatusData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatusData {
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
    
    @JsonProperty("order_details")
    private OrderDetails orderDetails;
    
    
    
    
    @JsonProperty("shipment_details")
    private List<ShipmentDetail> shipmentDetails;
    
    
    
    
}

/*
    Model: OrderStatusResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatusResult {
    
    
    
    
    @JsonProperty("result")
    private List<OrderStatusData> result;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
}

/*
    Model: ManualAssignDPToShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualAssignDPToShipment {
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    @JsonProperty("qc_required")
    private String qcRequired;
    
    
    
    
}

/*
    Model: ManualAssignDPToShipmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManualAssignDPToShipmentResponse {
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
}

/*
    Model: ShippingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingInfo {
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("shipping_type")
    private String shippingType;
    
    
    
    
    @JsonProperty("slot")
    private List<Object> slot;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("geo_location")
    private Object geoLocation;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: Tax
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tax {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
    
    @JsonProperty("breakup")
    private List<Object> breakup;
    
    
    
    
    @JsonProperty("tax_exempt")
    private Boolean taxExempt;
    
    
    
    
}

/*
    Model: Charge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Charge {
    
    
    
    
    @JsonProperty("tax")
    private Tax tax;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("amount")
    private Object amount;
    
    
    
    
}

/*
    Model: LineItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LineItem {
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("custom_messasge")
    private String customMessasge;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("external_line_id")
    private String externalLineId;
    
    
    
    
}

/*
    Model: ProcessingDates
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProcessingDates {
    
    
    
    
    @JsonProperty("dp_pickup_slot")
    private Object dpPickupSlot;
    
    
    
    
    @JsonProperty("confirm_by_date")
    private String confirmByDate;
    
    
    
    
    @JsonProperty("pack_by_date")
    private String packByDate;
    
    
    
    
    @JsonProperty("dispatch_after_date")
    private String dispatchAfterDate;
    
    
    
    
    @JsonProperty("customer_pickup_slot")
    private Object customerPickupSlot;
    
    
    
    
    @JsonProperty("dispatch_by_date")
    private String dispatchByDate;
    
    
    
    
}

/*
    Model: Shipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Shipment {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("location_id")
    private Integer locationId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("external_shipment_id")
    private Double externalShipmentId;
    
    
    
    
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    
    
    
    
    @JsonProperty("processing_dates")
    private ProcessingDates processingDates;
    
    
    
    
}

/*
    Model: TaxInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxInfo {
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("b2b_gstin_number")
    private String b2BGstinNumber;
    
    
    
    
}

/*
    Model: BillingInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BillingInfo {
    
    
    
    
    @JsonProperty("external_customer_code")
    private String externalCustomerCode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("state_code")
    private String stateCode;
    
    
    
    
    @JsonProperty("floor_no")
    private String floorNo;
    
    
    
    
    @JsonProperty("alternate_email")
    private String alternateEmail;
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    @JsonProperty("customer_code")
    private String customerCode;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("middle_name")
    private String middleName;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("alternate_mobile_number")
    private String alternateMobileNumber;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("house_no")
    private String houseNo;
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("primary_email")
    private String primaryEmail;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    @JsonProperty("primary_mobile_number")
    private String primaryMobileNumber;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: PaymentMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethod {
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("transaction_data")
    private Object transactionData;
    
    
    
    
}

/*
    Model: PaymentInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentInfo {
    
    
    
    
    @JsonProperty("primary_mode")
    private String primaryMode;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethod> paymentMethods;
    
    
    
    
}

/*
    Model: CreateOrderAPI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderAPI {
    
    
    
    
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipment> shipments;
    
    
    
    
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
    
    
    
    
    @JsonProperty("billing_info")
    private BillingInfo billingInfo;
    
    
    
    
    @JsonProperty("external_order_id")
    private String externalOrderId;
    
    
    
    
    @JsonProperty("currency_info")
    private Object currencyInfo;
    
    
    
    
    @JsonProperty("external_creation_date")
    private String externalCreationDate;
    
    
    
    
    @JsonProperty("payment_info")
    private PaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("charges")
    private List<Charge> charges;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: CreateOrderErrorReponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateOrderErrorReponse {
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("info")
    private Object info;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private String meta;
    
    
    
    
}

/*
    Model: PaymentMethods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentMethods {
    
    
    
    
    @JsonProperty("refund_by")
    private String refundBy;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("collect_by")
    private String collectBy;
    
    
    
    
}

/*
    Model: CreateChannelPaymentInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelPaymentInfo {
    
    
    
    
    @JsonProperty("payment_methods")
    private List<PaymentMethods> paymentMethods;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
}

/*
    Model: DpConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DpConfiguration {
    
    
    
    
    @JsonProperty("shipping_by")
    private String shippingBy;
    
    
    
    
}

/*
    Model: CreateChannelConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfig {
    
    
    
    
    @JsonProperty("shipment_assignment")
    private String shipmentAssignment;
    
    
    
    
    @JsonProperty("logo_url")
    private Object logoUrl;
    
    
    
    
    @JsonProperty("payment_info")
    private CreateChannelPaymentInfo paymentInfo;
    
    
    
    
    @JsonProperty("dp_configuration")
    private DpConfiguration dpConfiguration;
    
    
    
    
    @JsonProperty("location_reassignment")
    private Boolean locationReassignment;
    
    
    
    
    @JsonProperty("lock_states")
    private String lockStates;
    
    
    
    
}

/*
    Model: CreateChannelConfigData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfigData {
    
    
    
    
    @JsonProperty("config_data")
    private CreateChannelConfig configData;
    
    
    
    
}

/*
    Model: CreateChannelConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConfigResponse {
    
    
    
    
    @JsonProperty("acknowledged")
    private Boolean acknowledged;
    
    
    
    
    @JsonProperty("is_inserted")
    private Boolean isInserted;
    
    
    
    
    @JsonProperty("is_upserted")
    private Boolean isUpserted;
    
    
    
    
}

/*
    Model: CreateChannelConifgErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateChannelConifgErrorResponse {
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: UploadConsent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UploadConsent {
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("consent_url")
    private String consentUrl;
    
    
    
    
}

/*
    Model: FyndOrderIdList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndOrderIdList {
    
    
    
    
    @JsonProperty("fynd_order_id")
    private List<String> fyndOrderId;
    
    
    
    
}

/*
    Model: OrderStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderStatus {
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("mobile")
    private Integer mobile;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("order_details")
    private List<FyndOrderIdList> orderDetails;
    
    
    
    
}




/*
    Model: SearchKeywordResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SearchKeywordResult {
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
}

/*
    Model: CreateSearchKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateSearchKeyword {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("result")
    private SearchKeywordResult result;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: GetSearchWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsData {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: DeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeleteResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: GetSearchWordsDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsDetailResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private GetSearchWordsData items;
    
    
    
    
}

/*
    Model: GetSearchWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetSearchWordsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetSearchWordsData> items;
    
    
    
    
}

/*
    Model: AutocompletePageAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompletePageAction {
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: AutocompleteAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteAction {
    
    
    
    
    @JsonProperty("page")
    private AutocompletePageAction page;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Media
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: AutocompleteResult
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AutocompleteResult {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("action")
    private AutocompleteAction action;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
}

/*
    Model: CreateAutocompleteKeyword
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAutocompleteKeyword {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<AutocompleteResult> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: GetAutocompleteWordsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAutocompleteWordsData {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: GetAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAutocompleteWordsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetAutocompleteWordsData> items;
    
    
    
    
}

/*
    Model: CreateAutocompleteWordsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAutocompleteWordsResponse {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("results")
    private List<Object> results;
    
    
    
    
    @JsonProperty("words")
    private List<String> words;
    
    
    
    
}

/*
    Model: ProductBundleItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleItem {
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
}

/*
    Model: ProductBundleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: GetProductBundleCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleCreateResponse {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: GetProductBundleListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetProductBundleCreateResponse> items;
    
    
    
    
}

/*
    Model: ProductBundleUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBundleUpdateRequest {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("products")
    private List<ProductBundleItem> products;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: LimitedProductData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LimitedProductData {
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("images")
    private List<String> images;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price")
    private Object price;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: Price
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Price {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("max_marked")
    private Double maxMarked;
    
    
    
    
    @JsonProperty("max_effective")
    private Double maxEffective;
    
    
    
    
    @JsonProperty("min_effective")
    private Double minEffective;
    
    
    
    
    @JsonProperty("min_marked")
    private Double minMarked;
    
    
    
    
}

/*
    Model: Size
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Size {
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: GetProducts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProducts {
    
    
    
    
    @JsonProperty("max_quantity")
    private Integer maxQuantity;
    
    
    
    
    @JsonProperty("product_details")
    private LimitedProductData productDetails;
    
    
    
    
    @JsonProperty("price")
    private Price price;
    
    
    
    
    @JsonProperty("allow_remove")
    private Boolean allowRemove;
    
    
    
    
    @JsonProperty("auto_select")
    private Boolean autoSelect;
    
    
    
    
    @JsonProperty("auto_add_to_cart")
    private Boolean autoAddToCart;
    
    
    
    
    @JsonProperty("sizes")
    private List<Size> sizes;
    
    
    
    
    @JsonProperty("min_quantity")
    private Integer minQuantity;
    
    
    
    
    @JsonProperty("product_uid")
    private Integer productUid;
    
    
    
    
}

/*
    Model: GetProductBundleResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetProductBundleResponse {
    
    
    
    
    @JsonProperty("same_store_assignment")
    private Boolean sameStoreAssignment;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("choice")
    private String choice;
    
    
    
    
    @JsonProperty("page_visibility")
    private List<String> pageVisibility;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("products")
    private List<GetProducts> products;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: Guide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Guide {
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
}

/*
    Model: ValidateSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateSizeGuide {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("guide")
    private Guide guide;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
}

/*
    Model: ListSizeGuide
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListSizeGuide {
    
    
    
    
    @JsonProperty("page")
    private Object page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}

/*
    Model: SizeGuideResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeGuideResponse {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("guide")
    private Object guide;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
}

/*
    Model: MetaFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaFields {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: ApplicationItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemMeta {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("_custom_meta")
    private List<MetaFields> customMeta;
    
    
    
    
}

/*
    Model: SuccessResponse1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponse1 {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: MOQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MOQ {
    
    
    
    
    @JsonProperty("maximum")
    private Integer maximum;
    
    
    
    
    @JsonProperty("minimum")
    private Integer minimum;
    
    
    
    
    @JsonProperty("increment_unit")
    private Integer incrementUnit;
    
    
    
    
}

/*
    Model: ApplicationItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationItemResponse {
    
    
    
    
    @JsonProperty("alt_text")
    private Object altText;
    
    
    
    
    @JsonProperty("moq")
    private MOQ moq;
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
}

/*
    Model: GetConfigMetadataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetConfigMetadataResponse {
    
    
    
    
    @JsonProperty("condition")
    private List<Object> condition;
    
    
    
    
    @JsonProperty("values")
    private List<Object> values;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: AttributeDetailsGroup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeDetailsGroup {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: AppConfigurationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfigurationDetail {
    
    
    
    
    @JsonProperty("attributes")
    private List<AttributeDetailsGroup> attributes;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("template_slugs")
    private List<String> templateSlugs;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ConfigErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: PageResponseType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageResponseType {
    
    
    
    
    @JsonProperty("total_count")
    private Integer totalCount;
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    @JsonProperty("next")
    private Integer next;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
}

/*
    Model: GetConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetConfigResponse {
    
    
    
    
    @JsonProperty("page")
    private PageResponseType page;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: ConfigSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigSuccessResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AppConfigurationsSort
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfigurationsSort {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: AllowSingleRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AllowSingleRequest {
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
    
}

/*
    Model: DefaultKeyRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultKeyRequest {
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
}

/*
    Model: MetaDataListingFilterMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingFilterMetaResponse {
    
    
    
    
    @JsonProperty("units")
    private List<Object> units;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("filter_types")
    private List<String> filterTypes;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: MetaDataListingFilterResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingFilterResponse {
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingFilterMetaResponse> data;
    
    
    
    
}

/*
    Model: MetaDataListingSortMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingSortMetaResponse {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: MetaDataListingSortResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingSortResponse {
    
    
    
    
    @JsonProperty("data")
    private List<MetaDataListingSortMetaResponse> data;
    
    
    
    
}

/*
    Model: MetaDataListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetaDataListingResponse {
    
    
    
    
    @JsonProperty("filter")
    private MetaDataListingFilterResponse filter;
    
    
    
    
    @JsonProperty("sort")
    private MetaDataListingSortResponse sort;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationDetailsProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationDetailsProduct {
    
    
    
    
    @JsonProperty("compare")
    private Object compare;
    
    
    
    
    @JsonProperty("detail")
    private Object detail;
    
    
    
    
    @JsonProperty("variant")
    private Object variant;
    
    
    
    
    @JsonProperty("similar")
    private Object similar;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationMetaData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationMetaData {
    
    
    
    
    @JsonProperty("listing")
    private MetaDataListingResponse listing;
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
}

/*
    Model: ConfigurationBucketPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationBucketPoints {
    
    
    
    
    @JsonProperty("end")
    private Double end;
    
    
    
    
    @JsonProperty("start")
    private Double start;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: ConfigurationListingFilterValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilterValue {
    
    
    
    
    @JsonProperty("bucket_points")
    private List<ConfigurationBucketPoints> bucketPoints;
    
    
    
    
    @JsonProperty("condition")
    private String condition;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("map_values")
    private List<Object> mapValues;
    
    
    
    
    @JsonProperty("sort")
    private String sort;
    
    
    
    
    @JsonProperty("map")
    private Object map;
    
    
    
    
}

/*
    Model: ConfigurationListingFilterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilterConfig {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("value_config")
    private ConfigurationListingFilterValue valueConfig;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ConfigurationListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingFilter {
    
    
    
    
    @JsonProperty("allow_single")
    private Boolean allowSingle;
    
    
    
    
    @JsonProperty("attribute_config")
    private List<ConfigurationListingFilterConfig> attributeConfig;
    
    
    
    
}

/*
    Model: ConfigurationListingSortConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingSortConfig {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ConfigurationListingSort
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListingSort {
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationListingSortConfig> config;
    
    
    
    
    @JsonProperty("default_key")
    private String defaultKey;
    
    
    
    
}

/*
    Model: ConfigurationListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationListing {
    
    
    
    
    @JsonProperty("filter")
    private ConfigurationListingFilter filter;
    
    
    
    
    @JsonProperty("sort")
    private ConfigurationListingSort sort;
    
    
    
    
}

/*
    Model: ProductSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSize {
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
}

/*
    Model: ConfigurationProductVariantConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductVariantConfig {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ConfigurationProductVariant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductVariant {
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductVariantConfig> config;
    
    
    
    
}

/*
    Model: ConfigurationProductConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductConfig {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("size")
    private ProductSize size;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ConfigurationProductSimilar
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProductSimilar {
    
    
    
    
    @JsonProperty("config")
    private List<ConfigurationProductConfig> config;
    
    
    
    
}

/*
    Model: ConfigurationProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ConfigurationProduct {
    
    
    
    
    @JsonProperty("variant")
    private ConfigurationProductVariant variant;
    
    
    
    
    @JsonProperty("similar")
    private ConfigurationProductSimilar similar;
    
    
    
    
}

/*
    Model: AppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppConfiguration {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
}

/*
    Model: AppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCatalogConfiguration {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("listing")
    private ConfigurationListing listing;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("product")
    private ConfigurationProduct product;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
}

/*
    Model: GetAppCatalogConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAppCatalogConfiguration {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("data")
    private AppCatalogConfiguration data;
    
    
    
    
}

/*
    Model: GetCatalogConfigurationDetailsSchemaListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCatalogConfigurationDetailsSchemaListing {
    
    
    
    
    @JsonProperty("filter")
    private Object filter;
    
    
    
    
    @JsonProperty("sort")
    private Object sort;
    
    
    
    
}

/*
    Model: EntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityConfiguration {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("config_id")
    private String configId;
    
    
    
    
    @JsonProperty("listing")
    private GetCatalogConfigurationDetailsSchemaListing listing;
    
    
    
    
    @JsonProperty("product")
    private GetCatalogConfigurationDetailsProduct product;
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
}

/*
    Model: GetAppCatalogEntityConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAppCatalogEntityConfiguration {
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("data")
    private EntityConfiguration data;
    
    
    
    
}

/*
    Model: ProductSortOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSortOn {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersValue {
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
}

/*
    Model: ProductFiltersKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFiltersKey {
    
    
    
    
    @JsonProperty("operators")
    private List<String> operators;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
}

/*
    Model: ProductFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductFilters {
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
    
}

/*
    Model: GetCollectionQueryOptionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionQueryOptionResponse {
    
    
    
    
    @JsonProperty("operators")
    private HashMap<String,String> operators;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
}

/*
    Model: CollectionSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionSchedule {
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("next_schedule")
    private List<NextSchedule> nextSchedule;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
}

/*
    Model: CollectionBadge
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionBadge {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
}

/*
    Model: UserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserInfo {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: CollectionImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionImage {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
}

/*
    Model: CollectionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionQuery {
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    @JsonProperty("value")
    private List<Object> value;
    
    
    
    
    @JsonProperty("attribute")
    private String attribute;
    
    
    
    
}

/*
    Model: CollectionBanner
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionBanner {
    
    
    
    
    @JsonProperty("portrait")
    private CollectionImage portrait;
    
    
    
    
    @JsonProperty("landscape")
    private CollectionImage landscape;
    
    
    
    
}

/*
    Model: SeoDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SeoDetail {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: CreateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateCollection {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo createdBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
}

/*
    Model: BannerImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BannerImage {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
}

/*
    Model: ImageUrls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ImageUrls {
    
    
    
    
    @JsonProperty("portrait")
    private BannerImage portrait;
    
    
    
    
    @JsonProperty("landscape")
    private BannerImage landscape;
    
    
    
    
}

/*
    Model: CollectionCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionCreateResponse {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private BannerImage logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Media1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media1 {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: GetCollectionDetailNest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionDetailNest {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: CollectionListingFilterType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilterType {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: CollectionListingFilterTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilterTag {
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: CollectionListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionListingFilter {
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
    
}

/*
    Model: GetCollectionListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
}

/*
    Model: CollectionDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionDetailResponse {
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: UpdateCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCollection {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    @JsonProperty("_schedule")
    private CollectionSchedule schedule;
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("badge")
    private CollectionBadge badge;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo modifiedBy;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("is_visible")
    private Boolean isVisible;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("logo")
    private CollectionImage logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("banners")
    private CollectionBanner banners;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    @JsonProperty("sort_on")
    private String sortOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seo")
    private SeoDetail seo;
    
    
    
    
}

/*
    Model: ItemQueryForUserCollection
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemQueryForUserCollection {
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: CollectionItemRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CollectionItemRequest {
    
    
    
    
    @JsonProperty("item")
    private List<ItemQueryForUserCollection> item;
    
    
    
    
    @JsonProperty("query")
    private List<CollectionQuery> query;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: UpdatedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdatedResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items_not_updated")
    private List<Integer> itemsNotUpdated;
    
    
    
    
}

/*
    Model: ProductDetailAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailAttribute {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
}

/*
    Model: ProductDetailGroupedAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailGroupedAttribute {
    
    
    
    
    @JsonProperty("details")
    private List<ProductDetailAttribute> details;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: Price1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Price1 {
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
}

/*
    Model: ProductListingPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingPrice {
    
    
    
    
    @JsonProperty("effective")
    private Price1 effective;
    
    
    
    
    @JsonProperty("marked")
    private Price1 marked;
    
    
    
    
}

/*
    Model: ProductBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBrand {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("logo")
    private Media1 logo;
    
    
    
    
}

/*
    Model: ProductListingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingDetail {
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: GetCollectionItemsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCollectionItemsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
}

/*
    Model: CatalogInsightItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightItem {
    
    
    
    
    @JsonProperty("sellable_count")
    private Integer sellableCount;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("out_of_stock_count")
    private Integer outOfStockCount;
    
    
    
    
}

/*
    Model: CatalogInsightBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightBrand {
    
    
    
    
    @JsonProperty("total_articles")
    private Integer totalArticles;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("available_articles")
    private Integer availableArticles;
    
    
    
    
    @JsonProperty("total_sizes")
    private Integer totalSizes;
    
    
    
    
    @JsonProperty("available_sizes")
    private Integer availableSizes;
    
    
    
    
    @JsonProperty("article_freshness")
    private Integer articleFreshness;
    
    
    
    
}

/*
    Model: CatalogInsightResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogInsightResponse {
    
    
    
    
    @JsonProperty("item")
    private CatalogInsightItem item;
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
}

/*
    Model: CrossSellingData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CrossSellingData {
    
    
    
    
    @JsonProperty("articles")
    private Integer articles;
    
    
    
    
    @JsonProperty("products")
    private Integer products;
    
    
    
    
}

/*
    Model: CrossSellingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CrossSellingResponse {
    
    
    
    
    @JsonProperty("brand_distribution")
    private CatalogInsightBrand brandDistribution;
    
    
    
    
    @JsonProperty("data")
    private CrossSellingData data;
    
    
    
    
}

/*
    Model: OptInPostRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptInPostRequest {
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: CompanyOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyOptIn {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("created_on")
    private Integer createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private Integer modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("opt_level")
    private String optLevel;
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
}

/*
    Model: GetOptInPlatform
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetOptInPlatform {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyOptIn> items;
    
    
    
    
}

/*
    Model: OptinCompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyDetail {
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
}

/*
    Model: CompanyBrandDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandDetail {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("total_article")
    private Integer totalArticle;
    
    
    
    
    @JsonProperty("brand_id")
    private Integer brandId;
    
    
    
    
    @JsonProperty("brand_name")
    private String brandName;
    
    
    
    
}

/*
    Model: OptinCompanyBrandDetailsView
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyBrandDetailsView {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandDetail> items;
    
    
    
    
}

/*
    Model: OptinCompanyMetrics
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinCompanyMetrics {
    
    
    
    
    @JsonProperty("brand")
    private Integer brand;
    
    
    
    
    @JsonProperty("store")
    private Integer store;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
}

/*
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreDetail {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
    @JsonProperty("additional_contacts")
    private List<Object> additionalContacts;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("manager")
    private Object manager;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("documents")
    private List<Object> documents;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("timing")
    private Object timing;
    
    
    
    
}

/*
    Model: OptinStoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptinStoreDetails {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<StoreDetail> items;
    
    
    
    
}

/*
    Model: AttributeMasterDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterDetails {
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
}

/*
    Model: AttributeSchemaRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeSchemaRange {
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
}

/*
    Model: AttributeMaster
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMaster {
    
    
    
    
    @JsonProperty("multi")
    private Boolean multi;
    
    
    
    
    @JsonProperty("mandatory")
    private Boolean mandatory;
    
    
    
    
    @JsonProperty("format")
    private String format;
    
    
    
    
    @JsonProperty("allowed_values")
    private List<String> allowedValues;
    
    
    
    
    @JsonProperty("range")
    private AttributeSchemaRange range;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: AttributeMasterFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterFilter {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("depends_on")
    private List<String> dependsOn;
    
    
    
    
    @JsonProperty("indexing")
    private Boolean indexing;
    
    
    
    
}

/*
    Model: AttributeMasterMandatoryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterMandatoryDetails {
    
    
    
    
    @JsonProperty("l3_keys")
    private List<String> l3Keys;
    
    
    
    
}

/*
    Model: AttributeMasterMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterMeta {
    
    
    
    
    @JsonProperty("enriched")
    private Boolean enriched;
    
    
    
    
    @JsonProperty("mandatory_details")
    private AttributeMasterMandatoryDetails mandatoryDetails;
    
    
    
    
}

/*
    Model: GenderDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenderDetail {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("meta")
    private AttributeMasterMeta meta;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: ProdcutTemplateCategoriesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProdcutTemplateCategoriesResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}

/*
    Model: PTErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PTErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: DepartmentCreateUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateUpdate {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("platforms")
    private Object platforms;
    
    
    
    
    @JsonProperty("_cls")
    private String cls;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: DepartmentCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: DepartmentCreateErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCreateErrorResponse {
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: UserSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer {
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: GetDepartment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetDepartment {
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("page_size")
    private Integer pageSize;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("page_no")
    private Integer pageNo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("search")
    private String search;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: DepartmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetDepartment> items;
    
    
    
    
}

/*
    Model: DepartmentErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: UserDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetail {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
    @JsonProperty("super_user")
    private Boolean superUser;
    
    
    
    
}

/*
    Model: DepartmentModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentModel {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail createdBy;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("_id")
    private Object id;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserDetail verifiedBy;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail modifiedBy;
    
    
    
    
    @JsonProperty("_cls")
    private Object cls;
    
    
    
    
    @JsonProperty("synonyms")
    private List<Object> synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
}

/*
    Model: ProductTemplate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTemplate {
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: TemplatesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplatesResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductTemplate items;
    
    
    
    
}

/*
    Model: TemplateDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateDetails {
    
    
    
    
    @JsonProperty("attributes")
    private List<String> attributes;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("categories")
    private List<String> categories;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: Properties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Properties {
    
    
    
    
    @JsonProperty("currency")
    private Object currency;
    
    
    
    
    @JsonProperty("size_guide")
    private Object sizeGuide;
    
    
    
    
    @JsonProperty("product_group_tag")
    private Object productGroupTag;
    
    
    
    
    @JsonProperty("brand_uid")
    private Object brandUid;
    
    
    
    
    @JsonProperty("description")
    private Object description;
    
    
    
    
    @JsonProperty("multi_size")
    private Object multiSize;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Object noOfBoxes;
    
    
    
    
    @JsonProperty("command")
    private Object command;
    
    
    
    
    @JsonProperty("trader_type")
    private Object traderType;
    
    
    
    
    @JsonProperty("short_description")
    private Object shortDescription;
    
    
    
    
    @JsonProperty("hsn_code")
    private Object hsnCode;
    
    
    
    
    @JsonProperty("slug")
    private Object slug;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("is_active")
    private Object isActive;
    
    
    
    
    @JsonProperty("item_type")
    private Object itemType;
    
    
    
    
    @JsonProperty("tags")
    private Object tags;
    
    
    
    
    @JsonProperty("sizes")
    private Object sizes;
    
    
    
    
    @JsonProperty("category_slug")
    private Object categorySlug;
    
    
    
    
    @JsonProperty("highlights")
    private Object highlights;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("product_publish")
    private Object productPublish;
    
    
    
    
    @JsonProperty("media")
    private Object media;
    
    
    
    
    @JsonProperty("name")
    private Object name;
    
    
    
    
    @JsonProperty("country_of_origin")
    private Object countryOfOrigin;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("return_config")
    private Object returnConfig;
    
    
    
    
    @JsonProperty("trader")
    private Object trader;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("is_dependent")
    private Object isDependent;
    
    
    
    
}

/*
    Model: GlobalValidation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GlobalValidation {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("properties")
    private Properties properties;
    
    
    
    
    @JsonProperty("definitions")
    private Object definitions;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("required")
    private List<String> required;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: TemplateValidationData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplateValidationData {
    
    
    
    
    @JsonProperty("template_validation")
    private Object templateValidation;
    
    
    
    
    @JsonProperty("global_validation")
    private GlobalValidation globalValidation;
    
    
    
    
}

/*
    Model: TemplatesValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TemplatesValidationResponse {
    
    
    
    
    @JsonProperty("template_details")
    private TemplateDetails templateDetails;
    
    
    
    
    @JsonProperty("data")
    private TemplateValidationData data;
    
    
    
    
}

/*
    Model: InventoryValidationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryValidationResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: HSNData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNData {
    
    
    
    
    @JsonProperty("hsn_code")
    private List<String> hsnCode;
    
    
    
    
    @JsonProperty("country_of_origin")
    private List<String> countryOfOrigin;
    
    
    
    
}

/*
    Model: HSNCodesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNCodesResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private HSNData data;
    
    
    
    
}

/*
    Model: VerifiedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VerifiedBy {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
}

/*
    Model: ProductDownloadItemsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadItemsData {
    
    
    
    
    @JsonProperty("brand")
    private List<String> brand;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("templates")
    private List<String> templates;
    
    
    
    
}

/*
    Model: ProductDownloadsItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadsItems {
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("created_by")
    private VerifiedBy createdBy;
    
    
    
    
    @JsonProperty("template_tags")
    private Object templateTags;
    
    
    
    
    @JsonProperty("seller_id")
    private Double sellerId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("data")
    private ProductDownloadItemsData data;
    
    
    
    
}

/*
    Model: ProductDownloadsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDownloadsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductDownloadsItems items;
    
    
    
    
}

/*
    Model: ProductConfigurationDownloads
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductConfigurationDownloads {
    
    
    
    
    @JsonProperty("multivalue")
    private Boolean multivalue;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: Media2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Media2 {
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
}

/*
    Model: CategoryMappingValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryMappingValues {
    
    
    
    
    @JsonProperty("catalog_id")
    private Integer catalogId;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CategoryMapping
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryMapping {
    
    
    
    
    @JsonProperty("google")
    private CategoryMappingValues google;
    
    
    
    
    @JsonProperty("facebook")
    private CategoryMappingValues facebook;
    
    
    
    
    @JsonProperty("ajio")
    private CategoryMappingValues ajio;
    
    
    
    
}

/*
    Model: Hierarchy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Hierarchy {
    
    
    
    
    @JsonProperty("l2")
    private Integer l2;
    
    
    
    
    @JsonProperty("department")
    private Integer department;
    
    
    
    
    @JsonProperty("l1")
    private Integer l1;
    
    
    
    
}

/*
    Model: CategoryRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryRequestBody {
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
}

/*
    Model: CategoryCreateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryCreateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: Category
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Category {
    
    
    
    
    @JsonProperty("media")
    private Media2 media;
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("marketplaces")
    private CategoryMapping marketplaces;
    
    
    
    
    @JsonProperty("hierarchy")
    private List<Hierarchy> hierarchy;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("level")
    private Integer level;
    
    
    
    
}

/*
    Model: CategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Category> items;
    
    
    
    
}

/*
    Model: CategoryUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryUpdateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: SingleCategoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SingleCategoryResponse {
    
    
    
    
    @JsonProperty("data")
    private Category data;
    
    
    
    
}

/*
    Model: CustomOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CustomOrder {
    
    
    
    
    @JsonProperty("manufacturing_time")
    private Integer manufacturingTime;
    
    
    
    
    @JsonProperty("is_custom_order")
    private Boolean isCustomOrder;
    
    
    
    
    @JsonProperty("manufacturing_time_unit")
    private String manufacturingTimeUnit;
    
    
    
    
}

/*
    Model: TaxIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxIdentifier {
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("hsn_code_id")
    private String hsnCodeId;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
}

/*
    Model: TeaserTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TeaserTag {
    
    
    
    
    @JsonProperty("tag")
    private String tag;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ProductPublish
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublish {
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
}

/*
    Model: NetQuantity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NetQuantity {
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("unit")
    private Object unit;
    
    
    
    
}

/*
    Model: Trader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader {
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ProductCreateUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductCreateUpdate {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("product_group_tag")
    private List<String> productGroupTag;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("no_of_boxes")
    private Integer noOfBoxes;
    
    
    
    
    @JsonProperty("is_image_less_product")
    private Boolean isImageLessProduct;
    
    
    
    
    @JsonProperty("bulk_job_id")
    private String bulkJobId;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("custom_order")
    private CustomOrder customOrder;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("variant_media")
    private Object variantMedia;
    
    
    
    
    @JsonProperty("requester")
    private String requester;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("tax_identifier")
    private TaxIdentifier taxIdentifier;
    
    
    
    
    @JsonProperty("teaser_tag")
    private TeaserTag teaserTag;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublish productPublish;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("net_quantity")
    private NetQuantity netQuantity;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader> trader;
    
    
    
    
    @JsonProperty("item_code")
    private Object itemCode;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("change_request_id")
    private Object changeRequestId;
    
    
    
    
}

/*
    Model: Image
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Image {
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Double aspectRatioF;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: ProductPublished
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPublished {
    
    
    
    
    @JsonProperty("product_online_date")
    private Integer productOnlineDate;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
}

/*
    Model: Logo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Logo {
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio_f")
    private Integer aspectRatioF;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: Product
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Product {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("size_guide")
    private String sizeGuide;
    
    
    
    
    @JsonProperty("images")
    private List<Image> images;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("multi_size")
    private Boolean multiSize;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("custom_order")
    private Object customOrder;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("sizes")
    private List<Object> sizes;
    
    
    
    
    @JsonProperty("category_slug")
    private String categorySlug;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("product_publish")
    private ProductPublished productPublish;
    
    
    
    
    @JsonProperty("media")
    private List<Media1> media;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_physical")
    private Boolean isPhysical;
    
    
    
    
    @JsonProperty("brand")
    private Brand brand;
    
    
    
    
    @JsonProperty("is_expirable")
    private Boolean isExpirable;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("variants")
    private Object variants;
    
    
    
    
    @JsonProperty("departments")
    private List<Integer> departments;
    
    
    
    
    @JsonProperty("all_sizes")
    private List<Object> allSizes;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("is_dependent")
    private Boolean isDependent;
    
    
    
    
    @JsonProperty("category_uid")
    private Integer categoryUid;
    
    
    
    
    @JsonProperty("l3_mapping")
    private List<String> l3Mapping;
    
    
    
    
}

/*
    Model: ProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Product> items;
    
    
    
    
}

/*
    Model: AttributeMasterSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AttributeMasterSerializer {
    
    
    
    
    @JsonProperty("variant")
    private Boolean variant;
    
    
    
    
    @JsonProperty("raw_key")
    private String rawKey;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("is_nested")
    private Boolean isNested;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("suggestion")
    private String suggestion;
    
    
    
    
    @JsonProperty("synonyms")
    private Object synonyms;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("details")
    private AttributeMasterDetails details;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("schema")
    private AttributeMaster schema;
    
    
    
    
    @JsonProperty("enabled_for_end_consumer")
    private Boolean enabledForEndConsumer;
    
    
    
    
    @JsonProperty("filters")
    private AttributeMasterFilter filters;
    
    
    
    
}

/*
    Model: ProductAttributesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAttributesResponse {
    
    
    
    
    @JsonProperty("items")
    private List<AttributeMasterSerializer> items;
    
    
    
    
}

/*
    Model: ValidateProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidateProduct {
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
    
}

/*
    Model: UserInfo1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserInfo1 {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: BulkJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkJob {
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<Object> cancelledRecords;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<Object> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("custom_template_tag")
    private String customTemplateTag;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: BulkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkResponse {
    
    
    
    
    @JsonProperty("created_by")
    private UserInfo1 createdBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("modified_by")
    private UserInfo1 modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: UserDetail1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetail1 {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
}

/*
    Model: ProductBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkRequest {
    
    
    
    
    @JsonProperty("created_by")
    private UserDetail1 createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetail1 modifiedBy;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("template")
    private ProductTemplate template;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: ProductBulkRequestList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkRequestList {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private ProductBulkRequest items;
    
    
    
    
}

/*
    Model: BulkProductRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkProductRequest {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("template_tag")
    private String templateTag;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("data")
    private List<Object> data;
    
    
    
    
}

/*
    Model: NestedTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class NestedTags {
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: ProductTagsViewResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductTagsViewResponse {
    
    
    
    
    @JsonProperty("items")
    private NestedTags items;
    
    
    
    
}

/*
    Model: ProductBulkAssets
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductBulkAssets {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
}

/*
    Model: UserCommon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserCommon {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: Items
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Items {
    
    
    
    
    @JsonProperty("created_by")
    private UserCommon createdBy;
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("retry")
    private Integer retry;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserCommon modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: BulkAssetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkAssetResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<Items> items;
    
    
    
    
}

/*
    Model: ProductSizeDeleteDataResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeDeleteDataResponse {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: ProductSizeDeleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductSizeDeleteResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("data")
    private ProductSizeDeleteDataResponse data;
    
    
    
    
}

/*
    Model: ItemQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemQuery {
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: GTIN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GTIN {
    
    
    
    
    @JsonProperty("gtin_value")
    private String gtinValue;
    
    
    
    
    @JsonProperty("gtin_type")
    private String gtinType;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
}

/*
    Model: SetSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SetSize {
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
}

/*
    Model: SizeDistribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SizeDistribution {
    
    
    
    
    @JsonProperty("sizes")
    private List<SetSize> sizes;
    
    
    
    
}

/*
    Model: InventorySet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySet {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("size_distribution")
    private SizeDistribution sizeDistribution;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: InvSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvSize {
    
    
    
    
    @JsonProperty("item_weight")
    private Double itemWeight;
    
    
    
    
    @JsonProperty("item_length")
    private Double itemLength;
    
    
    
    
    @JsonProperty("identifiers")
    private List<GTIN> identifiers;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("item_width")
    private Double itemWidth;
    
    
    
    
    @JsonProperty("item_height")
    private Double itemHeight;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
}

/*
    Model: InventoryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryRequest {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("item")
    private ItemQuery item;
    
    
    
    
    @JsonProperty("sizes")
    private List<InvSize> sizes;
    
    
    
    
}

/*
    Model: InventoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponse {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("identifiers")
    private Object identifiers;
    
    
    
    
    @JsonProperty("store")
    private Object store;
    
    
    
    
    @JsonProperty("inventory_updated_on")
    private String inventoryUpdatedOn;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("price_transfer")
    private Double priceTransfer;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("sellable_quantity")
    private Integer sellableQuantity;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: InventoryResponsePaginated
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponsePaginated {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponse> items;
    
    
    
    
}

/*
    Model: CompanyMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyMeta {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
}

/*
    Model: QuantityBase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QuantityBase {
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: Quantities
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Quantities {
    
    
    
    
    @JsonProperty("order_committed")
    private QuantityBase orderCommitted;
    
    
    
    
    @JsonProperty("damaged")
    private QuantityBase damaged;
    
    
    
    
    @JsonProperty("sellable")
    private QuantityBase sellable;
    
    
    
    
    @JsonProperty("not_available")
    private QuantityBase notAvailable;
    
    
    
    
}

/*
    Model: PriceMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceMeta {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("transfer")
    private Double transfer;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("tp_notes")
    private Object tpNotes;
    
    
    
    
}

/*
    Model: ManufacturerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManufacturerResponse {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
}

/*
    Model: BrandMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandMeta {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: WeightResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WeightResponse {
    
    
    
    
    @JsonProperty("shipping")
    private Double shipping;
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: ReturnConfig1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReturnConfig1 {
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
    
}

/*
    Model: DimensionResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DimensionResponse {
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
    @JsonProperty("width")
    private Double width;
    
    
    
    
    @JsonProperty("height")
    private Double height;
    
    
    
    
    @JsonProperty("length")
    private Double length;
    
    
    
    
}

/*
    Model: Trader1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Trader1 {
    
    
    
    
    @JsonProperty("address")
    private List<String> address;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: InventorySellerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySellerResponse {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("company")
    private CompanyMeta company;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("quantities")
    private Quantities quantities;
    
    
    
    
    @JsonProperty("set")
    private InventorySet set;
    
    
    
    
    @JsonProperty("price")
    private PriceMeta price;
    
    
    
    
    @JsonProperty("manufacturer")
    private ManufacturerResponse manufacturer;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("fynd_item_code")
    private String fyndItemCode;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("fynd_article_code")
    private String fyndArticleCode;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("tax_identifier")
    private Object taxIdentifier;
    
    
    
    
    @JsonProperty("fragile")
    private Boolean fragile;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("store")
    private StoreMeta store;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("added_on_store")
    private String addedOnStore;
    
    
    
    
    @JsonProperty("brand")
    private BrandMeta brand;
    
    
    
    
    @JsonProperty("track_inventory")
    private Boolean trackInventory;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("fynd_meta")
    private Object fyndMeta;
    
    
    
    
    @JsonProperty("weight")
    private WeightResponse weight;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("raw_meta")
    private Object rawMeta;
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig1 returnConfig;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("dimension")
    private DimensionResponse dimension;
    
    
    
    
    @JsonProperty("trader")
    private List<Trader1> trader;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
}

/*
    Model: InventorySellerIdentifierResponsePaginated
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventorySellerIdentifierResponsePaginated {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<InventorySellerResponse> items;
    
    
    
    
}

/*
    Model: BulkInventoryGetItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInventoryGetItems {
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("cancelled_records")
    private List<String> cancelledRecords;
    
    
    
    
    @JsonProperty("succeed")
    private Integer succeed;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("cancelled")
    private Integer cancelled;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("failed_records")
    private List<String> failedRecords;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: BulkInventoryGet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkInventoryGet {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<BulkInventoryGetItems> items;
    
    
    
    
}

/*
    Model: InventoryJobPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryJobPayload {
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("item_weight_unit_of_measure")
    private String itemWeightUnitOfMeasure;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("item_dimensions_unit_of_measure")
    private String itemDimensionsUnitOfMeasure;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
}

/*
    Model: InventoryBulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBulkRequest {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    @JsonProperty("sizes")
    private List<InventoryJobPayload> sizes;
    
    
    
    
}

/*
    Model: InventoryExportRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportRequest {
    
    
    
    
    @JsonProperty("brand")
    private List<Integer> brand;
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: InventoryExportResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportResponse {
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("request_params")
    private Object requestParams;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: InventoryExportJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryExportJob {
    
    
    
    
    @JsonProperty("task_id")
    private String taskId;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("request_params")
    private Object requestParams;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("trigger_on")
    private String triggerOn;
    
    
    
    
    @JsonProperty("completed_on")
    private String completedOn;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: FilerList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilerList {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: InventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryConfig {
    
    
    
    
    @JsonProperty("multivalues")
    private Boolean multivalues;
    
    
    
    
    @JsonProperty("data")
    private List<FilerList> data;
    
    
    
    
}

/*
    Model: InventoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPayload {
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    
    
    
    
    @JsonProperty("expiration_date")
    private String expirationDate;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
}

/*
    Model: InventoryRequestSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryRequestSchemaV2 {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("payload")
    private List<InventoryPayload> payload;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: InventoryFailedReason
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryFailedReason {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("errors")
    private String errors;
    
    
    
    
}

/*
    Model: InventoryResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryResponseItem {
    
    
    
    
    @JsonProperty("reason")
    private InventoryFailedReason reason;
    
    
    
    
    @JsonProperty("data")
    private InventoryPayload data;
    
    
    
    
}

/*
    Model: InventoryUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryUpdateResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<InventoryResponseItem> items;
    
    
    
    
}

/*
    Model: HsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnUpsert {
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: HsnCodesObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesObject {
    
    
    
    
    @JsonProperty("tax_on_esp")
    private Boolean taxOnEsp;
    
    
    
    
    @JsonProperty("hs2_code")
    private String hs2Code;
    
    
    
    
    @JsonProperty("threshold2")
    private Double threshold2;
    
    
    
    
    @JsonProperty("tax_on_mrp")
    private Boolean taxOnMrp;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("threshold1")
    private Double threshold1;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("tax2")
    private Double tax2;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("tax1")
    private Double tax1;
    
    
    
    
}

/*
    Model: HsnCode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCode {
    
    
    
    
    @JsonProperty("data")
    private HsnCodesObject data;
    
    
    
    
}

/*
    Model: PageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PageResponse {
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
}

/*
    Model: HsnCodesListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesListingResponse {
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("items")
    private List<HsnCodesObject> items;
    
    
    
    
}

/*
    Model: BulkHsnUpsert
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkHsnUpsert {
    
    
    
    
    @JsonProperty("data")
    private List<HsnUpsert> data;
    
    
    
    
}

/*
    Model: BulkHsnResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkHsnResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: TaxSlab
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaxSlab {
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
    @JsonProperty("cess")
    private Double cess;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
}

/*
    Model: HSNDataInsertV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HSNDataInsertV2 {
    
    
    
    
    @JsonProperty("taxes")
    private List<TaxSlab> taxes;
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("reporting_hsn")
    private String reportingHsn;
    
    
    
    
    @JsonProperty("modified_by")
    private Object modifiedBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: HsnCodesListingResponseSchemaV2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HsnCodesListingResponseSchemaV2 {
    
    
    
    
    @JsonProperty("page")
    private PageResponse page;
    
    
    
    
    @JsonProperty("items")
    private List<HSNDataInsertV2> items;
    
    
    
    
}

/*
    Model: BrandItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandItem {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: BrandListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandListingResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<BrandItem> items;
    
    
    
    
}

/*
    Model: Department
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Department {
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: DepartmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentResponse {
    
    
    
    
    @JsonProperty("items")
    private List<Department> items;
    
    
    
    
}

/*
    Model: DepartmentIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentIdentifier {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: ThirdLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ThirdLevelChild {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: SecondLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SecondLevelChild {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: Child
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Child {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: CategoryItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryItems {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: DepartmentCategoryTree
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DepartmentCategoryTree {
    
    
    
    
    @JsonProperty("department")
    private String department;
    
    
    
    
    @JsonProperty("items")
    private List<CategoryItems> items;
    
    
    
    
}

/*
    Model: CategoryListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryListingResponse {
    
    
    
    
    @JsonProperty("departments")
    private List<DepartmentIdentifier> departments;
    
    
    
    
    @JsonProperty("data")
    private List<DepartmentCategoryTree> data;
    
    
    
    
}

/*
    Model: ApplicationProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationProductListingResponse {
    
    
    
    
    @JsonProperty("operators")
    private Object operators;
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
}

/*
    Model: ProductDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetail {
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    @JsonProperty("teaser_tag")
    private Object teaserTag;
    
    
    
    
    @JsonProperty("medias")
    private List<Media1> medias;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    @JsonProperty("promo_meta")
    private Object promoMeta;
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: InventoryPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPage {
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: InventoryStockResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStockResponse {
    
    
    
    
    @JsonProperty("page")
    private InventoryPage page;
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
}

/*
    Model: UserSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer1 {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
}

/*
    Model: LocationTimingSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationTimingSerializer {
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
    
}

/*
    Model: LocationDayWiseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationDayWiseSerializer {
    
    
    
    
    @JsonProperty("opening")
    private LocationTimingSerializer opening;
    
    
    
    
    @JsonProperty("closing")
    private LocationTimingSerializer closing;
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
}

/*
    Model: UserSerializer2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserSerializer2 {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
    
}

/*
    Model: GetAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetAddressSerializer {
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
}

/*
    Model: GetCompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCompanySerializer {
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer2 createdBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer2 verifiedBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer2 modifiedBy;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
}

/*
    Model: SellerPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerPhoneNumber {
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
}

/*
    Model: LocationIntegrationType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationIntegrationType {
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
    @JsonProperty("order")
    private String order;
    
    
    
    
}

/*
    Model: LocationManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationManagerSerializer {
    
    
    
    
    @JsonProperty("mobile_no")
    private SellerPhoneNumber mobileNo;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: ProductReturnConfigSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductReturnConfigSerializer {
    
    
    
    
    @JsonProperty("on_same_store")
    private Boolean onSameStore;
    
    
    
    
    @JsonProperty("store_uid")
    private Integer storeUid;
    
    
    
    
}

/*
    Model: InvoiceCredSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceCredSerializer {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
}

/*
    Model: InvoiceDetailsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceDetailsSerializer {
    
    
    
    
    @JsonProperty("e_invoice")
    private InvoiceCredSerializer eInvoice;
    
    
    
    
    @JsonProperty("e_waybill")
    private InvoiceCredSerializer eWaybill;
    
    
    
    
}

/*
    Model: GetLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLocationSerializer {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer1 modifiedBy;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("company")
    private GetCompanySerializer company;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer1 verifiedBy;
    
    
    
    
    @JsonProperty("integration_type")
    private LocationIntegrationType integrationType;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer1 createdBy;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
}

/*
    Model: LocationListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationListSerializer {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<GetLocationSerializer> items;
    
    
    
    
}

/*
    Model: ApplicationBrandJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationBrandJson {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: ApplicationCategoryJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationCategoryJson {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}

/*
    Model: ApplicationStoreJson
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationStoreJson {
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
}




/*
    Model: BusinessCountryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessCountryInfo {
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
}

/*
    Model: Website
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Website {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: BusinessDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessDetails {
    
    
    
    
    @JsonProperty("website")
    private Website website;
    
    
    
    
}

/*
    Model: ContactDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ContactDetails {
    
    
    
    
    @JsonProperty("emails")
    private List<String> emails;
    
    
    
    
    @JsonProperty("phone")
    private List<SellerPhoneNumber> phone;
    
    
    
    
}

/*
    Model: CompanyTaxesSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyTaxesSerializer {
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
}

/*
    Model: GetCompanyProfileSerializerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetCompanyProfileSerializerResponse {
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("taxes")
    private List<CompanyTaxesSerializer> taxes;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
}

/*
    Model: CreateUpdateAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUpdateAddressSerializer {
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
}

/*
    Model: CompanyTaxesSerializer1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyTaxesSerializer1 {
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
    
    @JsonProperty("rate")
    private Double rate;
    
    
    
    
    @JsonProperty("effective_date")
    private String effectiveDate;
    
    
    
    
}

/*
    Model: UpdateCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCompany {
    
    
    
    
    @JsonProperty("addresses")
    private List<CreateUpdateAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("business_info")
    private String businessInfo;
    
    
    
    
    @JsonProperty("contact_details")
    private ContactDetails contactDetails;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("business_details")
    private BusinessDetails businessDetails;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("taxes")
    private List<CompanyTaxesSerializer1> taxes;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
}

/*
    Model: ProfileSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProfileSuccessResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: DocumentsObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentsObj {
    
    
    
    
    @JsonProperty("pending")
    private Integer pending;
    
    
    
    
    @JsonProperty("verified")
    private Integer verified;
    
    
    
    
}

/*
    Model: MetricsSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MetricsSerializer {
    
    
    
    
    @JsonProperty("product")
    private DocumentsObj product;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("store")
    private DocumentsObj store;
    
    
    
    
    @JsonProperty("brand")
    private DocumentsObj brand;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("store_documents")
    private DocumentsObj storeDocuments;
    
    
    
    
    @JsonProperty("company_documents")
    private DocumentsObj companyDocuments;
    
    
    
    
}

/*
    Model: BrandBannerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandBannerSerializer {
    
    
    
    
    @JsonProperty("portrait")
    private String portrait;
    
    
    
    
    @JsonProperty("landscape")
    private String landscape;
    
    
    
    
}

/*
    Model: GetBrandResponseSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBrandResponseSerializer {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
}

/*
    Model: CreateUpdateBrandRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUpdateBrandRequestSerializer {
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("banner")
    private BrandBannerSerializer banner;
    
    
    
    
    @JsonProperty("_locale_language")
    private Object localeLanguage;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("synonyms")
    private List<String> synonyms;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("brand_tier")
    private String brandTier;
    
    
    
    
}

/*
    Model: CompanySocialAccounts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanySocialAccounts {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: CompanyDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyDetails {
    
    
    
    
    @JsonProperty("website_url")
    private String websiteUrl;
    
    
    
    
    @JsonProperty("socials")
    private List<CompanySocialAccounts> socials;
    
    
    
    
}

/*
    Model: CompanySerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanySerializer {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("business_country_info")
    private BusinessCountryInfo businessCountryInfo;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
    @JsonProperty("addresses")
    private List<GetAddressSerializer> addresses;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    @JsonProperty("market_channels")
    private List<String> marketChannels;
    
    
    
    
    @JsonProperty("details")
    private CompanyDetails details;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CompanyBrandSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandSerializer {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("created_by")
    private UserSerializer createdBy;
    
    
    
    
    @JsonProperty("verified_on")
    private String verifiedOn;
    
    
    
    
    @JsonProperty("modified_by")
    private UserSerializer modifiedBy;
    
    
    
    
    @JsonProperty("company")
    private CompanySerializer company;
    
    
    
    
    @JsonProperty("brand")
    private GetBrandResponseSerializer brand;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("verified_by")
    private UserSerializer verifiedBy;
    
    
    
    
    @JsonProperty("reject_reason")
    private String rejectReason;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
}

/*
    Model: CompanyBrandListSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandListSerializer {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<CompanyBrandSerializer> items;
    
    
    
    
}

/*
    Model: CompanyBrandPostRequestSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandPostRequestSerializer {
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
}

/*
    Model: LocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocationSerializer {
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("manager")
    private LocationManagerSerializer manager;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("timing")
    private List<LocationDayWiseSerializer> timing;
    
    
    
    
    @JsonProperty("company")
    private Integer company;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
    
    @JsonProperty("gst_credentials")
    private InvoiceDetailsSerializer gstCredentials;
    
    
    
    
    @JsonProperty("documents")
    private List<Document> documents;
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<SellerPhoneNumber> contactNumbers;
    
    
    
    
    @JsonProperty("address")
    private GetAddressSerializer address;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("product_return_config")
    private ProductReturnConfigSerializer productReturnConfig;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("warnings")
    private Object warnings;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BulkLocationSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkLocationSerializer {
    
    
    
    
    @JsonProperty("data")
    private List<LocationSerializer> data;
    
    
    
    
}




/*
    Model: FailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FailedResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CDN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CDN {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: Upload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Upload {
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: StartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StartResponse {
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
}

/*
    Model: StartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StartRequest {
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
}

/*
    Model: CompleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompleteResponse {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: Opts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Opts {
    
    
    
    
    @JsonProperty("attempts")
    private Integer attempts;
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
    
}

/*
    Model: CopyFileTask
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CopyFileTask {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("data")
    private BulkRequest data;
    
    
    
    
    @JsonProperty("opts")
    private Opts opts;
    
    
    
    
    @JsonProperty("progress")
    private Integer progress;
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    @JsonProperty("attempts_made")
    private Integer attemptsMade;
    
    
    
    
    @JsonProperty("stacktrace")
    private List<String> stacktrace;
    
    
    
    
    @JsonProperty("finished_on")
    private Integer finishedOn;
    
    
    
    
    @JsonProperty("processed_on")
    private Integer processedOn;
    
    
    
    
}

/*
    Model: BulkUploadResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkUploadResponse {
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    @JsonProperty("task")
    private CopyFileTask task;
    
    
    
    
}

/*
    Model: ReqConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReqConfiguration {
    
    
    
    
    @JsonProperty("concurrency")
    private Integer concurrency;
    
    
    
    
}

/*
    Model: Destination
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Destination {
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("rewrite")
    private String rewrite;
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
    
}

/*
    Model: BulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkRequest {
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
    @JsonProperty("destination")
    private Destination destination;
    
    
    
    
    @JsonProperty("configuration")
    private ReqConfiguration configuration;
    
    
    
    
}

/*
    Model: Urls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Urls {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("signed_url")
    private String signedUrl;
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
}

/*
    Model: SignUrlResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignUrlResponse {
    
    
    
    
    @JsonProperty("urls")
    private List<Urls> urls;
    
    
    
    
}

/*
    Model: SignUrlRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignUrlRequest {
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
}

/*
    Model: DbRecord
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DbRecord {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: BrowseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrowseResponse {
    
    
    
    
    @JsonProperty("items")
    private List<DbRecord> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}




/*
    Model: RedirectDevice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RedirectDevice {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: WebRedirect
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class WebRedirect {
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: Redirects
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Redirects {
    
    
    
    
    @JsonProperty("ios")
    private RedirectDevice ios;
    
    
    
    
    @JsonProperty("android")
    private RedirectDevice android;
    
    
    
    
    @JsonProperty("web")
    private WebRedirect web;
    
    
    
    
    @JsonProperty("force_web")
    private Boolean forceWeb;
    
    
    
    
}

/*
    Model: CampaignShortLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CampaignShortLink {
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("medium")
    private String medium;
    
    
    
    
}

/*
    Model: Attribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Attribution {
    
    
    
    
    @JsonProperty("campaign_cookie_expiry")
    private String campaignCookieExpiry;
    
    
    
    
}

/*
    Model: SocialMediaTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SocialMediaTags {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
}

/*
    Model: ShortLinkReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShortLinkReq {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: UrlInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UrlInfo {
    
    
    
    
    @JsonProperty("original")
    private String original;
    
    
    
    
    @JsonProperty("short")
    private String shortName;
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
}

/*
    Model: ShortLinkRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShortLinkRes {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("url")
    private UrlInfo url;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("app_redirect")
    private Boolean appRedirect;
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
}

/*
    Model: ShortLinkList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShortLinkList {
    
    
    
    
    @JsonProperty("items")
    private List<ShortLinkRes> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ErrorRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ErrorRes {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}




/*
    Model: GCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GCompany {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("stores")
    private List<GStore> stores;
    
    
    
    
    @JsonProperty("gstores")
    private List<GStore> gstores;
    
    
    
    
}

/*
    Model: GStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GStore {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("data")
    private StoreData data;
    
    
    
    
}

/*
    Model: Metum
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Metum {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListSlingshotConfigurationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeListSlingshotConfigurationDetail {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private List<SlingshotConfigurationDetail> items;
    
    
    
    
    @JsonProperty("payload")
    private List<SlingshotConfigurationDetail> payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SlingshotConfigurationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlingshotConfigurationDetail {
    
    
    
    
    @JsonProperty("integration")
    private SlingshotIntegration integration;
    
    
    
    
    @JsonProperty("companies")
    private List<GCompany> companies;
    
    
    
    
}

/*
    Model: SlingshotIntegration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SlingshotIntegration {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    @JsonProperty("meta")
    private List<Metum> meta;
    
    
    
    
}

/*
    Model: StoreData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreData {
    
    
    
    
    @JsonProperty("location_id")
    private String locationId;
    
    
    
    
}

/*
    Model: KafkaMetaModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaMetaModel {
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    @JsonProperty("batch_id")
    private Integer batchId;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("trace")
    private List<String> trace;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("created_timestamp")
    private Integer createdTimestamp;
    
    
    
    
}

/*
    Model: SuppressStoreModel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuppressStoreModel {
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
    
}

/*
    Model: SuppressStorePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuppressStorePayload {
    
    
    
    
    @JsonProperty("payload")
    private List<SuppressStoreModel> payload;
    
    
    
    
    @JsonProperty("meta")
    private KafkaMetaModel meta;
    
    
    
    
}

/*
    Model: KafkaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class KafkaResponse {
    
    
    
    
    @JsonProperty("offset")
    private Integer offset;
    
    
    
    
    @JsonProperty("partition")
    private Integer partition;
    
    
    
    
}

/*
    Model: ResponseEnvelopeKafkaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeKafkaResponse {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private KafkaResponse items;
    
    
    
    
    @JsonProperty("payload")
    private KafkaResponse payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: DataTresholdDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DataTresholdDTO {
    
    
    
    
    @JsonProperty("min_price")
    private Double minPrice;
    
    
    
    
    @JsonProperty("safe_stock")
    private Integer safeStock;
    
    
    
    
    @JsonProperty("period_threshold")
    private Integer periodThreshold;
    
    
    
    
    @JsonProperty("period_threshold_type")
    private String periodThresholdType;
    
    
    
    
    @JsonProperty("period_type_list")
    private List<GenericDTO> periodTypeList;
    
    
    
    
}

/*
    Model: GenericDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenericDTO {
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: JobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobConfigDTO {
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("integration_data")
    private HashMap<String,Object> integrationData;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("task_details")
    private TaskDTO taskDetails;
    
    
    
    
    @JsonProperty("threshold_details")
    private DataTresholdDTO thresholdDetails;
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
}

/*
    Model: TaskDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaskDTO {
    
    
    
    
    @JsonProperty("type")
    private Integer type;
    
    
    
    
    @JsonProperty("group_list")
    private List<GenericDTO> groupList;
    
    
    
    
}

/*
    Model: ResponseEnvelopeString
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeString {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private String items;
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AWSS3config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AWSS3config {
    
    
    
    
    @JsonProperty("bucket")
    private String bucket;
    
    
    
    
    @JsonProperty("region")
    private String region;
    
    
    
    
    @JsonProperty("dir")
    private String dir;
    
    
    
    
    @JsonProperty("access_key")
    private String accessKey;
    
    
    
    
    @JsonProperty("secret_key")
    private String secretKey;
    
    
    
    
    @JsonProperty("local_file_path")
    private String localFilePath;
    
    
    
    
    @JsonProperty("archive_path")
    private String archivePath;
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("delete")
    private Boolean delete;
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: ArchiveConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArchiveConfig {
    
    
    
    
    @JsonProperty("delete")
    private Boolean delete;
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("archive_dir")
    private String archiveDir;
    
    
    
    
}

/*
    Model: Audit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Audit {
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: CatalogMasterConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CatalogMasterConfig {
    
    
    
    
    @JsonProperty("source_slug")
    private String sourceSlug;
    
    
    
    
}

/*
    Model: CompanyConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyConfig {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("exclude_steps")
    private List<Integer> excludeSteps;
    
    
    
    
    @JsonProperty("hidden_closet_keys")
    private List<String> hiddenClosetKeys;
    
    
    
    
    @JsonProperty("open_tags")
    private HashMap<String,Object> openTags;
    
    
    
    
    @JsonProperty("tax_identifiers")
    private List<String> taxIdentifiers;
    
    
    
    
    @JsonProperty("delete_quantity_threshold")
    private Integer deleteQuantityThreshold;
    
    
    
    
}

/*
    Model: DBConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DBConfig {
    
    
    
    
    @JsonProperty("vendor")
    private String vendor;
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("dbname")
    private String dbname;
    
    
    
    
    @JsonProperty("query")
    private String query;
    
    
    
    
    @JsonProperty("procedure")
    private Boolean procedure;
    
    
    
    
    @JsonProperty("driver_class")
    private String driverClass;
    
    
    
    
    @JsonProperty("jdbc_url")
    private String jdbcUrl;
    
    
    
    
    @JsonProperty("optional_properties")
    private HashMap<String,String> optionalProperties;
    
    
    
    
}

/*
    Model: DBConnectionProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DBConnectionProfile {
    
    
    
    
    @JsonProperty("inventory")
    private String inventory;
    
    
    
    
}

/*
    Model: DBParamConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DBParamConfig {
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,Object> params;
    
    
    
    
}

/*
    Model: DefaultHeadersDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultHeadersDTO {
    
    
    
    
    @JsonProperty("store")
    private PropBeanDTO store;
    
    
    
    
    @JsonProperty("intf_article_id")
    private PropBeanDTO intfArticleId;
    
    
    
    
    @JsonProperty("price_effective")
    private PropBeanDTO priceEffective;
    
    
    
    
    @JsonProperty("quantity")
    private PropBeanDTO quantity;
    
    
    
    
}

/*
    Model: DocMappingConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocMappingConfig {
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,Object> properties;
    
    
    
    
    @JsonProperty("junk_data_threshold_count")
    private Integer junkDataThresholdCount;
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    @JsonProperty("unwind_field")
    private String unwindField;
    
    
    
    
    @JsonProperty("default_headers")
    private DefaultHeadersDTO defaultHeaders;
    
    
    
    
}

/*
    Model: EmailConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EmailConfig {
    
    
    
    
    @JsonProperty("recepient")
    private String recepient;
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    @JsonProperty("read_from_content")
    private Boolean readFromContent;
    
    
    
    
    @JsonProperty("filter_based_on_recepients")
    private Boolean filterBasedOnRecepients;
    
    
    
    
    @JsonProperty("pcol")
    private String pcol;
    
    
    
    
    @JsonProperty("subject_line_regex")
    private String subjectLineRegex;
    
    
    
    
    @JsonProperty("sender_address")
    private String senderAddress;
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    @JsonProperty("folder_name_hierarchies")
    private List<String> folderNameHierarchies;
    
    
    
    
    @JsonProperty("attachment_regex")
    private String attachmentRegex;
    
    
    
    
    @JsonProperty("body_content_regex")
    private String bodyContentRegex;
    
    
    
    
    @JsonProperty("password_protected")
    private Boolean passwordProtected;
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    @JsonProperty("attachment_mandate")
    private Boolean attachmentMandate;
    
    
    
    
    @JsonProperty("filter_files_after_extraction")
    private Boolean filterFilesAfterExtraction;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    @JsonProperty("read_all_unread_mails")
    private Boolean readAllUnreadMails;
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    @JsonProperty("downloadable_link")
    private Boolean downloadableLink;
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
}

/*
    Model: FTPConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FTPConfig {
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    @JsonProperty("remote_dir")
    private String remoteDir;
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: FileConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileConfig {
    
    
    
    
    @JsonProperty("delimiter")
    private String delimiter;
    
    
    
    
    @JsonProperty("charset")
    private String charset;
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,Object> properties;
    
    
    
    
    @JsonProperty("file_has_header")
    private Boolean fileHasHeader;
    
    
    
    
    @JsonProperty("header_index")
    private Integer headerIndex;
    
    
    
    
    @JsonProperty("header_array")
    private List<String> headerArray;
    
    
    
    
    @JsonProperty("data_start_index")
    private Integer dataStartIndex;
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    @JsonProperty("junk_data_threshold_count")
    private Integer junkDataThresholdCount;
    
    
    
    
    @JsonProperty("file_type")
    private String fileType;
    
    
    
    
    @JsonProperty("line_validity_check")
    private Boolean lineValidityCheck;
    
    
    
    
    @JsonProperty("sheet_names")
    private List<String> sheetNames;
    
    
    
    
    @JsonProperty("read_all_sheets")
    private Boolean readAllSheets;
    
    
    
    
    @JsonProperty("quote_char")
    private String quoteChar;
    
    
    
    
    @JsonProperty("escape_char")
    private String escapeChar;
    
    
    
    
    @JsonProperty("default_headers")
    private DefaultHeadersDTO defaultHeaders;
    
    
    
    
}

/*
    Model: GoogleSpreadSheetConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GoogleSpreadSheetConfig {
    
    
    
    
    @JsonProperty("range")
    private String range;
    
    
    
    
    @JsonProperty("sheet_id")
    private String sheetId;
    
    
    
    
    @JsonProperty("client_secret_location")
    private String clientSecretLocation;
    
    
    
    
    @JsonProperty("cred_storage_directory")
    private String credStorageDirectory;
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: HttpConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HttpConfig {
    
    
    
    
    @JsonProperty("hosturl")
    private String hosturl;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("request_params")
    private HashMap<String,String> requestParams;
    
    
    
    
    @JsonProperty("http_method")
    private String httpMethod;
    
    
    
    
    @JsonProperty("request_payload")
    private String requestPayload;
    
    
    
    
    @JsonProperty("local_path")
    private String localPath;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
}

/*
    Model: JobConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobConfig {
    
    
    
    
    @JsonProperty("_id")
    private Integer id;
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    @JsonProperty("task_type")
    private String taskType;
    
    
    
    
    @JsonProperty("sync_delay")
    private Integer syncDelay;
    
    
    
    
    @JsonProperty("cron_expression")
    private String cronExpression;
    
    
    
    
    @JsonProperty("store_filter")
    private StoreFilter storeFilter;
    
    
    
    
    @JsonProperty("process_config")
    private ProcessConfig processConfig;
    
    
    
    
    @JsonProperty("store_config")
    private List<StoreConfig> storeConfig;
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
    @JsonProperty("immediate_first_run")
    private Boolean immediateFirstRun;
    
    
    
    
    @JsonProperty("disable")
    private Boolean disable;
    
    
    
    
    @JsonProperty("dependent_job_codes")
    private List<String> dependentJobCodes;
    
    
    
    
    @JsonProperty("company_config")
    private List<CompanyConfig> companyConfig;
    
    
    
    
    @JsonProperty("company_ids")
    private List<Integer> companyIds;
    
    
    
    
    @JsonProperty("tax_identifiers")
    private List<String> taxIdentifiers;
    
    
    
    
    @JsonProperty("priority")
    private String priority;
    
    
    
    
    @JsonProperty("period_threshold")
    private Integer periodThreshold;
    
    
    
    
    @JsonProperty("period_threshold_type")
    private String periodThresholdType;
    
    
    
    
    @JsonProperty("db_connection_profile")
    private DBConnectionProfile dbConnectionProfile;
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,Object> params;
    
    
    
    
    @JsonProperty("open_tags")
    private HashMap<String,Object> openTags;
    
    
    
    
    @JsonProperty("delete_quantity_threshold")
    private Integer deleteQuantityThreshold;
    
    
    
    
    @JsonProperty("catalog_master_config")
    private CatalogMasterConfig catalogMasterConfig;
    
    
    
    
    @JsonProperty("aggregator_types")
    private List<String> aggregatorTypes;
    
    
    
    
    @JsonProperty("integration_type")
    private String integrationType;
    
    
    
    
    @JsonProperty("min_price")
    private Double minPrice;
    
    
    
    
    @JsonProperty("audit")
    private Audit audit;
    
    
    
    
    @JsonProperty("version")
    private Integer version;
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
}

/*
    Model: JobConfigRawDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobConfigRawDTO {
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("data")
    private JobConfig data;
    
    
    
    
}

/*
    Model: JsonDocConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JsonDocConfig {
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
}

/*
    Model: LocalFileConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LocalFileConfig {
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    @JsonProperty("working_dir")
    private String workingDir;
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: MongoDocConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MongoDocConfig {
    
    
    
    
    @JsonProperty("collection_name")
    private String collectionName;
    
    
    
    
    @JsonProperty("find_query")
    private HashMap<String,Object> findQuery;
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    @JsonProperty("prop_bean_configs")
    private List<PropBeanConfig> propBeanConfigs;
    
    
    
    
    @JsonProperty("aggregate_pipeline")
    private List<HashMap<String,Object>> aggregatePipeline;
    
    
    
    
    @JsonProperty("skip_save")
    private Boolean skipSave;
    
    
    
    
}

/*
    Model: OAuthConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OAuthConfig {
    
    
    
    
    @JsonProperty("limit")
    private Integer limit;
    
    
    
    
    @JsonProperty("pages")
    private Integer pages;
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    @JsonProperty("consumer_key")
    private String consumerKey;
    
    
    
    
    @JsonProperty("consumer_secret")
    private String consumerSecret;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("token_secret")
    private String tokenSecret;
    
    
    
    
    @JsonProperty("rest_url")
    private String restUrl;
    
    
    
    
    @JsonProperty("rest_base_url")
    private String restBaseUrl;
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
}

/*
    Model: ProcessConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProcessConfig {
    
    
    
    
    @JsonProperty("db_config")
    private DBConfig dbConfig;
    
    
    
    
    @JsonProperty("db_param_config")
    private DBParamConfig dbParamConfig;
    
    
    
    
    @JsonProperty("sftp_config")
    private SFTPConfig sftpConfig;
    
    
    
    
    @JsonProperty("aws_s3_config")
    private AWSS3config awsS3Config;
    
    
    
    
    @JsonProperty("mongo_doc_config")
    private MongoDocConfig mongoDocConfig;
    
    
    
    
    @JsonProperty("ftp_config")
    private FTPConfig ftpConfig;
    
    
    
    
    @JsonProperty("email_config")
    private EmailConfig emailConfig;
    
    
    
    
    @JsonProperty("file_config")
    private FileConfig fileConfig;
    
    
    
    
    @JsonProperty("json_doc_config")
    private JsonDocConfig jsonDocConfig;
    
    
    
    
    @JsonProperty("doc_mapping_config")
    private DocMappingConfig docMappingConfig;
    
    
    
    
    @JsonProperty("task_step_config")
    private TaskStepConfig taskStepConfig;
    
    
    
    
    @JsonProperty("http_config")
    private HttpConfig httpConfig;
    
    
    
    
    @JsonProperty("local_file_config")
    private LocalFileConfig localFileConfig;
    
    
    
    
    @JsonProperty("oauth_config")
    private OAuthConfig oauthConfig;
    
    
    
    
    @JsonProperty("google_spreadsheet_config")
    private GoogleSpreadSheetConfig googleSpreadsheetConfig;
    
    
    
    
}

/*
    Model: PropBeanConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PropBeanConfig {
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("mapping")
    private HashMap<String,PropBeanConfig> mapping;
    
    
    
    
    @JsonProperty("optional")
    private Boolean optional;
    
    
    
    
    @JsonProperty("send")
    private Send send;
    
    
    
    
    @JsonProperty("validations")
    private List<HashMap<String,Object>> validations;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
    @JsonProperty("include")
    private Boolean include;
    
    
    
    
    @JsonProperty("source_field")
    private String sourceField;
    
    
    
    
    @JsonProperty("source_fields")
    private List<String> sourceFields;
    
    
    
    
    @JsonProperty("destination_field")
    private String destinationField;
    
    
    
    
    @JsonProperty("data_type")
    private String dataType;
    
    
    
    
    @JsonProperty("default_value")
    private Object defaultValue;
    
    
    
    
    @JsonProperty("const_value")
    private Object constValue;
    
    
    
    
    @JsonProperty("concat_str")
    private String concatStr;
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
    @JsonProperty("transformer_name")
    private String transformerName;
    
    
    
    
    @JsonProperty("all_param_function_name")
    private String allParamFunctionName;
    
    
    
    
    @JsonProperty("sub_separator")
    private String subSeparator;
    
    
    
    
    @JsonProperty("index_field")
    private String indexField;
    
    
    
    
    @JsonProperty("ignore_if_not_exists")
    private Boolean ignoreIfNotExists;
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    @JsonProperty("enrich_from_master")
    private Boolean enrichFromMaster;
    
    
    
    
}

/*
    Model: PropBeanDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PropBeanDTO {
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("optional")
    private Boolean optional;
    
    
    
    
    @JsonProperty("include")
    private Boolean include;
    
    
    
    
    @JsonProperty("source_field")
    private String sourceField;
    
    
    
    
    @JsonProperty("source_fields")
    private List<String> sourceFields;
    
    
    
    
    @JsonProperty("destination_field")
    private String destinationField;
    
    
    
    
    @JsonProperty("data_type")
    private String dataType;
    
    
    
    
    @JsonProperty("default_value")
    private Object defaultValue;
    
    
    
    
    @JsonProperty("const_value")
    private Object constValue;
    
    
    
    
    @JsonProperty("concat_str")
    private String concatStr;
    
    
    
    
    @JsonProperty("function_name")
    private String functionName;
    
    
    
    
    @JsonProperty("transformer_name")
    private String transformerName;
    
    
    
    
    @JsonProperty("all_param_function_name")
    private String allParamFunctionName;
    
    
    
    
    @JsonProperty("sub_separator")
    private String subSeparator;
    
    
    
    
    @JsonProperty("index_field")
    private String indexField;
    
    
    
    
    @JsonProperty("ignore_if_not_exists")
    private Boolean ignoreIfNotExists;
    
    
    
    
    @JsonProperty("identifier_type")
    private String identifierType;
    
    
    
    
    @JsonProperty("projection_query")
    private HashMap<String,Object> projectionQuery;
    
    
    
    
    @JsonProperty("enrich_from_master")
    private Boolean enrichFromMaster;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigRawDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeListJobConfigRawDTO {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigRawDTO> items;
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigRawDTO> payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SFTPConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SFTPConfig {
    
    
    
    
    @JsonProperty("host")
    private String host;
    
    
    
    
    @JsonProperty("port")
    private Integer port;
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    @JsonProperty("unzip")
    private Boolean unzip;
    
    
    
    
    @JsonProperty("retries")
    private Integer retries;
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
    
    @JsonProperty("private_key_path")
    private String privateKeyPath;
    
    
    
    
    @JsonProperty("strict_host_key_checking")
    private Boolean strictHostKeyChecking;
    
    
    
    
    @JsonProperty("local_dir")
    private String localDir;
    
    
    
    
    @JsonProperty("remote_dir")
    private String remoteDir;
    
    
    
    
    @JsonProperty("password_protected")
    private Boolean passwordProtected;
    
    
    
    
    @JsonProperty("zip_file_regex")
    private String zipFileRegex;
    
    
    
    
    @JsonProperty("file_regex")
    private String fileRegex;
    
    
    
    
    @JsonProperty("zip_format")
    private String zipFormat;
    
    
    
    
    @JsonProperty("archive_config")
    private ArchiveConfig archiveConfig;
    
    
    
    
    @JsonProperty("read_all_files")
    private Boolean readAllFiles;
    
    
    
    
}

/*
    Model: Send
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Send {
    
    
    
    
    @JsonProperty("raw")
    private Boolean raw;
    
    
    
    
    @JsonProperty("processed")
    private Boolean processed;
    
    
    
    
}

/*
    Model: StoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreConfig {
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    @JsonProperty("storeid")
    private String storeid;
    
    
    
    
    @JsonProperty("store_alias")
    private String storeAlias;
    
    
    
    
    @JsonProperty("store_file_regex")
    private String storeFileRegex;
    
    
    
    
    @JsonProperty("store_file_name")
    private String storeFileName;
    
    
    
    
    @JsonProperty("process_config")
    private ProcessConfig processConfig;
    
    
    
    
    @JsonProperty("properties")
    private HashMap<String,String> properties;
    
    
    
    
}

/*
    Model: StoreFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreFilter {
    
    
    
    
    @JsonProperty("include_tags")
    private List<String> includeTags;
    
    
    
    
    @JsonProperty("exclude_tags")
    private List<String> excludeTags;
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,Object> query;
    
    
    
    
}

/*
    Model: TaskConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaskConfig {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("task_config_id")
    private Integer taskConfigId;
    
    
    
    
    @JsonProperty("task_params")
    private List<TaskParam> taskParams;
    
    
    
    
}

/*
    Model: TaskParam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaskParam {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
}

/*
    Model: TaskStepConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TaskStepConfig {
    
    
    
    
    @JsonProperty("task_configs")
    private List<TaskConfig> taskConfigs;
    
    
    
    
    @JsonProperty("task_config_ids")
    private List<Integer> taskConfigIds;
    
    
    
    
    @JsonProperty("task_config_group_ids")
    private List<Integer> taskConfigGroupIds;
    
    
    
    
}

/*
    Model: JobStepsDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobStepsDTO {
    
    
    
    
    @JsonProperty("step_name")
    private String stepName;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("step_execution_time")
    private Integer stepExecutionTime;
    
    
    
    
    @JsonProperty("start_count")
    private Integer startCount;
    
    
    
    
    @JsonProperty("end_count")
    private Integer endCount;
    
    
    
    
    @JsonProperty("deleted_count")
    private Integer deletedCount;
    
    
    
    
    @JsonProperty("processed_start_time")
    private String processedStartTime;
    
    
    
    
    @JsonProperty("processed_at")
    private String processedAt;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobStepsDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeListJobStepsDTO {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private List<JobStepsDTO> items;
    
    
    
    
    @JsonProperty("payload")
    private List<JobStepsDTO> payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeListJobConfigDTO {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigDTO> items;
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigDTO> payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: ResponseEnvelopeJobConfigDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeJobConfigDTO {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private JobConfigDTO items;
    
    
    
    
    @JsonProperty("payload")
    private JobConfigDTO payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobHistoryDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobHistoryDto {
    
    
    
    
    @JsonProperty("total_added_count")
    private Integer totalAddedCount;
    
    
    
    
    @JsonProperty("total_updated_count")
    private Integer totalUpdatedCount;
    
    
    
    
    @JsonProperty("total_suppressed_count")
    private Integer totalSuppressedCount;
    
    
    
    
    @JsonProperty("total_initial_count")
    private Integer totalInitialCount;
    
    
    
    
    @JsonProperty("job_id")
    private Integer jobId;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    @JsonProperty("processed_on")
    private String processedOn;
    
    
    
    
    @JsonProperty("filename")
    private List<String> filename;
    
    
    
    
    @JsonProperty("error_type")
    private String errorType;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: JobMetricsDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobMetricsDto {
    
    
    
    
    @JsonProperty("job_code")
    private String jobCode;
    
    
    
    
    @JsonProperty("is_run_more_than_usual")
    private String isRunMoreThanUsual;
    
    
    
    
    @JsonProperty("job_history")
    private List<JobHistoryDto> jobHistory;
    
    
    
    
    @JsonProperty("total_success_count")
    private Integer totalSuccessCount;
    
    
    
    
    @JsonProperty("total_failure_count")
    private Integer totalFailureCount;
    
    
    
    
    @JsonProperty("total_warning_count")
    private Integer totalWarningCount;
    
    
    
    
    @JsonProperty("total_suppressed_count")
    private Integer totalSuppressedCount;
    
    
    
    
    @JsonProperty("total_job_runs")
    private Integer totalJobRuns;
    
    
    
    
}

/*
    Model: ResponseEnvelopeJobMetricsDto
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeJobMetricsDto {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private JobMetricsDto items;
    
    
    
    
    @JsonProperty("payload")
    private JobMetricsDto payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: JobConfigListDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JobConfigListDTO {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("alias")
    private String alias;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ResponseEnvelopeListJobConfigListDTO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ResponseEnvelopeListJobConfigListDTO {
    
    
    
    
    @JsonProperty("timestamp")
    private String timestamp;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("total_time_taken_in_millis")
    private Integer totalTimeTakenInMillis;
    
    
    
    
    @JsonProperty("http_status")
    private String httpStatus;
    
    
    
    
    @JsonProperty("items")
    private List<JobConfigListDTO> items;
    
    
    
    
    @JsonProperty("payload")
    private List<JobConfigListDTO> payload;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}




/*
    Model: ApplicationInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationInventory {
    
    
    
    
    @JsonProperty("inventory")
    private AppInventoryConfig inventory;
    
    
    
    
    @JsonProperty("authentication")
    private AuthenticationConfig authentication;
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignmentConfig articleAssignment;
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    @JsonProperty("order")
    private AppOrderConfig order;
    
    
    
    
    @JsonProperty("logistics")
    private AppLogisticsConfig logistics;
    
    
    
    
    @JsonProperty("business")
    private String business;
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: AppInventoryConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryConfig {
    
    
    
    
    @JsonProperty("brand")
    private InventoryBrand brand;
    
    
    
    
    @JsonProperty("store")
    private InventoryStore store;
    
    
    
    
    @JsonProperty("category")
    private InventoryCategory category;
    
    
    
    
    @JsonProperty("price")
    private InventoryPrice price;
    
    
    
    
    @JsonProperty("discount")
    private InventoryDiscount discount;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("only_verified_products")
    private Boolean onlyVerifiedProducts;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("exclude_category")
    private List<Object> excludeCategory;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("company_store")
    private List<Object> companyStore;
    
    
    
    
}

/*
    Model: InventoryBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBrand {
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("brands")
    private List<Object> brands;
    
    
    
    
}

/*
    Model: InventoryStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStore {
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("stores")
    private List<Object> stores;
    
    
    
    
    @JsonProperty("rules")
    private AppStoreRules rules;
    
    
    
    
}

/*
    Model: AppStoreRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppStoreRules {
    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    @JsonProperty("brands")
    private List<Object> brands;
    
    
    
    
}

/*
    Model: InventoryCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryCategory {
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("categories")
    private List<Object> categories;
    
    
    
    
}

/*
    Model: InventoryPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPrice {
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: InventoryDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryDiscount {
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: AuthenticationConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthenticationConfig {
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
    
}

/*
    Model: ArticleAssignmentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentConfig {
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRules rules;
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
}

/*
    Model: ArticleAssignmentRules
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentRules {
    
    
    
    
    @JsonProperty("store_priority")
    private StorePriority storePriority;
    
    
    
    
}

/*
    Model: StorePriority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePriority {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("storetype_order")
    private List<Object> storetypeOrder;
    
    
    
    
}

/*
    Model: AppCartConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCartConfig {
    
    
    
    
    @JsonProperty("delivery_charges")
    private DeliveryCharges deliveryCharges;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("max_cart_items")
    private Integer maxCartItems;
    
    
    
    
    @JsonProperty("min_cart_value")
    private Double minCartValue;
    
    
    
    
    @JsonProperty("bulk_coupons")
    private Boolean bulkCoupons;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
    @JsonProperty("empty_cart")
    private Boolean emptyCart;
    
    
    
    
}

/*
    Model: DeliveryCharges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeliveryCharges {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("charges")
    private Charges charges;
    
    
    
    
}

/*
    Model: Charges
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Charges {
    
    
    
    
    @JsonProperty("threshold")
    private Double threshold;
    
    
    
    
    @JsonProperty("charges")
    private Double charges;
    
    
    
    
}

/*
    Model: AppPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppPaymentConfig {
    
    
    
    
    @JsonProperty("callback_url")
    private CallbackUrl callbackUrl;
    
    
    
    
    @JsonProperty("methods")
    private Methods methods;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("cod_amount_limit")
    private Double codAmountLimit;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
}

/*
    Model: CallbackUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CallbackUrl {
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("web")
    private String web;
    
    
    
    
}

/*
    Model: Methods
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Methods {
    
    
    
    
    @JsonProperty("pl")
    private PaymentModeConfig pl;
    
    
    
    
    @JsonProperty("card")
    private PaymentModeConfig card;
    
    
    
    
    @JsonProperty("nb")
    private PaymentModeConfig nb;
    
    
    
    
    @JsonProperty("wl")
    private PaymentModeConfig wl;
    
    
    
    
    @JsonProperty("ps")
    private PaymentModeConfig ps;
    
    
    
    
    @JsonProperty("upi")
    private PaymentModeConfig upi;
    
    
    
    
    @JsonProperty("qr")
    private PaymentModeConfig qr;
    
    
    
    
    @JsonProperty("cod")
    private PaymentModeConfig cod;
    
    
    
    
    @JsonProperty("pp")
    private PaymentModeConfig pp;
    
    
    
    
    @JsonProperty("jp")
    private PaymentModeConfig jp;
    
    
    
    
    @JsonProperty("pac")
    private PaymentModeConfig pac;
    
    
    
    
    @JsonProperty("fc")
    private PaymentModeConfig fc;
    
    
    
    
    @JsonProperty("jiopp")
    private PaymentModeConfig jiopp;
    
    
    
    
    @JsonProperty("jiopplink")
    private PaymentModeConfig jiopplink;
    
    
    
    
    @JsonProperty("stripepg")
    private PaymentModeConfig stripepg;
    
    
    
    
    @JsonProperty("juspaypg")
    private PaymentModeConfig juspaypg;
    
    
    
    
    @JsonProperty("payubizpg")
    private PaymentModeConfig payubizpg;
    
    
    
    
    @JsonProperty("payumoneypg")
    private PaymentModeConfig payumoneypg;
    
    
    
    
    @JsonProperty("rupifipg")
    private PaymentModeConfig rupifipg;
    
    
    
    
    @JsonProperty("simpl")
    private PaymentModeConfig simpl;
    
    
    
    
}

/*
    Model: PaymentModeConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModeConfig {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: PaymentSelectionLock
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentSelectionLock {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
}

/*
    Model: AppOrderConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppOrderConfig {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("force_reassignment")
    private Boolean forceReassignment;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: AppLogisticsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppLogisticsConfig {
    
    
    
    
    @JsonProperty("logistics_by_seller")
    private Boolean logisticsBySeller;
    
    
    
    
    @JsonProperty("serviceability_check")
    private Boolean serviceabilityCheck;
    
    
    
    
    @JsonProperty("same_day_delivery")
    private Boolean sameDayDelivery;
    
    
    
    
    @JsonProperty("dp_assignment")
    private Boolean dpAssignment;
    
    
    
    
}

/*
    Model: LoyaltyPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoyaltyPointsConfig {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
}

/*
    Model: AppInventoryPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryPartialUpdate {
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
    @JsonProperty("cart")
    private AppCartConfig cart;
    
    
    
    
    @JsonProperty("payment")
    private AppPaymentConfig payment;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPointsConfig loyaltyPoints;
    
    
    
    
    @JsonProperty("comms_enabled")
    private Boolean commsEnabled;
    
    
    
    
}

/*
    Model: BrandCompanyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandCompanyInfo {
    
    
    
    
    @JsonProperty("company_name")
    private String companyName;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: CompanyByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyByBrandsRequest {
    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
}

/*
    Model: CompanyByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyByBrandsResponse {
    
    
    
    
    @JsonProperty("items")
    private List<BrandCompanyInfo> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: StoreByBrandsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreByBrandsRequest {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("brands")
    private Integer brands;
    
    
    
    
    @JsonProperty("search_text")
    private String searchText;
    
    
    
    
}

/*
    Model: StoreByBrandsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreByBrandsResponse {
    
    
    
    
    @JsonProperty("items")
    private List<BrandStoreInfo> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: BrandStoreInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandStoreInfo {
    
    
    
    
    @JsonProperty("store_name")
    private String storeName;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("store_address")
    private OptedStoreAddress storeAddress;
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
    
}

/*
    Model: CompanyBrandInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyBrandInfo {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("brand_logo_url")
    private String brandLogoUrl;
    
    
    
    
    @JsonProperty("brand_banner_url")
    private String brandBannerUrl;
    
    
    
    
    @JsonProperty("brand_banner_portrait_url")
    private String brandBannerPortraitUrl;
    
    
    
    
}

/*
    Model: BrandsByCompanyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BrandsByCompanyResponse {
    
    
    
    
    @JsonProperty("brands")
    private CompanyBrandInfo brands;
    
    
    
    
}

/*
    Model: CreateApplicationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateApplicationRequest {
    
    
    
    
    @JsonProperty("app")
    private App app;
    
    
    
    
    @JsonProperty("configuration")
    private AppInventory configuration;
    
    
    
    
    @JsonProperty("domain")
    private AppDomain domain;
    
    
    
    
}

/*
    Model: CreateAppResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateAppResponse {
    
    
    
    
    @JsonProperty("app")
    private Application app;
    
    
    
    
    @JsonProperty("configuration")
    private ApplicationInventory configuration;
    
    
    
    
}

/*
    Model: ApplicationsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationsResponse {
    
    
    
    
    @JsonProperty("items")
    private List<Application> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: MobileAppConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileAppConfiguration {
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("package_name")
    private String packageName;
    
    
    
    
}

/*
    Model: LandingImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingImage {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: SplashImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SplashImage {
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
}

/*
    Model: MobileAppConfigRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MobileAppConfigRequest {
    
    
    
    
    @JsonProperty("app_name")
    private String appName;
    
    
    
    
    @JsonProperty("landing_image")
    private LandingImage landingImage;
    
    
    
    
    @JsonProperty("splash_image")
    private SplashImage splashImage;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
}

/*
    Model: BuildVersionHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuildVersionHistory {
    
    
    
    
    @JsonProperty("versions")
    private BuildVersion versions;
    
    
    
    
    @JsonProperty("latest_available_version_name")
    private String latestAvailableVersionName;
    
    
    
    
}

/*
    Model: BuildVersion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BuildVersion {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("platform_type")
    private String platformType;
    
    
    
    
    @JsonProperty("build_status")
    private String buildStatus;
    
    
    
    
    @JsonProperty("version_name")
    private String versionName;
    
    
    
    
    @JsonProperty("version_code")
    private Integer versionCode;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: AppSupportedCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppSupportedCurrency {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("supported_currency")
    private List<String> supportedCurrency;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: DefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DefaultCurrency {
    
    
    
    
    @JsonProperty("ref")
    private String ref;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: CurrencyConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrencyConfig {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
}

/*
    Model: DomainAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainAdd {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: DomainAddRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainAddRequest {
    
    
    
    
    @JsonProperty("domain")
    private DomainAdd domain;
    
    
    
    
}

/*
    Model: DomainsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainsResponse {
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
}

/*
    Model: UpdateDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDomain {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: UpdateDomainTypeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateDomainTypeRequest {
    
    
    
    
    @JsonProperty("domain")
    private UpdateDomain domain;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
}

/*
    Model: DomainStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatusRequest {
    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
    
}

/*
    Model: DomainStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatus {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: DomainStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainStatusResponse {
    
    
    
    
    @JsonProperty("connected")
    private Boolean connected;
    
    
    
    
    @JsonProperty("status")
    private List<DomainStatus> status;
    
    
    
    
}

/*
    Model: DomainSuggestionsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestionsRequest {
    
    
    
    
    @JsonProperty("domain_url")
    private String domainUrl;
    
    
    
    
    @JsonProperty("custom")
    private Boolean custom;
    
    
    
    
}

/*
    Model: DomainSuggestion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestion {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("unsupported")
    private Boolean unsupported;
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
}

/*
    Model: DomainSuggestionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DomainSuggestionsResponse {
    
    
    
    
    @JsonProperty("domains")
    private List<DomainSuggestion> domains;
    
    
    
    
}

/*
    Model: GetIntegrationsOptInsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetIntegrationsOptInsResponse {
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationOptIn> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: IntegrationOptIn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationOptIn {
    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    @JsonProperty("constants")
    private String constants;
    
    
    
    
    @JsonProperty("companies")
    private List<Object> companies;
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Validators
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validators {
    
    
    
    
    @JsonProperty("company")
    private CompanyValidator company;
    
    
    
    
    @JsonProperty("store")
    private StoreValidator store;
    
    
    
    
    @JsonProperty("inventory")
    private InventoryValidator inventory;
    
    
    
    
    @JsonProperty("order")
    private OrderValidator order;
    
    
    
    
}

/*
    Model: CompanyValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyValidator {
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: JsonSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class JsonSchema {
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("tooltip")
    private String tooltip;
    
    
    
    
}

/*
    Model: StoreValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreValidator {
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: InventoryValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryValidator {
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: OrderValidator
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderValidator {
    
    
    
    
    @JsonProperty("json_schema")
    private List<JsonSchema> jsonSchema;
    
    
    
    
    @JsonProperty("browser_script")
    private String browserScript;
    
    
    
    
}

/*
    Model: IntegrationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationMeta {
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: Integration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Integration {
    
    
    
    
    @JsonProperty("validators")
    private Validators validators;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("description_html")
    private String descriptionHtml;
    
    
    
    
    @JsonProperty("constants")
    private Object constants;
    
    
    
    
    @JsonProperty("companies")
    private List<Object> companies;
    
    
    
    
    @JsonProperty("support")
    private List<String> support;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: IntegrationConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationConfigResponse {
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
    
}

/*
    Model: IntegrationLevel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class IntegrationLevel {
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<Object> permissions;
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("meta")
    private List<IntegrationMeta> meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: UpdateIntegrationLevelRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateIntegrationLevelRequest {
    
    
    
    
    @JsonProperty("items")
    private List<IntegrationLevel> items;
    
    
    
    
}

/*
    Model: OptedStoreIntegration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStoreIntegration {
    
    
    
    
    @JsonProperty("other_opted")
    private Boolean otherOpted;
    
    
    
    
    @JsonProperty("other_integration")
    private IntegrationOptIn otherIntegration;
    
    
    
    
    @JsonProperty("other_entity")
    private OtherEntity otherEntity;
    
    
    
    
}

/*
    Model: OtherEntity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherEntity {
    
    
    
    
    @JsonProperty("opted")
    private Boolean opted;
    
    
    
    
    @JsonProperty("permissions")
    private List<String> permissions;
    
    
    
    
    @JsonProperty("last_patch")
    private List<LastPatch> lastPatch;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("integration")
    private String integration;
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("data")
    private OtherEntityData data;
    
    
    
    
    @JsonProperty("meta")
    private List<Object> meta;
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: LastPatch
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LastPatch {
    
    
    
    
    @JsonProperty("op")
    private String op;
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: OtherEntityData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherEntityData {
    
    
    
    
    @JsonProperty("article_identifier")
    private String articleIdentifier;
    
    
    
    
}

/*
    Model: App
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class App {
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("desc")
    private String desc;
    
    
    
    
}

/*
    Model: AppInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventory {
    
    
    
    
    @JsonProperty("brand")
    private InventoryBrandRule brand;
    
    
    
    
    @JsonProperty("store")
    private InventoryStoreRule store;
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    @JsonProperty("franchise_enabled")
    private Boolean franchiseEnabled;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("only_verified_products")
    private Boolean onlyVerifiedProducts;
    
    
    
    
    @JsonProperty("payment")
    private InventoryPaymentConfig payment;
    
    
    
    
    @JsonProperty("article_assignment")
    private InventoryArticleAssignment articleAssignment;
    
    
    
    
}

/*
    Model: AppDomain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppDomain {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: CompaniesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompaniesResponse {
    
    
    
    
    @JsonProperty("items")
    private AppInventoryCompanies items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AppInventoryCompanies
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryCompanies {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
    
}

/*
    Model: StoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoresResponse {
    
    
    
    
    @JsonProperty("items")
    private AppInventoryStores items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AppInventoryStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppInventoryStores {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: FilterOrderingStoreRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FilterOrderingStoreRequest {
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("q")
    private String q;
    
    
    
    
}

/*
    Model: DeploymentMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeploymentMeta {
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
}

/*
    Model: OrderingStoreConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoreConfig {
    
    
    
    
    @JsonProperty("deployment_meta")
    private DeploymentMeta deploymentMeta;
    
    
    
    
}

/*
    Model: OtherSellerCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerCompany {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: OtherSellerApplication
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerApplication {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("company")
    private OtherSellerCompany company;
    
    
    
    
    @JsonProperty("opt_type")
    private String optType;
    
    
    
    
}

/*
    Model: OtherSellerApplications
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OtherSellerApplications {
    
    
    
    
    @JsonProperty("items")
    private List<OtherSellerApplication> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: OptedApplicationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedApplicationResponse {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    @JsonProperty("company")
    private OptedCompany company;
    
    
    
    
    @JsonProperty("opted_inventory")
    private OptedInventory optedInventory;
    
    
    
    
    @JsonProperty("opt_out_inventory")
    private OptOutInventory optOutInventory;
    
    
    
    
}

/*
    Model: OptedCompany
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedCompany {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: OptedInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedInventory {
    
    
    
    
    @JsonProperty("opt_type")
    private OptType optType;
    
    
    
    
    @JsonProperty("items")
    private Object items;
    
    
    
    
}

/*
    Model: OptType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptType {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
}

/*
    Model: OptedStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStore {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
}

/*
    Model: OptOutInventory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptOutInventory {
    
    
    
    
    @JsonProperty("store")
    private List<Integer> store;
    
    
    
    
    @JsonProperty("company")
    private List<Integer> company;
    
    
    
    
}

/*
    Model: TokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TokenResponse {
    
    
    
    
    @JsonProperty("tokens")
    private Tokens tokens;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: Tokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Tokens {
    
    
    
    
    @JsonProperty("firebase")
    private Firebase firebase;
    
    
    
    
    @JsonProperty("moengage")
    private Moengage moengage;
    
    
    
    
    @JsonProperty("segment")
    private Segment segment;
    
    
    
    
    @JsonProperty("gtm")
    private Gtm gtm;
    
    
    
    
    @JsonProperty("freshchat")
    private Freshchat freshchat;
    
    
    
    
    @JsonProperty("safetynet")
    private Safetynet safetynet;
    
    
    
    
    @JsonProperty("fynd_rewards")
    private FyndRewards fyndRewards;
    
    
    
    
    @JsonProperty("google_map")
    private GoogleMap googleMap;
    
    
    
    
}

/*
    Model: Firebase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Firebase {
    
    
    
    
    @JsonProperty("credentials")
    private Credentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: Credentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Credentials {
    
    
    
    
    @JsonProperty("ios")
    private Ios ios;
    
    
    
    
    @JsonProperty("android")
    private Android android;
    
    
    
    
    @JsonProperty("project_id")
    private String projectId;
    
    
    
    
    @JsonProperty("gcm_sender_id")
    private String gcmSenderId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Ios
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ios {
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Android
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Android {
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Moengage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Moengage {
    
    
    
    
    @JsonProperty("credentials")
    private MoengageCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: MoengageCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MoengageCredentials {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
}

/*
    Model: Segment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Segment {
    
    
    
    
    @JsonProperty("credentials")
    private SegmentCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SegmentCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SegmentCredentials {
    
    
    
    
    @JsonProperty("write_key")
    private String writeKey;
    
    
    
    
}

/*
    Model: Gtm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Gtm {
    
    
    
    
    @JsonProperty("credentials")
    private GtmCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: GtmCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GtmCredentials {
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: Freshchat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Freshchat {
    
    
    
    
    @JsonProperty("credentials")
    private FreshchatCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: FreshchatCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreshchatCredentials {
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("app_key")
    private String appKey;
    
    
    
    
    @JsonProperty("web_token")
    private String webToken;
    
    
    
    
}

/*
    Model: Safetynet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Safetynet {
    
    
    
    
    @JsonProperty("credentials")
    private SafetynetCredentials credentials;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: SafetynetCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SafetynetCredentials {
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: FyndRewards
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndRewards {
    
    
    
    
    @JsonProperty("credentials")
    private FyndRewardsCredentials credentials;
    
    
    
    
}

/*
    Model: FyndRewardsCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FyndRewardsCredentials {
    
    
    
    
    @JsonProperty("public_key")
    private String publicKey;
    
    
    
    
}

/*
    Model: GoogleMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GoogleMap {
    
    
    
    
    @JsonProperty("credentials")
    private GoogleMapCredentials credentials;
    
    
    
    
}

/*
    Model: GoogleMapCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GoogleMapCredentials {
    
    
    
    
    @JsonProperty("api_key")
    private String apiKey;
    
    
    
    
}

/*
    Model: RewardPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardPointsConfig {
    
    
    
    
    @JsonProperty("credit")
    private Credit credit;
    
    
    
    
    @JsonProperty("debit")
    private Debit debit;
    
    
    
    
}

/*
    Model: Credit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Credit {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: Debit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Debit {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    @JsonProperty("strategy_channel")
    private String strategyChannel;
    
    
    
    
}

/*
    Model: ProductDetailFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductDetailFeature {
    
    
    
    
    @JsonProperty("similar")
    private List<String> similar;
    
    
    
    
    @JsonProperty("seller_selection")
    private Boolean sellerSelection;
    
    
    
    
    @JsonProperty("update_product_meta")
    private Boolean updateProductMeta;
    
    
    
    
    @JsonProperty("request_product")
    private Boolean requestProduct;
    
    
    
    
}

/*
    Model: LaunchPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LaunchPage {
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
}

/*
    Model: LandingPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LandingPageFeature {
    
    
    
    
    @JsonProperty("launch_page")
    private LaunchPage launchPage;
    
    
    
    
    @JsonProperty("continue_as_guest")
    private Boolean continueAsGuest;
    
    
    
    
    @JsonProperty("login_btn_text")
    private String loginBtnText;
    
    
    
    
    @JsonProperty("show_domain_textbox")
    private Boolean showDomainTextbox;
    
    
    
    
    @JsonProperty("show_register_btn")
    private Boolean showRegisterBtn;
    
    
    
    
}

/*
    Model: RegistrationPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RegistrationPageFeature {
    
    
    
    
    @JsonProperty("ask_store_address")
    private Boolean askStoreAddress;
    
    
    
    
}

/*
    Model: AppFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeature {
    
    
    
    
    @JsonProperty("product_detail")
    private ProductDetailFeature productDetail;
    
    
    
    
    @JsonProperty("landing_page")
    private LandingPageFeature landingPage;
    
    
    
    
    @JsonProperty("registration_page")
    private RegistrationPageFeature registrationPage;
    
    
    
    
    @JsonProperty("home_page")
    private HomePageFeature homePage;
    
    
    
    
    @JsonProperty("common")
    private CommonFeature common;
    
    
    
    
    @JsonProperty("cart")
    private CartFeature cart;
    
    
    
    
    @JsonProperty("qr")
    private QrFeature qr;
    
    
    
    
    @JsonProperty("pcr")
    private PcrFeature pcr;
    
    
    
    
    @JsonProperty("order")
    private OrderFeature order;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: HomePageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HomePageFeature {
    
    
    
    
    @JsonProperty("order_processing")
    private Boolean orderProcessing;
    
    
    
    
}

/*
    Model: CommonFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommonFeature {
    
    
    
    
    @JsonProperty("communication_optin_dialog")
    private CommunicationOptinDialogFeature communicationOptinDialog;
    
    
    
    
    @JsonProperty("deployment_store_selection")
    private DeploymentStoreSelectionFeature deploymentStoreSelection;
    
    
    
    
    @JsonProperty("listing_price")
    private ListingPriceFeature listingPrice;
    
    
    
    
    @JsonProperty("currency")
    private CurrencyFeature currency;
    
    
    
    
    @JsonProperty("revenue_engine")
    private RevenueEngineFeature revenueEngine;
    
    
    
    
    @JsonProperty("feedback")
    private FeedbackFeature feedback;
    
    
    
    
    @JsonProperty("compare_products")
    private CompareProductsFeature compareProducts;
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
    
}

/*
    Model: CommunicationOptinDialogFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CommunicationOptinDialogFeature {
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
    
}

/*
    Model: DeploymentStoreSelectionFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeploymentStoreSelectionFeature {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: ListingPriceFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListingPriceFeature {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: CurrencyFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrencyFeature {
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("default_currency")
    private String defaultCurrency;
    
    
    
    
}

/*
    Model: RevenueEngineFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RevenueEngineFeature {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: FeedbackFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FeedbackFeature {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: CompareProductsFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompareProductsFeature {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
}

/*
    Model: CartFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartFeature {
    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    @JsonProperty("google_map")
    private Boolean googleMap;
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
    
}

/*
    Model: QrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class QrFeature {
    
    
    
    
    @JsonProperty("application")
    private Boolean application;
    
    
    
    
    @JsonProperty("products")
    private Boolean products;
    
    
    
    
    @JsonProperty("collections")
    private Boolean collections;
    
    
    
    
}

/*
    Model: PcrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PcrFeature {
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
}

/*
    Model: OrderFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderFeature {
    
    
    
    
    @JsonProperty("buy_again")
    private Boolean buyAgain;
    
    
    
    
}

/*
    Model: AppFeatureRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeatureRequest {
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
    
}

/*
    Model: AppFeatureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppFeatureResponse {
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
    
}

/*
    Model: UnhandledError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UnhandledError {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InvalidPayloadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvalidPayloadRequest {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SuccessMessageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessMessageResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: InventoryBrandRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryBrandRule {
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
}

/*
    Model: StoreCriteriaRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreCriteriaRule {
    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
    
}

/*
    Model: InventoryStoreRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryStoreRule {
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    @JsonProperty("rules")
    private List<StoreCriteriaRule> rules;
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
    
}

/*
    Model: InventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryPaymentConfig {
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
}

/*
    Model: StorePriorityRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StorePriorityRule {
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("storetype_order")
    private List<String> storetypeOrder;
    
    
    
    
}

/*
    Model: ArticleAssignmentRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticleAssignmentRule {
    
    
    
    
    @JsonProperty("store_priority")
    private StorePriorityRule storePriority;
    
    
    
    
}

/*
    Model: InventoryArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InventoryArticleAssignment {
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRule rules;
    
    
    
    
}

/*
    Model: CompanyAboutAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompanyAboutAddress {
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
}

/*
    Model: UserEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserEmail {
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
}

/*
    Model: UserPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserPhoneNumber {
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
}

/*
    Model: ApplicationInformation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationInformation {
    
    
    
    
    @JsonProperty("address")
    private InformationAddress address;
    
    
    
    
    @JsonProperty("support")
    private InformationSupport support;
    
    
    
    
    @JsonProperty("social_links")
    private SocialLinks socialLinks;
    
    
    
    
    @JsonProperty("links")
    private Links links;
    
    
    
    
    @JsonProperty("copyright_text")
    private String copyrightText;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("business_highlights")
    private BusinessHighlights businessHighlights;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: InformationAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationAddress {
    
    
    
    
    @JsonProperty("loc")
    private String loc;
    
    
    
    
    @JsonProperty("address_line")
    private List<String> addressLine;
    
    
    
    
    @JsonProperty("phone")
    private InformationPhone phone;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
}

/*
    Model: InformationPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationPhone {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
    
}

/*
    Model: InformationSupport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InformationSupport {
    
    
    
    
    @JsonProperty("phone")
    private List<String> phone;
    
    
    
    
    @JsonProperty("email")
    private List<String> email;
    
    
    
    
    @JsonProperty("timing")
    private String timing;
    
    
    
    
}

/*
    Model: SocialLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SocialLinks {
    
    
    
    
    @JsonProperty("facebook")
    private FacebookLink facebook;
    
    
    
    
    @JsonProperty("instagram")
    private InstagramLink instagram;
    
    
    
    
    @JsonProperty("twitter")
    private TwitterLink twitter;
    
    
    
    
    @JsonProperty("pinterest")
    private PinterestLink pinterest;
    
    
    
    
    @JsonProperty("google_plus")
    private GooglePlusLink googlePlus;
    
    
    
    
    @JsonProperty("youtube")
    private YoutubeLink youtube;
    
    
    
    
    @JsonProperty("linked_in")
    private LinkedInLink linkedIn;
    
    
    
    
    @JsonProperty("vimeo")
    private VimeoLink vimeo;
    
    
    
    
    @JsonProperty("blog_link")
    private BlogLink blogLink;
    
    
    
    
}

/*
    Model: FacebookLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FacebookLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: InstagramLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InstagramLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: TwitterLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class TwitterLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: PinterestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PinterestLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: GooglePlusLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GooglePlusLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: YoutubeLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class YoutubeLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: LinkedInLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LinkedInLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: VimeoLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class VimeoLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: BlogLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BlogLink {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: Links
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Links {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
}

/*
    Model: BusinessHighlights
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BusinessHighlights {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
}

/*
    Model: ApplicationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ApplicationDetail {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
}

/*
    Model: CurrenciesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CurrenciesResponse {
    
    
    
    
    @JsonProperty("items")
    private List<Currency> items;
    
    
    
    
}

/*
    Model: AppCurrencyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppCurrencyResponse {
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    @JsonProperty("supported_currency")
    private List<Currency> supportedCurrency;
    
    
    
    
}

/*
    Model: StoreLatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StoreLatLong {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
    
}

/*
    Model: OptedStoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OptedStoreAddress {
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    @JsonProperty("lat_long")
    private StoreLatLong latLong;
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
}

/*
    Model: OrderingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStore {
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: OrderingStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStores {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
}

/*
    Model: OrderingStoresResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OrderingStoresResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
}




/*
    Model: RuleDefinition
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RuleDefinition {
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("applicable_on")
    private String applicableOn;
    
    
    
    
    @JsonProperty("is_exact")
    private Boolean isExact;
    
    
    
    
    @JsonProperty("scope")
    private List<String> scope;
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
}

/*
    Model: CouponAuthor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAuthor {
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: PostOrder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostOrder {
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
}

/*
    Model: PriceRange
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PriceRange {
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: PaymentAllowValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentAllowValue {
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: PaymentModes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentModes {
    
    
    
    
    @JsonProperty("types")
    private List<String> types;
    
    
    
    
    @JsonProperty("networks")
    private List<String> networks;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue uses;
    
    
    
    
}

/*
    Model: BulkBundleRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkBundleRestriction {
    
    
    
    
    @JsonProperty("multi_store_allowed")
    private Boolean multiStoreAllowed;
    
    
    
    
}

/*
    Model: UsesRemaining
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRemaining {
    
    
    
    
    @JsonProperty("user")
    private Integer user;
    
    
    
    
    @JsonProperty("app")
    private Integer app;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
}

/*
    Model: UsesRestriction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRestriction {
    
    
    
    
    @JsonProperty("remaining")
    private UsesRemaining remaining;
    
    
    
    
    @JsonProperty("maximum")
    private UsesRemaining maximum;
    
    
    
    
}

/*
    Model: Restrictions
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions {
    
    
    
    
    @JsonProperty("ordering_stores")
    private List<Integer> orderingStores;
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder postOrder;
    
    
    
    
    @JsonProperty("price_range")
    private PriceRange priceRange;
    
    
    
    
    @JsonProperty("payments")
    private HashMap<String,PaymentModes> payments;
    
    
    
    
    @JsonProperty("bulk_bundle")
    private BulkBundleRestriction bulkBundle;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction uses;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("coupon_allowed")
    private Boolean couponAllowed;
    
    
    
    
}

/*
    Model: Rule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Rule {
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    @JsonProperty("key")
    private Double key;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("discount_qty")
    private Double discountQty;
    
    
    
    
}

/*
    Model: State
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class State {
    
    
    
    
    @JsonProperty("is_display")
    private Boolean isDisplay;
    
    
    
    
    @JsonProperty("is_public")
    private Boolean isPublic;
    
    
    
    
    @JsonProperty("is_archived")
    private Boolean isArchived;
    
    
    
    
}

/*
    Model: CouponAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAction {
    
    
    
    
    @JsonProperty("txn_mode")
    private String txnMode;
    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
    
}

/*
    Model: Ownership
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ownership {
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
}

/*
    Model: CouponDateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponDateMeta {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: Validity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validity {
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
}

/*
    Model: Validation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Validation {
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
    
    @JsonProperty("user_registered_after")
    private String userRegisteredAfter;
    
    
    
    
    @JsonProperty("app_id")
    private List<String> appId;
    
    
    
    
}

/*
    Model: CouponSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponSchedule {
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: DisplayMetaDict
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMetaDict {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
}

/*
    Model: DisplayMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMeta {
    
    
    
    
    @JsonProperty("remove")
    private DisplayMetaDict remove;
    
    
    
    
    @JsonProperty("auto")
    private DisplayMetaDict auto;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("apply")
    private DisplayMetaDict apply;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
}

/*
    Model: CouponAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponAdd {
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
}

/*
    Model: CouponsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private CouponAdd items;
    
    
    
    
}

/*
    Model: SuccessMessage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessMessage {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: OperationErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OperationErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: CouponUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponUpdate {
    
    
    
    
    @JsonProperty("rule_definition")
    private RuleDefinition ruleDefinition;
    
    
    
    
    @JsonProperty("author")
    private CouponAuthor author;
    
    
    
    
    @JsonProperty("type_slug")
    private String typeSlug;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions restrictions;
    
    
    
    
    @JsonProperty("rule")
    private List<Rule> rule;
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("action")
    private CouponAction action;
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership ownership;
    
    
    
    
    @JsonProperty("date_meta")
    private CouponDateMeta dateMeta;
    
    
    
    
    @JsonProperty("validity")
    private Validity validity;
    
    
    
    
    @JsonProperty("validation")
    private Validation validation;
    
    
    
    
    @JsonProperty("_schedule")
    private CouponSchedule schedule;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta displayMeta;
    
    
    
    
    @JsonProperty("identifiers")
    private Identifier identifiers;
    
    
    
    
}

/*
    Model: CouponPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponPartialUpdate {
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("schedule")
    private CouponSchedule schedule;
    
    
    
    
}

/*
    Model: CompareObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CompareObject {
    
    
    
    
    @JsonProperty("greater_than_equals")
    private Double greaterThanEquals;
    
    
    
    
    @JsonProperty("equals")
    private Double equals;
    
    
    
    
    @JsonProperty("greater_than")
    private Double greaterThan;
    
    
    
    
    @JsonProperty("less_than")
    private Double lessThan;
    
    
    
    
    @JsonProperty("less_than_equals")
    private Double lessThanEquals;
    
    
    
    
}

/*
    Model: ItemCriteria
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ItemCriteria {
    
    
    
    
    @JsonProperty("buy_rules")
    private List<String> buyRules;
    
    
    
    
    @JsonProperty("cart_total")
    private CompareObject cartTotal;
    
    
    
    
    @JsonProperty("item_size")
    private List<String> itemSize;
    
    
    
    
    @JsonProperty("item_category")
    private List<Integer> itemCategory;
    
    
    
    
    @JsonProperty("item_id")
    private List<Integer> itemId;
    
    
    
    
    @JsonProperty("item_exclude_id")
    private List<Integer> itemExcludeId;
    
    
    
    
    @JsonProperty("item_company")
    private List<Integer> itemCompany;
    
    
    
    
    @JsonProperty("all_items")
    private Boolean allItems;
    
    
    
    
    @JsonProperty("item_exclude_brand")
    private List<Integer> itemExcludeBrand;
    
    
    
    
    @JsonProperty("item_store")
    private List<Integer> itemStore;
    
    
    
    
    @JsonProperty("available_zones")
    private List<String> availableZones;
    
    
    
    
    @JsonProperty("item_exclude_category")
    private List<Integer> itemExcludeCategory;
    
    
    
    
    @JsonProperty("item_exclude_company")
    private List<Integer> itemExcludeCompany;
    
    
    
    
    @JsonProperty("cart_quantity")
    private CompareObject cartQuantity;
    
    
    
    
    @JsonProperty("item_exclude_store")
    private List<Integer> itemExcludeStore;
    
    
    
    
    @JsonProperty("item_exclude_sku")
    private List<String> itemExcludeSku;
    
    
    
    
    @JsonProperty("item_sku")
    private List<String> itemSku;
    
    
    
    
    @JsonProperty("item_brand")
    private List<Integer> itemBrand;
    
    
    
    
}

/*
    Model: PostOrder1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PostOrder1 {
    
    
    
    
    @JsonProperty("return_allowed")
    private Boolean returnAllowed;
    
    
    
    
    @JsonProperty("cancellation_allowed")
    private Boolean cancellationAllowed;
    
    
    
    
}

/*
    Model: PaymentAllowValue1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PaymentAllowValue1 {
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
}

/*
    Model: PromotionPaymentModes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionPaymentModes {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("codes")
    private List<String> codes;
    
    
    
    
    @JsonProperty("uses")
    private PaymentAllowValue1 uses;
    
    
    
    
}

/*
    Model: UsesRemaining1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRemaining1 {
    
    
    
    
    @JsonProperty("user")
    private Integer user;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
}

/*
    Model: UsesRestriction1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UsesRestriction1 {
    
    
    
    
    @JsonProperty("remaining")
    private UsesRemaining1 remaining;
    
    
    
    
    @JsonProperty("maximum")
    private UsesRemaining1 maximum;
    
    
    
    
}

/*
    Model: UserRegistered
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserRegistered {
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
}

/*
    Model: Restrictions1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Restrictions1 {
    
    
    
    
    @JsonProperty("order_quantity")
    private Integer orderQuantity;
    
    
    
    
    @JsonProperty("user_id")
    private List<String> userId;
    
    
    
    
    @JsonProperty("post_order")
    private PostOrder1 postOrder;
    
    
    
    
    @JsonProperty("payments")
    private List<PromotionPaymentModes> payments;
    
    
    
    
    @JsonProperty("user_groups")
    private List<Integer> userGroups;
    
    
    
    
    @JsonProperty("uses")
    private UsesRestriction1 uses;
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    @JsonProperty("anonymous_users")
    private Boolean anonymousUsers;
    
    
    
    
    @JsonProperty("user_registered")
    private UserRegistered userRegistered;
    
    
    
    
}

/*
    Model: PromotionAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAction {
    
    
    
    
    @JsonProperty("action_type")
    private String actionType;
    
    
    
    
    @JsonProperty("action_date")
    private String actionDate;
    
    
    
    
}

/*
    Model: PromotionAuthor
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAuthor {
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
    
}

/*
    Model: PromotionDateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionDateMeta {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
}

/*
    Model: DisplayMeta1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayMeta1 {
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
}

/*
    Model: DiscountOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountOffer {
    
    
    
    
    @JsonProperty("discount_percentage")
    private Double discountPercentage;
    
    
    
    
    @JsonProperty("discount_price")
    private Double discountPrice;
    
    
    
    
    @JsonProperty("discount_amount")
    private Double discountAmount;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("min_offer_quantity")
    private Integer minOfferQuantity;
    
    
    
    
    @JsonProperty("apportion_discount")
    private Boolean apportionDiscount;
    
    
    
    
    @JsonProperty("partial_can_ret")
    private Boolean partialCanRet;
    
    
    
    
    @JsonProperty("max_offer_quantity")
    private Integer maxOfferQuantity;
    
    
    
    
    @JsonProperty("max_discount_amount")
    private Double maxDiscountAmount;
    
    
    
    
    @JsonProperty("max_usage_per_transaction")
    private Integer maxUsagePerTransaction;
    
    
    
    
}

/*
    Model: DiscountRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRule {
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("buy_condition")
    private String buyCondition;
    
    
    
    
    @JsonProperty("item_criteria")
    private ItemCriteria itemCriteria;
    
    
    
    
    @JsonProperty("offer")
    private DiscountOffer offer;
    
    
    
    
}

/*
    Model: Ownership1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Ownership1 {
    
    
    
    
    @JsonProperty("payable_category")
    private String payableCategory;
    
    
    
    
    @JsonProperty("payable_by")
    private String payableBy;
    
    
    
    
}

/*
    Model: Visibility
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Visibility {
    
    
    
    
    @JsonProperty("pdp")
    private Boolean pdp;
    
    
    
    
    @JsonProperty("coupon_list")
    private Boolean couponList;
    
    
    
    
}

/*
    Model: PromotionSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionSchedule {
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: PromotionListItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionListItem {
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
}

/*
    Model: PromotionsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionsResponse {
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("items")
    private PromotionListItem items;
    
    
    
    
}

/*
    Model: PromotionAdd
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionAdd {
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
}

/*
    Model: PromotionUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionUpdate {
    
    
    
    
    @JsonProperty("buy_rules")
    private HashMap<String,ItemCriteria> buyRules;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("restrictions")
    private Restrictions1 restrictions;
    
    
    
    
    @JsonProperty("post_order_action")
    private PromotionAction postOrderAction;
    
    
    
    
    @JsonProperty("stackable")
    private Boolean stackable;
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    @JsonProperty("author")
    private PromotionAuthor author;
    
    
    
    
    @JsonProperty("date_meta")
    private PromotionDateMeta dateMeta;
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    @JsonProperty("apply_priority")
    private Integer applyPriority;
    
    
    
    
    @JsonProperty("display_meta")
    private DisplayMeta1 displayMeta;
    
    
    
    
    @JsonProperty("apply_all_discount")
    private Boolean applyAllDiscount;
    
    
    
    
    @JsonProperty("apply_exclusive")
    private String applyExclusive;
    
    
    
    
    @JsonProperty("promo_group")
    private String promoGroup;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRule> discountRules;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    @JsonProperty("ownership")
    private Ownership1 ownership;
    
    
    
    
    @JsonProperty("calculate_on")
    private String calculateOn;
    
    
    
    
    @JsonProperty("visiblility")
    private Visibility visiblility;
    
    
    
    
    @JsonProperty("_schedule")
    private PromotionSchedule schedule;
    
    
    
    
}

/*
    Model: PromotionPartialUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromotionPartialUpdate {
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    @JsonProperty("schedule")
    private PromotionSchedule schedule;
    
    
    
    
}

/*
    Model: ActivePromosResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActivePromosResponse {
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    
    
    
    
    @JsonProperty("entity_slug")
    private String entitySlug;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("example")
    private String example;
    
    
    
    
}

/*
    Model: CartItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItem {
    
    
    
    
    @JsonProperty("product_id")
    private String productId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
}

/*
    Model: OpenapiCartDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenapiCartDetailsRequest {
    
    
    
    
    @JsonProperty("cart_items")
    private CartItem cartItems;
    
    
    
    
}

/*
    Model: RawBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RawBreakup {
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    @JsonProperty("mrp_total")
    private Double mrpTotal;
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
}

/*
    Model: LoyaltyPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LoyaltyPoints {
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
}

/*
    Model: CouponBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CouponBreakup {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
}

/*
    Model: DisplayBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DisplayBreakup {
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
}

/*
    Model: CartBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartBreakup {
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
}

/*
    Model: BaseInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BaseInfo {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: BasePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BasePrice {
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
}

/*
    Model: ArticlePriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ArticlePriceInfo {
    
    
    
    
    @JsonProperty("converted")
    private BasePrice converted;
    
    
    
    
    @JsonProperty("base")
    private BasePrice base;
    
    
    
    
}

/*
    Model: ProductArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductArticle {
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    @JsonProperty("store")
    private BaseInfo store;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: DiscountRulesApp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountRulesApp {
    
    
    
    
    @JsonProperty("raw_offer")
    private Object rawOffer;
    
    
    
    
    @JsonProperty("matched_buy_rules")
    private List<String> matchedBuyRules;
    
    
    
    
    @JsonProperty("offer")
    private Object offer;
    
    
    
    
    @JsonProperty("item_criteria")
    private Object itemCriteria;
    
    
    
    
}

/*
    Model: FreeGiftItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FreeGiftItem {
    
    
    
    
    @JsonProperty("item_brand_name")
    private String itemBrandName;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("item_price_details")
    private Object itemPriceDetails;
    
    
    
    
    @JsonProperty("item_slug")
    private String itemSlug;
    
    
    
    
    @JsonProperty("item_images_url")
    private List<String> itemImagesUrl;
    
    
    
    
}

/*
    Model: AppliedFreeArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedFreeArticles {
    
    
    
    
    @JsonProperty("free_gift_item_details")
    private FreeGiftItem freeGiftItemDetails;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("parent_item_identifier")
    private String parentItemIdentifier;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: AppliedPromotion
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppliedPromotion {
    
    
    
    
    @JsonProperty("buy_rules")
    private List<BuyRules> buyRules;
    
    
    
    
    @JsonProperty("promotion_type")
    private String promotionType;
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
    @JsonProperty("discount_rules")
    private List<DiscountRulesApp> discountRules;
    
    
    
    
    @JsonProperty("promotion_name")
    private String promotionName;
    
    
    
    
    @JsonProperty("article_quantity")
    private Integer articleQuantity;
    
    
    
    
    @JsonProperty("applied_free_articles")
    private List<AppliedFreeArticles> appliedFreeArticles;
    
    
    
    
    @JsonProperty("promotion_group")
    private String promotionGroup;
    
    
    
    
    @JsonProperty("mrp_promotion")
    private Boolean mrpPromotion;
    
    
    
    
    @JsonProperty("offer_text")
    private String offerText;
    
    
    
    
    @JsonProperty("promo_id")
    private String promoId;
    
    
    
    
}

/*
    Model: PromoMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromoMeta {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: CategoryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CategoryInfo {
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
}

/*
    Model: ProductImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductImage {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
}

/*
    Model: ActionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ActionQuery {
    
    
    
    
    @JsonProperty("product_slug")
    private List<String> productSlug;
    
    
    
    
}

/*
    Model: ProductAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAction {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
    
}

/*
    Model: CartProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProduct {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
}

/*
    Model: ProductPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPrice {
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
}

/*
    Model: ProductPriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductPriceInfo {
    
    
    
    
    @JsonProperty("converted")
    private ProductPrice converted;
    
    
    
    
    @JsonProperty("base")
    private ProductPrice base;
    
    
    
    
}

/*
    Model: ProductAvailability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ProductAvailability {
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
}

/*
    Model: CartProductIdentifer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProductIdentifer {
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
}

/*
    Model: CartProductInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartProductInfo {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    @JsonProperty("promotions_applied")
    private List<AppliedPromotion> promotionsApplied;
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
}

/*
    Model: OpenapiCartDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenapiCartDetailsResponse {
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
}

/*
    Model: OpenApiErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiErrorResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("errors")
    private Object errors;
    
    
    
    
}

/*
    Model: ShippingAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingAddress {
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    @JsonProperty("phone")
    private Integer phone;
    
    
    
    
}

/*
    Model: OpenApiCartServiceabilityRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCartServiceabilityRequest {
    
    
    
    
    @JsonProperty("cart_items")
    private CartItem cartItems;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
}

/*
    Model: PromiseFormatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseFormatted {
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
    
}

/*
    Model: PromiseTimestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PromiseTimestamp {
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
}

/*
    Model: ShipmentPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShipmentPromise {
    
    
    
    
    @JsonProperty("formatted")
    private PromiseFormatted formatted;
    
    
    
    
    @JsonProperty("timestamp")
    private PromiseTimestamp timestamp;
    
    
    
    
}

/*
    Model: OpenApiCartServiceabilityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCartServiceabilityResponse {
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
}

/*
    Model: OpenApiFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiFiles {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
}

/*
    Model: CartItemMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartItemMeta {
    
    
    
    
    @JsonProperty("group_id")
    private String groupId;
    
    
    
    
    @JsonProperty("primary_item")
    private Boolean primaryItem;
    
    
    
    
}

/*
    Model: OpenApiOrderItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiOrderItem {
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    @JsonProperty("product_id")
    private Integer productId;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("employee_discount")
    private Double employeeDiscount;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("meta")
    private CartItemMeta meta;
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: OpenApiPlatformCheckoutReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiPlatformCheckoutReq {
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    @JsonProperty("files")
    private List<OpenApiFiles> files;
    
    
    
    
    @JsonProperty("cart_items")
    private List<OpenApiOrderItem> cartItems;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("employee_discount")
    private Object employeeDiscount;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Double deliveryCharges;
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    @JsonProperty("loyalty_discount")
    private Double loyaltyDiscount;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("affiliate_order_id")
    private String affiliateOrderId;
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("coupon")
    private String coupon;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<MultiTenderPaymentMethod> paymentMethods;
    
    
    
    
    @JsonProperty("billing_address")
    private ShippingAddress billingAddress;
    
    
    
    
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    
    
    
    
}

/*
    Model: OpenApiCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class OpenApiCheckoutResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("order_ref_id")
    private String orderRefId;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
}

/*
    Model: AbandonedCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonedCart {
    
    
    
    
    @JsonProperty("cashback")
    private Object cashback;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("fynd_credits")
    private Object fyndCredits;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("delivery_charges")
    private Object deliveryCharges;
    
    
    
    
    @JsonProperty("shipments")
    private List<Object> shipments;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("cod_charges")
    private Object codCharges;
    
    
    
    
    @JsonProperty("cart_value")
    private Double cartValue;
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    @JsonProperty("payment_methods")
    private List<Object> paymentMethods;
    
    
    
    
    @JsonProperty("fc_index_map")
    private List<Integer> fcIndexMap;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    @JsonProperty("promotion")
    private Object promotion;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    @JsonProperty("payments")
    private Object payments;
    
    
    
    
    @JsonProperty("is_archive")
    private Boolean isArchive;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("coupon")
    private Object coupon;
    
    
    
    
    @JsonProperty("bulk_coupon_discount")
    private Double bulkCouponDiscount;
    
    
    
    
    @JsonProperty("merge_qty")
    private Boolean mergeQty;
    
    
    
    
    @JsonProperty("is_default")
    private Boolean isDefault;
    
    
    
    
}

/*
    Model: AbandonedCartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonedCartResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("result")
    private Object result;
    
    
    
    
    @JsonProperty("items")
    private List<AbandonedCart> items;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: AddProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProductCart {
    
    
    
    
    @JsonProperty("product_group_tags")
    private List<String> productGroupTags;
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: AddCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddCartRequest {
    
    
    
    
    @JsonProperty("items")
    private List<AddProductCart> items;
    
    
    
    
}

/*
    Model: CartCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartCurrency {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
}

/*
    Model: CartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CartDetailResponse {
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    @JsonProperty("buy_now")
    private Boolean buyNow;
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
}

/*
    Model: AddCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddCartDetailResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
}

/*
    Model: UpdateProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateProductCart {
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    @JsonProperty("parent_item_identifiers")
    private Object parentItemIdentifiers;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
}

/*
    Model: UpdateCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartRequest {
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    @JsonProperty("items")
    private List<UpdateProductCart> items;
    
    
    
    
}

/*
    Model: UpdateCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UpdateCartDetailResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
}




/*
    Model: AppUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AppUser {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("block_reason")
    private String blockReason;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: E
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class E {
    
    
    
    
    @JsonProperty("code")
    private Object code;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
    
}

/*
    Model: Giveaway
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Giveaway {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("audience")
    private RewardsAudience audience;
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rule")
    private RewardsRule rule;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
}

/*
    Model: GiveawayResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GiveawayResponse {
    
    
    
    
    @JsonProperty("items")
    private List<Giveaway> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: HistoryPretty
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryPretty {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("claimed")
    private Boolean claimed;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    @JsonProperty("remaining_points")
    private Double remainingPoints;
    
    
    
    
    @JsonProperty("text_1")
    private String text1;
    
    
    
    
    @JsonProperty("text_2")
    private String text2;
    
    
    
    
    @JsonProperty("text_3")
    private String text3;
    
    
    
    
    @JsonProperty("txn_name")
    private String txnName;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: HistoryRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class HistoryRes {
    
    
    
    
    @JsonProperty("items")
    private List<HistoryPretty> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
}

/*
    Model: Offer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Offer {
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("rule")
    private Object rule;
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    @JsonProperty("sub_text")
    private String subText;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
}

/*
    Model: Points
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Points {
    
    
    
    
    @JsonProperty("available")
    private Double available;
    
    
    
    
}

/*
    Model: Referral
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Referral {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
}

/*
    Model: RewardUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardUser {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("referral")
    private Referral referral;
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    @JsonProperty("user_block_reason")
    private String userBlockReason;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: RewardsAudience
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardsAudience {
    
    
    
    
    @JsonProperty("header_user_id")
    private String headerUserId;
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
}

/*
    Model: RewardsRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RewardsRule {
    
    
    
    
    @JsonProperty("amount")
    private Double amount;
    
    
    
    
}

/*
    Model: Schedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Schedule {
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
}

/*
    Model: ShareMessages
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShareMessages {
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    @JsonProperty("facebook")
    private String facebook;
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("messenger")
    private String messenger;
    
    
    
    
    @JsonProperty("sms")
    private String sms;
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    @JsonProperty("twitter")
    private String twitter;
    
    
    
    
    @JsonProperty("whatsapp")
    private String whatsapp;
    
    
    
    
}

/*
    Model: UserRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserRes {
    
    
    
    
    @JsonProperty("points")
    private Points points;
    
    
    
    
    @JsonProperty("user")
    private RewardUser user;
    
    
    
    
}




/*
    Model: StatGroup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatGroup {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
}

/*
    Model: StatsGroups
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsGroups {
    
    
    
    
    @JsonProperty("groups")
    private List<StatGroup> groups;
    
    
    
    
}

/*
    Model: StatsGroupComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsGroupComponent {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("filters")
    private Object filters;
    
    
    
    
}

/*
    Model: StatsGroupComponents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsGroupComponents {
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("components")
    private List<StatsGroupComponent> components;
    
    
    
    
}

/*
    Model: StatsRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatsRes {
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}

/*
    Model: ReceivedAt
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ReceivedAt {
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
}

/*
    Model: AbandonCartsDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonCartsDetail {
    
    
    
    
    @JsonProperty("properties_cart_id")
    private String propertiesCartId;
    
    
    
    
    @JsonProperty("context_traits_first_name")
    private String contextTraitsFirstName;
    
    
    
    
    @JsonProperty("context_traits_last_name")
    private String contextTraitsLastName;
    
    
    
    
    @JsonProperty("context_traits_phone_number")
    private String contextTraitsPhoneNumber;
    
    
    
    
    @JsonProperty("context_traits_email")
    private String contextTraitsEmail;
    
    
    
    
    @JsonProperty("context_app_application_id")
    private String contextAppApplicationId;
    
    
    
    
    @JsonProperty("properties_breakup_values_raw_total")
    private String propertiesBreakupValuesRawTotal;
    
    
    
    
    @JsonProperty("received_at")
    private ReceivedAt receivedAt;
    
    
    
    
}

/*
    Model: AbandonCartsList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonCartsList {
    
    
    
    
    @JsonProperty("items")
    private List<AbandonCartsDetail> items;
    
    
    
    
    @JsonProperty("cart_total")
    private String cartTotal;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: AbandonCartDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AbandonCartDetail {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("cart_value")
    private String cartValue;
    
    
    
    
    @JsonProperty("articles")
    private List<Object> articles;
    
    
    
    
    @JsonProperty("breakup")
    private Object breakup;
    
    
    
    
    @JsonProperty("address")
    private Object address;
    
    
    
    
}

/*
    Model: ExportJobReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExportJobReq {
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    @JsonProperty("start_time")
    private String startTime;
    
    
    
    
    @JsonProperty("end_time")
    private String endTime;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
}

/*
    Model: ExportJobRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExportJobRes {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
}

/*
    Model: ExportJobStatusRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ExportJobStatusRes {
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("job_id")
    private String jobId;
    
    
    
    
    @JsonProperty("download_url")
    private String downloadUrl;
    
    
    
    
}

/*
    Model: GetLogsListReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLogsListReq {
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
}

/*
    Model: MkpLogsResp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class MkpLogsResp {
    
    
    
    
    @JsonProperty("start_time_iso")
    private String startTimeIso;
    
    
    
    
    @JsonProperty("end_time_iso")
    private String endTimeIso;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("count")
    private String count;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: GetLogsListRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetLogsListRes {
    
    
    
    
    @JsonProperty("items")
    private List<MkpLogsResp> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: SearchLogReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SearchLogReq {
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    @JsonProperty("start_date")
    private String startDate;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("end_date")
    private String endDate;
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    @JsonProperty("identifier_value")
    private String identifierValue;
    
    
    
    
}

/*
    Model: LogInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogInfo {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("marketplace_name")
    private String marketplaceName;
    
    
    
    
    @JsonProperty("event")
    private String event;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
    @JsonProperty("company_id")
    private Double companyId;
    
    
    
    
    @JsonProperty("brand_id")
    private Double brandId;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    @JsonProperty("item_id")
    private Double itemId;
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
}

/*
    Model: SearchLogRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SearchLogRes {
    
    
    
    
    @JsonProperty("items")
    private List<LogInfo> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}




/*
    Model: ValidityObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ValidityObject {
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
}

/*
    Model: CreateUpdateDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateUpdateDiscount {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_ids")
    private List<String> appIds;
    
    
    
    
    @JsonProperty("extension_ids")
    private List<String> extensionIds;
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("discount_level")
    private String discountLevel;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("validity")
    private ValidityObject validity;
    
    
    
    
}

/*
    Model: DiscountJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountJob {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    @JsonProperty("app_ids")
    private List<String> appIds;
    
    
    
    
    @JsonProperty("job_type")
    private String jobType;
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("discount_level")
    private String discountLevel;
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
    @JsonProperty("validity")
    private ValidityObject validity;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    @JsonProperty("created_by")
    private UserDetails createdBy;
    
    
    
    
    @JsonProperty("modified_by")
    private UserDetails modifiedBy;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: ListOrCalender
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ListOrCalender {
    
    
    
    
    @JsonProperty("items")
    private List<DiscountJob> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: DiscountItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DiscountItems {
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    @JsonProperty("brand_uid")
    private Integer brandUid;
    
    
    
    
    @JsonProperty("seller_identifier")
    private String sellerIdentifier;
    
    
    
    
    @JsonProperty("discount_type")
    private String discountType;
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
}

/*
    Model: BulkDiscount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkDiscount {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("items")
    private List<DiscountItems> items;
    
    
    
    
}

/*
    Model: FileJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class FileJobResponse {
    
    
    
    
    @JsonProperty("stage")
    private String stage;
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    @JsonProperty("failed")
    private Integer failed;
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("body")
    private Object body;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("file_type")
    private String fileType;
    
    
    
    
}

/*
    Model: DownloadFileJob
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DownloadFileJob {
    
    
    
    
    @JsonProperty("brand_ids")
    private List<Integer> brandIds;
    
    
    
    
    @JsonProperty("store_ids")
    private List<Integer> storeIds;
    
    
    
    
}

/*
    Model: CancelJobResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CancelJobResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: UserDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class UserDetails {
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
}

/*
    Model: BadRequestObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestObject {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}




/*
    Model: AddProxyReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProxyReq {
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
    
}

/*
    Model: AddProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AddProxyResponse {
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("attached_path")
    private String attachedPath;
    
    
    
    
    @JsonProperty("proxy_url")
    private String proxyUrl;
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
}

/*
    Model: APIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class APIError {
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: RemoveProxyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RemoveProxyResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
}




/*
    Model: EventConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfig {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
}

/*
    Model: EventConfigList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigList {
    
    
    
    
    @JsonProperty("items")
    private List<EventConfig> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EventConfigResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigResponse {
    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfig> eventConfigs;
    
    
    
    
}

/*
    Model: SubscriberConfigList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfigList {
    
    
    
    
    @JsonProperty("items")
    private List<SubscriberResponse> items;
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
}

/*
    Model: EventProcessedStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventProcessedStatus {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private String subscriberId;
    
    
    
    
    @JsonProperty("attempt")
    private Integer attempt;
    
    
    
    
    @JsonProperty("response_code")
    private String responseCode;
    
    
    
    
    @JsonProperty("response_message")
    private String responseMessage;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("processed_on")
    private String processedOn;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: EventPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventPayload {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("event_trace_id")
    private String eventTraceId;
    
    
    
    
    @JsonProperty("message_id")
    private String messageId;
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
    
}

/*
    Model: SubscriberConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberConfig {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("status")
    private SubscriberStatus status;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    @JsonProperty("event_id")
    private List<Integer> eventId;
    
    
    
    
}

/*
    Model: SubscriberResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberResponse {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("webhook_url")
    private String webhookUrl;
    
    
    
    
    @JsonProperty("association")
    private Association association;
    
    
    
    
    @JsonProperty("custom_headers")
    private Object customHeaders;
    
    
    
    
    @JsonProperty("email_id")
    private String emailId;
    
    
    
    
    @JsonProperty("status")
    private SubscriberStatus status;
    
    
    
    
    @JsonProperty("auth_meta")
    private AuthMeta authMeta;
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    @JsonProperty("updated_on")
    private String updatedOn;
    
    
    
    
    @JsonProperty("event_configs")
    private List<EventConfig> eventConfigs;
    
    
    
    
}

/*
    Model: SubscriberEvent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SubscriberEvent {
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    @JsonProperty("subscriber_id")
    private Integer subscriberId;
    
    
    
    
    @JsonProperty("event_id")
    private Integer eventId;
    
    
    
    
    @JsonProperty("created_date")
    private String createdDate;
    
    
    
    
}

/*
    Model: AuthMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class AuthMeta {
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
}

/*
    Model: Association
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Association {
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    @JsonProperty("application_id")
    private List<String> applicationId;
    
    
    
    
    @JsonProperty("extension_id")
    private String extensionId;
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
}

/*
    Model: EventConfigBase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EventConfigBase {
    
    
    
    
    @JsonProperty("event_name")
    private String eventName;
    
    
    
    
    @JsonProperty("event_type")
    private String eventType;
    
    
    
    
    @JsonProperty("event_category")
    private String eventCategory;
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
}


    
    /*
        Enum: SubscriberStatus
        Used By: Webhook
    */
    @Getter
    public enum SubscriberStatus {

        
        active("active"), 
        
        inactive("inactive"), 
        
        blocked("blocked");
        

        private String priority;
        SubscriberStatus(String priority) {
            this.priority = priority;
        }
    }




/*
    Model: RequestBodyAuditLog
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class RequestBodyAuditLog {
    
    
    
    
    @JsonProperty("log_meta")
    private LogMetaObj logMeta;
    
    
    
    
    @JsonProperty("log_payload")
    private Object logPayload;
    
    
    
    
}

/*
    Model: CreateLogResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class CreateLogResponse {
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("internal_message")
    private String internalMessage;
    
    
    
    
}

/*
    Model: LogMetaObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogMetaObj {
    
    
    
    
    @JsonProperty("modifier")
    private Object modifier;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("entity")
    private EntityObject entity;
    
    
    
    
    @JsonProperty("device_info")
    private Object deviceInfo;
    
    
    
    
    @JsonProperty("location")
    private Object location;
    
    
    
    
}

/*
    Model: EntityObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityObject {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
}

/*
    Model: LogSchemaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogSchemaResponse {
    
    
    
    
    @JsonProperty("docs")
    private List<LogDocs> docs;
    
    
    
    
}

/*
    Model: LogDocs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class LogDocs {
    
    
    
    
    @JsonProperty("entity")
    private EntityObj entity;
    
    
    
    
    @JsonProperty("modifier")
    private Modifier modifier;
    
    
    
    
    @JsonProperty("device_info")
    private DeviceInfo deviceInfo;
    
    
    
    
    @JsonProperty("location")
    private Location location;
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    @JsonProperty("company")
    private String company;
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    @JsonProperty("sessions")
    private String sessions;
    
    
    
    
    @JsonProperty("date")
    private String date;
    
    
    
    
    @JsonProperty("logs")
    private Object logs;
    
    
    
    
}

/*
    Model: EntityObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityObj {
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    @JsonProperty("entity_details")
    private Object entityDetails;
    
    
    
    
}

/*
    Model: Modifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Modifier {
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    @JsonProperty("as_administrator")
    private Boolean asAdministrator;
    
    
    
    
    @JsonProperty("user_details")
    private Object userDetails;
    
    
    
    
}

/*
    Model: DeviceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DeviceInfo {
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
}

/*
    Model: Location
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class Location {
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
}

/*
    Model: EntityTypesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityTypesResponse {
    
    
    
    
    @JsonProperty("items")
    private List<EntityTypeObj> items;
    
    
    
    
}

/*
    Model: EntityTypeObj
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class EntityTypeObj {
    
    
    
    
    @JsonProperty("entity_value")
    private String entityValue;
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
}




/*
    Model: GenerateBulkInvoiceLabelShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkInvoiceLabelShipment {
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
}

/*
    Model: GenerateBulkInvoiceOrLabelUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkInvoiceOrLabelUrl {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("batch_id")
    private Double batchId;
    
    
    
    
}

/*
    Model: DocumentType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class DocumentType {
    
    
    
    
    @JsonProperty("invoice")
    private String invoice;
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
}

/*
    Model: BulkListBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListBadRequestResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: BulkListFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkListFailedResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: SuccessResponseGenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseGenerateBulkShipment {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("job_id")
    private Double jobId;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
}

/*
    Model: SuccessResponseBulkStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseBulkStatus {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    @JsonProperty("trace_id")
    private String traceId;
    
    
    
    
}

/*
    Model: GenerateBulkUrlSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkUrlSuccessResponse {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
    
}

/*
    Model: InternalErrorResponseGenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulkShipment {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: BadRequestResponseGenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkUrl {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
}

/*
    Model: InternalErrorResponseGenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulkUrl {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: GenerateBulkShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkShipment {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
}

/*
    Model: GenerateBulkUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkUrl {
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
}

/*
    Model: GetBulkStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GetBulkStatusRequest {
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
}

/*
    Model: BadRequestResponseGenerateBulkItemParameters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkItemParameters {
    
    
    
    
    @JsonProperty("missing_property")
    private String missingProperty;
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
}

/*
    Model: BadRequestResponseGenerateBulkItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulkItem {
    
    
    
    
    @JsonProperty("keyword")
    private String keyword;
    
    
    
    
    @JsonProperty("data_path")
    private String dataPath;
    
    
    
    
    @JsonProperty("schema_path")
    private String schemaPath;
    
    
    
    
    @JsonProperty("parameters")
    private BadRequestResponseGenerateBulkItemParameters parameters;
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
}

/*
    Model: SuccessResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SuccessResponseGenerateBulk {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
}

/*
    Model: BadRequestResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BadRequestResponseGenerateBulk {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private List<BadRequestResponseGenerateBulkItem> errorMessage;
    
    
    
    
}

/*
    Model: InternalErrorResponseGenerateBulk
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InternalErrorResponseGenerateBulk {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
}

/*
    Model: ShippingToAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ShippingToAddress {
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
}

/*
    Model: SellerAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SellerAddress {
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
}

/*
    Model: BoxDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BoxDetails {
    
    
    
    
    @JsonProperty("box_id")
    private String boxId;
    
    
    
    
    @JsonProperty("total_quantity")
    private String totalQuantity;
    
    
    
    
    @JsonProperty("package_count")
    private String packageCount;
    
    
    
    
    @JsonProperty("dimension")
    private String dimension;
    
    
    
    
    @JsonProperty("weight")
    private String weight;
    
    
    
    
}

/*
    Model: GenerateBulkBoxLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkBoxLabel {
    
    
    
    
    @JsonProperty("stock_transfer_id")
    private String stockTransferId;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("box_details")
    private List<BoxDetails> boxDetails;
    
    
    
    
}

/*
    Model: GenerateBulkShipmentLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkShipmentLabel {
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentDetails> shipments;
    
    
    
    
}

/*
    Model: GenerateNoc
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateNoc {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("seller_gstin")
    private String sellerGstin;
    
    
    
    
    @JsonProperty("fc_gstin")
    private String fcGstin;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("fc_address")
    private SellerAddress fcAddress;
    
    
    
    
    @JsonProperty("seller_address")
    private SellerAddress sellerAddress;
    
    
    
    
}

/*
    Model: PackageDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageDetails {
    
    
    
    
    @JsonProperty("package_id")
    private String packageId;
    
    
    
    
    @JsonProperty("item_quantity")
    private String itemQuantity;
    
    
    
    
    @JsonProperty("package_type")
    private String packageType;
    
    
    
    
    @JsonProperty("packaging_type")
    private String packagingType;
    
    
    
    
    @JsonProperty("dimension")
    private String dimension;
    
    
    
    
    @JsonProperty("weight")
    private String weight;
    
    
    
    
}

/*
    Model: PackageItemDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class PackageItemDetails {
    
    
    
    
    @JsonProperty("jio_code")
    private String jioCode;
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    @JsonProperty("mrp")
    private String mrp;
    
    
    
    
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    
    
    
    
    @JsonProperty("best_before_date")
    private String bestBeforeDate;
    
    
    
    
    @JsonProperty("ean")
    private String ean;
    
    
    
    
    @JsonProperty("package_details")
    private List<PackageDetails> packageDetails;
    
    
    
    
}

/*
    Model: GenerateBulkPackageLabel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateBulkPackageLabel {
    
    
    
    
    @JsonProperty("stock_transfer_id")
    private String stockTransferId;
    
    
    
    
    @JsonProperty("label_type")
    private String labelType;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("seller_name")
    private String sellerName;
    
    
    
    
    @JsonProperty("template_id")
    private Double templateId;
    
    
    
    
    @JsonProperty("item_details")
    private List<PackageItemDetails> itemDetails;
    
    
    
    
}

/*
    Model: SignedSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedSuccessResponse {
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
}

/*
    Model: BulkPresignedSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class BulkPresignedSuccessResponse {
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    @JsonProperty("batch_id")
    private String batchId;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
    
    @JsonProperty("presigned_url")
    private String presignedUrl;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
}

/*
    Model: SignedBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedBadRequestResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
}

/*
    Model: SignedFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class SignedFailedResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
}

/*
    Model: StatusSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusSuccessResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
}

/*
    Model: StatusBadRequestResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusBadRequestResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
}

/*
    Model: StatusFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class StatusFailedResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
}

/*
    Model: GenerateManifest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateManifest {
    
    
    
    
    @JsonProperty("store_id")
    private Double storeId;
    
    
    
    
    @JsonProperty("from_date")
    private String fromDate;
    
    
    
    
    @JsonProperty("to_date")
    private String toDate;
    
    
    
    
    @JsonProperty("shipment_ids")
    private List<String> shipmentIds;
    
    
    
    
}

/*
    Model: GeneratePresignedManifestUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GeneratePresignedManifestUrl {
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
}

/*
    Model: ManifestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestLink {
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
}

/*
    Model: GenerateManifestUrlSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class GenerateManifestUrlSuccessResponse {
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    @JsonProperty("manifest_id")
    private String manifestId;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
    @JsonProperty("presigned_type")
    private String presignedType;
    
    
    
    
}

/*
    Model: ManifestListFailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class ManifestListFailedResponse {
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
    
}

/*
    Model: InvoiceLabelPresignedRequestBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public static class InvoiceLabelPresignedRequestBody {
    
    
    
    
    @JsonProperty("document_type")
    private String documentType;
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    @JsonProperty("expires_in")
    private Double expiresIn;
    
    
    
    
}



}