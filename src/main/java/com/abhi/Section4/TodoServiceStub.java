package com.abhi.Section4;

import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return List.of("Learn Spring MVC","Learn Spring","Learn to Dance");
    }
}
