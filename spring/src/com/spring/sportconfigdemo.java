package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class sportconfigdemo {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Javasportconfig.class);
		Coach thecoach = context.getBean("tabletennis", Coach.class);
		System.out.println(thecoach.fortune());
		System.out.println(thecoach.getDailyWorkout());
		context.close();
		
	}

}
