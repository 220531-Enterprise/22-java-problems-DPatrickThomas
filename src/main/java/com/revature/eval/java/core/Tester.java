package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(getGreatestCommonDivisor(9, 18));
		

	}
	
	
	public static int getGreatestCommonDivisor(int first, int second) {
		int divisor=0;
	
		if (first<0 || second<0) {
			return -1;
		}
		for (int i=1; i<=first; i++) {
			if (first % i==0 && second % i==0) {
				if (i>divisor) {
					divisor=i;
				}
			}
				
			}
			return divisor;
		}
		
		
		
	}

	


	




