package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		// call some method on the bean
		System.out.println(tennisCoach.getDailyWork());
		System.out.println(tennisCoach.getDailyFortune());

		// close bean
		context.close();
	}

}
