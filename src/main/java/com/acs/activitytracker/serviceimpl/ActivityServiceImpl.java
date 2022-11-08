package com.acs.activitytracker.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.acs.activitytracker.exception.ActivityNotFoundException;
import com.acs.activitytracker.model.Activity;
import com.acs.activitytracker.repository.ActivityRepository;
import com.acs.activitytracker.service.ActivityService;

/**
 * This is a implementation of {@link ActivityService}
 * 
 * @author Srivani.Emmadi
 * 
 */
@Service
public class ActivityServiceImpl implements ActivityService {
	// @Autowired
	private ActivityRepository activityRepository;

	private static List<Activity> list = new ArrayList<>();

	@Override
	public Activity createActivity(Activity activity) {
		// return activityRepository.save(activity);
		list.add(activity);
		return activity;
	}

	@Override
	public Optional<List<Activity>> getAllActivity() {
		return Optional.of(list); // Optional.of(activityrepository.findAll())
	}

	@Override
	public void deleteActivity(Long id) throws ActivityNotFoundException {
		// Optional<Activity> activity = activityRepository.findById(id);
		Optional<Activity> activity = list.stream().filter(activtyItr -> activtyItr.getId().equals(id)).findFirst();
		if (activity.isPresent()) {
			// activityRepository.delete(activity.get());
			list.remove(activity.get());
		} else {
			throw new ActivityNotFoundException("Activity not found with id " + id);
		}
	}

	@Override
	public Activity upadteActivityById(Long id, Map<Object, Object> change) throws ActivityNotFoundException {
		
		Activity user = null;//activityRepository.findById(id).orElse(null);
		if (user != null) {

//			change.forEach((key, value) -> {
//				Field field = ReflectionUtils.findRequiredField(Activity.class, (String) key);
//				field.setAccessible(true);
//				ReflectionUtils.setField(field, user, value);
//			});
//			activityRepository.save(user);
			return user;

		} else {
			throw new ActivityNotFoundException("Activity not found with id " + id);
		}

	}
}
