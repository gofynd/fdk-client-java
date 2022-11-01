package com.sdk.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Date;
import java.util.List;

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

    @JsonProperty("id")
    String id;

    @JsonProperty("expire")
    Date expire;
    
    @JsonProperty("extension_Id")
    String extensionId;

    @JsonProperty("state")
    String state;

    private List<String> scope;

    @JsonProperty("expires_at")
    Long expiresAt;


}