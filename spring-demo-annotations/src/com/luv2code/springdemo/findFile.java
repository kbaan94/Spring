package com.luv2code.springdemo;

import java.io.File;

public class findFile {

	public static void main(String[] args) {
		File f = new File("fortunes.txt");
		System.out.println(f.getAbsolutePath());
	}

}
