# Tasks Manager API

This is a simple **Tasks Manager API** built using **Java Spring Boot**. It provides basic CRUD operations (Create, Read, Update, Delete) for managing tasks.

## Project Overview

The project implements a RESTful API for a task management system. It allows clients to interact with the backend through HTTP requests to create, read, update, and delete tasks.

## Features

- **Create Task**: Add a new task via a POST request.
- **Read Tasks**: Retrieve a list of all tasks or a specific task by its ID via GET requests.
- **Update Task**: Modify an existing task via a PUT request.
- **Delete Task**: Remove a task by its ID via a DELETE request.

## API Endpoints

| Method | Endpoint          | Description                  |
|--------|-------------------|------------------------------|
| GET    | `/api/tasks`       | Retrieve all tasks           |
| GET    | `/api/tasks/{id}`  | Retrieve a task by its ID    |
| POST   | `/api/tasks`       | Create a new task            |
| PUT    | `/api/tasks`       | Update an existing task      |
| DELETE | `/api/tasks/{id}`  | Delete a task by its ID      |

### Example Request and Response

1. **GET `/api/tasks`**

   Request:
   ```http
   GET /api/tasks
