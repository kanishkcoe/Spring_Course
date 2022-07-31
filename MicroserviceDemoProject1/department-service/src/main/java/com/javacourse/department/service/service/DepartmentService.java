package com.javacourse.department.service.service;

import com.javacourse.department.service.entity.Department;
import com.javacourse.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public Department findByDepartmentId(Long departmentID) {
        return repository.findByDepartmentID(departmentID);
    }
}
