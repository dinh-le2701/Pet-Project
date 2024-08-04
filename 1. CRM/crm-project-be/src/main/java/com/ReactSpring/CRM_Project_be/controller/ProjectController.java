//package com.ReactSpring.CRM_Project_be.controller;
//
//import com.ReactSpring.CRM_Project_be.model.Project;
//import com.ReactSpring.CRM_Project_be.service.ProjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/project")
//public class ProjectController {
//    @Autowired
//    private ProjectService projectService;
//
//    @GetMapping("")
//    public ResponseEntity<List<Project>> getAllProjects(){
//        List<Project> projects = projectService.getAllProject();
//        return new ResponseEntity<>(projects, HttpStatus.OK);
//    }
//}
