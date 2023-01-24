package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationUsingFileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// fetch bean
		Coach ballCoach = context.getBean("basketballCoach", Coach.class);
		
		// call method on bean
		System.out.println(ballCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
