package com.feit.students.service;

import com.feit.students.model.Student;
import com.feit.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public List<Student> getStudents(){
        return studentRepository.getStudents();
    }

    public Student postStudents(Student student){
        return studentRepository.postStudents(student);
    }

    public Student putStudents(String name, String surname, int id){
        return studentRepository.putStudents(name, surname, id);
    }

    public String deleteStudents(int id){
        return studentRepository.deleteStudents(id);
    }

}
