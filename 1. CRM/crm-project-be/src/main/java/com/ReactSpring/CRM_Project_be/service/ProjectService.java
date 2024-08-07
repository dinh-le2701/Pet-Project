package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    List<Project> getAllProject();

    Project getProjectById(Integer project_id);

    Project saveNewProject(Project project);

    Project updateProject(Integer project_id, Project updateProject);

    void deleteProject(Integer project_id);
}
