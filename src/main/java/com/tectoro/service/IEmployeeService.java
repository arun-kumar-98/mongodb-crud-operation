package com.tectoro.service;

import com.tectoro.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee saveEmp(Employee employee);
    List<Employee> getEmployeeList();
    Employee updateEmployee(Integer id,Employee employee);
    String removeEmployeeFromList(Integer id);
    Employee getEmployeeById(Integer id);

}
