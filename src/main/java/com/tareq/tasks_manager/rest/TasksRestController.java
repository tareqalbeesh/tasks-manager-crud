package com.tareq.tasks_manager.rest;

import com.tareq.tasks_manager.entity.Task;
import com.tareq.tasks_manager.services.TasksService;
import com.tareq.tasks_manager.services.TasksServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class TasksRestController {

    TasksService tasksService;

    //the TasksService is injected cause this is a Rest Controller
    TasksRestController(TasksServiceImpl tasksService){
        this.tasksService=tasksService;
    }

    @GetMapping("/tasks")
    public List<Task> readAllTasks(){
        return tasksService.getAll();
    }

    @GetMapping("/tasks/{taskId}")
    public Task readTask(@PathVariable int taskId){
        Task task = tasksService.getTaskById(taskId);

        if(task==null){
            throw new RuntimeException("the task with the id: " + taskId + " was not found!");
        }

        return task;
    }


    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task){
        task.setId(0);
        return tasksService.save(task);
    }
    @PutMapping("/tasks")
    public Task editTask(@RequestBody Task task){

        return tasksService.save(task);
    }
    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable int taskId){
        Task task  = tasksService.getTaskById(taskId);
        if(task==null){
            throw new RuntimeException("the task with the id: " + taskId + " was not found!");
        }
        tasksService.deleteTaskById(taskId);
        return "Done Successfully!";
    }


}
