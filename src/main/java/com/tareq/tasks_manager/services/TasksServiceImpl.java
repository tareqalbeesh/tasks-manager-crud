package com.tareq.tasks_manager.services;

import com.tareq.tasks_manager.dao.TaskDAOImpl;
import com.tareq.tasks_manager.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TasksServiceImpl implements TasksService{


    TaskDAOImpl taskDAO;
    @Autowired
    TasksServiceImpl(TaskDAOImpl taskDAO){
        this.taskDAO = taskDAO;
    }

    @Override
    public List<Task> getAll() {
        return taskDAO.getAll();
    }

    @Override
    public Task getTaskById(int id) {
        return taskDAO.getTaskById(id);
    }

    @Override
    public Task addTask(Task task) {
        return taskDAO.addTask(task);
    }

    @Override
    public void deleteTaskById(int id) {
        taskDAO.deleteTaskById(id);
    }
}
