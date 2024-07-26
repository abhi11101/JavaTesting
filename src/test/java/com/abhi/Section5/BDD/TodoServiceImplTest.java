package com.abhi.Section5.BDD;

import com.abhi.Section4.TodoService;
import com.abhi.Section4.TodoServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoServiceImplTest {


    @Test
    void testRetrieveTodosRelatedToSpringUsingBDD(){

        // Given

        TodoService todoService = mock(TodoService.class);

        given(todoService.retrieveTodos("Goku")).willReturn(List.of("Learn Spring MVC","Learn Spring","Learn to Dance"));

        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoService);


        // When

        List<String> filteredTodos = todoServiceImpl.retrieveTodosRelatedToSpring("Goku");

        // Then

        assertThat(filteredTodos.size(),is(2));

    }
}
