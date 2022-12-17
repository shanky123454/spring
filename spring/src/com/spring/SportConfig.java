
package com.spring;

import org.springframework.context.annotation.Bean;   
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	public SportConfig()
	{
		System.out.println("inside the sportconfig constructor");
	}
@Bean
		public FortuneService happyFortuneService() {
			return new   HappyFortuneService();
		}
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
 
	
	// define bean for our swim coach AND inject dependency

  @Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		
		return mySwimCoach;
	}
	
@Bean
	public Coach tabletennis() {
	 Tabletennis mytabletennis=new Tabletennis(happyFortuneService());
	 
		
		return mytabletennis;
	}
}

	  
   
