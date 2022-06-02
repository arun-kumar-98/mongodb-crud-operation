package com.tectoro.service.impl;

import com.tectoro.entity.Employee;
import com.tectoro.repository.IEmployeeRepository;
import com.tectoro.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepository repository;

    @Override
    public Employee saveEmp(Employee employee) {
        return repository.insert(employee);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return repository.findAll();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee employee1 = repository.findById(id).get();
        if (repository.existsById(id) && id != null) {
            employee1.setName(employee.getName());
            employee1.setSalary(employee.getSalary());
            repository.save(employee1);
        } else {
            return new Employee();
        }
        return employee1;
    }

    @Override
    public String removeEmployeeFromList(Integer id) {
        Employee employee=repository.findById(id).get();
        repository.delete(employee);
        return "employee deleted "+employee.getId();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return repository.findById(id).get();
    }
}
