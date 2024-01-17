package com.basic.math.examples.ds;

import java.util.Arrays;

public class ThirdLargeArray {
	
	

	public static void thirdLargest(int arr[], int n) {
		if(n<3) {
			System.out.println("Invalid Input");
			return;
		}
		
		int first= arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > first )
				first = arr[i];
		}
		
		int second = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]> second && arr[i] < first)
				second = arr[i];
		}
		
		int third = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i] > third && arr[i] < second)
				third = arr[i];
		}
		
		System.out.println("Third Largest Element in the array "+ Arrays.toString(arr)+ " is " + third);
		
	}
	
	static void thirdLargestSingleTraversal(int arr[], int n) {
		
		if(n<3) {
			System.out.println("Invalid Input");
			return;
		}
		int first= arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}else if(arr[i]> second) {
				third= second;
				second = arr[i];
			}else if(arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("Third Largest Element in the array "+ Arrays.toString(arr)+ " is " + third);
		
		
	}
	
	static void thirdLargestbySorting(int arr[], int n) {
		if(n<3) {
			System.out.println("Invalid Input");
			return;
		}else {
			Arrays.sort(arr);
			System.out.println("Third Largest Element in the array "+ Arrays.toString(arr)+ " is " + arr[n-3]); 
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {19, -10, 20, 14, 2, 16, 10};
		
		int n= arr.length;
		thirdLargest(arr,n);
		thirdLargestSingleTraversal(arr,n);
		thirdLargestbySorting(arr,n);

	}

}
