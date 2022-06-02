package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(printMegaBytesAndKiloBytes(2500));

	}
	
	public static String printMegaBytesAndKiloBytes(int kilobytes) {
		if (kilobytes <0 ) {
			return "Invalid Value";	
		}
		int megabytes = kilobytes/1024; 
		int remainingKilobytes= kilobytes % 1024;
		return kilobytes + " KB = " + megabytes + " MB and " +remainingKilobytes + "KB";
	}

}


