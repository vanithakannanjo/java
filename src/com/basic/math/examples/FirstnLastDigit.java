package com.basic.math.examples;

public class FirstnLastDigit {
	
	public static int firstDigit(int n) {
			
		return (int)( n/(int)( Math.pow(10, (int) Math.log10(n))));
	}
	
	public static int lastDigit(int n) {
		return (n%10);
	}
	
	public static void main(String[] args) {
		int n=914523;
		System.out.println( "N = " + n + " -> First Digit =  " +  firstDigit(n) + " Last Digit = " + lastDigit(n));
	}
}
