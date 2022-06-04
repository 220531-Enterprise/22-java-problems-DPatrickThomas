package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(cleanPhoneNumber("223 456   7890   "));
		

	}
	
	
	public static String cleanPhoneNumber(String string) {
		String numOnly= string.replaceAll("[^0-9]", "");
		if (numOnly.charAt(0) ==1) {
			numOnly.substring(1);
		}
		
		return numOnly;
	}
	
	
}
	




