package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Project;
import com.ReactSpring.CRM_Project_be.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Integer project_id) {
        return projectRepository.findById(project_id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + project_id));
    }

    @Override
    public Project saveNewProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProject(Integer project_id, Project updateProject) {
        Project project = projectRepository.findById(project_id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + project_id));
        project.setProject_name(updateProject.getProject_name());
        project.setStart_date(updateProject.getStart_date());
        project.setEnd_date(updateProject.getEnd_date());
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(Integer project_id) {
        Project project = projectRepository.findById(project_id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + project_id));
        projectRepository.deleteById(project_id);
    }
}
