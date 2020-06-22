package com.example.demo;

import com.example.demo.entity.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoController {
  
  @Autowired
  private TodoRepository todoRepository;

  @GetMapping("/todo/{id}")
  public Optional<Todo> getTodoPK(@PathVariable("id") int id) {
    return todoRepository.findById(id);
  }


  @GetMapping("/todo")
  public List<Todo> getTodoList() {
      return todoRepository.findAll();
  }

  @PostMapping("/todo")
  public Todo AddTodo(@RequestBody Todo todo) {
    Todo saved = todoRepository.save(todo);
    return saved;
  }
}
