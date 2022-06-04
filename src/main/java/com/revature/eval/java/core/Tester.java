package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
	System.out.println(cleanPhoneNumber("3212345678902  "));
	
	}
	
	
	public static String cleanPhoneNumber(String string) {
		
		String numOnly= justNumbers(string);
		if (numOnly.length() >10) {
			return "Invalid Number";
		}
		if (numOnly.charAt(0) ==1) {
			numOnly.substring(1);
		}
		
		return numOnly;
	}
	
	public static String justNumbers (String string) {
		String numbersString="";
		String numbers= "1234567890";
		
		for (int i=0; i <= string.length()-1; i++) {
			for (int j=0; j<=9; j++) {
				if (string.charAt(i)== numbers.charAt(j)) {
					numbersString += string.charAt(i);
				}
			}
		}
		return numbersString;
		}
}	




