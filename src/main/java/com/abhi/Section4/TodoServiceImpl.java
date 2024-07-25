package com.abhi.Section4;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl {

    private TodoService todoService;

    public TodoServiceImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){

        List<String> filteredTodos = new ArrayList<>();
        List<String> todoFetched = todoService.retrieveTodos(user);

        todoFetched.forEach(todo -> {
            if (todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        } );

        return filteredTodos;
    }
}
