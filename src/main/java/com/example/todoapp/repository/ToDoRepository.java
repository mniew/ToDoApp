package com.example.todoapp.repository;

import com.example.todoapp.item.ToDoId;
import com.example.todoapp.item.ToDoItem;

import java.util.List;

public interface ToDoRepository {
    List<ToDoItem> findAll();

    ToDoItem findById(ToDoId id);

    ToDoId insert(ToDoItem toDoItem);

    void update(ToDoItem toDoItem);

    void delete(ToDoItem toDoItem);
}
