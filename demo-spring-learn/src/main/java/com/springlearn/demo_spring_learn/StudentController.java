package com.springlearn.demo_spring_learn;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
public class StudentController {
  
  @PostMapping("/students")
  public String create(@RequestBody @Valid Student student) {
    return "Run PostMapping!!!!";
  }

  @GetMapping("/students/{studentId}")
  public String read(@PathVariable Integer studentId) {
    return "Run DB Read ACTION";
  }

  @PutMapping("/students/{studedtId}")
  public String update(@PathVariable Integer studentId,
      @RequestBody Student student, @RequestHeader String info) {
    return "Run DB update ACTION";
  }

  @DeleteMapping("/students/{studentId}")
  public String delete(@PathVariable Integer studentId) {
    return "Run DB Delete";
  }
}
