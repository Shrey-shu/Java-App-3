package com.acs.activitytracker.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* Defines that Remainder class is entity and mapped to database table */
@Table(name="remainder") /* Defines the name of the table that is present in database used for mapping */
public class Remainder {

	@Id /* Defines Id is primary key for the entity */
	private Long id;

	@Column(name="activity_id") /* Specifies the name of column in database table. It is optional annotations */
	private Long activityId;

	@Column(name="user_id")
	private Long userId;

	private String frequency;

	@Column(name="schedule_time")
	private Date scheduleTime;

	@Column(name="next_remainder")
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
