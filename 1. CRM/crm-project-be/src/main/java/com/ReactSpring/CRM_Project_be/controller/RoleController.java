package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.model.Role;
import com.ReactSpring.CRM_Project_be.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/")
    public ResponseEntity<List<Role>> getAllRoles(){
        List<Role> roles = roleService.getAllRole();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }
}
