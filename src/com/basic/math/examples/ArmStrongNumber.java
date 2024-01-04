package com.basic.math.examples;

public class ArmStrongNumber {

	
	 int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
	
	int order(int x) {
		int n=0;
		while(x!=0) {
			n++;
			x=x/10;
		}
		return n;		
	}
	
	
	boolean isArmstrong(int x) {
		int n=order(x);
		int temp=x, sum=0;
		
		while(temp!=0) {
			int r = temp%10;
			sum = sum + power(r,n);
			temp = temp/10;
		}
		
		return (sum == x);
	}
	
	public static void main(String[] args) {
		ArmStrongNumber amN = new ArmStrongNumber();
		
		System.out.println("Is Armstrong number 153? " + amN.isArmstrong(153));
		System.out.println("Is Armstrong number 1234? " + amN.isArmstrong(1234));
		
		  
		System.out.println("Total digits in 14 = " + ((int)Math.log10(14)+ 1));
	}

}
