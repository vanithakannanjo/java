package com.basic.math.examples;

public class PowerOfNumber {
	
	private static long power(int x, int n) {
		long pow = 1L;
		for(int i=0;i<n;i++) {
			pow = pow * x;
		}
		return pow;
	}

	public static void main(String[] args) {
		int x=5;
		int n=3;
		
		System.out.println("Power (x ** n) = " + power(x,n));
	}

	

}
