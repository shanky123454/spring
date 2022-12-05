
package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CricketDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CricketCoachConfig.class);
		CricketCoach thecoach = context.getBean("cricketCoach",CricketCoach.class);
		System.out.println(thecoach.fortune());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getWork());
		System.out.println(thecoach.getEmail());
		System.out.println(thecoach.getTeam());
		context.close(); 
	}

}
