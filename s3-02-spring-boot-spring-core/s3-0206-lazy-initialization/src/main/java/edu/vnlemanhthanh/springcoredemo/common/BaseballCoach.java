package edu.vnlemanhthanh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	public BaseballCoach() {
		System.out.println("in Contructor: " + this);
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}
}
