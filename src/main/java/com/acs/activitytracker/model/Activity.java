package com.acs.activitytracker.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class contains an Entity , with Table name Activity and It's Variables
 * 
 * @author Srivani.Emmadi
 *
 */

@Entity
@Table(name = "Activity")
public class Activity {
	@Id
	private Long id;
	private String description;
	private Date startDate;
	private Date endDate;
	private String assignedTo;
	private String approvalBy;
	private String selfReminder;
	private boolean isslef;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getApprovalBy() {
		return approvalBy;
	}

	public void setApprovalBy(String approvalBy) {
		this.approvalBy = approvalBy;
	}

	public String getSelfReminder() {
		return selfReminder;
	}

	public void setSelfReminder(String selfReminder) {
		this.selfReminder = selfReminder;
	}

	public boolean getIsslef() {
		return isslef;
	}

	public void setIsslef(boolean isslef) {
		this.isslef = isslef;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", description=" + description + ", startDate=" + startDate + ", endDate="
				+ endDate + ", assignedTo=" + assignedTo + ", approvalBy=" + approvalBy + ", selfReminder="
				+ selfReminder + ", isslef=" + isslef + "]";
	}

}
