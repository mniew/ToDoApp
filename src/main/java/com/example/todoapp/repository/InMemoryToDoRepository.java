package com.example.todoapp.repository;

import com.example.todoapp.item.ToDoId;
import com.example.todoapp.item.ToDoItem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class InMemoryToDoRepository implements ToDoRepository {
    private final ConcurrentMap<ToDoId, ToDoItem> toDos = new ConcurrentHashMap<>();

    @Override
    public List<ToDoItem> findAll() {
        List<ToDoItem> toDoItems = new ArrayList<>(toDos.values());
        //Collections.sort(toDoItems);
        return toDoItems;
    }

    @Override
    public ToDoItem findById(ToDoId id) {
        return toDos.get(id);
    }

    @Override
    public ToDoId insert(ToDoItem toDoItem) {
        toDos.putIfAbsent(toDoItem.getId(), toDoItem);
        return toDoItem.getId();
    }

    @Override
    public void update(ToDoItem toDoItem) {
        toDos.replace(toDoItem.getId(), toDoItem);
    }

    @Override
    public void delete(ToDoItem toDoItem) {
        toDos.remove(toDoItem.getId());
    }
}
