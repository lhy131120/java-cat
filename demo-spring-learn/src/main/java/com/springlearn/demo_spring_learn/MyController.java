package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @RequestMapping("/test")
  public String test1(@RequestParam (name="testid") Integer id,
                      @RequestParam (required = false) String name,
                      @RequestParam(defaultValue = "false") Boolean attr) {
    System.out.println("id: " + id);
    System.out.println("name: " + name);
    System.out.println("attr: " + attr);
    return "parameter: " + id + ", name: " + name + ", attr: " + attr;
  }
}
