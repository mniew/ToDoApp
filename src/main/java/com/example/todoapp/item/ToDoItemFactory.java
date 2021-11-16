package com.example.todoapp.item;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ToDoItemFactory {
    private final ToDoItemIdProvider idProvider;

    public ToDoItem create(ToDoName name) {
        return ToDoItem.from(idProvider.newId(), name);
    }

}
