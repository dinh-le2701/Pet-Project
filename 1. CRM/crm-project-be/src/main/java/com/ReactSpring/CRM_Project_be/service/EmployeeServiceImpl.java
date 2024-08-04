package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Employees;
import com.ReactSpring.CRM_Project_be.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeesService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employees> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
