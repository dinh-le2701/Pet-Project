package com.ReactSpring.CRM_Project_be.controller;


import com.ReactSpring.CRM_Project_be.dto.ProjectDto;
import com.ReactSpring.CRM_Project_be.model.Project;
import com.ReactSpring.CRM_Project_be.model.Task;
import com.ReactSpring.CRM_Project_be.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.getAllProject();

//        List<ProjectDto> projectDtos = new ArrayList<>();
//        for (Project data : projects) {
//            ProjectDto projectDto = new ProjectDto();
//            projectDto.setProject_name(data.getProject_name());
//            projectDto.setStart_date(data.getStart_date());
//            projectDto.setEnd_date(data.getEnd_date());
//
//            List<String> listTask = new ArrayList<>();
//            for (Task itemTask : data.getListTask()){
//                listTask
//            }
//        }
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
}
