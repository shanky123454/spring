
package com.spring;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring")
@PropertySource("classpath:sport.properties")
public class CricketCoachConfig {
		public CricketCoachConfig() 
		{
			System.out.println("inside CricketCoachConfig constructor");
		}
		
		@Bean
		public FortuneService happyfortuneservice()
		{
			return new HappyFortuneService();
			
		}
		@Bean
		public Coach cricketCoach()
		{
			return new CricketCoach(happyfortuneservice());
			
		}
}
