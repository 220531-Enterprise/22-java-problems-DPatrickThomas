package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		DecimalFormat df = new DecimalFormat(".000");
		if (firstNum<0) {
		    df.setRoundingMode(RoundingMode.CEILING);
		} else {
			df.setRoundingMode(RoundingMode.FLOOR);
		}
		String num1= df.format(firstNum);
		String num2= df.format(secondNum);
		System.out.println(num1);
		System.out.println(num2);
	    return num1.equals(num2);
		
		
		
		
		
		
	}

	
}

	




