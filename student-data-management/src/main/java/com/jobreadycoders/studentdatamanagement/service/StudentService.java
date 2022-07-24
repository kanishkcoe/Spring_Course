package com.jobreadycoders.studentdatamanagement.service;

import com.jobreadycoders.studentdatamanagement.entity.Student;
import com.jobreadycoders.studentdatamanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Optional<Student> getStudent(Long id) {
        return repository.findById(id);
    }
}

