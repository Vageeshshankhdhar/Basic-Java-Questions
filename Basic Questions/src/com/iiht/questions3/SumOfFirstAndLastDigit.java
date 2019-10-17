package com.iiht.questions3;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int last_digit = number%10;
		int first_digit = 0;
	    while(number!=0)
	    {
	     first_digit =number%10;
	     number=number/10;
	    	
	    }
	   int sum = first_digit+last_digit;
	    System.out.println("Sum of first and last digit in given number is : "+sum);
	}
}
