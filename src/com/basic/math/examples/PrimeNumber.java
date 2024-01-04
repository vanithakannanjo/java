package com.basic.math.examples;

public class PrimeNumber {

	static int i=2;
	static boolean primeNumber(int n) {
		if(n==0  || n==1) return false;
		
		if(n==i) return true;
		
		if(n%i ==0) {
			return false;
		}
		
		i++;
		return primeNumber(n);
		
	}
	public static void main(String[] args) {
		int n=35;
		
		
		System.out.println(n + " is Prime Number ? " + primeNumber(n));
	}
}
