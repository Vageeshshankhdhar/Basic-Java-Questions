package com.iiht.questions2;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
	    
		if(number==0) {
			System.out.println("Entered number is zero");
		}
		if(number<0)
		{
			System.out.println("Entered number is negative");
		}
		if(number>0)
		{
			System.out.println("Entered number is positive");
		}
	}
}
