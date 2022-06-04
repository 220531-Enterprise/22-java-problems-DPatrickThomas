package com.revature.eval.java.core;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(getScrabbleScore("quirky"));
		

	}
	
	
	public static int getScrabbleScore(String string) {
		String word= string.toUpperCase();
		int score=0;
		char tile;
		for (int i=0; i<=word.length()-1;i++) {
			tile=word.charAt(i);
			switch (tile) {
				case 'Q': case 'Z':
					score +=10;
					break;
				case 'J': case 'X':
					score +=8;
					break;
				case 'F': case 'H': case 'V': case 'W': case 'Y':
					score +=4;
					break;
				case 'B': case 'C': case 'M': case 'P':
					score +=3;
					break;
				case 'D': case 'G':
					score +=2;
					break;
				default:
					score+=1;
				}
			}
		return score;
	}
	
	
}
	




