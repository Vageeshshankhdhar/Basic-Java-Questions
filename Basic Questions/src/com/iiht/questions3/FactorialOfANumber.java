package com.iiht.questions3;

import java.util.Scanner;

public class FactorialOfANumber {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
		int fact = 1;
		
		for (int i=number;i>=1;i--)
		{
			fact =fact*i;
		}
		System.out.println("The Factorial of given number is : "+fact);
	}
}
