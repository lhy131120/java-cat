package com.springlearn.demo_spring_learn.Model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{

  private int count;

  @PostConstruct
  public void customFunction() {
    count = 10;
  } 

  @Override
  public void print(String message) {
    count--;
    System.out.println("HP Printer!" + message);
    System.out.println("Count times: " + count);
  }
}
