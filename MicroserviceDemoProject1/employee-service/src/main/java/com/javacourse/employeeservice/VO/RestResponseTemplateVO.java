package com.javacourse.employeeservice.VO;

import com.javacourse.employeeservice.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//value object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestResponseTemplateVO {
    Employee employee;
    Department department;
}
