package com.iiht.questions;

import java.util.Scanner;

public class ConversionOfDaysInWeekMonthYear {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter numbers of days : ");
		float days = scan.nextFloat();
		float weeks = days/7;
		float months = days/30;
		float year = days/365;
		System.out.println("Numbers of weeks is : "+weeks);
		System.out.println("Numbers of months is : "+months);
		System.out.println("Numbers of year is : "+year);
	}
}
