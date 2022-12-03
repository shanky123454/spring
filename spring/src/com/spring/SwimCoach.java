package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	@Qualifier("sadFortuneService")
	public FortuneService fortuneservice;
	
	@Autowired
	public SwimCoach(FortuneService thefortuneservice)
	{
		fortuneservice = thefortuneservice;
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}	
	@Override
	public String getDailyWorkout() {
		return "swim daily";
	}
	@Override
	public String getWork() {
		return "get swim daily";
	}

	@Override
	public String fortune() {
		return fortuneservice.fortune();
	}

}
