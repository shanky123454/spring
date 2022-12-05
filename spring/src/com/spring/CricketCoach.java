package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("happyfortuneservice")
	public FortuneService fortuneservice;
	@Autowired
	public CricketCoach(FortuneService thefortuneservice)
	{
		System.out.println("cricket coach constructor");
		fortuneservice = thefortuneservice;
	}
	@Value("${foo.email}")
	public String mail;
	@Value("${foo.team}")
	public String name;
	
	public String getEmail()
	{
		return mail;
		
	}
	public String getTeam()
	{
		return name;
	}
	
	

	@Override
	public String getDailyWorkout() {
		
		return "practice cricket daily";
	}

	@Override
	public String getWork() {
	
		return "get cricket work daily";
	}

	@Override
	public String fortune() {
		// TODO Auto-generated method stub
		return fortuneservice.fortune();
	}
	

}
