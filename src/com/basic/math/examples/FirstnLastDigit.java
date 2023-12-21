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
		
		
		n = 34356; 
        String s = Integer.toString(n); 
        System.out.println(" 0 = "  +  s.charAt(0) + " last char= " + s.charAt(s.length() - 1));
        int first_digit = s.charAt(0) - '0'; 
        int last_digit = s.charAt(s.length() - 1) - '0'; 
        System.out.println("First digit of " + n + " is " + first_digit); 
        System.out.println("Last digit of " + n + " is " + last_digit); 
	}
}
