package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(thecoach.fortune());
		System.out.println(thecoach.getWork());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println("email: " + thecoach.getEmail());
		System.out.println("team: " + thecoach.getTeam());
		context.close(); 
		


	}

}
