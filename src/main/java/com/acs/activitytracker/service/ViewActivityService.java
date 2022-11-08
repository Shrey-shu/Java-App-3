package com.acs.activitytracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acs.activitytracker.controller.ViewActivityDataController;
import com.acs.activitytracker.model.ViewActivity;

/**
 * This Service class is having all the method implemented for
 * {@link ViewActivityDataController} to GET , POST , PATCH and DELETE
 * {@link ViewActivity}.
 * 
 * @author shivam.dubey
 */
@Component
public class ViewActivityService {

	private static List<ViewActivity> list = new ArrayList<>();
	static {
		list.add(new ViewActivity(1, "2022-2-10", "2022-2-12", "2022-3-15", "Implementation API Activity",
				"shivam dubey", "Mahesh", "Done", "Core Java"));
		list.add(new ViewActivity(2, "2022-2-10", "2022-2-13", "2022-3-15", "Integrate Logging Framework",
				"Anmol Agrawal", "Mahesh", "Done", "Spring Boot"));
		list.add(new ViewActivity(3, null, "2022-2-14", "2022-3-15", "Integrate Email functionality", "Aman Singh",
				"Mahesh", "Done", "Spring Boot"));
		list.add(new ViewActivity(4, "2022-2-10", "2022-2-15", "2022-3-15", "Unit Tests for APIs", "Shivam Dubey",
				"Mahesh", "In progress", "Spring Boot"));
		list.add(new ViewActivity(5, "2022-2-10", "2022-2-16", "2022-3-15",
				"Create Entities & Model classes as per ER Diagram", "Neelanshu Singh", "Mahesh", "Done",
				"Spring Boot"));
	}

	public List<ViewActivity> getAllActivities() {
		// return
		// list.stream().sorted(Comparator.comparingInt(ViewActivity::getId)).toList();
		return list;
	}

	public ViewActivity getActivityById(int id) {
		ViewActivity object = null;

		object = list.stream().filter(e -> e.getId() == id).findFirst().get();

		return object;
	}
}
