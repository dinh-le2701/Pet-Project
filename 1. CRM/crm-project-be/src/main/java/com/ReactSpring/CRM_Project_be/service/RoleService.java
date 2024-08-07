package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    List<Role> getAllRole();
    Role createRole(Role role);
}
