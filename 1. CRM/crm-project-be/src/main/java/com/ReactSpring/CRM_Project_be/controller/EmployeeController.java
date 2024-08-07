package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.model.Employee;
import com.ReactSpring.CRM_Project_be.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployee();
    }

//    @GetMapping("")
//    public ResponseEntity<List<Employee>> getEmployees(){
//        List<Employee> employees = employeeService.getAllEmployee();
//        return new ResponseEntity<>(employees, HttpStatus.OK);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
