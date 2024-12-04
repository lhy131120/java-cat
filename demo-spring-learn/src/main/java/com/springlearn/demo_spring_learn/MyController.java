package com.springlearn.demo_spring_learn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("/test")
  public ResponseEntity<String> test() {

    return ResponseEntity.status(HttpStatus.OK)//
        .header("Custom-Header", "Value")//
        .body("Example created");
  }

  @DeleteMapping("/test/delete/{id}")
  public ResponseEntity<Void> delete(@PathVariable long id) {
    boolean deleted = true; 
    if (deleted) {
        return ResponseEntity.noContent().build(); // HTTP 204 No Content
    } else {
        return ResponseEntity.notFound().build(); // HTTP 404 Not Found
    }
  }

  @GetMapping("/info")
  public ResponseEntity<Map<String, Object>> getInfo() {
    Map<String, Object> response = new HashMap<>();
    response.put("status", "success");
    response.put("timestamp", System.currentTimeMillis());
    response.put("data", List.of("item1", "item2"));

    return ResponseEntity.ok(response);
  }


}
