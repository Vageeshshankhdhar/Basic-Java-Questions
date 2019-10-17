package com.iiht.questions;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of temperature in degree celsius : ");
		float temperatureinC = scan.nextFloat();
		float temperatureinF = ((temperatureinC*9)/5)+32;
		System.out.println("Value of temperature in degree celsius is : "+temperatureinC);
		System.out.println("Value of temperature in degree farhenheit is : "+temperatureinF);
	}
}
