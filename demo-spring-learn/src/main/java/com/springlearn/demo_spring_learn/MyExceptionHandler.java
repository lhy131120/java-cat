package com.springlearn.demo_spring_learn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class MyExceptionHandler {

  /*
   * @ExceptionHandler的Exception類型與 handle method的parameter must SAME
   */

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<String> handle(RuntimeException exception) {

    // 建立自定義返回的http response
    return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
        .body("RunTimeException " + exception.getMessage());
  }

  /*
   * Special Exception: IllegalArgumentExce
   */
  @ExceptionHandler(IllegalArgumentException.class)
  public ResponseEntity<String> handle(IllegalArgumentException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST) // BAD_REQUEST: 400
        .body("IllegalArgumentException " + e.getMessage());
  }

  /*
   * NoResourceFoundException with HTML Code on ResponseBody
   */
  @ExceptionHandler(NoResourceFoundException.class)
  public ResponseEntity<String> handle(NoResourceFoundException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)//
        .body("<h2>NoResourceFoundException " + e.getMessage() +"</h2>");
  }
}
