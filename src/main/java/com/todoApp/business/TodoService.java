package com.todoApp.business;

import com.todoApp.business.requests.CreateTodoRequest;
import com.todoApp.business.requests.UpdateTodoRequest;
import com.todoApp.business.responses.GetAllTodoResponse;

import java.util.List;

public interface TodoService {

    List<GetAllTodoResponse> getAll();
    void add(CreateTodoRequest createTodoRequest);
    void update(UpdateTodoRequest updateTodoRequest);





}
