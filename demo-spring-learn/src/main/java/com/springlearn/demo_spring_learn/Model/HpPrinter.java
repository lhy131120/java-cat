package com.springlearn.demo_spring_learn.Model;

import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{

  @Override
  public void print(String message) {
    System.out.println("HP Printer: " + message);
  }
}
