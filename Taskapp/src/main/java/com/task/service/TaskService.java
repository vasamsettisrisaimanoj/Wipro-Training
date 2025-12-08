package com.task.service;
import java.util.*;

import com.task.Task;
public interface TaskService {
	Task addTask(Task task);
	Task updateTask(Task task);
	void deleteTask(Integer id);
	List<Task> getAllTasks();
	List<Task> getByStatus(String status);
	List<Task> getByPriority(String priority);
	List<Task> getOverdueTasks();
}
