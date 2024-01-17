package com.basic.math.examples;

public class PerfectNumber {
	
	public static boolean isPerfectNo(int x) {
		int i=1, sum=0;
		
		while(i <= x/2) {
			if(x % i == 0) {
				sum+= i;
			}
			i++;
		}
		
		
		if(x==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		//int x=28;
		for(int x=0;x<=100;x++)
			System.out.println( x + " is perfect number ? " + isPerfectNo(x));
	}
}
