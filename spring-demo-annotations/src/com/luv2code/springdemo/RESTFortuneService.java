package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

// specify component name since default name generated by Java beans introspector wont apply. REST is all capitalized, it only
// works for class names which have only the first letter Capitalized.
@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return null;
	}

}
