package com.sdk.fixtures.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionToUrlCase<T> {
    @JsonProperty("name")
    String name;

    @JsonProperty("action")
    T action;

    @JsonProperty("result")
    UrlResult result;
}
