package com.iiht.questions;

import java.util.Scanner;

public class SquareRoot {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter number whose sqaure root is needed : ");
		double number = scan.nextDouble();
		System.out.println("Square root of number is : "+Math.sqrt(number));
		
	}

}
