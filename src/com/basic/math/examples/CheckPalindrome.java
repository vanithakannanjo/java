package com.basic.math.examples;

public class CheckPalindrome {

	static boolean isPalindrome(String str) {
		int len = str.length();
		for(int i=0;i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1))
				return false;
			
		}
		return true;
		
	}
	
	static boolean isPalin2(int n) {
		
		int reverse =0;
		int temp = n;
		
		while(temp != 0) {
			reverse = (reverse * 10) + (temp%10);
			temp = temp/10;
		}
		
		return (n == reverse);
	}
	
	public static void main(String[] args) {
		String st = "11211"; 
		if(isPalindrome(st))
			System.out.println(st + " is Palindrome");
		else
			System.out.println(st + " is Not Palindrome");
		
		System.out.println("12345 is " + isPalin2(12345) );
		System.out.println("12321 is " + isPalin2(12321) );
	}

}
