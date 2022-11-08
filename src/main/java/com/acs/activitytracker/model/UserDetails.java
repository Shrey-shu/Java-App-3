package com.acs.activitytracker.model;

public class UserDetails {
	private Long id;
	private String name;
	private boolean active;
	private String email;
	private Long managerId;
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
