package com.todoApp.controller;

import com.todoApp.business.TodoService;
import com.todoApp.business.requests.CreateTodoRequest;
import com.todoApp.business.requests.UpdateTodoRequest;
import com.todoApp.business.responses.GetAllTodoResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/getAll")
    public List<GetAllTodoResponse> getAll(){
        return  todoService.getAll();

    }

    @PostMapping("/add")
    public void add(@RequestBody CreateTodoRequest createTodoRequest){
        this.todoService.add(createTodoRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateTodoRequest updateTodoRequest){
        this.todoService.update(updateTodoRequest);
    }






}
