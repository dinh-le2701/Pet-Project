package com.ReactSpring.CRM_Project_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

    private String project_name;

    private Date start_date;

    private Date end_date;



}
