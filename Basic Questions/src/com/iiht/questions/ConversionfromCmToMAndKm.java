package com.iiht.questions;

import java.util.Scanner;

public class ConversionfromCmToMAndKm {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of length in cm : ");
		float length =scan.nextInt();
		float lengthinmeter = length/100;
		float lengthinkilometer =(length/100000);
		System.out.println("Length in m : "+lengthinmeter+"m");
		System.out.println("Length in Km : "+lengthinkilometer+"km");
	}
}
