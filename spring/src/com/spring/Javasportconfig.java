package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring")
public class Javasportconfig{
  //@Autowired
 // @Qualifier("SadFortuneService")

  public Javasportconfig()
  {
	  System.out.println("inside the javasportconfig constructor");
  }
 //========================================================================================	
 /* @Bean
  public FortuneService sadFortuneService()
  {
	return new SadFortuneService();
	  
  }
  @Bean
	public Coach tabletennis() {
	 Tabletennis mytabletennis=new Tabletennis(sadFortuneService());
	
		
		return mytabletennis;
	}
	 
	 @Bean
		public Coach swimCoach() {
			SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
			
			return mySwimCoach;
		}*/

}


