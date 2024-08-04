package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeesService {
    List<Employees> getAllEmployee();
}
