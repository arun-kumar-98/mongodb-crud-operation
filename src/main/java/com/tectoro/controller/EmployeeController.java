package com.tectoro.controller;

import com.tectoro.entity.Employee;
import com.tectoro.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired(required = true)
    private IEmployeeService service;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return  ResponseEntity.ok(service.saveEmp(employee));
    }
    @PostMapping("/get")
    public ResponseEntity<List<Employee>> listOfEmployee(){
        return  ResponseEntity.ok(service.getEmployeeList());
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id,@RequestBody  Employee employee){
        return  ResponseEntity.ok(service.updateEmployee(id,employee));
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<String> removeEmployee(@PathVariable Integer id){
        return  ResponseEntity.ok(service.removeEmployeeFromList(id));
    }

    @PostMapping("/get-one/{id}")
    public ResponseEntity<Employee> getOneEmpRecord(@PathVariable Integer id){
        return  ResponseEntity.ok(service.getEmployeeById(id));
    }
}
