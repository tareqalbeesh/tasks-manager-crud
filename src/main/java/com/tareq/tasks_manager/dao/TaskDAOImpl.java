package com.tareq.tasks_manager.dao;

import com.tareq.tasks_manager.entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO{

    EntityManager entityManager;

    //injecting the entity manager which will provide the connection with the database
    @Autowired
    TaskDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    public List<Task> getAll() {
        TypedQuery gettingAllTasksQuery =  entityManager.createQuery("From Task",Task.class);
        return gettingAllTasksQuery.getResultList();
    }

    @Override
    public Task getTaskById(int id) {
        return entityManager.find(Task.class, id);
    }

    @Override
    public Task addTask(Task task) {
        return entityManager.merge(task);
    }

    @Override
    public void deleteTaskById(int id) {
        Task theTask = entityManager.find(Task.class,id);
        entityManager.remove(theTask);
    }
}
