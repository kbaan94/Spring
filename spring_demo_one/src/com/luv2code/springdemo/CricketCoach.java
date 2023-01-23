package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	// Injecting literal values
	private String emailAddress;
	private String team;

	// we need helper so we make use of the fortuneService dependency here.
	private FortuneService fortuneService;

	// create a no-arg con. Spring will call this when they make a ref to our bean.
	public CricketCoach() {
		// print something for diagnostic purposes
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// dependency injection via setter method. Will be called by spring when they
	// inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFrotuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
