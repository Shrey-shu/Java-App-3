package com.acs.activitytracker.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * This class contains ExceptionHandler for ActivityNotFoundException
 * 
 * @author srivani.emmadi
 *
 */
@RestControllerAdvice
public class ActivityAdvicer {
	@ExceptionHandler(ActivityNotFoundException.class)
	public Map<String, String> handleError(ActivityNotFoundException ex) {

		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("error", ex.getMessage());
		return errorMap;
	}
}
