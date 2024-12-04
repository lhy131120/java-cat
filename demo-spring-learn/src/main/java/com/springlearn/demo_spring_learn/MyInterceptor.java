package com.springlearn.demo_spring_learn;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {
  @SuppressWarnings("null")
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

    if(request == null || response == null || handler == null) throw new NullPointerException("Request, Response, or Handler is null");
    System.out.println("Run PreHandle Method");
    // response.setStatus(401);
    // return false; // blocked http response
    return true;  // allow http response
  }
}
