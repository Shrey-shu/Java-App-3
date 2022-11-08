package com.acs.activitytracker.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acs.activitytracker.exception.ActivityNotFoundException;
import com.acs.activitytracker.model.Activity;
import com.acs.activitytracker.service.ActivityService;

/**
 * 
 * This Project is for API's Create Activity.
 * 
 * This package is where all the API's controllers should be created and also
 * have sub packages as required.
 * 
 * @author Srivani.Emmadi
 *
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {

	private ActivityService activityService;

	@Autowired
	public ActivityController(ActivityService activityService) {
		this.activityService = activityService;
	}

	/**
	 * 
	 * @return ResponseEntity and This method gets all the activities.
	 * 
	 */
	@GetMapping
	public ResponseEntity<Optional<List<Activity>>> getAllActivity() {
		return ResponseEntity.ok().body(activityService.getAllActivity());
	}

	/**
	 * 
	 * @param activity
	 * @return ReponseEntity and This method allows create activity.
	 */
	@PostMapping
	public ResponseEntity<Activity> createActivity(@RequestBody Activity activity) {
		return ResponseEntity.ok().body(activityService.createActivity(activity));
	}

	/**
	 * 
	 * @param id
	 * @return ReponseEntity and This method allows Delete activity.
	 * @throws ActivityNotFoundException
	 */
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteActivity(@PathVariable Long id) throws ActivityNotFoundException {
		activityService.deleteActivity(id);
		return new ResponseEntity<>("Activity has been deleted Successfully", HttpStatus.OK);
	}

	/**
	 * 
	 * @param id
	 * @param change
	 * @return Updated activity.
	 * @throws ActivityNotFoundException
	 */
	@PatchMapping(path = "{id}")
	public Activity updateActivity(@PathVariable Long id, @RequestBody Map<Object, Object> change)
			throws ActivityNotFoundException {
		return (activityService.upadteActivityById(id, change));
	}

}
