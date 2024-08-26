package com.tareq.tasks_manager.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.util.Date;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "due")
    private Date due;


    //Constructors

    //the JPA needs this empty constructor
    public Task(){

    }

    public Task(String name, String description, Date due) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.due = due;
    }

    //Setters and getters

    public int getId() {
        return id;
    }
    //setting the id would be needed in case we are trying to save a new object coming from the api request
    //and it already had some id. therefore we set the id to 0,
    // so that the JPA would automatically on save give it a new id based on our id generation strategy
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }



    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", due=" + due +
                '}';
    }
}
