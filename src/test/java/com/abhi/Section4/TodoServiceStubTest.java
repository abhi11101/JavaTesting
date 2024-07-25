package com.abhi.Section4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceStubTest {

    @Test
    void test(){

        TodoService todoServiceStub = new TodoServiceStub();

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoServiceStub);

        List<String> filteredTodos = todoServiceImpl.retrieveTodosRelatedToSpring("Goku");

        assertEquals(2, filteredTodos.size());
    }

}