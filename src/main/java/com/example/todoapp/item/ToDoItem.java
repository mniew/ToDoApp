package com.example.todoapp.item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ToDoItem {
    private final ToDoId id;
    private ToDoName name;
    private boolean completed;

    // Factory method (static)
    static ToDoItem from(ToDoId id, ToDoName name) {

        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }

        if (id == null) {
            throw new IllegalArgumentException("Id should not be null");
        }


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
