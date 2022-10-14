package com.feit.students.model;


import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String surname;
    private int id;

}
