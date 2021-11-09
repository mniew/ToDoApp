package com.example.TODO_APP.TODO_APP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotations built into the spring framework
public class mainView {

    @RequestMapping
    public String getTasks() {
        return "tasks ";
    }
}
