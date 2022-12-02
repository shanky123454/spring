package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Tabletennis implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice hard";
	}

	@Override
	public String getWork() {
		
		return "don't be lazy";
	}

}
