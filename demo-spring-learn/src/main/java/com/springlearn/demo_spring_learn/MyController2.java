package com.springlearn.demo_spring_learn;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

  @GetMapping("/test2/{id}")
  public ResponseEntity<String> test2(@PathVariable Long id) {
    // throw new RuntimeException();
    return ResponseEntity.status(HttpStatus.OK)//
        .header("321", "Value")//
        .body("Custom Body Message");
  }
}
