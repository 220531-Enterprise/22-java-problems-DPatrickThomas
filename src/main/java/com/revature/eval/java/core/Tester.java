package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
	System.out.println(isPangram("a quick movement of the enemy will jeopardize five gunboats"));
	
	}
	
	
	public static boolean isPangram (String sentence) {
		
		String abcs="abcdefghijklmnopqrstuvwxyz";
		String testString="";
		boolean isPangram=true;
		
		for (int i=0; i<=25; i++) {
			 char nextChar= abcs.charAt(i);
			 
			 if (isInSentence(nextChar, sentence)== false){
				isPangram=false;
				break;
			    }
			 testString="";
		    }
		return isPangram;		
	}
	
	public static boolean isInSentence (char letter, String sentence) {
		boolean isIn= false;
		for (int i=0; i< sentence.length(); i++) {
			if (sentence.charAt(i) == letter) {
				isIn=true;
				break;
			}			
		}
		return isIn;
	}
}	




