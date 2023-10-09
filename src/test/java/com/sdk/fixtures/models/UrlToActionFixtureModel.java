package com.sdk.fixtures.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UrlToActionFixtureModel<T> {
    @JsonProperty("tests")
    List<UrlToActionCase<T>> tests;
}

