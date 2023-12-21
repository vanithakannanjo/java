package com.basic.math.examples;

public class NumberOfDigits {
	
	static int countDigits(int n) {
		return (int)(Math.floor(Math.log10(n) + 1));
	}
	
	
	static int countDigitsByRecursive(int n) {
	
		return (n/10 == 0) ? 1 :( 1 + countDigitsByRecursive(n/10));
	}
	
	static int countDigitByLoop(int n) {
		int count =0;
		while(n!= 0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n=343;
		System.out.println("Number of Digits = " + countDigits(n));
		System.out.println("Number of Digits = " +countDigitsByRecursive(n));
		System.out.println("Number of Digits = " + countDigitByLoop(n)); 
	}
}
