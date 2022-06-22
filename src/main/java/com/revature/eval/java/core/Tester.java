package com.revature.eval.java.core;



import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;



public class Tester {

	public static void main(String[] args) {
	

	int[] set = { 4, 6 };	
	System.out.println(getSumOfMultiples(15, set));
		
		     
	 }
	
	
	
	public static int getSumOfMultiples(int i, int[] set) {
		int sum=0;
		for (int k=1; k <i ;k++) {
			System.out.println("K: " +k);
			for (int j=0; j<set.length; j++) {
				System.out.println("j: " + j);
				System.out.println("set[] :" + set[j]);
				if (k % set[j] == 0) {
					
					sum += k;
					System.out.println(sum);
					break;
				}
			}
		}
		
		return sum;
	}
	
}
			
			
			
			
			

	




