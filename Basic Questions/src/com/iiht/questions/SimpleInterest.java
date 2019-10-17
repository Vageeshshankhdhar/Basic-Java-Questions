package com.iiht.questions;

import java.util.Scanner;

public class SimpleInterest {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the principal : ");
		float P = scan.nextFloat();
		System.out.println("Enter rate of interest : ");
		float R = scan.nextFloat();
		System.out.println("Enter time in months : ");
		float T = scan.nextFloat();
		float si = (R*T*P)/100;
		System.out.println("The Simple Interset is : "+si);
	}
}
