package com.sdk.common.model;

public class FDKException extends Exception {

  public FDKException(String message) {
    super(message);
  }

  public FDKException(String message, Throwable cause) {
    super(message, cause);
  }
}
