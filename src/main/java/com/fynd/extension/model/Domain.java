package com.fynd.extension.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Domain {
    @JsonProperty("verified")
    Boolean verified;

    @JsonProperty("name")
    String Name;
}
