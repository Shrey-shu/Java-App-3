package com.acs.activitytracker.model;

public class NotificationSettings extends BaseModel {
	private Long id;
	private String name;
	private Long userId;
	private boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "NotificationSettings [id=" + id + ", name=" + name + ", userId=" + userId + ", active=" + active
				+ ", getCreatedBy()=" + getCreatedBy() + ", getUpdatedBy()=" + getUpdatedBy() + ", getCreatedAt()="
				+ getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}

}
