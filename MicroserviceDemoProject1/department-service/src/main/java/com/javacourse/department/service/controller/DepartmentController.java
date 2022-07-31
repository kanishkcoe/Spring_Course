package com.javacourse.department.service.controller;

import com.javacourse.department.service.entity.Department;
import com.javacourse.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentID) {
        return service.findByDepartmentId(departmentID);
    }
}
