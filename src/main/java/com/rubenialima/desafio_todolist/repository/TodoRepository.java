package com.rubenialima.desafio_todolist.repository;

import com.rubenialima.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long>{
}
