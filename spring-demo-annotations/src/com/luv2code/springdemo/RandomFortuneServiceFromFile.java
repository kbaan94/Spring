package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceFromFile implements FortuneService {

	BufferedReader reader;
	List<String> listOfLines;
	Random myRandom = new Random();

	public RandomFortuneServiceFromFile() {
		System.out.println("Inside RandomFortuneServiceFromFile: Constructor");

		listOfLines = new ArrayList<String>();

		try {
			FileReader file = new FileReader(
					"C:\\Users\\khale\\git\\Spring\\spring-demo-annotations\\src\\fortunes.txt");

			reader = new BufferedReader(file);
			String line = reader.readLine();

			while (line != null) {
				listOfLines.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String getFortune() {

		int index = myRandom.nextInt(listOfLines.size());
		String tempFortune = listOfLines.get(index);

		return tempFortune;
	}

}
