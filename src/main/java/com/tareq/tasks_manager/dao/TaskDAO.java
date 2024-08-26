package com.tareq.tasks_manager.dao;

import com.tareq.tasks_manager.entity.Task;

import java.util.List;

public interface TaskDAO {
    List<Task> getAll();
    Task getTaskById(int id);
    Task save(Task task);
    void deleteTaskById(int id);
}
