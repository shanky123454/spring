package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDemo {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		//ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationcontext.xml");

		//get the bean from spring container
		Coach thecoach = context.getBean("tabletennis", Coach.class);
		//Coach thecoach1 = context.getBean("HappyFortuneService",Coach.class);
		//Coach thecoach1 = context.getBean("HappyFortuneService", Coach.class);

		//call a method on the bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getWork());
		//System.out.println(thecoach.getWork());
		System.out.println(thecoach.fortune());

		//close the context
		context.close();
		//context2.close();
		
	}

}
