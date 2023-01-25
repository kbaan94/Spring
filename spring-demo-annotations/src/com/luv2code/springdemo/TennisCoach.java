package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Spring will automatically register this bean
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	/*
	 * Qualifier annotation is used to specify what implementation of the
	 * FortuneService interface you would like to inject in this private field.
	 */
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService myFortuneService) {
		System.out.println("Inside TennishCoach constructor, using qualifire to inject randomFortuneService");
		fortuneService = myFortuneService;
	}

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	public TennisCoach() {
		System.out.println(">>In TennisCoach: contructor.");
	}

	@Override
	public String getDailyWork() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside of domyStartupStuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff");
	}

	// define setter method for injecting fortuneService. Configure dependency
	// injection with Autowired.
	// tell Spring we want to autowire this dependency using setter method.
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println(">>In TennisCoach: setFortuneService"); fortuneService =
	 * theFortuneService; }
	 */
}
