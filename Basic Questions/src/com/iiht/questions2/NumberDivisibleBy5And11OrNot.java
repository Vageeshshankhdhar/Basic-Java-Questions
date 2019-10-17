package com.iiht.questions2;

import java.util.Scanner;

public class NumberDivisibleBy5And11OrNot {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
	    int rem1=number%5;
	    int rem2=number%11;
		if(rem1==0&rem2==0) {
			System.out.println("Entered number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("Entered number is not divisible by 5 and 11");
		}
	}
}
