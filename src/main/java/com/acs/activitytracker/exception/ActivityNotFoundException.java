package com.acs.activitytracker.exception;

/**
 * This class contains ActivityNotFoundException
 * 
 * @author srivani.emmadi
 *
 */
public class ActivityNotFoundException extends Exception {
	public String message;

	public ActivityNotFoundException(String message) {
		super(message);
	}

}
