package com.ReactSpring.CRM_Project_be.repository;

import com.ReactSpring.CRM_Project_be.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
