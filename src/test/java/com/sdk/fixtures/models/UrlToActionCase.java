package com.sdk.fixtures.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UrlToActionCase<T> {
    @JsonProperty("name")
    String name;
    @JsonProperty("path")
    String path;
    @JsonProperty("result")
    ActionResult<T> result;
}
