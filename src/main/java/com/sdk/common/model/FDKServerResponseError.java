package com.sdk.common.model;

import lombok.Getter;

@Getter
public class FDKServerResponseError extends Exception {

  private int responseCode;
  private String responseBody;
  private String responseHeaders;
  private String requestUrl;
  private String requestBody;
  private String requestHeaders;
  private String requestMethod;

  public FDKServerResponseError(int responseCode, String responseBody, String responseHeaders,
      String requestMethod, String requestUrl, String requestBody, String requestHeaders) {
    super(getMessage(responseCode, responseBody));
    this.responseCode = responseCode;
    this.responseBody = responseBody;
    this.responseHeaders = responseHeaders;
    this.requestMethod = requestMethod;
    this.requestUrl = requestUrl;
    this.requestBody = requestBody;
    this.requestHeaders = requestHeaders;
  }

  private static String getMessage(int responseCode, String responseBody) {
    return "HTTP responseCode: " + responseCode + " responseBody :"
        + responseBody;
  }

}
