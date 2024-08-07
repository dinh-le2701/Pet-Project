package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.dto.RoleDTO;
import com.ReactSpring.CRM_Project_be.model.Role;
import com.ReactSpring.CRM_Project_be.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("")
    public ResponseEntity<List<Role>> getAllRoles(){
        List<Role> role = roleService.getAllRole();
//        List<RoleDTO> listRoleDTO = new ArrayList<>();
//        for(Role data : role){
//            RoleDTO roleDTO = new RoleDTO();
//            roleDTO.setRole_name(data.getRole_name());
//            roleDTO.setDescription(data.getDescription());
//            listRoleDTO.add(roleDTO);
//        }
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
//
//    @PostMapping("")
//    public ResponseEntity<?> saveRole(@RequestBody Role roles){
//        Role saveRole = roleService.createRole(roles);
//        return new ResponseEntity<>(saveRole, HttpStatus.CREATED);
//    }
}
