package com.springlearn.demo_spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer{

  @Autowired
  private MyInterceptor myInterceptor;

  @Override
  public void addInterceptors(@SuppressWarnings("null") InterceptorRegistry registry) {
    registry.addInterceptor(myInterceptor).addPathPatterns("/**");
  }
}
