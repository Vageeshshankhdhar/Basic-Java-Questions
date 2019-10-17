package com.iiht.questions;

import java.util.Scanner;

public class ThirdAngleOfTriangle {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter first angle in degrees : ");
		float firstangle = scan.nextFloat();
		System.out.println("Enter second angle in degrees : ");
		float secondangle = scan.nextFloat();
		float thirdangle = 180-firstangle-secondangle;
		System.out.println("Third angle in degrees is : "+thirdangle);
		
	}
}
