package com.example.todoapp.controller;

import com.example.todoapp.application.ToDoService;
import com.example.todoapp.item.ToDoName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotations built into the spring framework
public class MainController {

    ToDoService toDoService;

    @GetMapping
    public String getTasks() {
        return "tasks";
    }

    @PostMapping("/todos")
    public String createToDo(String toDoName) {
        return toDoService.createNew(ToDoName.from(toDoName))
                .getId()
                .getValue();
    }
}
