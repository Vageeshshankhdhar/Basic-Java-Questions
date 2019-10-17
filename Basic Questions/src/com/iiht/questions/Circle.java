package com.iiht.questions;

import java.util.Scanner;

public class Circle {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter value of radius : ");
		int radius =scan.nextInt();
		int diameter = 2*radius;
		float circumference = (float) (2*3.14*radius);
		float area = (float) (3.14*radius*radius) ;
		System.out.println("Diameter is : "+diameter);
		System.out.println("Circumference is : "+circumference);
		System.out.println("Area is : "+area);
	}
}
