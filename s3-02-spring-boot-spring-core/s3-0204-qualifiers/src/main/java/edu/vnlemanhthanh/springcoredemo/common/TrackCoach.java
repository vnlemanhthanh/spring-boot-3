package edu.vnlemanhthanh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Run a hark 5k!";
	}
}
