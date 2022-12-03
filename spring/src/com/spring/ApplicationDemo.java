package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDemo {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		//ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationcontext.xml");

		//get the bean from spring container
		Coach thecoach = context.getBean("tabletennis", Coach.class);
		FortuneService thecoach1 = context.getBean("happyFortuneService",FortuneService.class);
		//FortuneService thecoach2 = context.getBean("sadFortuneService",FortuneService.class);
		FortuneService thecoach2 = context.getBean("happyFortuneService",FortuneService.class);

		//Coach thecoach1 = context.getBean("HappyFortuneService", Coach.class);

		//call a method on the bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getWork());
		System.out.println(thecoach.fortune());

		System.out.println(thecoach1.fortune());
		System.out.println(thecoach2.fortune());
		boolean b = (thecoach1== thecoach2);
		System.out.println(b);


		//close the context
		context.close();
		
	}

}
