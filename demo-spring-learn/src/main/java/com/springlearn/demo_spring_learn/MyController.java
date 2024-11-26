package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.RestController;
import com.springlearn.demo_spring_learn.Model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class MyController {

  @Autowired
  @Qualifier("canonPrinter")
  private Printer printer;
  
  @RequestMapping("/test")
  public String test() {
    printer.print("App Running...");
    return "Return App Run";
  }
}
