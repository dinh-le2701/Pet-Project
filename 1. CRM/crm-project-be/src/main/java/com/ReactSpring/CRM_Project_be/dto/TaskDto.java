package com.ReactSpring.CRM_Project_be.dto;

import com.ReactSpring.CRM_Project_be.model.Task;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private String task_name;

    private LocalDate start_date;

    private LocalDate end_date;

    private LocalDateTime create_at;

    private LocalDateTime update_at;

    private Task.TaskStatus taskStatus;

}
