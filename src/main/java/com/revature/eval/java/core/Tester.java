package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Tester {

	public static void main(String[] args) {
	
		
	System.out.println(guessingGame(50, 100));
	
	}
	public static int guessingGame(int x, int y) {
		int range= y-x;
        int randomNum = (int)(Math.random() * range) + x;
		return randomNum;
	}
	
	
}
	




