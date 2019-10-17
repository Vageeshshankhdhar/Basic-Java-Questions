package com.iiht.questions3;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	private static Scanner scan;
	public static void main(String[] args) {
		System.out.println("Enter a natural number upto which sum is needed : ");
		scan = new Scanner(System.in);
		int number=scan.nextInt();
		int sum = 0;
	    for(int i=1;i<=number;i++)
	    {
	    	 sum = sum+i;
	    }
	    	System.out.print("Sum of numbers is : "+sum);
	}
}
