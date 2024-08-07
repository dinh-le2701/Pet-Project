package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Role;
import com.ReactSpring.CRM_Project_be.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Role> getAllRole() {
        return rolesRepository.findAll();
    }

    @Override
    public Role createRole(Role role) {
        return rolesRepository.save(role);
    }
}
