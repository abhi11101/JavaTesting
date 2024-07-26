package com.abhi.Section6;

import com.abhi.Section4.TodoService;
import com.abhi.Section4.TodoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoAnnotationsTest {

    @Mock
    TodoService todoService;

    @InjectMocks
    TodoServiceImpl todoServiceImpl;

    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRetrieveTodoRelatedToSpring(){

        when(todoService.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        List<String> filteredTodo = todoServiceImpl.retrieveTodosRelatedToSpring("Goku");

        assertEquals(filteredTodo.size(), 2);

    }

    @Test
    void testArgumentCaptor(){

        when(todoService.retrieveTodos("Goku")).thenReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        todoServiceImpl.deleteTodosNotRelatedToSpring("Goku");

        verify(todoService).deleteTodo(stringArgumentCaptor.capture());

        assertEquals(stringArgumentCaptor.getValue(), "Learn to Dance");
    }
}
