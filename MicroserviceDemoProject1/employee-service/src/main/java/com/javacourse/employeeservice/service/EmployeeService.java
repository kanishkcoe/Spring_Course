package com.javacourse.employeeservice.service;

import com.javacourse.employeeservice.VO.Department;
import com.javacourse.employeeservice.VO.RestResponseTemplateVO;
import com.javacourse.employeeservice.entity.Employee;
import com.javacourse.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private RestTemplate restTemplate;
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public RestResponseTemplateVO getEmployee(Long employeeID) {
        RestResponseTemplateVO response = new RestResponseTemplateVO();

        Employee employee = repository.findByEmployeeId(employeeID);

        Department department = restTemplate
                .getForObject("http://localhost:9001/departments/" + employee.getDepartmentId(),
                        Department.class);

        response.setEmployee(employee);
        response.setDepartment(department);

        return response;
    }

}
