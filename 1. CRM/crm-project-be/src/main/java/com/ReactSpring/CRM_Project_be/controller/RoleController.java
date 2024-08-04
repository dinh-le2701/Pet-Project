package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.dto.RoleDTO;
import com.ReactSpring.CRM_Project_be.model.Roles;
import com.ReactSpring.CRM_Project_be.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RolesService rolesService;

    @GetMapping("")
    public ResponseEntity<?> getAllRoles(){
        List<Roles> roles = rolesService.getAllRole();
        List<RoleDTO> listRoleDTO = new ArrayList<>();

        for(Roles data : roles){
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setRole_id(data.getId());
            roleDTO.setRole_name(data.getRole_name());

            listRoleDTO.add(roleDTO);
        }
        return new ResponseEntity<>(listRoleDTO, HttpStatus.OK);
    }
}
