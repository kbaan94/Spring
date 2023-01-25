package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class MartialArtsCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	public MartialArtsCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWork() {
		return "Train on the punching bag as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
