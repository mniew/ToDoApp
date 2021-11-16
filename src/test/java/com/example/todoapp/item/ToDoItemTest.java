package com.example.todoapp.item;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;


class ToDoItemTest {

    @Test
    void givenNullName_whenCreatingToDoItem_shouldThrowException() {
        // given
        ToDoId id = ToDoId.from("to-do-id");
        ToDoName name = null;

        //when
        var exception = catchThrowable(() -> ToDoItem.from(id, name));

        //then
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Name should not be null");


    }

    @Test
    void givenNullID_whenCreatingToDoItem_shouldThrowException() {
        // given
        ToDoId id = null;
        ToDoName name = ToDoName.from("to-do-id");

        //when
        var exception = catchThrowable(() -> ToDoItem.from(id, name));

        //then
        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Id should not be null");

    }

//    @Test
//    void givenNullID_whenCreatingToDoItem_shouldThrowException() {
//        // given
//        ToDoId id = null;
//        ToDoName name = ToDoName.from("to-do-id");
//
//        //when
//        var exception = catchThrowable(() -> ToDoItem.from(id, name));
//
//        //then
//        assertThat(exception)
//                .isInstanceOf(Legal.class)
//                .hasMessage("Id should not be null");
//
//    }
}
