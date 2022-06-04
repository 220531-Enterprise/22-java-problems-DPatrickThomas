package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(isArmstrongNumber(9474));
		

	}
	
	
	public static boolean isArmstrongNumber(int input) {
		int digit=0;
		int numOfDigits=0;
		int sumOfRaisedDigits=0;
		int decimalPlaces= input;
		int utilNum = input;
		
		while (decimalPlaces>0) {
			numOfDigits ++;
			decimalPlaces /= 10;
		}
		
		while (utilNum>0) {
		    digit = utilNum % 10;
		    System.out.println(digit);
		    sumOfRaisedDigits += Math.pow(digit,numOfDigits);
		    utilNum /=10;
		}
		System.out.println(sumOfRaisedDigits);
		
		return input==sumOfRaisedDigits;
	}
}
	




