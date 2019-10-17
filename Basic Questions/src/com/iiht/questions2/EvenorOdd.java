package com.iiht.questions2;

import java.util.Scanner;

public class EvenorOdd {

	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=scan.nextInt();
	    int rem=number%2;
		if(rem==0) {
			System.out.println("Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}
	}

}
