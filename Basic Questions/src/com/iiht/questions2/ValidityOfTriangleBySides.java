package com.iiht.questions2;

import java.util.Scanner;

public class ValidityOfTriangleBySides {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter length of first side : ");
		int side1 =scan.nextInt();
		System.out.println("Enter length of second side : ");
		int side2 =scan.nextInt();
		System.out.println("Enter length of third side : ");
		int side3 =scan.nextInt();
		int sum = side1+side2;
		if(sum>side3)
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is invalid");
		}
	}
}
