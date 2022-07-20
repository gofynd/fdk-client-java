package com.sdk.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessTokenDto {

    @JsonProperty("access_token")
    String token;

    @JsonProperty("access_mode")
    String accessMode;

    @JsonProperty("current_user")
    String currentUser;

    @JsonProperty("expires")
    String expires; //TODO::Check the type here and change

    @JsonProperty("refresh_token")
    String refreshToken;

    @JsonProperty("access_token_validity")
    String accessTokenValidity; //TODO::Check the type here and change

    @JsonProperty("expires_in")
    Long expiresIn;
}
