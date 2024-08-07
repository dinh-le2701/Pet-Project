package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployee();

    Optional<Employee> getEmployeeById(Integer id);

    Employee saveEmployee(Employee employee);

    void deleteEmployeeById(Integer id);
}
