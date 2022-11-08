package com.acs.activitytracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* Defines that ActivityLog class is entity and mapped to database table */
@Table(name = "Activity_Log") /* Defines the name of the table that is present in database used for mapping */
public class ActivityLog extends BaseEntity {
	@Id /* Defines Id is primary key for the entity */
	private Long id;

	@Column(name = "activity_id") /* Specifies the name of column in database table. It is optional annotations */
	private Long activityId;

	@Column(name = "activity_status_id")
	private Long activityStatusId;

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

	public Long getActivityStatusId() {
		return activityStatusId;
	}

	public void setActivityStatusId(Long activityStatusId) {
		this.activityStatusId = activityStatusId;
	}

	@Override
	public String toString() {
		return "ActivityLog [id=" + id + ", activityId=" + activityId + ", activityStatusId=" + activityStatusId
				+ ", getCreatedBy()=" + getCreatedBy() + ", getUpdatedBy()=" + getUpdatedBy() + ", getCreatedAt()="
				+ getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}

}
