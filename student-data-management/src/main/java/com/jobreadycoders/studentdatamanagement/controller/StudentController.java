package com.jobreadycoders.studentdatamanagement.controller;

import com.jobreadycoders.studentdatamanagement.entity.Student;
import com.jobreadycoders.studentdatamanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("hello")
    public String helloSpring() {
        return "Hello this is a spring boot project.";
    }

    @PostMapping("save")
    public Student saveStudent(@RequestBody Student student) {
       return service.saveStudent(student);
    }

    @GetMapping("get/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
       return service.getStudent(id);
    }
}
