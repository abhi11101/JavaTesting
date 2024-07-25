package com.abhi.Section4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoServiceMockTest {

    @Test
    void test(){

        TodoService todoServiceMock = mock(TodoService.class);

        when(todoServiceMock.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoServiceMock);

        List<String> filteredTodos = todoServiceImpl.retrieveTodosRelatedToSpring("Goku");

        assertEquals(2, filteredTodos.size());
    }

}
