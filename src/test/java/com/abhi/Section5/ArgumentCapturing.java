package com.abhi.Section5;

import com.abhi.Section4.TodoService;
import com.abhi.Section4.TodoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ArgumentCapturing {


    @Test
    void testDeleteTodoNotRelatedToSpring(){

        // Declare Argument Captor

        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

        // Define Argument Captor on specific method call
        // Captor the argument


        TodoService todoService = mock(TodoService.class);

        when(todoService.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoService);

        todoServiceImpl.deleteTodosNotRelatedToSpring("Goku");

        verify(todoService).deleteTodo(stringArgumentCaptor.capture());

        assertEquals(stringArgumentCaptor.getValue(), "Learn to Dance");

    }

    @Test
    void testArgumentCaptorMultiple(){

        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

        TodoService todoService = mock(TodoService.class);

        when(todoService.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring","Learn Rock and Roll","Learn to Dance"));

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoService);

        todoServiceImpl.deleteTodosNotRelatedToSpring("Goku");

        verify(todoService,times(2)).deleteTodo(stringArgumentCaptor.capture());

        assertEquals(stringArgumentCaptor.getAllValues().size(),2);

    }
}
