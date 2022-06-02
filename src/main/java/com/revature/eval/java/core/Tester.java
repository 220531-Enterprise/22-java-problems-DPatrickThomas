package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(printYearsAndDays(561600));
		

	}
	
	

	public static String printYearsAndDays(long minutes) {
		long years = minutes/525600;
		long remainingMinutes= minutes % 525600;
		int days= (int) remainingMinutes/ 1440;
		return minutes + " min = " + years +" y and " + days + " d" ;
	}
		
		
		
		
		
	}

	


	




