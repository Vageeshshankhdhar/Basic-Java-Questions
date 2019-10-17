package com.iiht.questions;

import java.util.Scanner;

public class Result {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter marks in Subject1 : ");
		float Subject1 = scan.nextFloat();
		System.out.println("Enter marks in Subject2 : ");
		float Subject2 = scan.nextFloat();
		System.out.println("Enter marks in Subject3 : ");
		float Subject3 = scan.nextFloat();
		System.out.println("Enter marks in Subject4 : ");
		float Subject4 = scan.nextFloat();
		System.out.println("Enter marks in Subject5 : ");
		float Subject5 = scan.nextFloat();
		float total = Subject1+Subject2+Subject3+Subject4+Subject5;
		float average = total/5;
		float percentage = total/5;
		System.out.println("Total Marks is : "+total);
		System.out.println("Average of marks is : "+average);
		System.out.println("Percentage is : "+percentage+"%");
	}
}
