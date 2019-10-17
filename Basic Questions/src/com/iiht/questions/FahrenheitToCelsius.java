package com.iiht.questions;

import java.util.Scanner;

public class FahrenheitToCelsius {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of temperature in degree fahrenheit : ");
		float temperatureinF = scan.nextFloat();
		float temperatureinC = ((temperatureinF-32)*5)/9;
		System.out.println("Value of temperature in degree farhenheit is : "+temperatureinF);
		System.out.println("Value of temperature in degree celsius is : "+temperatureinC);
	}
}
