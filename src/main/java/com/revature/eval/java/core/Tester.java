package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(reverse ("robot"));
		

	}
	
	
	public static String reverse(String string) {
		
		String reversedString= "";
		char newChar;
		for (int i=1; i <= string.length(); i++) {
			newChar=string.charAt(string.length()-i);
			reversedString += newChar;	
		    }
		return reversedString;
	    }
	
}

	




