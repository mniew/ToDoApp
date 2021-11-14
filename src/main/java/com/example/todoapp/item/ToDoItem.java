package com.example.todoapp.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ToDoItem {
    private final ToDoId id;
    private ToDoName name;
    private boolean completed;

    // Factory method (static)
    static ToDoItem from(ToDoId id, ToDoName name) {
        return new ToDoItem(id, name, false);
    }

    public void rename(ToDoName newName) {
        this.name = newName;
    }

    public void complete() {
        completed = true;
    }

    public void uncomplete() {
        completed = false;
    }
}
