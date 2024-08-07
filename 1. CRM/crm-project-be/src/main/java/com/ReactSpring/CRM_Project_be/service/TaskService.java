package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    List<Task> getAllTask();

    Task getTaskById(Integer id);

    Task saveTask(Task task);

    Task editTaskById(Integer id, Task updateTask);

    void deleteTaskById(Integer id);
}
