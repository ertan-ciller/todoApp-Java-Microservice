package com.todoApp.business;

import com.todoApp.Entities.TodoModel;
import com.todoApp.business.requests.CreateTodoRequest;
import com.todoApp.business.requests.UpdateTodoRequest;
import com.todoApp.business.responses.GetAllTodoResponse;
import com.todoApp.core.mapper.MapperService;
import com.todoApp.dataAccess.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TodoManager implements TodoService{

    private TodoRepository todoRepository;
    private MapperService modelMapperService;
    @Override
    public List<GetAllTodoResponse> getAll() {

        List<TodoModel> todoModels = todoRepository.findAll();

        List<GetAllTodoResponse> todoResponse = todoModels.stream()
                .map(todoModel -> this.modelMapperService.forResponse()
                        .map(todoModel,GetAllTodoResponse.class)).collect(Collectors.toList());
        return todoResponse;
    }

    @Override
    public void add(CreateTodoRequest createTodoRequest) {

        TodoModel todoModel = this.modelMapperService.forRequest().map(createTodoRequest,TodoModel.class);
        this.todoRepository.save(todoModel);

    }

    @Override
    public void update(UpdateTodoRequest updateTodoRequest) {

        TodoModel todoModel = this.modelMapperService.forRequest().map(updateTodoRequest, TodoModel.class);
        this.todoRepository.save(todoModel);

    }
}
