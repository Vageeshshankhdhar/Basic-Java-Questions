package com.iiht.questions;

import java.util.Scanner;

public class Power {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter number x : ");
		double x = scan.nextDouble();
		System.out.println("Enter number y : ");
		double y = scan.nextDouble();
		System.out.println("Square root of number is : "+Math.pow(x, y));
	}
}
