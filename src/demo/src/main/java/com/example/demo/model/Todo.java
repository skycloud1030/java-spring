package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name = "todos")
@Data
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @NotNull
  private String title;

  @NotNull
  private String message;
}
