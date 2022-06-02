package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		

	}
	
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		return (int) (firstNum * 1000) == (int) (secondNum * 1000);
	}
	
	
}
	




