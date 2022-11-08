package com.acs.activitytracker.model;

/**
 * This class is used to create entity of ViewActivity. It contains declaration
 * of all the fields required to create an Activity.
 * 
 * @author Shivam.Dubey
 */
public class ViewActivity {

	private int id;

	private String assignedDate;

	private String startDate;

	private String endDate;

	private String taskType;

	private String assignedTo;

	private String assignedBy;

	private String progress;

	private String description;

	/**
	 * Getters , Setters and Constructor of all the fields.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(String assignedDate) {
		this.assignedDate = assignedDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ViewActivity(int id, String assignedDate, String startDate, String endDate, String taskType,
			String assignedTo, String assignedBy, String progress, String description) {

		this.id = id;
		this.assignedDate = assignedDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.taskType = taskType;
		this.assignedTo = assignedTo;
		this.assignedBy = assignedBy;
		this.progress = progress;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", assignedDate=" + assignedDate + ", startDate=" + startDate + ", endDate="
				+ endDate + ", taskType=" + taskType + ", assignedTo=" + assignedTo + ", assignedBy=" + assignedBy
				+ ", progress=" + progress + ", description=" + description + "]";
	}

}
