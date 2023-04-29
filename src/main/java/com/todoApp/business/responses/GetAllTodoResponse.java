package com.todoApp.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTodoResponse {

    private int id;
    private String todoName;
    private Date todoDate;
    private Boolean isComplated;

}
