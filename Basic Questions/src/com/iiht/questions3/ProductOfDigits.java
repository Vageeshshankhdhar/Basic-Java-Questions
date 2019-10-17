package com.iiht.questions3;

import java.util.Scanner;

public class ProductOfDigits {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int product = 1;
		int n;
	    while(number>0)
	    {
	     n = number%10;
	     product = product*n;
	     number=number/10;
	    }
	    System.out.println("Product of digits of given number is : "+product);
	}
}
