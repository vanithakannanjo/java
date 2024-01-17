package com.basic.math.examples.ds;

import java.util.*;


public class ArrayMinMax {

	static class Pair{
		public int min;
		public int max;
	}

	static Pair getMinMaxbyBinSearch(int arr[], int low, int high) {
		
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmh = new Pair();
		int mid;
		
		if(low==high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}
		
		if(high == low + 1) {
			if(arr[low] > arr[high]) {
				minmax.min = arr[high];
				minmax.max = arr[low];
			}else {
				minmax.min = arr[low];
				minmax.max = arr[high];
			}
			return minmax;
		}
		
		
		mid = (low + high)/2;
		mml = getMinMaxbyBinSearch(arr, low, mid);
		mmh = getMinMaxbyBinSearch(arr, mid,high);
		
		if(mml.min < mmh.min)
			minmax.min = mml.min;
		else
			minmax.min = mmh.min;
		
		
		if(mml.max > mmh.max)
			minmax.max = mml.max;
		else
			minmax.max = mmh.max;
		
		return minmax;
	}
	
	static Pair getMinMax(int arr[], int n) {
		
		Pair minmax = new Pair();
		//Arrays.sort(arr);
		//minmax.max = arr[n-1];
		//minmax.min = arr[0];
		
		int i;
		if(n== 1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
		}

		if(arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		}else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		
		
		for(i=2 ;i<n; i++) {
			if(arr[i] > minmax.max) {
				minmax.max = arr[i];
			}else if(arr[i]< minmax.min) {
				minmax.min = arr[i];
			}
		}
		
		return minmax;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1000, 11, 445, 1, 330, 3000};
		int aSize = arr.length;
		
		Pair maxmin = getMinMax(arr, aSize);
		System.out.println("Max value = "  + maxmin.max);
		System.out.println("Min value = "  + maxmin.min);
		
		Pair maxminbs = getMinMaxbyBinSearch(arr, 0,aSize-1);
		System.out.println("BS:: Max value = "  + maxminbs.max);
		System.out.println("BS::Min value = "  + maxminbs.min);

	}

}
