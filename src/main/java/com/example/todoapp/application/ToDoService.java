package com.example.todoapp.application;

import com.example.todoapp.item.ToDoItem;
import com.example.todoapp.item.ToDoItemFactory;
import com.example.todoapp.item.ToDoName;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ToDoService {

    private final ToDoItemFactory toDoItemFactory;

    public ToDoItem createNew(ToDoName name) {
        return toDoItemFactory.create(name);
    }
}
