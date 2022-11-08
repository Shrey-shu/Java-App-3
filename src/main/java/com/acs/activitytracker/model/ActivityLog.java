package com.acs.activitytracker.model;

public class ActivityLog extends BaseModel {
	private Long id;
	private Long activityId;
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
