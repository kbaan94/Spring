package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

		// Coach ballCoach = context.getBean("basketballCoach", Coach.class);

		// call some method on the bean
		System.out.println(tennisCoach.getDailyWork());
		System.out.println(tennisCoach.getDailyFortune());

		// close bean
		context.close();
	}

}
