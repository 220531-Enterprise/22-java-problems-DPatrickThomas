package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(acronym("First In, First Out"));
		

	}
	
	
	public static String acronym(String phrase) {
		String[] words= phrase.split(" ");
		String acronym= "";
		for (int i=0; i <words.length; i++) {
			acronym += words[i].charAt(0);
		}
		
		return acronym;
	
	}
}
	




