package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(sumFirstAndLastDigit(257));
		

	}
	
	
	public static int sumFirstAndLastDigit(int num) {
		int firstDigit=0;
		int lastDigit= num % 10;
		while (num !=0) {
			firstDigit=num;
			num /=10;
		}
		return firstDigit + lastDigit;	
	}

	
}

	




