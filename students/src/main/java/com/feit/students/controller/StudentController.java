package com.feit.students.controller;

import com.feit.students.model.Student;
import com.feit.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public @ResponseBody
    List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public @ResponseBody
    Student postStudents(@RequestBody Student student){
        return studentService.postStudents(student);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    Student putStudents(@RequestBody String name, String surname, @PathVariable int id){
        return studentService.putStudents(name, surname, id);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteStudents(@PathVariable int id){
        return studentService.deleteStudents(id);
    }

}
