package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(shouldWakeUp(true, -1));

	}
	
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if(hourOfDay<0 || hourOfDay>23) {
			return false;
		}
		if (isBarking==true && hourOfDay<8 || hourOfDay>22 ) {
			return true;
		} 
		return false;	
	}
	
}

	




