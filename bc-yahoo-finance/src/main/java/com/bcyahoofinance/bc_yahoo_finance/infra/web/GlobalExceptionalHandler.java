package com.bcyahoofinance.bc_yahoo_finance.infra.web;

import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


public class GlobalExceptionalHandler {
  @ExceptionHandler({BusinessException.class})
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResp<Void> businessException(BusinessException e) {
    return ApiResp.<Void>builder()//
        .fail(e)//
        .build();
  }

  public ApiResp<Object> unhandledExceptionHandler(Exception e) {
    return ApiResp.<Object>builder()//
        .fail(e)//
        .data(new ArrayList<>()).build();
  }
}
