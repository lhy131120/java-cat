package com.springlearn.demo_spring_learn;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
  @NotNull
  Integer id;

  @NotBlank
  String name;

}
