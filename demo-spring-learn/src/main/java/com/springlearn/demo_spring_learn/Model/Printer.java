package com.springlearn.demo_spring_learn.Model;

import org.springframework.stereotype.Component;

@Component
public interface Printer {

  void print(String message);
}
