package com.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	public String fortune() 
	{
		String s = new String("shashank");
		return s;
	}
	}


