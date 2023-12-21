package com.basic.math.examples;

public class ReverseStringorArr {

	public static void reverseArray(int arr[], int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void reverseArrayRecursive(int arr[], int start, int end) {
		int temp;
		if(start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end]=temp;
		reverseArray(arr,start+1, end-1);
	}
	
	private static void printArray(int[] arr, int length) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		printArray(arr, arr.length);
		
		reverseArray(arr, 0, arr.length-1);
		System.out.println("Reversed Array: ");
		printArray(arr, arr.length);
		
		reverseArrayRecursive(arr,0, arr.length-1);
		System.out.println("Reversed Array: ");
		printArray(arr, arr.length);
	}
	
	
	

}
