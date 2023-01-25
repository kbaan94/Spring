package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneServiceFromFile")
	FortuneService fortuneService;
	
	public BasketballCoach() {
		System.out.println("Inside BasketballCoach Constructor");
	}

	@Override
	public String getDailyWork() {
		return "Take a 100 free throws!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
