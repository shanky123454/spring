package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hurray!")// or we can also give the name of the class starting with small.
public class Tabletennis implements Coach {
	public Tabletennis()
	{
		System.out.println("inside tabletennis constructor");
	}
	//@Autowired // field injection
	public FortuneService fortuneservice;
	@Autowired// constructor injection
	public Tabletennis(FortuneService thefortuneservice)
	{
		fortuneservice = thefortuneservice;
	}
	/*@Autowired// setter injection
	public void setfortuneservice(FortuneService thefortuneservice)
	{
		fortuneservice =thefortuneservice;
	}*/
	@Override
	public String getDailyWorkout() {
		return "practice hard";
	}

	@Override
	public String getWork() {
		
		return "don't be lazy";
	}
	@Override
	public String fortune()
	{
		return fortuneservice.fortune();
		
	}

}
