package com.sdk.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FDKException extends Exception {

  private int responseCode;
  private String responseBody;
  private String responseHeaders;
  private String requestUrl;
  private String requestBody;

  private String requestHeaders;

  private String requestMethod;

  public FDKException() {
    super();
  }

  public FDKException(String message) {
    super(message);
  }

  public FDKException(String message, Throwable cause) {
    super(message, cause);
  }

  public FDKException(int responseCode, String responseBody, String responseHeaders,
      String requestMethod, String requestUrl, String requestBody, String requestHeaders) {
    this.responseCode = responseCode;
    this.responseBody = responseBody;
    this.responseHeaders = responseHeaders;
    this.requestMethod = requestMethod;
    this.requestUrl = requestUrl;
    this.requestBody = requestBody;
    this.requestHeaders = requestHeaders;
  }

}
