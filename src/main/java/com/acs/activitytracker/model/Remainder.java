package com.acs.activitytracker.model;

import java.util.Date;

public class Remainder {
	private Long id;
	private Long activityId;
	private Long userId;
	private String frequency;
	private Date scheduleTime;
	private Date nextRemainder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public Date getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public Date getNextRemainder() {
		return nextRemainder;
	}

	public void setNextRemainder(Date nextRemainder) {
		this.nextRemainder = nextRemainder;
	}

	@Override
	public String toString() {
		return "Remainder [id=" + id + ", activityId=" + activityId + ", userId=" + userId + ", frequency=" + frequency
				+ ", scheduleTime=" + scheduleTime + ", nextRemainder=" + nextRemainder + "]";
	}

}
