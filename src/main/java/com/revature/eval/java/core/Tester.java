package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(printConversion(10.25));

	}
	
	public static String printConversion(double kilometersPerHour) {
		if (kilometersPerHour <0) {
			return "Invalid Value";
		}
		long mph= Math.round(kilometersPerHour / 1.609);
		return kilometersPerHour + " km/h = " + mph + "mi/h";
		}

}
