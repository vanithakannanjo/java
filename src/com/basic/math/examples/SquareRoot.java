package com.basic.math.examples;

public class SquareRoot {
	
	static int floorSqrt(int x) {
		if(x==0 || x==1)
			return x;
		
		int i=1, result =1;
		while(result <= x) {
			i++;
			result = i * i;
		}
		return i-1;
	}
	
	static int binarySearchSqrt(int x) {
		if(x==0 || x==1)
			return x;
		
		long start =1;
		long end = x/2;
		long res =0;
		
		while(start <= end) {
			long mid = (start+end)/2;
			
			if(mid * mid == x)
				return (int)mid;
		
			if(mid * mid < x) {
				start = mid + 1;
				res = mid;
			}else {
				end = mid -1;
			}
		}
		 
		return (int)res;
		
		
		
	}

	public static void main(String[] args) {
		int x=125;
		System.out.println("Square root = " + floorSqrt(x));
		System.out.println("SQRT by binary search = " + binarySearchSqrt(x));
		
		System.out.println("log of " + x + " = " + Math.log(x));
		System.out.println("log of " + x + "/2=  " + Math.log(x)/2);
		System.out.println("exp(log of " + x + "/2)=  " + Math.exp(Math.log(x)/2));
		System.out.println("exp of  2.4141=" + (int)Math.floor(Math.exp(2.4141)));

	}

}
