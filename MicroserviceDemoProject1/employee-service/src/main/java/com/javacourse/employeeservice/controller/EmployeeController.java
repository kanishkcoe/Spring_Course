package com.javacourse.employeeservice.controller;

import com.javacourse.employeeservice.VO.RestResponseTemplateVO;
import com.javacourse.employeeservice.entity.Employee;
import com.javacourse.employeeservice.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employees")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        log.info("Inside saveEmployee method with data : " + employee);
        return service.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public RestResponseTemplateVO getEmployee(@PathVariable("id") Long employeeID) {
        return service.getEmployee(employeeID);
    }
}
