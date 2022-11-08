package com.acs.activitytracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* Defines that UserPoints is entity and mapped to database table */
@Table(name="user_points") /* Defines the name of the table that is present in database used for mapping */
public class UserPoints extends BaseEntity {

	@Id /* Defines Id is primary key for the entity */
	private Long id;

	@Column(name="activity_id")
	private Long activityId;

	private Long points;

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

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "UserPoints [id=" + id + ", activityId=" + activityId + ", points=" + points + ", getCreatedBy()="
				+ getCreatedBy() + ", getUpdatedBy()=" + getUpdatedBy() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}

}
