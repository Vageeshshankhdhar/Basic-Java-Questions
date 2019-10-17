package com.iiht.questions3;

import java.util.Scanner;

public class SumOfOddNumbers {
	private static Scanner scan;
	public static void main(String[] args) {
		System.out.println("Enter a natural number upto which sum of odd numbers is needed : ");
		scan = new Scanner(System.in);
		int number=scan.nextInt();
		int sum = 0;
	    for(int i=1;i<=number;i++)
	    {int rem = i%2;
    	if(rem==1)
    	{
    	 sum = sum+i;
    	}
	    }
	    	System.out.print("Sum of odd numbers is : "+sum);
	}
}
