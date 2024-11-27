package com.springlearn.demo_spring_learn;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @RequestMapping("/product")
  public Store product() {
    Store store = new Store();
    List<String> list = new ArrayList<>();
    list.add("Item1");
    list.add("Item2");
    store.setProductList(list);
    
    return store;
  }

  @RequestMapping("/users")
  public Student user() {
    Student student = new Student();
    student.setName("Judy");
    student.setId(1024);
    return student;
  }
}
