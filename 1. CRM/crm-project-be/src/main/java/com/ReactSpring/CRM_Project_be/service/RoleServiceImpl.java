package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Roles;
import com.ReactSpring.CRM_Project_be.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RolesService{
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> getAllRole() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles createRole(Roles role) {
        return rolesRepository.save(role);
    }
}
