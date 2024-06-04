package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Role;
import com.ReactSpring.CRM_Project_be.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }
}
