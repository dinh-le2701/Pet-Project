package com.ReactSpring.CRM_Project_be.service;

import com.ReactSpring.CRM_Project_be.model.Task;
import com.ReactSpring.CRM_Project_be.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Integer id) {
        return taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + id));
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task editTaskById(Integer id, Task updateTask) {
        Task task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + id));
        task.setTask_name(updateTask.getTask_name());
        task.setStart_date(updateTask.getStart_date());
        task.setEnd_date(updateTask.getEnd_date());
        task.setUpdate_at(updateTask.getUpdate_at());
        task.setTaskStatus(updateTask.getTaskStatus());
        return taskRepository.save(task);
    }

    @Override
    public void deleteTaskById(Integer id) {
        Task task = taskRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found project has id: " + id));
        taskRepository.deleteById(id);
    }
}
