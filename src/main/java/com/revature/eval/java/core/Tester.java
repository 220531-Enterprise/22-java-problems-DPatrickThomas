package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Tester {

	public static void main(String[] args) {
	
		
	System.out.println(Arrays.toString(threeLuckyNumbers()));
	
	}
	
	
	public static int[] threeLuckyNumbers() {
		
		int[] slots= new int[3];
		for (int i=0; i <=2; i++) {
			slots[i]= ThreadLocalRandom.current().nextInt(1, 100 + 1);
		}
		return slots;
	}
}	




