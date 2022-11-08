package com.acs.activitytracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acs.activitytracker.model.ViewActivity;
import com.acs.activitytracker.service.ViewActivityService;

/**
 * This class is responsible for processing ViewActivity API requests,
 * 
 * @author Shivam.Dubey
 */
@RestController
@RequestMapping("/activities")
public class ViewActivityDataController {

	@Autowired
	private ViewActivityService viewActivityService;

	/**
	 * This method will map the URL to fetch all the list of Activities and return
	 * as response.
	 */
	@GetMapping
	public List<ViewActivity> viewAllActivities() {
		return viewActivityService.getAllActivities();
	}

	/**
	 * This method will map the URL to fetch the activity, with respect to the Id
	 * requested in URL and return as response.
	 */
	@GetMapping("/{id}")
	public ResponseEntity<ViewActivity> activityById(@PathVariable("id") int id) {
		ViewActivity activity = viewActivityService.getActivityById(id);
		if (activity != null) {
			return ResponseEntity.of(Optional.of(activity));
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
