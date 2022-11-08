package com.acs.activitytracker.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* Defines that ActivityStatus class is entity and mapped to database table */
@Table(name = "Activity_Status") /* Defines the name of the table that is present in database used for mapping */
public class ActivityStatus extends BaseEntity {

	@Id /* Defines Id is primary key for the entity */
	private Long id;
	private String name;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "ActivityStatus [id=" + id + ", name=" + name + ", active=" + active + ", getCreatedBy()="
				+ getCreatedBy() + ", getUpdatedBy()=" + getUpdatedBy() + ", getCreatedAt()=" + getCreatedAt()
				+ ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}

}
