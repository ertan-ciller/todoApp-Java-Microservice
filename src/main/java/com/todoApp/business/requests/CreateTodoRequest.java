package com.todoApp.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTodoRequest {

 private String todoName;
 private Date todoDate;
 private Boolean isComplated;

}
