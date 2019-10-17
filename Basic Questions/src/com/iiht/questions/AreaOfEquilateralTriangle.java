package com.iiht.questions;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter side of triangle : ");
		double side = scan.nextDouble();
		
		double area = (Math.sqrt(3)/4)*(side*side);
		System.out.println("Area of triangle is : "+area);
	}
}
