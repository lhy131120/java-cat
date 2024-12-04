package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController3 {

  @RequestMapping("/controller3")
  public String controller3() {
    System.out.println("執行 controller3 方法");
    return "Return controller3";
  }

  @RequestMapping("/controller4")
  public String controller4() {
    System.out.println("執行 controller4 方法");
    return "Return controller4";
  }
}
