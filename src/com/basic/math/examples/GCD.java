package com.basic.math.examples;

public class GCD {
	
	static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		
		if(a==b) return a;
		
		if(a>b)
			return gcd(a-b,b);
		else
			return gcd(a,b-a);
	}
	
	static int optimisedGCD(int a, int b ) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		
		if(a==b) return a;
		
		if(a>b) {
			if(a%b == 0)
				return b;
			return gcd(a-b, b);
			
		}
		
		if(b%a==0) return a;
		return gcd(a, b-a);
		
	}
	
	static int gcdv2(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		int a=98, b=56;
		System.out.println("GCD [ " + a + " , " + b + " ]= "   + gcd(a,b) );
		System.out.println("Optimised GCD [ " + a + " , " + b + " ]= "   + optimisedGCD(a,b) );
		System.out.println("GCD V2 [ " + a + " , " + b + " ]= "   + gcdv2(a,b) );
	}
	

}
