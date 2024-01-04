package com.basic.math.examples;

import java.util.Vector;

public class NaturalNoDivision {
	
	
	public static void printDivisors2(int n)  
	{ int i; 
	    for( i = 1; i * i < n; i++) 
	    {  
	        if (n % i == 0) 
	            System.out.print(i + " "); 
	    }  
	    if(i-(n/i)==1) 
	    { 
	      i--; 
	    } 
	    for(; i >= 1; i--) 
	    {  
	        if (n % i == 0)  
	            System.out.print(n / i + " "); 
	    }  
	}  
	  
	
	static void printDivisors(int n) {
		Vector<Integer> v = new Vector<>();
		//System.out.println("sqrt of n = " + Math.sqrt(n));
		//System.out.println("1. vector = " + v);
		
		for (int i = 1; i <=Math.sqrt(n); i++) {
			//System.out.println(" i = " + i );
			if(n%i == 0) {
				if(n/i == i)
					System.out.print(i + "...  ");
					//System.out.print(i +"  ");
				else {
					System.out.print(i +"  ");
					v.add(n/i);
					//System.out.println("i = " + i + " --> " + n + "/" + i + " = " + (n/i));
					//System.out.println(n/i);
				}
			}
				
		}
		//System.out.println("2. vector = " + v);
		
		//System.out.println("next half...v.size = " + v.size());
		for (int i = v.size()-1;i>=0 ;i--) {
			System.out.print (v.get(i) + "   ");
		}
		//System.out.println("3. vector = " + v);
	}

	public static void main(String[] args) {
		int n=100;
		System.out.print("Divisors of " + n  + " : ");
		//printDivisors(n);
		printDivisors2(n);
		

	}

}
