package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWork() {
		return "Take a 100 free throws!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
