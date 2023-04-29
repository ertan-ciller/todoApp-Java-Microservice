package com.todoApp.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "todoModel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TodoModel {

    // Öncesinde db yi oluşturmak gerekiyor. Bunu anlamış olduk.
    //Artık diğer komutları oluşturup swagger ile kontrok sağlamaya çalışacağım.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "todoName")
    private String todoName;

    @Column(name = "todoDate")
    private Date todoDate;

    @Column(name = "isComplated")
    private boolean isComplated;

}
