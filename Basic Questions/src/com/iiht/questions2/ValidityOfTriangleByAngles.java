package com.iiht.questions2;

import java.util.Scanner;

public class ValidityOfTriangleByAngles {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of first angle in degrees : ");
		int angle1 =scan.nextInt();
		System.out.println("Enter value of second angle in degrees : ");
		int angle2 =scan.nextInt();
		System.out.println("Enter value of third angle in degrees : ");
		int angle3 =scan.nextInt();
		int sum = angle1+angle2+angle3;
		if(sum==180)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is invalid");
		}
	}
}
