package com.example.TODO_APP.TODO_APP.repository;

import com.example.TODO_APP.TODO_APP.item.ToDoItem;
import java.util.List;

public interface todoBase {
    List<ToDoItem> findAll();

    ToDoItem findById(Long id);

    Long insert(ToDoItem toDoItem);

    void update(ToDoItem toDoItem);

    void delete(ToDoItem toDoItem);
}
