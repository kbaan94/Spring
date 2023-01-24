package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public SwimCoach() {
		System.out.println("Inside SwimCoach: Constructor");
	}

	public void propertiesToPrint() {
		System.out.println("Email: " + getEmail() + "\n" + "Team: " + getTeam());
	}

	@Override
	public String getDailyWork() {
		return "Swim 10 laps";
	}

	@Override
	public String getDailyFortune() {
		return "Today will be your luckiest day!";
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
