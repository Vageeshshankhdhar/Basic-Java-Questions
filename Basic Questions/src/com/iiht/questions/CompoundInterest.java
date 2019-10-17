package com.iiht.questions;

import java.util.Scanner;

public class CompoundInterest {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter the principal : ");
		double P = scan.nextDouble();
		System.out.println("Enter rate of interest : ");
		double R = scan.nextDouble();
		System.out.println("Enter time in years : ");
		double T = scan.nextDouble();
		double ci = P*(Math.pow((1+R/100),T));
		System.out.println("The Compound Interset is : "+ci);
	}
}
