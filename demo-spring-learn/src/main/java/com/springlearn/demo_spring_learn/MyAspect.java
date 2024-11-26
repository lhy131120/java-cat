package com.springlearn.demo_spring_learn;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

  @Before("execution(* com.springlearn.demo_spring_learn.Model.HpPrinter.*(..))")
  public void before() {
    System.out.println("I'm Before @Aspect");
  }
}
