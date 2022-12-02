package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tabletennis implements Coach {
	public FortuneService fortuneservice;
	/*@Autowired
	public Tabletennis(FortuneService thefortuneservice)
	{
		fortuneservice = thefortuneservice;
	}*/
	@Autowired
	public void setfortuneservice(FortuneService thefortuneservice)
	{
		fortuneservice =thefortuneservice;
	}
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
