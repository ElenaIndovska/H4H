package h4h.springboot.postgresexample.controller;

import h4h.springboot.postgresexample.model.Student;
import h4h.springboot.postgresexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try{
            return studentService.getStudents();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Connection timeout");
        }
        return students;
    }

    @PostMapping("/students")
    @Transactional(propagation = Propagation.SUPPORTS)
    public @ResponseBody
    Student save(@RequestBody Student student){
        Student student1 = new Student();
        try{
            return studentService.save(student);
        }catch(Exception e){
            e.printStackTrace();
        }
        return student1;
    }

    @DeleteMapping("/students/{id}")
    public @ResponseBody
    void findById(@PathVariable long id){
        try{
            studentService.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
