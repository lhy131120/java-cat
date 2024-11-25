package com.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springlearn.demo_spring_learn.Model.HpPrinter;
import com.springlearn.demo_spring_learn.Model.Printer;

@Configuration
public class MyConfiguration {
  
  @Bean
  public Printer myPrinter() {
    return new HpPrinter();
  }
}
