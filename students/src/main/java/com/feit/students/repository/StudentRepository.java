package com.feit.students.repository;

import com.feit.students.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {


    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(Student.builder().name("Student").surname("Student").id(Integer.parseInt("1")).build());
        students.add(Student.builder().name("Student").surname("Student").id(Integer.parseInt("2")).build());
        students.add(Student.builder().name("Student").surname("Student").id(Integer.parseInt("3")).build());

        return students;
    }

    public Student postStudents(Student student){
        return student;
    }

    public Student putStudents(String name, String surname, int id){
        return Student.builder().name(name).surname(surname).id(id).build();
    }

    public String deleteStudents(int id){
        return String.format("Student with id %d was deleted", id);
    }





}
