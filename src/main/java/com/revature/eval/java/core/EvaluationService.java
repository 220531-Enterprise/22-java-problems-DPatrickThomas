package com.revature.eval.java.core;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			if (kilometersPerHour<0) {
				return -1;
			} 
			long mph= Math.round(kilometersPerHour / 1.609);
			return mph;
		}
		
		

		/**
		 * 1.B Speed Converter - Print Conversion
		 
		
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {
			if (kilometersPerHour <0) {
				return "Invalid Value";
			}
			long mph= Math.round(kilometersPerHour / 1.609);
			return kilometersPerHour + " km/h = " + mph + " mi/h";
 		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int kilobytes) {
		if (kilobytes <0 ) {
			return "Invalid Value";	
		}
		int megabytes = kilobytes/1024; 
		int remainingKilobytes= kilobytes % 1024;
		return kilobytes + " KB = " + megabytes + " MB and " +remainingKilobytes + " KB";
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if(hourOfDay<0 || hourOfDay>23) {
			return false;
		}
		if (isBarking==true && hourOfDay<8 || hourOfDay>22 ) {
			return true;
		} 
		return false;	
	}
	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 * 
	 */
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		return (int) (firstNum * 1000) == (int) (secondNum * 1000);
	}
	
	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {
			if ((x<20 && x>12) || (y<20 && y>12) || (z<20 && z>12)) {
				return true;
			}else {
			return false;
			}
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method

		public static boolean isTeen(int number) {
			// TODO Write an implementation for this method declaration
			return false;
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should not return anything (void) and it needs to calculate the
	 * years and days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to print a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public static String printYearsAndDays(long minutes) {
		long years = minutes/525600;
		long remainingMinutes= minutes % 525600;
		int days= (int) remainingMinutes/ 1440;
		return minutes + " min = " + years +" y and " + days + " d" ;
	}
		

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	
	public static String printNumberInWord(int number) {
		String word;
	
		switch (number){
		case 0: word= "ZERO";
		break;
		case 1: word= "ONE";
		break;
		case 2: word ="TWO";
		break;
		case 3: word= "THREE";
		break;
		case 4: word= "FOUR";
		break;
		case 5: word= "FIVE";
		break;
		case 6: word= "SIX";
		break;
		case 7: word= "SEVEN";
		break;
		case 8: word= "EIGHT";
		break;
		case 9: word= "NINE";
		break;
		default: word = "OTHER";
		}
		
		return word;
		}	

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	
	public static int getGreatestCommonDivisor(int first, int second) {
		int divisor=0;
		
	
		if (first<10 || second<10) {
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
		
		
	

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public static int sumFirstAndLastDigit(int num) {
		int firstDigit=0;
		int lastDigit= num % 10;
		while (num !=0) {
			firstDigit=num;
			num /=10;
		}
		return firstDigit + lastDigit;	
	}
	

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public static String reverse(String string) {
		
		String reversedString= "";
		char newChar;
		for (int i=1; i <= string.length(); i++) {
			newChar=string.charAt(string.length()-i);
			reversedString += newChar;	
		    }
		return reversedString;
	    }

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	 public static String acronym(String phrase) {
		String[] words= phrase.split(" ");
		String acronym= "";
		for (int i=0; i <words.length; i++) {
			acronym += words[i].charAt(0);
		}
		return acronym.toUpperCase();
	 }

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			if(this.getSideOne()== this.getSideTwo() && this.getSideTwo()==this.getSideOne()) {
				return true;
			}else {
			return false;
			}
		}

		public boolean isIsosceles() {
			if((this.getSideOne()== this.getSideTwo() && this.getSideOne() != this.getSideThree())
				|| (this.getSideTwo()== this.getSideThree() && this.getSideTwo() != this.getSideThree())
				|| (this.getSideOne()== this.getSideThree() && this.getSideTwo() != this.getSideThree())
				) {
				return true;
			}else {
			return false;
			}
		}

		public boolean isScalene() {
			if(this.getSideOne()!= this.getSideTwo() && this.getSideTwo()!=this.getSideOne()) {
				return true;
			}else {
			return false;
			}

	}
	}
  
	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
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
				case 'K':
					score+=5;
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

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
public static String cleanPhoneNumber(String string) {
		
		String numOnly= justNumbers(string);
		if (numOnly.length() != 10) {
				throw new IllegalArgumentException();	
			}
		if (numOnly.charAt(0) ==1) {
			numOnly.substring(1);
		}
		return numOnly;
	}

	
	public static String justNumbers (String string) {
		String numbersString="";
		String numbers= "1234567890";
		
		for (int i=0; i <= string.length()-1; i++) {
			for (int j=0; j<=9; j++) {
				if (string.charAt(i)== numbers.charAt(j)) {
					numbersString += string.charAt(i);
				}
			}
		}
		return numbersString;
		}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		return null;
	}

	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	
	public static boolean isArmstrongNumber(int input) {
		int digit=0;
		int numOfDigits=0;
		int sumOfRaisedDigits=0;
		int decimalPlaces= input;
		int utilNum = input;
		
		while (decimalPlaces>0) {
			numOfDigits ++;
			decimalPlaces /= 10;
		}
		
		while (utilNum>0) {
		    digit = utilNum % 10;
		    
		    sumOfRaisedDigits += Math.pow(digit,numOfDigits);
		    utilNum /=10;
		}
		
		
		return input==sumOfRaisedDigits;
	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 */
	public static List<Long> calculatePrimeFactorsOf(long l) {
		Long factor= 0L;
		List<Long> factors = new ArrayList<>();
		Long num= l;
		
		for (long i=2; i<=num; i++) {
			if( num % i ==0) {
				factor=i;
				factors.add(i);
				num /= i;
				i=1;
			}
		}	
		return factors;
	}
	
	

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {
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
	

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public static boolean isPangram (String sentence) {
		
		String abcs="abcdefghijklmnopqrstuvwxyz";
		boolean isPangram=true;
		
		for (int i=0; i<=25; i++) {
			 char nextChar= abcs.charAt(i);
			 if (isInSentence(nextChar, sentence)== false){
				isPangram=false;
				break;
			    }
		    }
		return isPangram;		
	}
	
	public static boolean isInSentence (char letter, String sentence) {
		boolean isIn= false;
		for (int i=0; i< sentence.length(); i++) {
			if (sentence.charAt(i) == letter) {
				isIn=true;
				break;
			}			
		}
		return isIn;
	}
	/**
	 * 20. Sum of Multiples 
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
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
	
	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
	
	public int[] threeLuckyNumbers() {
		
		int[] slots= new int[3];
		for (int i=0; i <=2; i++) {
			slots[i]= ThreadLocalRandom.current().nextInt(1, 100 + 1);
		}
		return slots;
	}
	
	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range:
	 * int x = minimum
	 * iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and y.
	 */
	
	public int guessingGame(int x, int y) {
		int range= y-x;
        int randomNum = (int)(Math.random() * range) + x;
		return randomNum;
	}
	
	}

