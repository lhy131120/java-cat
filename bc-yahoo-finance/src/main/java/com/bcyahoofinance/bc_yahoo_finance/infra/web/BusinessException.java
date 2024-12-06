package com.bcyahoofinance.bc_yahoo_finance.infra.web;

public class BusinessException extends RuntimeException{
  private int code;

  public BusinessException(ErrorCode errorCode) {
    super(errorCode.getMessage());
    this.code = errorCode.getCode();
  }

  public BusinessException(ErrorCode errorCode, String message) {
    super(message);
    this.code = errorCode.getCode();
  }

  public int getCode() {
    return this.code;
  }
}
