package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

  @RequestMapping("/test2")
  public String test2() {
    throw new RuntimeException("Test2 Error");
  }

  @RequestMapping("/test3")
  public String test3() {
    throw new IllegalArgumentException("Customer Error Message");
  }
}
