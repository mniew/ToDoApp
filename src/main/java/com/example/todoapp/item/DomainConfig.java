package com.example.todoapp.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class DomainConfig {

    @Bean
    ToDoItemIdProvider toDoItemIdProvider() {
        return () -> ToDoId.from(UUID.randomUUID().toString());
    }

    @Bean
    ToDoItemFactory toDoItemFactory(ToDoItemIdProvider toDoItemIdProvider) {
        return new ToDoItemFactory(toDoItemIdProvider);
    }
}
