package com.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach  implements Coach{
	@Qualifier("sadFortuneService")
	public FortuneService fortuneservice;
	@Autowired
	public SwimCoach(FortuneService thefortuneservice)
	{
		System.out.println("swimcoach constructor");
		fortuneservice = thefortuneservice;
	}
	@PostConstruct // execute after the execution of constructor
	  public void play()
	  {
		  System.out.println("shashank is playing");
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
