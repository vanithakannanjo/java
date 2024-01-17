package com.basic.math.examples.ds;

public class FindMissingNumber {

	
	/*
	 * public static int getMissingNo(int nums[], int n) {
	 * 
	 * int sum = 0; for(int i=0;i<n;i++){
	 * 
	 * 
	 * sum = sum + nums[i]; System.out.println("nums[ " + i + " ]= " + nums[i] +
	 * "Sum = " + sum); } System.out.println("Sum of natural number = " +(n *
	 * (n+1))/2 ); System.out.println("Sum of Array integers = " + sum);
	 * 
	 * return ((n * (n+1))/2 - sum);
	 * 
	 * }
	 * 
	 */
	
	static int getMissingNo2(int a[], int n) {
		int total = 1;
		for(int i=2;i<(n+1); i++) {
			System.out.print(total  + " + " +  i + " = ");
			total += i;
			System.out.println( total);
			System.out.print("[ " + (i-2) + " ]= "  + total  + " - " +  a[i-2] + " = ");
			total -= a[i-2];
			System.out.println( total);
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Find missing number:");
		int arr[] = {1,2,3,5,6};
		
		int aSize = arr.length;
		System.out.println("Array Length = " + aSize);
		
		//System.out.println("Missing number = " + getMissingNo(arr, aSize));
		System.out.println("Missing number = " + getMissingNo2(arr, aSize));
		
	}

}
