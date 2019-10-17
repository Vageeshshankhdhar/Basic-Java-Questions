package com.iiht.questions3;

import java.util.Scanner;

public class SumOfDigits {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int sum = 0;
		int n;
	    while(number>0)
	    {
	     n = number%10;
	     sum = sum +n;
	     number=number/10;
	    }
	    System.out.println("Sum of digits of given number is : "+sum);
	}
}
