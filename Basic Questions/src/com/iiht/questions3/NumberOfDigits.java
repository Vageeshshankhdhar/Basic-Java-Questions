package com.iiht.questions3;

import java.util.Scanner;

public class NumberOfDigits {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int flag = 0;
	    while(number!=0)
	    {
	    	number =number/10;
	    	flag++;
	    }
	    System.out.println("Number of digits in given number is : "+flag);
	}
}
