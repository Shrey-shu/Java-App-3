package com.acs.activitytracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /*
		 * Defines that NotificationSettings class is entity and mapped to database
		 * table
		 */
@Table(name="Notification_Setting") /* Defines the name of the table that is present in database used for mapping */
public class NotificationSettings extends BaseEntity {
	@Id /* Defines Id is primary key for the entity */
	private Long id;
	private String name;

	@Column(name="user_id") /* Specifies the name of column in database table. It is optional annotations */
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
