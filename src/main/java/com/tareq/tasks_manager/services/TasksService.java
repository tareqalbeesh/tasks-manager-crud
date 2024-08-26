package com.tareq.tasks_manager.services;

import com.tareq.tasks_manager.entity.Task;

import java.util.List;

public interface TasksService {
    List<Task> getAll();
    Task getTaskById(int id);
    Task addTask(Task task);
    void deleteTaskById(int id);
}
