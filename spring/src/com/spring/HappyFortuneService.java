package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//default is singleton
public class HappyFortuneService implements FortuneService {
	public String fortune() 
	{
		String s = new String("shashank");
		return s;
	}
	}


