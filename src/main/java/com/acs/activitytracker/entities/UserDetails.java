package com.acs.activitytracker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /* Defines that UserDetails is entity and mapped to database table */
@Table(name="User_details") /* Defines the name of the table that is present in database used for mapping */
public class UserDetails {

	@Id /* Defines Id is primary key for the entity */
	private Long id;
	private String name;
	private boolean active;
	private String email;

	@Column(name="manager_id") /* Specifies the name of column in database table. It is optional annotations */
	private Long managerId;

	@Column(name="work_location")
	private String workLocation;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", active=" + active + ", email=" + email + ", managerId="
				+ managerId + ", workLocation=" + workLocation + "]";
	}

}
