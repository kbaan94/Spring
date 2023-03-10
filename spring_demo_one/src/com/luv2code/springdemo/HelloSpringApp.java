package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		
		// new methods for fortunes
		System.out.println(trackCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
