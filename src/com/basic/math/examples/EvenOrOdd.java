package com.basic.math.examples;

public class EvenOrOdd {

	public static boolean isEven(int n) {	
		return ((n & 1) == 0) ? true:false;
	}
	
	public static boolean isEvenBitWise(int n) {
		return (n == ((n >> 1)<<1));
	}
	
	public static void main(String[] args) {
		System.out.println(isEven(11) ? "Even" : "Odd");
		System.out.println(isEvenBitWise(234) ? "Even" : "Odd");
	}

}
