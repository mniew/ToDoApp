package com.example.todoapp.application;

import com.example.todoapp.item.ToDoItemFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    ToDoService toDoService(ToDoItemFactory toDoItemFactory) {
        return new ToDoService(toDoItemFactory);
    }
}
