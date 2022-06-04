package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
	System.out.println(solveWithFunction(10001) );
	
	}
	
	public static int calculateNthPrime(int k) {
		int counter=0;
		int num= 2;
		int lastPrime=0;
		boolean isPrime=true;
		
		while (counter < k) {
			isPrime=true;
			for (int i=2; i<=num-1; i ++) {
				if (num % i ==0) {
					isPrime=false;
					break;
				} else {
					isPrime=true;
				}
			}
		if (isPrime=true) {
			lastPrime=num;
			counter ++;
		}
		num++;
		}
		return lastPrime;
		}
	
	
	
	
		private static boolean isPrime(int num) {		
			boolean isPrime=true;
			for (int i=2; i<=num-1; i ++) {
				if (num % i ==0) {
					isPrime=false;
					break;
				} else {
					isPrime=true;
				}
			}
			return isPrime;
		}
		
		
		public static int solveWithFunction(int k) {
			int counter=0;
			int num= 2;
			int lastPrime=0;
			boolean isPrime=true;
			
			while (counter < k) {
				if (isPrime(num)) {
					counter++;
					lastPrime=num;
				}
				num++;
			}
			return lastPrime;
		}
}	




