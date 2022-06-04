package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
	System.out.println(isPangram("five boxing wizards jump quickly at it"));
	
	}
	
	
	public static boolean isPangram (String sentence) {
		
		String abcs="abcdefghijklmnopqrstuvwxyz";
		String testString="";
		boolean isPangram=true;
		
		for (int i=0; i<=25; i++) {
			 char nextChar= abcs.charAt(i);
			 testString += nextChar;
			 System.out.println(testString);
			 if (sentence.contains(testString)== false){
				isPangram=false;
				break;
			    }
			 testString="";
		    }
		return isPangram;		
	}
}	




