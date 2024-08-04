package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.model.Employees;
import com.ReactSpring.CRM_Project_be.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping("")
    public ResponseEntity<List<Employees>> getAllEmployee(){
        List<Employees> listEmpl = employeesService.getAllEmployee();
        return new ResponseEntity<>(listEmpl, HttpStatus.OK);
    }
}
