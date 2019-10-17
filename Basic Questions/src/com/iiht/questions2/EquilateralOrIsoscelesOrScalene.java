package com.iiht.questions2;

import java.util.Scanner;

public class EquilateralOrIsoscelesOrScalene {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter length of first side : ");
		int side1 =scan.nextInt();
		System.out.println("Enter length of second side : ");
		int side2 =scan.nextInt();
		System.out.println("Enter length of third side : ");
		int side3 =scan.nextInt();
		
		if(side1==side2&&side2==side3)
		{
			System.out.println("Triangle is equilateral");
		}
		if((side1==side2)&&(side2!=side3)||(side1==side3)&&(side1!=side2)||(side2==side3)&&(side2!=side1))
		{
			System.out.println("Triangle is isosceles");
		}
		if(side1!=side2&&side2!=side3&&side3!=side1)
		{
			System.out.println("Triangle is scalene");
		}
	}
}
