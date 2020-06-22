package com.example.demo;

import com.example.demo.entity.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
  Optional<Todo> findById(int id);
}
