package com.tareq.tasks_manager.services;

import com.tareq.tasks_manager.dao.TaskDAOImpl;
import com.tareq.tasks_manager.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    @Transactional
    @Override
    public Task save(Task task) {
        return taskDAO.save(task);
    }
    @Transactional
    @Override
    public void deleteTaskById(int id) {
        taskDAO.deleteTaskById(id);
    }
}
