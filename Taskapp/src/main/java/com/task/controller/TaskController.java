package com.task.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.task.Task;
import com.task.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    // POST /task
    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody Task task) {
        return new ResponseEntity<>(service.addTask(task), HttpStatus.CREATED);
    }

    // PUT /task
    @PutMapping
    public ResponseEntity<?> updateTask( @RequestBody Task task) {
        return ResponseEntity.ok(service.updateTask(task));
    }

    // DELETE /task/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Integer id) {
        service.deleteTask(id);
        return ResponseEntity.ok("Task deleted successfully");
    }

    // GET /task
    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    // GET /task/search?status=value
    @GetMapping("/search")
    public ResponseEntity<?> searchByStatus(@RequestParam String status) {

        if (status == null)
            return new ResponseEntity<>("status parameter is required", HttpStatus.BAD_REQUEST);

        return ResponseEntity.ok(service.getByStatus(status));
    }

    // GET /task/priority/{priority}
    @GetMapping("/priority/{priority}")
    public List<Task> getByPriority(@PathVariable String priority) {
        return service.getByPriority(priority);
    }

    // GET /task/overdue
    @GetMapping("/overdue")
    public List<Task> getOverdueTasks() {
        return service.getOverdueTasks();
    }
}
