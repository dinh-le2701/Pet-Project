package com.ReactSpring.CRM_Project_be.controller;

import com.ReactSpring.CRM_Project_be.model.Task;
import com.ReactSpring.CRM_Project_be.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("")
    public ResponseEntity<List<Task>> getAllProjects(){
        List<Task> projects = taskService.getAllTask();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }


}

