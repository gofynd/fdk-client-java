package com.sdk.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class AccessTokenDto {

    @JsonProperty("access_token")
    String accessToken;

    @JsonProperty("access_mode")
    String accessMode;

    @JsonProperty("current_user")
    Map<String, Object> currentUser;

    @JsonProperty("expires")
    String expires;

    @JsonProperty("refresh_token")
    String refreshToken;

    @JsonProperty("access_token_validity")
    Long accessTokenValidity;

    @JsonProperty("expires_in")
    Long expiresIn;

}