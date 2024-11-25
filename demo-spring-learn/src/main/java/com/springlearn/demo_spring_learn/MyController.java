package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class MyController {
  
  @RequestMapping("/test")
  public String test() {
    System.out.println("Start");
    return "My Controller test !!!";
  }
  
}
