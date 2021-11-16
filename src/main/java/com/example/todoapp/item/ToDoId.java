package com.example.todoapp.item;

import lombok.Value;

@Value(staticConstructor = "from")
public class ToDoId {
    String value;
}
