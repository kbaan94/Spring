package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MartialArtsConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		MartialArtsCoach mmaCoach = context.getBean("martialArtsCoach", MartialArtsCoach.class);

		// call some method on the bean
		System.out.println(mmaCoach.getDailyWork());
		System.out.println(mmaCoach.getDailyFortune());

		System.out.println(mmaCoach.getEmail() + " " + mmaCoach.getTeam());

		// close bean
		context.close();
	}

}
