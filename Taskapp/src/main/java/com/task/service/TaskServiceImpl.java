package com.task.service;

import com.task.Task;
import com.task.repo.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repo;

    public TaskServiceImpl(TaskRepository repo) {
        this.repo = repo;
    }

    @Override
    public Task addTask(Task task) {

        if (repo.existsById(task.getId()))
            throw new 

        return repo.save(task);
    }

    @Override
    public Task updateTask(Task task) {

        if (!repo.existsById(task.getId()))
            throw new 

        return repo.save(task);
    }

    @Override
    public void deleteTask(Integer id) {

        if (!repo.existsById(id))
            throw new 

        repo.deleteById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    @Override
    public List<Task> getByStatus(String status) {
        return repo.findByStatusIgnoreCase(status);
    }

    @Override
    public List<Task> getByPriority(String priority) {
        return repo.findByPriorityIgnoreCase(priority);
    }

    @Override
    public List<Task> getOverdueTasks() {

        
    }
}
