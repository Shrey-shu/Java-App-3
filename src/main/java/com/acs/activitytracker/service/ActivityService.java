package com.acs.activitytracker.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.acs.activitytracker.exception.ActivityNotFoundException;
import com.acs.activitytracker.model.Activity;

/**
 * 
 * This is an interface of {@link ActivityServiceImpl}
 * 
 * @author Srivani.Emmadi
 *
 */
public interface ActivityService {

	Activity createActivity(Activity activity);

	Optional<List<Activity>> getAllActivity();

	void deleteActivity(Long id) throws ActivityNotFoundException;

	Activity upadteActivityById(Long id, Map<Object, Object> change) throws ActivityNotFoundException;

}
