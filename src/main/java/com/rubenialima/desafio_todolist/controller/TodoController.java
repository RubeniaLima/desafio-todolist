package com.rubenialima.desafio_todolist.controller;

import com.rubenialima.desafio_todolist.entity.Todo;
import com.rubenialima.desafio_todolist.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
@RequestMapping("/todos")
@RestController
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    ResponseEntity<List<Todo>> create(@Valid @RequestBody Todo todo){
        return ResponseEntity.status(HttpStatus.CREATED).body(todoService.create(todo));
    }

    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }

    @PutMapping("{id}")
    List<Todo> update(@PathVariable Long id, @RequestBody Todo todo){
        return todoService.update(id,todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id")  Long id){
        return todoService.delete(id);
    }
}
