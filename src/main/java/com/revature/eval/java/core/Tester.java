package com.revature.eval.java.core;



import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;



public class Tester {

	public static void main(String[] args) {
	
		
		Map <String, Integer> counter= wordCount("one,\ntwo,\nthree");
		
		for (Map.Entry<String,Integer> entry : counter.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}
		
		     
	public static Map<String, Integer> wordCount(String string) {
		
		string = string.replace(",", " ").replace(",\n", " ");
//		
		System.out.println(string);
		String[] words= string.split(" ");
		
		int count=0;
		Map<String, Integer> counter = new HashMap<>();
		
			for(String word :words) {
				System.out.println(word);
				
				for (String w :words) {
						if (word.equals(w)) {
							count ++;
				
						}
						
					}
				counter.put(word, count);
				count=0;
				}
			
		return counter;
	}

	

	
	
	
}
			
			
			
			
			

	




