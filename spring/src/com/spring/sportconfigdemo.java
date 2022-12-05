package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class sportconfigdemo {
 
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Javasportconfig.class);
		Tabletennis thecoach = context.getBean("tabletennis", Tabletennis.class);
		System.out.println(thecoach.fortune());
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getWork());
		context.close();
		
	}

}
