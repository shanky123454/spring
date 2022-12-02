package com.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String fortune() {
		return "today is bad day!";
	}

}
