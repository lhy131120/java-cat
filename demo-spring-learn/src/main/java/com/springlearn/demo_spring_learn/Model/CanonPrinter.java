package com.springlearn.demo_spring_learn.Model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CanonPrinter implements Printer{

  @Override
  public void print(String message) {
    System.out.println("Canon Printer!" + message);
  }
}
