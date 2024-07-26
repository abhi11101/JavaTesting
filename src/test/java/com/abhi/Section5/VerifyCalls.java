package com.abhi.Section5;

import com.abhi.Section4.TodoService;
import com.abhi.Section4.TodoServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class VerifyCalls {

    @Test
    void testDeleteTodosNotRelatedToSpring(){

        TodoService todoService = mock(TodoService.class);

        when(todoService.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoService);

        todoServiceImpl.deleteTodosNotRelatedToSpring("Goku");

        verify(todoService).deleteTodo("Learn to Dance");

        verify(todoService,never()).deleteTodo("Learn Spring");

        verify(todoService ,times(2)).deleteTodo("Learn to Dance");

    }
}
