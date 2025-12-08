package com.task;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SpringBootApplication
@Entity
public class Task {

	@Id
	private int id;
	private String title;
	private String assignedTo;
	private String priority;
	private String status;
	
	
}
