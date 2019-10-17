package com.iiht.questions2;

import java.util.Scanner;

public class LeapYearOrNot {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a year :");
		int number=scan.nextInt();
	    int rem=number%4;
		if(rem==0) {
			System.out.println("Entered year is a leap year");
		}
		else
		{
			System.out.println("Entered year is not a leap year");
		}
	}
}
