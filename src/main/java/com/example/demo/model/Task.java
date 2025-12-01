package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    private String title;
    private String description;
    private String month;
    private String materialsFinish;
    private String taskImage;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<TaskStep> steps;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMaterialsFinish() {
		return materialsFinish;
	}

	public void setMaterialsFinish(String materialsFinish) {
		this.materialsFinish = materialsFinish;
	}

	public String getTaskImage() {
		return taskImage;
	}

	public void setTaskImage(String taskImage) {
		this.taskImage = taskImage;
	}

	public List<TaskStep> getSteps() {
		return steps;
	}

	public void setSteps(List<TaskStep> steps) {
		this.steps = steps;
	}

	

    // Getters and setters
    
}
