package com.luv2code.springdemo;

public class GolfCoach implements Coach {

	private RandomFortuneService myRandomFortuneService;
	
	public GolfCoach(RandomFortuneService theRandomFortuneService) {
		myRandomFortuneService = theRandomFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 2 hours today";
	}

	@Override
	public String getDailyFortune() {
		return myRandomFortuneService.getFortune();
	}

}
